package com.composition.zak;

public class BookRunner {

	public static void main(String[] args) {
		Book book= new Book(123, "object oriented p","Ranga");
		book.addReview(new Review(10, "Great Book",5));
		book.addReview(new Review(101,"Awesome",5));
		System.out.println(book);

	}

}
