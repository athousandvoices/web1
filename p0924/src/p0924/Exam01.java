package p0924;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1, num2;
		String a;
		System.out.print("첫번째 게산할 값을 입력하세요 ==> ");
		num1=s1.nextInt();
		System.out.print("+ - * / % ==> ");
		a=s1.next();
		System.out.print("두번째 계산할 값을 입력하세요 ==> ");
		num2=s1.nextInt();
		
		if(a.equals("+")){
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}else{
			if(a.equals("-")){
				System.out.println(num1+"-"+num2+"="+(num1-num2));
			}else{
				if(a.equals("*")){
					System.out.println(num1+"*"+num2+(num1*num2));
				}else{
					if(a.equals("/")){
						System.out.println(num1+"/"+num2+(num1/num2));
					}else{
						if(a.equals("%")){
							System.out.println(num1+"%"+num2+(num1%num2));
						}else{
							if(a.equals("/")&&num2==0){
								System.out.println("0으로 나누면 안됩니다.");
							}else{
								System.out.println("잘못된 계산식입니다.");
							}
						}
					}
				}
			}
		}
	}

}
