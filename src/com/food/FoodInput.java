package com.food;

import java.util.Scanner;

public class FoodInput {

	Food fd = new Food();

	public void getInput() {

		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴 수량을 입력하세요");
		int num = sc.nextInt();
		int[] menuNum = new int[num];

		for (int i = 0; i < menuNum.length; i++) {

			System.out.println("만들 메뉴의 이름을 입력");
			fd.name = sc.next();

			System.out.println("메뉴의 가격을 입력");
			fd.price = sc.nextInt();
			
			

		}

	}

}
