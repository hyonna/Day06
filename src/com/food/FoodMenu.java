package com.food;

import java.util.Scanner;

public class FoodMenu {

	FoodInput fi = new FoodInput();
	
	
	public void getSelect() {

		Scanner sc = new Scanner(System.in);

		boolean check = true;

		while (check) {

			System.out.println("1. 주문");
			System.out.println("2. 결산");
			int select = sc.nextInt();
			
			if(select == 1) {
				
				
				System.out.println("1. 라면");
				System.out.println("2. 김밥");
				System.out.println("3. 떡볶이");
				
				
				
				
			} else {
				
				System.out.println("프로그램 종료");
				break;
				
			}

		}

	}

}
