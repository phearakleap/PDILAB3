package lab3_ex;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
	int bookID;
	String title;
	String author;
	double price;
	
	public Book(int BookID, String Title, String Author, double Price) {
		this.bookID = BookID;
		this.title = Title;
		this.author = Author;
		this.price = Price;
	}
	public double getPrice() {
		return price;
	}
	public void displayDetails() {
		System.out.println("ID: " + bookID + " Title: " + title + " Author:  " + author + " Price: $ " + price);
	}
}

public class LibraryMain{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList <Book> booklist = new ArrayList<>();
		System.out.print("Enter the number of books to add: ");
		int N = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < N; i++) {
			System.out.println("\n Enter details for Book " + (i + 1) + ":");
			System.out.print("Enter BookID: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter Title: ");
			String title = scanner.nextLine();
			System.out.print("Enter Author: ");
			String author = scanner.nextLine();
			System.out.print("Enter Price: ");
			double price = scanner.nextDouble();
			scanner.nextLine();
			booklist.add(new Book(id, title, author, price));
		}
		System.out.println("\nAll Book Details");
		double Total = 0;
		
		for (Book b : booklist) {
			b.displayDetails();
			Total += b.getPrice();
		}
		
		double average = booklist.isEmpty() ? 0 : Total / booklist.size();
		
		System.out.println("Total Price: $ " + Total);
		System.out.println("Average Price: $" + average);
	
	}
}
