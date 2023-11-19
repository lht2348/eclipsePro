package javagit;

import java.util.Scanner;
class Example37 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String name[]=new String[18];
		int x[]=new int[18];
		int b;
		int y[]=new int[18];
		System.out.println("이 게임은 이름 궁합 게임입니다. 재미로만 궁합을 봐주세요.");
		System.out.println("40가지의 궁합 중 하나가 선택되어지는 게임과 궁합 퍼센트를 알아보는 게임이 있습니다.");
		System.out.println("첫 번째 게임을 하고 싶으시면 1을 두번 째 게임을 하고 싶으면 2를 입력해주세요.");
		b=scan.nextInt();
		if(b==1) {
				do {
					int a=0,c=0,d=0,e;
					System.out.println("본 게임은 초성의 합을 통해서 궁합을 알아보는 게임입니다.");
					System.out.println("40을 넘을 경우 빼고 40을 넘지 않을 경우 빼지 않습니다!!");
					System.out.println("***마지막에 x를 입력하시면 게임이 끝납니다.***");
					System.out.println("***********************************************************");
					System.out.println("첫 번째 사람의 이름을 입력하세요.(단, 초성으로 입력하세요)");
					System.out.println("받침이 없을 경우 0을 입력하세요.");
					System.out.println("Example:김('ㄱ','ㅣ','ㅁ'),이('ㅇ','ㅣ','0')");
					System.out.println("***********************************************************");
					name[0]=scan.next();
					name[1]=scan.next();
					name[2]=scan.next();
					name[3]=scan.next();
					name[4]=scan.next();
					name[5]=scan.next();
					name[6]=scan.next();
					name[7]=scan.next();
					name[8]=scan.next();
					System.out.println("두 번째 사람의 성을 입력하세요.(단, 초성으로 입력하세요)");
					System.out.println("받침이 없을 경우 0을 입력하세요.");
					System.out.println("Example:김('ㄱ','ㅣ','ㅁ'),이('ㅇ','ㅣ','0')");
					System.out.println("***********************************************************");
					name[9]=scan.next();
					name[10]=scan.next();
					name[11]=scan.next();
					name[12]=scan.next();
					name[13]=scan.next();
					name[14]=scan.next();
					name[15]=scan.next();
					name[16]=scan.next();
					name[17]=scan.next();
					for(int n=0; n<18; n++) {
						if(name[n].equals("ㄱ")||name[n].equals("ㄴ")||name[n].equals("ㅇ")||name[n].equals("ㅡ")||name[n].equals("ㅣ")) {
							x[n]=1;
						}
						else if(name[n].equals("ㄷ")||name[n].equals("ㅅ")||name[n].equals("ㅈ")||name[n].equals("ㅋ")||name[n].equals("ㄹ")) {
							x[n]=2;
						}
						else if(name[n].equals("ㅏ")||name[n].equals("ㅓ")||name[n].equals("ㅗ")||name[n].equals("ㅜ")) {
							x[n]=2; 
						}
						else if(name[n].equals("ㄹ")||name[n].equals("ㅁ")||name[n].equals("ㅊ")||name[n].equals("ㅌ")||name[n].equals("ㅎ")) {
							x[n]=3;
						}
						else if(name[n].equals("ㅐ")||name[n].equals("ㅔ")||name[n].equals("ㅚ")||name[n].equals("ㅟ")||name[n].equals("ㅕ")) {
							x[n]=3;
						}
						else if(name[n].equals("ㅂ")||name[n].equals("ㅍ")||name[n].equals("ㄸ")||name[n].equals("ㅆ")||name[n].equals("ㅉ")) {
							x[n]=4;
						}
						else if(name[n].equals("ㅘ")||name[n].equals("ㅝ")||name[n].equals("ㅒ")||name[n].equals("ㅖ")) {
							x[n]=4;
						}
						else if(name[n].equals("ㅙ")||name[n].equals("ㅞ")) {
							x[n]=5;
						}
						else if(name[n].equals("ㅃ")) {
							x[n]=8;
						}
						else if(name[n].equals("0")) {
							x[n]=0;
						}
					}
					System.out.println("***********************************************************");
					for(int n=0; n<=2; n++) {
						if(name[n].equals("0"))
							System.out.print("");
						else
							System.out.print(name[n]);
					}
					System.out.print("  ");
					for(int n=3; n<=5; n++) {
						if(name[n].equals("0"))
							System.out.print("");
						else
							System.out.print(name[n]);
					}
					System.out.print("  ");
					for(int n=6; n<=8; n++) {
						if(name[n].equals("0"))
							System.out.print("");
						else
							System.out.print(name[n]);
					}
					System.out.print("  ");
					for(int n=9; n<=11; n++) {
						if(name[n].equals("0"))
							System.out.print("");
						else
							System.out.print(name[n]);
					}
					System.out.print("  ");
					for(int n=12; n<=14; n++) {
						if(name[n].equals("0"))
							System.out.print("");
						else
							System.out.print(name[n]);
					}
					System.out.print("  ");
					for(int n=15; n<=17; n++) {
						if(name[n].equals("0"))
							System.out.print("");
						else
							System.out.print(name[n]);
					}
					System.out.println("");
					for(int n=0; n<=2; n++) {
						System.out.print(x[n]+" ");
					}
					System.out.print("  ");
					for(int n=3; n<=5; n++) {
						System.out.print(x[n]+" ");
					}
					System.out.print(" ");
					for(int n=6; n<=8; n++) {
						System.out.print(x[n]+" ");
					}
					System.out.print("  ");
					for(int n=9; n<=11; n++) {
						System.out.print(x[n]+" ");
					}
					System.out.print(" ");
					for(int n=12; n<=14; n++) {
						System.out.print(x[n]+" ");
					}
					System.out.print(" ");
					for(int n=15; n<=17; n++) {
						System.out.print(x[n]+" ");
					}
					System.out.println("");
					for(int n=0; n<9; n++)
						b=b+x[n];
					System.out.println("첫 번째 사람의 초성의 합은"+b+"입니다.");
					for(int n=9; n<18; n++)
						d=d+x[n];
					System.out.println("두 번째 사람의 초성의 합은"+d+"입니다.");
						if(d+b>40) {
							System.out.println("두 사람의 초성의 합이 40을 넘었기 때문에 40을 빼겠습니다.");
							e=b+d-40;
						}
						else {
							System.out.println("두 사람의 초성의 합이 40 이하기 때문에 빼지 않겠습니다.");
							e=b+d;
						}
					if(e==1) {
						System.out.println("합: "+e);
						System.out.println("**이별하기 쉬움**");
					}
					else if(e==2) {
						System.out.println("합: "+e);
						System.out.println("**남 몰래 바라는 마음**");
					}
					else if(e==3) {
						System.out.println("합: "+e);
						System.out.println("**좋은데 싫은것**");
					}
					else if(e==4) {
						System.out.println("합: "+e);
						System.out.println("**진실한 사랑**");
					}
					else if(e==5) {
						System.out.println("합: "+e);
						System.out.println("**절교**");
					}
					else if(e==6) {
						System.out.println("합: "+e);
						System.out.println("**안타깝게 기다림**");
					}
					else if(e==7) {
						System.out.println("합: "+e);
						System.out.println("**서로 사랑**");
					}

					else if(e==8) {
						System.out.println("합: "+e);
						System.out.println("**혼자 사랑**");
					}
					else if(e==9) {
						System.out.println("합: "+e);
						System.out.println("**죽어도 좋아해**");
					}
					else if(e==10) {
						System.out.println("합: "+e);
						System.out.println("**좋아해**");
					}
					else if(e==11) {
						System.out.println("합: "+e);
						System.out.println("**거짓 사랑**");
					}
					else if(e==12) {
						System.out.println("합: "+e);
						System.out.println("**싫으면서 좋은것**");
					}
					else if(e==13) {
						System.out.println("합: "+e);
						System.out.println("**마음과는 정반대**");
					}
					else if(e==14) {
						System.out.println("합: "+e);
						System.out.println("**인연**");
					}
					else if(e==15) {
						System.out.println("합: "+e);
						System.out.println("**남자가 여자때문에 운다**");
					}
					else if(e==16) {
						System.out.println("합: "+e);
						System.out.println("**무질주 사랑**");
					}
					else if(e==17) {
						System.out.println("합: "+e);
						System.out.println("**잠시 좋은**");
					}
					else if(e==18) {
						System.out.println("합: "+e);
						System.out.println("**영원히**");
					}
					else if(e==19) {
						System.out.println("합: "+e);
						System.out.println("**다시 사귄다**");
					}
					else if(e==20) {
						System.out.println("합: "+e);
						System.out.println("**사랑을 위해서라면**");
					}
					else if(e==21) {
						System.out.println("합: "+e);
						System.out.println("**이별**");
					}
					else if(e==22) {
						System.out.println("합: "+e);
						System.out.println("**미래의 키스**");
					}
					else if(e==23) {
						System.out.println("합: "+e);
						System.out.println("**잊을 수 없는 사랑**");
					}
					else if(e==24) {
						System.out.println("합: "+e);
						System.out.println("**양다리**");
					}
					else if(e==25) {
						System.out.println("합: "+e);
						System.out.println("**이제 곧 데이트**");
					}
					else if(e==26) {
						System.out.println("합: "+e);
						System.out.println("**남자는 좋은데 여자가 안좋아함**");
					}
					else if(e==27) {
						System.out.println("합: "+e);
						System.out.println("**운명적 만남**");
					}
					else if(e==28) {
						System.out.println("합: "+e);
						System.out.println("**운명적 실수**");
					}
					else if(e==29) {
						System.out.println("합: "+e);
						System.out.println("**결혼 가능**");
					}
					else if(e==30) {
						System.out.println("합: "+e);
						System.out.println("**여자가 남자를 조심**");
					}
					else if(e==31) {
						System.out.println("합: "+e);
						System.out.println("**여자가 아깝다**");
					}
					else if(e==32) {
						System.out.println("합: "+e);
						System.out.println("**남자가 여자를 조심**");
					}
					else if(e==33) {
						System.out.println("합: "+e);
						System.out.println("**남자가 짝사랑**");
					}
					else if(e==34) {
						System.out.println("합: "+e);
						System.out.println("**여자가 남자 때문에 운다.**");
					}
					else if(e==35) {
						System.out.println("합: "+e);
						System.out.println("**꺠지기 쉽다**");
					}
					else if(e==36) {
						System.out.println("합: "+e);
						System.out.println("**어울리지 않는다**");
					}
					else if(e==37) {
						System.out.println("합: "+e);
						System.out.println("**남자가 아깝다**");
					}
					else if(e==38) {
						System.out.println("합: "+e);
						System.out.println("**여자는 좋은데 남자가 안좋아함**");
					}
					else if(e==39) {
						System.out.println("합: "+e);
						System.out.println("**여자가 짝사랑**");
					}
					else if(e==40) {
						System.out.println("합: "+e);
						System.out.println("**아주 좋은 LOVE**");
					}
					System.out.println("***********************************************************");
				}while(!name[17].equals("x"));
			}
		if(b==2) {
			
		}
	}
}