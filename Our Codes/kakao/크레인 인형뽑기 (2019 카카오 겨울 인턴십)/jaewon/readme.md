<h1>크레인뽑기 문제</h1>
<h2>풀이</h2>
{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}<br><br>
위 보드배열에 데이터들을 Stack 배열에 세로로 넣어 하나씩 뽑아 basket이라는 Stack에 삽입하고 <br><br>
삽입하는 과정에서 basket에 들어있는 가장 나중에 들어간 숫자와 비교하여 같으면<br><br>
basket과 stack 배열에 있는 비교한 숫자들을 함께 지우며 count를 2씩 증가시킴 다르다면 <br><br>
stack배열에 있던 숫자를 basket에 그대로 스택에 추가