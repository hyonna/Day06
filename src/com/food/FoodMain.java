package com.food;

public class FoodMain {

	public static void main(String[] args) {
		
		FoodInput fi = new FoodInput();
		FoodMenu fm = new FoodMenu();
		
		fi.getInput(); //음식 정보 입력
		
		fm.getSelect(); //음식 선택

	}

}
