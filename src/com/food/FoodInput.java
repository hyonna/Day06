package com.food;

import java.util.Scanner;

public class FoodInput {

	Scanner sc = new Scanner(System.in);
	Food[] fb = null;

	public void getInput() {

		System.out.println("메뉴 수량을 입력하세요");
		int num = sc.nextInt();
		fb = new Food[3];

		for (int i = 0; i < fb.length; i++) {

			Food foodInfo = new Food();

			System.out.println("만들 메뉴의 이름을 입력");
			foodInfo.name = sc.next();

			System.out.println("메뉴의 가격을 입력");
			foodInfo.price = sc.nextInt();

			fb[i] = foodInfo;

		}

		System.out.println();

//		for (int i = 0; i < fb.length; i++) {
//
//			System.out.println("메뉴 이름 : " + fb[i].name);
//			System.out.println("메뉴 가격 : " + fb[i].price);
//			System.out.println("재고 수량 : " + fb[i].jaegoNum);
//			System.out.println("판매 수량 : " + fb[i].salNum);
//
//		}

	}

}
