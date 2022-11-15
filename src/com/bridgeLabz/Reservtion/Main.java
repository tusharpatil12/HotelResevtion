package com.bridgeLabz.Reservtion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("...welcome to Hotel Reservtion System...");
		
		Hotel check =new Hotel();
        Hotel hotel_1 =new Hotel("LakeWood","Regular", 30,220);
        Hotel hotel_2 =new Hotel("RidgeWood","Reward", 15, 100);
        Hotel hotel_3 =new Hotel("Karma","Regular", 20 ,800);
        Hotel hotel_4 =new Hotel("HanShRaj","Reward", 30,  120);
        Hotel hotel_5 =new Hotel("DBCity","Reward", 25 ,1500);
        Hotel hotel_6 =new Hotel("Golden","Regular", 20 ,220);
        Hotel hotel_7 =new Hotel("Milan","Reward", 10, 80);
        Hotel hotel_9 =new Hotel("Vmart","Regular", 15, 6000);
        Hotel hotel_10 =new Hotel("GoldenCity","Regular", 25,150);
        ArrayList<Hotel>hotels =new ArrayList<>();
        hotels.add(hotel_1);
        hotels.add(hotel_2);
        hotels.add(hotel_3);
        hotels.add(hotel_4);
        hotels.add(hotel_5);
        hotels.add(hotel_6);
        hotels.add(hotel_7);
        hotels.add(hotel_9);
        hotels.add(hotel_10);
        System.out.println("...................display hotels...............");
        System.out.println(hotels);
        
        int choice;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println(" 1. enter for check available");
            System.out.println(" 2. enter for all display");
            System.out.println(" 0. enter for exit");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter customer type");
                    String customerType =sc.nextLine();
                    System.out.println("Enter date format(01/01/2000)");
                    String date_1 =sc.nextLine();
                    System.out.println("Enter date format(01/01/2000)");
                    String date_2 =sc.nextLine();
                   check.checkAvailable(hotels,customerType,date_1,date_2);
                   break;
                case 2:
                    Iterator<Hotel>iterator = hotels.iterator();
                    while (iterator.hasNext()){
                        Hotel hotel =iterator.next();
                        System.out.println(hotel);
                    }
            }
        }while (choice!=0);

	}

}
