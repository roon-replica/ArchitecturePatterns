- 개발자는 도메인보다 데이터에 초점을 맞추려는 경향이 있다?
  - 행동을 바탕으로 도메인 개념을 설계하지 않고, 데이터의 속성과 연결(외래 키)를 먼저 생각하려 한다고 함

### 엔티티 사용 이유
- 어떤 개념이 다른 모든 객체들과 반드시 구별되야 하는 제약 조건이 있을 때, 엔티티로 설계.

- 대부분의 개념은 엔티티가 아닌 값으로 모델링되야 한다고 함..

### 식별자
- 값 객체는 식별자 홀더 역할을 할 수 있다

- 식별자 생성 방법으로는 사용자가 직접, 애플리케이션에서, DB에서, 바운디드 컨텍스트에서 생성하는 방법이 있다고 함.





### 질문들
- 대부분의 개념이 엔티티가 아닌 값으로 모델링되야 DDD를 적용하기 적절하다고 하는데...

- 바운디드 컨텍스트에서 식별자 생성하는 방법이 어떤 방식인지 모름