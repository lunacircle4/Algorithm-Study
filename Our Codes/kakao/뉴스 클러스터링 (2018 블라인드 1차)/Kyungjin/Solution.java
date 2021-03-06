package kakao_news_clustering;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<String, Integer> multiple_set1 = makeMultipleSet(str1);
        Map<String, Integer> multiple_set2 = makeMultipleSet(str2);

        Map<String, Integer> union = new HashMap<>(multiple_set1);
        multiple_set2.forEach((k, v) -> union.merge(k, v, Integer::max));

        int count_union = union.values().stream().reduce(0, Integer::sum);
        int count_intersection = 0;
        for(String key : multiple_set1.keySet())
            count_intersection += Math.min(multiple_set1.get(key), multiple_set2.getOrDefault(key, 0));

        float jaccard_similarity;
        if(count_intersection == count_union)
            jaccard_similarity = 1;
        else
            jaccard_similarity = (float)count_intersection / count_union;

        return (int)(jaccard_similarity * 65536);
    }

    private Map<String, Integer> makeMultipleSet(String str) {
        Map<String, Integer> k_gram_set = new HashMap<>();

        for(int i=0; i<str.length()-1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i+1);

            if(!Character.isAlphabetic(a) || !Character.isAlphabetic(b))
                continue;

            String k_gram = "" + str.charAt(i) + str.charAt(i+1);

            k_gram_set.put(k_gram, k_gram_set.getOrDefault(k_gram, 0) + 1);
        }

        return k_gram_set;
    }
}
