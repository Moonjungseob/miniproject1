package ex_1;

import java.util.Scanner;

public class hongjintae {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			String[] foodMenu = new String[5];

			for (int i = 0; i < foodMenu.length; i++) {
				System.out.println("원하는 메뉴를 입력해주세요");
				foodMenu[i] = scanner.next();
			}

			for (int i = 0; i < foodMenu.length; i++) {

				if (i == 0) {
					System.out.print(foodMenu[i]);

				} else {
					System.out.print(", " + foodMenu[i]);
				}

			}

		}




	}

