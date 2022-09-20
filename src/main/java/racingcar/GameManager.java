package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.utils.InputView;
import racingcar.utils.OutputView;

public class GameManager {

    public static void main(String[] args) {
        OutputView.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Cars cars = getCars(InputView.getNextLine());
        OutputView.println("시도할 횟수는 몇회인가요?");
        int tryCount = InputView.getNextInt();

        OutputView.println("실행 결과");

        List<PlayStatus> playStatuses = null;
        int maxPosition = Integer.MIN_VALUE;
        for (int i = 0; i < tryCount; i++) {
            playStatuses = cars.play();
            maxPosition = processPlayStatus(playStatuses, maxPosition);
            OutputView.println(""); // 개행
        }

        // 게임 종료
        List<String> virtoryCarName = new ArrayList<>();
        for (PlayStatus playStatus : playStatuses) {
            addVictoryCarIfPositionOverMaxPosition(maxPosition, virtoryCarName, playStatus);
        }
        OutputView.println(
            virtoryCarName.toString().replace("[", "").replace("]", "") + "가 최종 우승했습니다.");
    }

    private static void addVictoryCarIfPositionOverMaxPosition(int maxPosition,
        List<String> virtoryCarName, PlayStatus playStatus) {
        if (playStatus.isOverMaxPosition(maxPosition)) {
            virtoryCarName.add(playStatus.getCarNameValue());
        }
    }

    private static int processPlayStatus(List<PlayStatus> playStatuses, int maxPosition) {
        for (PlayStatus playStatus : playStatuses) {
            OutputView.println(playStatus.getStatusMessage());
            maxPosition = Math.max(maxPosition, playStatus.getCarPositionValue());
        }
        return maxPosition;
    }


    private static Cars getCars(String nextLine) {
        String[] carNames = nextLine.split(",");
        List<Car> carList = Arrays.stream(carNames)
            .map(Car::new)
            .collect(Collectors.toList());
        return new Cars(carList);
    }

}
