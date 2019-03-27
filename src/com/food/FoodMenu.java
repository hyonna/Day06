package com.food;

import java.util.Scanner;

public class FoodMenu {

	public void getSelect() {

		FoodInput fi = new FoodInput();
		fi.getInput();
		Scanner sc = new Scanner(System.in);
		Food[] fb = fi.fb;

		boolean check = true;

		System.out.println("1. 메뉴 주문");
		System.out.println("2. 정산");
		int select = sc.nextInt();

		while (check) {

			if (select == 1) {

				for (int i = 0; i < fb.length; i++) {

					System.out.println((i + 1) + " 번쨰 메뉴 이름 :" + fb[i].name);
					System.out.println((i + 1) + " 번쨰 메뉴 가격 :" + fb[i].price);

					

				}

				System.out.println("메뉴를 선택하세요");
				
				

			
					
				break;
				
			} else {

				System.out.println("프로그램 종료");
				break;

			}

		}

	}

}
