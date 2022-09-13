# 문자열 계산기
## 기능 요구 사항
* 기본적으로 구분자는 쉼표(,) 또는 콜론(:)
* 구분자를 기준으로 분리한 각 숫자의 합을 반환
  1. 아무 숫자도 입력하지 않으면 0(합이 0) 반환
  2. 하나의 숫자만 입력하면 해당 숫자 그대로 반환
  3. 여러 숫자를 입력하면 해당 숫자들의 합을 반환
* 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정 가능
  * 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용
* 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw
---
# 자동차 경주 게임
## 기능 요구 사항
* 경주 시작 시 자동차의 이름을 입력받는다
  * 자동차 이름은 최대 5자.  
  * 자동차 이름은 쉼표(,)를 기준으로 구분한다. 
* 경주 시작 시 몇 번을 시도할지 입력받는다
  * 입력받은 횟수만큼 각 자동차를 랜덤하게 전진시키고 전진 시 마다 자동차의 상태를 출력한다
  * 상태 정보는 자동차의 이름, 현재 위치 정보
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 **random 값이 4이상일 경우**이다.
  * 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
  * 우승자는 한명 이상일 수 있다(서로 같은 거리를 전진한 자동차)