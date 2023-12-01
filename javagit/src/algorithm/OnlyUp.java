package algorithm;

import java.util.Iterator;
import java.util.Scanner;

public class OnlyUp {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int wood = 0;
        int up = 0;
        int down = 0;
        int day = 0;
        
        System.out.println("나무 막대 길이");
        wood = scanner.nextInt();
        System.out.println("올라가는 높이");
        up = scanner.nextInt();
        System.out.println("내려가는 높이");
        down = scanner.nextInt();
        
        
        if ( wood > up && up > down ) {
			while(wood > 0){
				if (wood > 0) {
					day++;
					wood -= up;
				
					if(wood > 0) {
						wood += down;
					}else {
						System.out.println("도착" + day +"일");
					}
				}
			}
        	
		}else {
			System.out.print("잘못된 입력입니다.");
		}
        
        scanner.close();
        
     }
}
