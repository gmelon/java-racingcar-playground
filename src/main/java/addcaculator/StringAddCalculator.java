package addcaculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    private static final String basicDelimiter = ",|:";
    private static final String customDelimiterRegex = "//(.)\n(.*)";
    private static final String exceptionMessage = "0 이상의 자연수만 입력 가능합니다";

    public static int splitAndSum(String text) {
        if (text == null) {
            return 0;
        }
        if (text.isEmpty()) {
            return 0;
        }
        Matcher customDelimiterMatcher = getCustomDelimiterMatcher(text);
        if (checkCustomDelimiterUsed(customDelimiterMatcher)) {
            String[] tokens = getCustomDelimiterTokens(customDelimiterMatcher);
            return getSumOfTokens(tokens);
        }
        String[] tokens = text.split(basicDelimiter);
        return getSumOfTokens(tokens);
    }

    private static String[] getCustomDelimiterTokens(Matcher matcher) {
        String customDelimiter = matcher.group(1);
        return matcher.group(2).split(customDelimiter);
    }

    private static boolean checkCustomDelimiterUsed(Matcher matcher) {
        return matcher.find();
    }

    private static Matcher getCustomDelimiterMatcher(String text) {
        return Pattern.compile(customDelimiterRegex).matcher(text);
    }

    private static int getSumOfTokens(String[] tokens) {
        int result = 0;
        for (String token : tokens) {
            int parsedToken;
            parsedToken = checkTokenIsNumberAndGetParsedToken(token);
            checkTokenAboveZero(parsedToken);
            result += parsedToken;
        }
        return result;
    }

    private static void checkTokenAboveZero(int parsedToken) {
        if (parsedToken < 0) {
            throwExceptionThatTokenMustBeNumber();
        }
    }

    private static int checkTokenIsNumberAndGetParsedToken(String token) {
        int parsedToken = 0;
        try {
            parsedToken = Integer.parseInt(token);
        } catch (NumberFormatException e) {
            throwExceptionThatTokenMustBeNumber();
        }
        return parsedToken;
    }

    private static void throwExceptionThatTokenMustBeNumber() {
        throw new RuntimeException(exceptionMessage);
    }
}
