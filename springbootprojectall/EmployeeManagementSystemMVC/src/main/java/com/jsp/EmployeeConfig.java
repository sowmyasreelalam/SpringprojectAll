package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jsp")
public class EmployeeConfig {
	
	@Bean
	public EntityManager getEntityManager()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
		return factory.createEntityManager();
	}
	@Bean
	public EntityTransaction getEntitytransaction()
	{
	return getEntityManager().getTransaction();
	}
	

}