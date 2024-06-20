package com.book.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.book.DTO.BookEntity;

@Repository
public class BookDao {
	
	
	
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	//to insert employee object to the DB
	public void saveBook(BookEntity bookEntity)
	{
		transaction.begin();
		manager.persist(bookEntity);
		transaction.commit();
	}
	
	public BookEntity getBookById(int id)
	{
		BookEntity b=manager.find(BookEntity.class,id);
		return b;
	}
	
	

}
