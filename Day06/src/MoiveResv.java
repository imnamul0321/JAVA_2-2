import java.util.*;

public class MoiveResv {
    // 좌석을 표시할 배열
    String[][] seat = new String[5][10];
    // 좌석에 따른 배열의 행 번호, 열 번호, 기능 동작
    char rn;
    int row_int, col, system;
    boolean confirm;
    // 이름을 확인받을 변수, 이름을 받을 변수, 취소에 쓸 이름, 열 이름, 예약 여부 표시
    String con_char, name, c_name, row, q;
    // pw = 관리자 비밀번호
    String pw = "java"; 
    

    // 인터페이스 번호를 받아 모드 변경
    public void lnterface() {
        System.out.println("안녕하세요. 좌석 예약 시스템입니다.");
        System.out.println("번호를 선택하세요:");
        System.out.print("예약(1), 취소(2), 좌석 조회(3), 종료(4): ");
        Scanner scan = new Scanner(System.in);
        try {
            system = scan.nextInt();
            switch (system) {
                case 0:	//어드민
                    Admin();
                    break;
                case 1: //예약
                    Reservation();
                    break;
                case 2: //취소
                    Cancel();
                    break;
                case 3: //조회
                    Reference();
                    break;
                case 4: //시스템종료
                    System.out.println("시스템 종료");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    // 좌석 배열 초기화
    public void lnitialize() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                seat[i][j] = "____";
            }
        }
    }

    // 관리자 모드
    public void Admin() {
        System.out.print("관리자 비밀번호를 입력하세요: ");
        Scanner scan = new Scanner(System.in);
        if (scan.nextLine().equals(pw)) {
            System.out.println("관리자 로그인 되었습니다.");
            confirm = true;
            do {
                try {
                    System.out.print("취소(1), 좌석 조회(2), 종료(3): ");
                    system = new Scanner(System.in).nextInt();
                    switch (system) {
                        case 1: //취소
                            AdminCance1();
                            break;
                        case 2: //어드민 조회
                            AdminRef();
                            break;
                        case 3: //관리자 모드 종료
                            System.out.println("관리자 모드 종료");
                            confirm = false;
                            break;
                    } //예외처리
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다.");
                }
            } while (confirm);
        } else {
            System.out.println("잘못된 비밀번호입니다.\n");
        }
    }

    // 관리자 모드에서 좌석 조회 템플릿
    public void AdminRef() {
    	rn = 'A';
        for (int i = 0; i < 5; i++) {
            System.out.println(rn + "열 ");
            col = 1;
            rn++;
            for (int j = 0; j < 10; j++) {
                q = seat[i][j].equals("____") ? " ◻ " : " ◼ ";
                System.out.print(col + q);
                col++;
            }
            System.out.println();
        }
    }

    // 기본 조회
    public void Reference() {
        rn = 'A';
        for (int i = 0; i < 5; i++) {
            System.out.print(rn + "열 ");
            col = 1;
            rn++;
            for (int j = 0; j < 10; j++) {
                q = seat[i][j].equals("____") ? " ◻ " : " ◼ ";
                System.out.print(col + q);
                col++;
            }
            System.out.println();
        }
    }

    // 예약창 대소문자 동시 사용 가능, 예약자 이름과 대조해서 y/n으로 식별
    public void Reservation() {
        Reference();
        do {
            confirm = true;
            System.out.print("예약자 성함을 입력하세요: ");
            Scanner scan = new Scanner(System.in);
            name = scan.nextLine();
            System.out.println("예약자 성함을 입력하세요: " + name);
            System.out.print("맞으면 Y, 틀리면 N: ");
            con_char = scan.next();
            confirm = (con_char.equalsIgnoreCase("Y")) ? false : true;
        } while (confirm);

        do {
            confirm = true;
            System.out.print("열을 선택하세요(A~E): ");
            Scanner scan = new Scanner(System.in);
            try {
                row = scan.next();
            } catch (Exception e) {  //A~E열
                System.out.println("A~E만 입력하세요");
            }
            if (row.equalsIgnoreCase("A")) {
                row_int = 0;
                confirm = false;
            } else if (row.equalsIgnoreCase("B")) {
                row_int = 1;
                confirm = false;
            } else if (row.equalsIgnoreCase("C")) {
                row_int = 2;
                confirm = false;
            } else if (row.equalsIgnoreCase("D")) {
                row_int = 3;
                confirm = false;
            } else if (row.equalsIgnoreCase("E")) {
                row_int = 4;
                confirm = false;
            } else {
                System.out.println("A~E만 입력하세요");
            }
        } while (confirm);

        do {
            confirm = true;
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("좌석 번호를 선택해주세요. 1~10: ");
                col = scan.nextInt();
                if (col >= 1 && col <= 10) {
                    if (seat[row_int][col - 1].equals("____")) {
                        seat[row_int][col - 1] = name;
                        confirm = false;
                    } else {
                        System.out.println("이미 예약된 자리입니다.");
                    }
                } else {
                    System.out.println("좌석은 1~10번까지 입니다.");
                }
            } catch (Exception e) {
                System.out.println("좌석은 1~10번까지 입니다.");
            }
        } while (confirm);
        System.out.println(name + "님 " + row + "열 " + col + "번으로 예약되었습니다.");
        Reference();
    }

    // 관리자 권한으로 취소
    public void AdminCance1() {
        System.out.println("이름을 입력하세요");
        Scanner scan = new Scanner(System.in);
        c_name = scan.nextLine();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (seat[i][j].equals(c_name)) {
                    seat[i][j] = "____";
                    System.out.println(c_name + "님 취소가 완료되었습니다.");
                    AdminRef();
                }
            }
        }
    }

    // 그냥 평범한 취소
    public void Cancel() {
        System.out.println("이름을 입력하세요");
        Scanner scan = new Scanner(System.in);
        c_name = scan.nextLine();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (seat[i][j].equals(c_name)) {
                    seat[i][j] = "____";
                    System.out.println(c_name + "님 취소가 완료되었습니다.");
                    AdminRef();
                }
            }
        }
    }

    // 메인 함수
    public static void main(String[] args) {
        MoiveResv movie = new MoiveResv();
        movie.lnitialize();
        while (true) {
            movie.lnterface();
            if (movie.system == 4) {
                break;
            }
        }
    }
}
