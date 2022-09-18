package racingcar.utils;

import java.util.Scanner;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    public static String getNextLine() {
        return sc.nextLine();
    }

    public static int getNextInt() {
        return sc.nextInt();
    }

}
