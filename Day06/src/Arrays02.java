import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {
        String[] names = {
            "홍길동",
            "로빈훗",
            "이순신",
            "정약용",
            "이황",
            "정우성",
            "고현정",
            "박명수",
            "홍진경",
            "이영자",
            "이준기"
            
        };

        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println("[i=" + i + "].....[" + names[i] + "]");
        }
    }
}
