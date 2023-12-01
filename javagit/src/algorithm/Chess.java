package algorithm;

import java.util.Scanner;

public class Chess {
	/* 
	체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
	동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
	*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("각 흰색 피스의 개수를 입력하세요.");
        System.out.print("킹(King): ");
        int whiteKing = scanner.nextInt();
        System.out.print("퀸(Queen): ");
        int whiteQueen = scanner.nextInt();
        System.out.print("룩(Rook): ");
        int whiteRook = scanner.nextInt();
        System.out.print("비숍(Bishop): ");
        int whiteBishop = scanner.nextInt();
        System.out.print("나이트(Knight): ");
        int whiteKnight = scanner.nextInt();
        System.out.print("폰(Pawn): ");
        int whitePawn = scanner.nextInt();
        
        // 올바른 세트의 피스 개수
        int correctWhiteKing = 1;
        int correctWhiteQueen = 1;
        int correctWhiteRook = 2;
        int correctWhiteBishop = 2;
        int correctWhiteKnight = 2;
        int correctWhitePawn = 8;

        // 추가해야 할 피스 개수 계산
        int additionalKing = Math.max(0, correctWhiteKing - whiteKing);
        int additionalQueen = Math.max(0, correctWhiteQueen - whiteQueen);
        int additionalRook = Math.max(0, correctWhiteRook - whiteRook);
        int additionalBishop = Math.max(0, correctWhiteBishop - whiteBishop);
        int additionalKnight = Math.max(0, correctWhiteKnight - whiteKnight);
        int additionalPawn = Math.max(0, correctWhitePawn - whitePawn);

        System.out.println("추가해야 할 킹의 개수: " + additionalKing);
        System.out.println("추가해야 할 퀸의 개수: " + additionalQueen);
        System.out.println("추가해야 할 룩의 개수: " + additionalRook);
        System.out.println("추가해야 할 비숍의 개수: " + additionalBishop);
        System.out.println("추가해야 할 나이트의 개수: " + additionalKnight);
        System.out.println("추가해야 할 폰의 개수: " + additionalPawn);

        scanner.close();
    }
}
