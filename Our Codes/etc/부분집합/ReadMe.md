# 부분집합

0~9까지의 숫자만을 원소로 갖는 집합이 주어졌을 때, 그 집합의 모든 부분집합을 출력하라.

단, 부분집합에는 공집합과 자기자신까지 포함하며, 공집합일 경우에는 { }를 출력한다.

모든 부분 집합을 출력할 때에는 원소의 개수가 작은 것부터 출력하고,

원소의 개수가 같은 부분집합일 경우 숫자가 작은 부분집합부터 출력한다.

입력에는 집합의 원소들이 한 줄로 입력되는데, 각 원소 사이에는 공백이 있다.

출력에는 모든 부분집합을 위에서 언급한 순서대로 출력하는데 원소와 원소 사이에는 콤마 대신 공백이 있어야 한다.

<br>

#### 입/출력 예시

##### 입력
```
1 2 3
```

##### 출력
```
{ }
{ 1 }
{ 2 }
{ 3 }
{ 1 2 }
{ 1 3 }
{ 2 3 }
{ 1 2 3 }
```