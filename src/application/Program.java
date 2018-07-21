package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int numberRooms = sc.nextInt();
		sc.nextLine();
		
		Student[] rooms = new Student[10];
		
		for(int i=0; i<numberRooms; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room =  sc.nextInt();
			sc.nextLine();
			rooms[room] = new Student(name, email); 
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i=0; i<rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.printf("%d: %s%n", i, rooms[i]);
			}
		}
		
		
		sc.close();
	}

}
