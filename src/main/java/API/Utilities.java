package API;

import org.apache.commons.lang3.RandomStringUtils;

public class Utilities {
    private static String sampleToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY3MzczZmJmOWVkMjgwMDAxYjUxMDQ2MCIsImlhdCI6MTczMTY3NDA1MywiZXhwIjoxNzMxNjc1MjUzfQ.pLvUofN92Y-TD6zM-3xBr--FA3ULHNqgy0OvKfWL1hg";
    private static String sampleHash = "9f700ac5ed3a2f468057b8d9216e171d607a788b22c4fed354e2c0f939007523e2fb5cbc76913174";
    public static String getRandomLogin() {
        String login = RandomStringUtils.randomAlphanumeric(6) + "@yandex.ru";
        String loginToLC = login.toLowerCase();
        return loginToLC;
    }

    public static String getRandomPwd() {
        return RandomStringUtils.randomNumeric(6);
    }

    public static String getRandomString(int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }

    public static String getFakedToken() {
        char[] chars = sampleToken.toCharArray();
        return RandomStringUtils.randomAlphanumeric(chars.length);
    }

    public static String getRandomHash() {
        char[] chars = sampleHash.toCharArray();
        return RandomStringUtils.randomAlphanumeric(chars.length).toLowerCase();
    }

}