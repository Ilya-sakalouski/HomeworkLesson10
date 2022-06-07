package src.tasks;

public class Task1 {

    static String part1(String s) {
        String[] newString = s.split("-");
        return newString[0] + "-" + newString[2];
    }

    static String part2(String s) {
        String[] newString = s.split("-");
        return s.replace(newString[1], "***").replace(newString[3], "***");
    }

    static String part3(String s) {
        StringBuffer sb = new StringBuffer(s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", ""));
        return String.valueOf(sb.insert(3, "/").insert(7, "/").insert(9, "/"));
    }

    static String part5(String s) {
        s.toLowerCase();
        return String.valueOf(s.contains("abc"));
    }

    static String part6(String s) {
        return String.valueOf(s.startsWith("555"));
    }

    static String part7(String s) {
        return String.valueOf(s.endsWith("1a2b"));
    }
}
