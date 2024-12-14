## 기능 목록

### 입력

- [x]  월(숫자)과 시작 요일(일, 월, 화, 수, 목, 금, 토) 정보를 입력받아라
  - [x]  월에 숫자 이외의 문자가 온다면, 예외를 발생시켜라
  - [x]  월에 1 ~ 12 이외의 숫자가 온 경우, 예외를 발생시켜라
  - [x]  구분자가 `,`  형식이 아니라면 예외를 발생시켜라
- [ ]  평일 비상 근무 순서를 입력받는다.
  - [ ]  구분자를 `,` 형식이 아니라면 예외를 발생시켜라
  - [ ]  존재하지 않는 이름이라면, 예외를 발생시켜라
  - [ ]  중복이 존재한다면, 예외를 발생시켜라
  - [ ]  1자 미만, 5자 초과의 이름이라면, 예외를 발생시켜라
  - [ ]  인원이 5명 미만이라면, 예외가 발생한다.
  - [ ]  인원이 35명 초과라면, 예외가 발생한다.
- [ ]  휴일(토요일, 일요일, 법정공휴일) 비상 근무 순서를 입력받는다.
  - [ ]  존재하지 않는 이름이라면, 예외를 발생시켜라
  - [ ]  중복이 존재한다면 예외를 발생시켜라
  - [ ]  1자 미만, 5자 초과의 이름이라면, 예외를 발생시켜라
  - [ ]  인원이 5명 미만이라면, 예외가 발생한다.
  - [ ]  인원이 35명 초과라면, 예외가 발생한다.

```
비상 근무를 배정할 월과 시작 요일을 입력하세요> 5,월
평일 비상 근무 순번대로 사원 닉네임을 입력하세요> 준팍,도밥,고니,수아,루루,글로,솔로스타,우코,슬링키,참새,도리
휴일 비상 근무 순번대로 사원 닉네임을 입력하세요> 수아,루루,글로,솔로스타,우코,슬링키,참새,도리,준팍,도밥,고니
```

- [ ]  올바르지 않은 입력을 할 경우 `[ERROR]`로 시작하는 에러 메시지를 출력 후 다시 입력받는다.
- [ ]  비상 근무를 배정할 월과 시작 요일의 입력 값이 올바르지 않은 경우, '비상 근무를 배정할 월과 시작 요일'부터 다시 입력받는다.

```
비상 근무를 배정할 월과 시작 요일을 입력하세요>
[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요.
비상 근무를 배정할 월과 시작 요일을 입력하세요>

```

- [ ]  평일 순번 또는 휴일 순번의 입력 값이 올바르지 않은 경우, '평일 순번'부터 다시 입력 받는다.

```
비상 근무를 배정할 월과 시작 요일을 입력하세요> 1,금
평일 비상 근무 순번대로 사원 닉네임을 입력하세요> 준팍,도밥,고니,수아,루루,글로
휴일 비상 근무 순번대로 사원 닉네임을 입력하세요> 수아,수아,글로,고니,도밥,준팍
[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요.
평일 비상 근무 순번대로 사원 닉네임을 입력하세요>
```

### 출력

- [ ]  비상 근무 월과 요일을 입력받기 위한 소개말을 출력하라

```
비상 근무를 배정할 월과 시작 요일을 입력하세요>
```

- [ ]  평일 비상 근무 인원을 입력받기 위한 소개말을 출력하라

```
평일 비상 근무 순번대로 사원 닉네임을 입력하세요>
```

- [ ]  휴일 비상 근무 인원을 입력받기 위한 소개말을 출력하라

```
휴일 비상 근무 순번대로 사원 닉네임을 입력하세요>
```

- [ ]  예외를 출력하라

```
[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요.
```

- [ ]  근무 날짜, 요일, 근무 인원의 이름을 출력하라
  - [ ]  평일이면서 법정공휴일의 경우에만 요일 뒤에 (휴일) 표기를 해야 한다.

```
5월 1일 월 준팍
5월 2일 화 도밥
5월 3일 수 고니
5월 4일 목 수아
5월 5일 금(휴일) 루루
5월 6일 토 수아
5월 7일 일 글로
5월 8일 월 루루
5월 9일 화 글로
5월 10일 수 솔로스타
5월 11일 목 우코
5월 12일 금 슬링키
5월 13일 토 솔로스타
5월 14일 일 우코
5월 15일 월 참새
5월 16일 화 도리
5월 17일 수 준팍
5월 18일 목 도밥
5월 19일 금 고니
5월 20일 토 슬링키
5월 21일 일 참새
5월 22일 월 수아
5월 23일 화 루루
5월 24일 수 글로
5월 25일 목 솔로스타
5월 26일 금 우코
5월 27일 토 도리
5월 28일 일 준팍
5월 29일 월 슬링키
5월 30일 화 참새
5월 31일 수 도리
```

### 실행 결과 예시

### 기능

**비상 근무일 배정 규칙**

- 기본적으로 순번에 따라 비상 근무일을 배정한다.
  - 회사에서는 평일과 휴일(토요일, 일요일, 법정공휴일) 비상 근무 순번을 다르게 운영하고 있다.
  - 평일 순번과 휴일 순번의 순서는 다를 수 있다.
- [ ]  연도는 고려하지 않으며, 매년 2월은 28일까지만 있다고 가정하라
- [ ]  비상 근무자는 평일 순번, 휴일 순번에 각각 1회 편성되어야 한다.
  - 잘못된 예시: 수아가 두 번 편성된 경우

      ```
      평일 순번: 수아, 루루, 글로, 솔로스타, 수아, 슬링키, 참새, 도리, 준팍, 도밥, 고니
      ```

- [ ]  근무자 보호와 비상 근무 운영의 효율을 위해, 비상 근무자는 어떤 경우에도 연속 2일은 근무할 수 없다.
  - [ ]  순번상 특정 근무자가 연속 2일 근무하게 되는 상황에는, 다음 근무자와 순서를 바꿔 편성한다.
  - 예를 들어, 수아가 평일인 목요일에 비상 근무를 서고, 다음 날인 금요일이 휴일이면서 순번상 또다시 수아가 근무해야 할 경우,
  - 다음 휴일 근무자와 순서를 바꿔서 근무한다.
  - 예시)
    - 평일 순번: 준팍,도밥,고니,수아,루루,글로,솔로스타,우코,슬링키,참새,도리
    - 휴일 순번: 수아,루루,글로,솔로스타,우코,슬링키,참새,도리,준팍,도밥,고니
    - 근무 예시: 준팍(월요일),도밥(화요일),고니(수요일),수아(목요일),루루(금요일/휴일),수아(토요일/휴일),...
- [ ]  만약에 법정공휴일인 수요일에 수아가 비상 근무를 서고 다음 날 평일 순번이 수아인 경우에는, 다음 평일 근무자와 순서를 바꿔서 근무한다.
  - 예시)
    - 평일 순번: 준팍,도밥,수아,루루,글로,솔로스타,우코,슬링키,참새,도리,고니
    - 휴일 순번: 수아,루루,글로,솔로스타,우코,슬링키,참새,도리,준팍,도밥,고니
    - 근무 예시: 준팍(월요일),도밥(화요일),수아(수요일/휴일),루루(목요일),수아(금요일),루루(토요일/휴일),글로(일요일/휴일),...
- 비상 근무자 배정 시 다음 근무자와 순서를 바꿔야 하는 경우에는, 앞의 날짜부터 순서를 변경해야 한다.

```
[법정 공휴일]
1월 1인 신정
3월 1일
5월 5일
6월 6일
8월 15일
10월 3일
10월 9일
12월 25일
```

### 실행 흐름

1. 비상 근무 월과 요일을 입력받아라
  1. 비상 근무 월과 요일 안내 메시지를 출력하라
  2. 비상 근무 월과 요일 안내 메시지를 입력하라
  3. 월에 숫자 이외의 문자가 온다면, 예외를 발생시켜라
  4. 월에 1 ~ 12 이외의 숫자가 온 경우, 예외를 발생시켜라
  5. 구분자가 `,`  형식이 아니라면 예외를 발생시켜라
2. 평일 비상 근무 인원을 입력받아라
  1. 구분자를 `,` 형식이 아니라면 예외를 발생시켜라
  2. 존재하지 않는 이름이라면, 예외를 발생시켜라
  3. 중복이 존재한다면, 예외를 발생시켜라
  4. 1자 미만, 5자 초과의 이름이라면, 예외를 발생시켜라
  5. 인원이 35명 초과라면, 예외가 발생한다.
3. 휴일 비상 근무 인원을 입력받아라
  1. 구분자를 `,` 형식이 아니라면 예외를 발생시켜라
  2. 존재하지 않는 이름이라면, 예외를 발생시켜라
  3. 중복이 존재한다면, 예외를 발생시켜라
  4. 1자 미만, 5자 초과의 이름이라면, 예외를 발생시켜라
  5. 인원이 35명 초과라면, 예외가 발생한다.
4. 비상 근무 순서대로, 근무를 선정한다.
  1. 평일과 휴일의 순서는 다르게 진행된다.
  2. 만약 평일과 휴일이 겹쳐 인원이 2일 연속으로 근무하게 된다면, 다음과 같이 진행한다.
    1. 휴일이 먼저 오는 경우, 평일 근무를 다음 인원과 교체한다.
    2. 평일이 먼저 오는 경우, 휴일 근무를 다음 인원과 교체한다.
5. 결과 비상 근무를 출력한다.
  1. 평일이면서 법정 공휴일인 경우에만, (휴일)을 붙여 출력한다.