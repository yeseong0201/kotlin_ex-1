# 코틀린

## 코틀린 배우기

자바로만 안드를 사용하다가 코틀린에 입문하게 되었습니다. ~~빨리 자바랑 손절하게 해주세요 ㅠ~~

코틀린을 배우면서 알게 된 내용들을 간단하게 적어놓았습니다.


### java와의 공통점
- xml문법은 같다.
- id를 통해 접근한다.
- Android Studio를 지원한다.
- oop이다.


**코틀린은 세미콜론(;) 이 없다.**

### 상속, 인터페이스 추가

| 차이점 | java | kotlin |
|:---:|:---:|:---:|
| 상속 | extends | :|
| 인터페이스 추가 | implements | ,|

### 변수 선언

```  kotlin
// java
TextView tv = findViewById(R.id.text);

// kotlin
var tv:TextView = findViewById(R.id.tv)
// 또는
var tv = findViewById(R.id.tv) as TextView
```

## var와 val의 차이점
* var = variable = 값을 변경할 수 있는 mutable한 변수. null을 포함할 수 있다.
* val = valuable = 값을 변경할 수 없는 immutable한 변수 



