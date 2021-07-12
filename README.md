## Algorithm
알고리즘 연습 코드

-----

<details>
<summary>코드업 기초100제 C</summary>

    - 1020번
      => 주민등록번호를 앞, 뒷자리 따로 받는 거라 double이 아닌 int
      => double 쓸 때는 ld 잊지 말기

    - 1022번
      => fgets()를 사용하면 공백 문자가 포함되어 있는 문장을 입력받아 저장할 수 있음
      => ex) fgets(data, 2000, stdin)
         공백이 포함된 문장을 키보드(stdin)로 입력받아 최대 2000자까지 data[] 공간에 저장하고 출력할 수 있음
      => scanf를 이용하여 문자를 입력받으면, 첫 번째 단어까지만 저장됨

    - 1024번
      => 단어나 문장을 scanf("%s", ~~)로 받게 되면, 마지막에 Null 문자가 자동으로 입력됨
      => for문으로 하나하나씩 검사해서 Null 문자가 아닐 때까지 출력 실행

      => 'for' loop initial declarations are only allowed in C99 or C11 mode
      => C언어의 버전 차이 때문에 생기는 컴파일 오류
      => 해결 방법 : Tools > Compiler Options > General > Add the following commands when calling the compiler: 체크 후 빈 칸에 -std=c11 입력

    - 1029번
      => float 데이터형을 사용하면 +-3.4*10^38 ~ +-3.4*10^38 범위의 실수를 저장 가능
      => 이 범위를 넘어가는 실수를 저장하기 위해서는 보다 큰 범위를 저장할 수 있는 다른 데이터 형을 사용해야 정상적으로 저장 가능
      => double은 더 정확하게 저장할 수 있지만, float 보다 2배의 저장 공간 필요

    - 1054번
      => if(a == 1 && b == 1) -> a&&b

    - 1058번
      => 두 개의 값이 모두 거짓일 때에만 참이 계산
          !(a || b)
</details>

-----

<details>
<summary>JAVA</summary>

    - 

</details>
