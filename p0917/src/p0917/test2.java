package p0917;

import java.util.Scanner;
https://www.google.com/imgres?imgurl=https%3A%2F%2Fblogthumb.pstatic.net%2FMjAxODEyMjZfMTkg%2FMDAxNTQ1NzgyMDMxMDc5.E2BS07aBL1-eR1KwE2wlhjD-sNpDDRQPsQLavf1ETGsg.dvw2a35urYu5JEG6PoNZNGMGN3-Y0gvHOw5MRfxwoAwg.JPEG.so7712yee%2F1_%25C7%25A5%25C1%25D8.jpg%3Ftype%3Dw2&imgrefurl=https%3A%2F%2Fm.blog.naver.com%2Fso7712yee%2F221427243332&tbnid=rzS7kZSOeOz5xM&vet=12ahUKEwitv-ytwu_rAhVXAaYKHRLsBE0QMygAegUIARClAQ..i&docid=wVVRswQVWYjMeM&w=730&h=655&q=%EB%93%B1%EA%B8%89%EC%BB%B7%20%EB%B0%B1%EB%B6%84%EC%9C%84&ved=2ahUKEwitv-ytwu_rAhVXAaYKHRLsBE0QMygAegUIARClAQ
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner S1=new Scanner(System.in);
		
		System.out.println("시험 점수를 입력하세요: ");
		num1=S1.nextInt();
		System.out.println("면접 점수를 입력하세요: ");
		num2=S1.nextInt();
		
		if((num1*0.7)+(num2*0.3)>=80){ //and 연산자 &&, or 연산자 ||
			System.out.println("합격을 축하합니다.");
		}else{
			System.out.println("아쉽지만 불합격입니다.");
		}
	}

}
