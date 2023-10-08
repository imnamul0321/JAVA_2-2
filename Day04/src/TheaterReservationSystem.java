import java.util.Scanner;

public class TheaterReservationSystem {
    public static void main(String[] args) {
        int numSeats = 10;
        int[] seats = new int[numSeats]; // 좌석 배열 초기화

        Scanner scanner = new Scanner(System.in);
        System.out.println("극장 좌석 배치표:");
        displaySeats(seats);

        while (true) {
            System.out.print("예약할 좌석 번호를 입력하세요 (음수 입력 시 종료): ");
            int seatNumber = scanner.nextInt();

            if (seatNumber < 1 || seatNumber > numSeats) {
                System.out.println("잘못된 좌석 번호입니다. 1부터 10 사이의 번호를 입력하세요.");
            } else if (seats[seatNumber - 1] == 1) {
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
            } else {
                seats[seatNumber - 1] = 1;
                System.out.println("좌석 " + seatNumber + "이(가) 예약되었습니다.");
                displaySeats(seats);
            }

            if (seatNumber < 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }

    // 좌석 상태를 출력하는 함수
    private static void displaySeats(int[] seats) {
        for (int i = 0; i < seats.length; i++) {
            System.out.print((seats[i] == 0) ? "0 " : "1 ");
        }
        System.out.println();
    }
}