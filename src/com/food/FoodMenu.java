package com.food;

import java.util.Scanner;

public class FoodMenu {

	public void getSelect() {

		FoodInput fi = new FoodInput();
		fi.getInput();
		Scanner sc = new Scanner(System.in);
		Food[] fb = fi.fb;

		int ramen = 0;
		int ramenPrice = 0;
		int kim = 0;
		int kimPrice = 0;
		int dduck = 0;
		int dduckPrice = 0;
		int total = 0;
		int count = 0;

		boolean check = true;

		System.out.println("1. 메뉴 주문");
		System.out.println("2. 정산");
		int select = sc.nextInt();

		if (select == 1) {

			while (check) {

				for (int i = 0; i < fb.length; i++) {

					System.out.println((i + 1) + "번쨰 메뉴 이름 :" + fb[i].name);
					System.out.println((i + 1) + "번쨰 메뉴 가격 :" + fb[i].price + "원");
					System.out.println();

				}

				check = !check;
			}

			boolean check2 = true;

			while (check2) {

				System.out.println("메뉴를 선택하세요");

				System.out.println("1. 라면");
				System.out.println("2. 김밥");
				System.out.println("3. 떡볶이");
				System.out.println("4. 결제");
				int menuSelect = sc.nextInt();

				

				if (menuSelect <= fb.length) {
					
					System.out.println("수량을 입력하세요");
					count = sc.nextInt();

					for (int i = 0; i < fb.length; i++) {

						
						fb[i].price = fb[i].price * count;
						fb[i].jaegoNum -= count;

					}

				} else {

					System.out.println("다시 주문하시겠습니까?");
					System.out.println("1. 예");
					System.out.println("2. 아니오");
					int againSelect = sc.nextInt();

					if (againSelect == 1) {

					} else {

						

							System.out.println("==== 총 주문 내역 ====");
							System.out.println("주문하신 메뉴 : " + fb[0].name);
							System.out.println("주문하신 메뉴 수량 : " + count);
							System.out.println("총 금액 : " + fb[0].price);
							System.out.println("남은 재고 : " + fb[0].jaegoNum);
							System.out.println();

						

					}

				}
			break;
			
			}
		} else {

			System.out.println("프로그램 종료");

		}

//		while (check) {
//
//			if (select == 1) {
//
//				for (int i = 0; i < fb.length; i++) {
//
//					System.out.println((i + 1) + " 번쨰 메뉴 이름 :" + fb[i].name);
//					System.out.println((i + 1) + " 번쨰 메뉴 가격 :" + fb[i].price);
//
//					
//
//				}
//
//				System.out.println("메뉴를 선택하세요");
//				
//				
//
//			
//					
//				break;
//				
//			} else {
//
//				System.out.println("프로그램 종료");
//				break;
//
//			}
//
//		}

	}

}
