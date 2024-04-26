package ex_3;

import java.util.Scanner;

public class leehansol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String lunchMenu[];
		lunchMenu = new String[5];
		System.out.println("먹고 싶은 메뉴 5가지를 입력하세요");
		//콘솔에서 입력한 음식메뉴를 배열에 담기 
		for (int i = 0; i < lunchMenu.length; i++) {
			lunchMenu[i] = scanner.next();
		}
			
		System.out.println("오늘 먹고 싶은 점심 메뉴 리스트");
		//반복문으로 배열에서 문자열 타입의 요소를 하나씩 출력하는 작업
		for (int i = 0; i < lunchMenu.length; i++) {
			System.out.println("lunchMenu : "+ lunchMenu[i]);
		}
	}




	}


