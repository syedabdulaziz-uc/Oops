package com.book.acd;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfLanguage=new Book();
		Book effectiveCode=new Book();
		Book cleanCode=new Book();
		artOfLanguage.setNoCopies(10);
		effectiveCode.setNoCopies(15);
		cleanCode.setNoCopies(25);
		System.out.println(artOfLanguage.getNoCopies());
		System.out.println(effectiveCode.getNoCopies());
		cleanCode.toString();
		System.out.println(cleanCode.toString());
		
	}

}
