package com.apipothi.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.apipothi.example.dao.Book;

@Component
public class Bookservice {
	
	Map<String,Book> booksDeatails=new HashMap<String,Book>();

	public List<Book> getBookData(String booksid) {
		
		String bookid=booksid;
		
		Map<String, Book> mybookmap=bookData();
		List<Book> serviceResponse=new ArrayList<Book>();
		Book value=null;
		
		Set<String> key=mybookmap.keySet();
		Iterator<String> itr=key.iterator();
		while(itr.hasNext()) {
			String mapkey=(String)itr.next();
			if(mapkey.equals(bookid));{
			value=mybookmap.get(mapkey);
				serviceResponse.add(value);
			}
			
			 
		}
		
		// TODO Auto-generated method stub
		return serviceResponse;
	}
		
	public Map<String, Book> bookData(){
		booksDeatails.put("1", new Book(100, "JAVA", 100));
		booksDeatails.put("2", new Book(100, "JAVA", 200));
		booksDeatails.put("3", new Book(100, "JAVA", 300));
		booksDeatails.put("4", new Book(100, "JAVA", 400));
		booksDeatails.put("5", new Book(100, "JAVA", 500));
		booksDeatails.put("6", new Book(100, "JAVA", 600));
		booksDeatails.put("7", new Book(100, "JAVA", 700));
		booksDeatails.put("8", new Book(100, "JAVA", 800));
		booksDeatails.put("9", new Book(100, "JAVA", 900));
		
		return booksDeatails;
		
	}

}
