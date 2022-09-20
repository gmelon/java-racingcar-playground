## 자동차 경주 게임
### 기능 요구 사항
* Car를 생성할 수 있다
  * CarName은 1~5자 사이여야 한다
  * CarPosition은 0으로 초기화한다
  * 위 두 값은 클래스로 포장한다

* CarPosition
  * 인스턴스 변수 position을 갖고, 값을 1씩 증가시키는 메서드를 갖는다 
  * 주어진 position보다 자신의 position이 더 큰지 boolean으로 반환하는 isBiggerThan() 메소드 제공

* Car.move(MovingStrategy movingStrategy)
  * MovingStrategy 라는 이름의 Functional Interface를 만들고, isMoveble의 값이 true일 때만 이동한다
  * 테스트 시 임의로 true, false를 입력한다.
  * MovingStretegy는 외부에서 지원받는다

* Car.biggerThanGivenPosition(CarPosition carPosition)
  * Cars에서 getMaxPosition()을 위해 사용되는 메서드
  * 주어진 CarPosition보다 자신이 가진 CarPosition이 클 경우 자신의 것을 반환

* Cars
  * Car를 생성해 리스트에 넣는다
  * 일급 콜렉션, List<Car> 에 대한 api를 통제한다
  * move(), findWinner(), getMaxPosition(), getCars() 메서드를 갖는다

* RacingGame
  * CarName List와 tryCount를 받아 Cars를 생성
  * tryCount 만큼 게임 진행 - play() 메소드
    * Controller에서 매 play() 마다 결과를 출력하기 위해 isEnd() 메소드와 play() 메소드를 분리한다
  * getCars(), getWinners() 메소드를 지원 (각각 Cars의 getCars(), findWinner() 메소드 호출)

* InputView
  * 쉼표로 구분된 차 이름들을 받아 배열로 반환 - getCarNames()
  * 전진 시도 횟수 입력 받기 - getTryCount()

* OutputView
  * 매 전진 결과 출력 - printPlayResult(List<car> cars)
  * 우승자 출력 - printWinners(List<Car> cars)
* 