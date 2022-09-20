### WARN 메세지
- HttpMediaTypeNotAcceptableException: Could not find acceptable representation

### 원인
응답 DTO에 getter가 없었어서... 잭슨이 json 응답만들 때 오류났나봄

### 해결
응답 DTO에 getter 추가..

그리고 body있는 요청에 대해 @RequestBody 좀 깜빡하지 말자...
@RequestParam 생략되니까 계속 @RequestBody도 까먹고 생략하다가 동작하지 않는 이유를 찾게 됨.