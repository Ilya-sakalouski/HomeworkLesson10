package src.task1;

public class Task5 {
    void task5Ansver() {
        String str = "Hello";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
