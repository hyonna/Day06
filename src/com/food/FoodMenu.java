package com.food;

import java.util.Scanner;

public class FoodMenu {

	FoodInput fi = new FoodInput();
	

	public void getSelect() {

		Scanner sc = new Scanner(System.in);

		boolean check = true;
		
		System.out.println("1. 메뉴 주문");
		System.out.println("2. 정산");
		int select = sc.nextInt();

		while (check) {


			if (select == 1) {

				
				System.out.println("1. 라면");
				System.out.println("2. 김밥");
				System.out.println("3. 떡볶이");
				System.out.println("4. 주문");
				int selectMenu = sc.nextInt();

				
				System.out.println("수량을 입력하세요");
				int selectNum = sc.nextInt();
				
				
				
				

				

			} else {

				System.out.println("프로그램 종료");
				break;

			}

		}

	}

}
