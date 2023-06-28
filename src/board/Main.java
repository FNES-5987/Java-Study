package board;
import java.util.Scanner;

public class Main {
    private static Board[] boardArray; // boardArray 라는 배열 생성
    private static int currentIndex; // currentIndex 라는 int 변수 생성

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력 툴이 들어간다

        System.out.print("게시판 크기를 입력하세요: "); // 시작 출력
        int capacity = scanner.nextInt(); // 입력받은 int 값을 capacity에 저장
        scanner.nextLine(); // 개행 문자 제거

        boardArray = new Board[capacity]; //boardArray 배열에 capacity에 입력된 값을 할당.
        currentIndex = 0; // currentIndex변수 0으로 초기화

        while (true) { // 반복문이 실행되는 동안 무한 반복
            System.out.println("\n===== 게시판 메뉴 =====");
            System.out.println("1. 게시물 추가");
            System.out.println("2. 게시물 목록 보기");
            System.out.println("3. 게시물 상세 조회");
            System.out.println("4. 게시물 수정");
            System.out.println("5. 게시물 삭제");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt(); // 입력 받은 숫자를 choice 변수에 저장
            scanner.nextLine(); // 개행 문자 제거

            switch (choice) { // 저장받은 choice변수를 switch 명령문에 대입 후 각 할당 번호에 해당하는 값 출력
                case 1:
                    if (currentIndex < boardArray.length) { // 게시물 수 보다 게시물 최대값이 적다면 실행
                        System.out.print("게시물 제목을 입력하세요: ");
                        String title = scanner.nextLine(); // 각 변수에 입력값 저장
                        System.out.print("게시물 내용을 입력하세요: ");
                        String content = scanner.nextLine();
                        System.out.print("게시물 작성자를 입력하세요: ");
                        String author = scanner.nextLine();

                        Board newBoard = new Board(title, content, author); // newBoard변수에 위에서 입력한 값 저장
                        boardArray[currentIndex] = newBoard; // 배열 boardArray[할당 장소] 에 위에서 저장한 값 할당
                        currentIndex++; // 게시물 수 +1

                        System.out.println("게시물이 추가되었습니다."); //
                    } else {
                        System.out.println("더 이상 게시물을 추가할 수 없습니다."); // 개시물 수가 게시물 최대값보다 많다면
                    }
                    break; // switch 반복문 종료.

                case 2:
                    if (currentIndex == 0) { // 게시물 수가 0일때
                        System.out.println("게시물이 없습니다."); // 출력
                    } else { // 게시물 수가 1개라도 있다면
                        System.out.println("===== 게시물 목록 =====");
                        for (int i = 0; i < currentIndex; i++) {     // 저장된 게시물 수 만큼 반복
                            System.out.println("게시물 번호: " + (i + 1)); // -----------------
                            System.out.println("제목: " + boardArray[i].getTitle()); //------|
                            System.out.println("작성자: " + boardArray[i].getAuthor()); // --| - 출력
                            System.out.println("------------------------"); // --------------
                        }
                    }
                    break; // 위의 값 출력 후 switch반복문 종료

                case 3:
                    System.out.print("조회할 게시물 번호를 입력하세요: ");
                    int postIndex = scanner.nextInt(); // 입력값을 받아서 postIndex 변수에 저장
                    scanner.nextLine(); // 개행 문자 제거

                    if (postIndex >= 1 && postIndex <= currentIndex) { // 게시물 번호가 당연히 0번일수는 없으니 당연 1보다는 커야함.
                                                                      // 그리고(and) 없는 게시물을 불러올수는 없으니 현재 게시물 수 보다는 작아야함
                        Board selectedBoard = boardArray[postIndex - 1]; // boardArray 배열은 0 부터 시작이나 게시물은 1번부터 시작이기에 입력값 -1
                        System.out.println("===== 게시물 상세 정보 =====");
                        System.out.println("제목: " + selectedBoard.getTitle());
                        System.out.println("내용: " + selectedBoard.getContent());   // 내용 출력
                        System.out.println("작성자: " + selectedBoard.getAuthor());
                        System.out.println("------------------------"); // 내용 출력
                    } else {
                        System.out.println("유효하지 않은 게시물 번호입니다.");
                    }
                    break;

                case 4:
                    System.out.print("수정할 게시물 번호를 입력하세요: ");
                    int editIndex = scanner.nextInt(); // 입력받은 숫자를 editIndex 변수에 저장
                    scanner.nextLine(); // 개행 문자 제거

                    if (editIndex >= 1 && editIndex <= currentIndex) { // 게시물 번호가 당연히 0번일수는 없으니 당연 1보다는 커야함.
                                                                       // 그리고(and &&) 없는 게시물을 불러올수는 없으니 현재 게시물 수 보다는 작아야함
                        Board editBoard = boardArray[editIndex - 1];   // 마찬가지로 배열은 0부터 시작이나 게시물은 1부터 시작이기에 입력받은 수 -1 을 해야함
                        System.out.print("수정할 제목을 입력하세요: ");
                        String newTitle = scanner.nextLine();          // 입력받은 Stings값을 newTitle 변수에 저장
                        System.out.print("수정할 내용을 입력하세요: ");
                        String newContent = scanner.nextLine();        // 입력받은 Stings값을 newContent 변수에 저장

                        editBoard = new Board(newTitle, newContent, editBoard.getAuthor());  // 수정된 내용을 editBoard 변수에 저장
                        boardArray[editIndex - 1] = editBoard;         // 원래 있던 배열 자리에 수정된 내용 저장

                        System.out.println("게시물이 수정되었습니다.");
                    } else {
                        System.out.println("유효하지 않은 게시물 번호입니다.");
                    }
                    break;

                case 5:
                    System.out.print("삭제할 게시물 번호를 입력하세요: ");
                    int deleteIndex = scanner.nextInt();  // 입력받은 int값을 deleteIndex 변수에 저장
                    scanner.nextLine(); // 개행 문자 제거
                    if (deleteIndex >= 1 && deleteIndex <= currentIndex) {
                        System.out.println("정말 삭제하시겠습니까?");
                        System.out.println("삭제 : 1, 취소 : 2");
                        int choose = scanner.nextInt();
                        switch (choose) {
                            case 1 :
                                for (int i = deleteIndex - 1; i < currentIndex - 1; i++) {     //삭제할 게시물 번호는 변수위치에서 -1 이기에 deleteIndex -1 을 해야함.
                                                                                               //위와 같은 이유로 게시물 수 - 1만큼 해줘야함. ex) 100번 개시물은 99번째 배열에 있음
                                    boardArray[i] = boardArray[i + 1];  // i번째 배열을 i+1번째 배열로 바꾸면서 한칸씩 앞으로 이동 (자연스럽게 i번째에 할당된 배열은 i+1번째 배열로 변경)
                                }
                                currentIndex--; // 게시물 하나가 사라졌으니 게시물 숫자 -1

                                System.out.println("게시물이 삭제되었습니다.");
                                break;

                            case 2 :
                                System.out.println("취소되었습니다.");
                                break;

                            default:
                                System.out.println("유효한 입력값이 아닙니다.");
                        }
                    } else
                        System.out.println("없는 게시물입니다.");
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close(); // 입력창 종료
                    System.exit(0); // 실행창 종료
                    break;

                default:
                    System.out.println("잘못된 메뉴 선택입니다."); // 스위치에 할당한 숫자 외 를 입력할 경우 출력
            }
        }
    }
}
