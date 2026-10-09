package com.telusko.SpringJDBCDemo;

import com.telusko.SpringJDBCDemo.Model.Alien;
import com.telusko.SpringJDBCDemo.Repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Alien alein1= context.getBean(Alien.class);
alein1.setId(105);
alein1.setName("sonam");
alein1.setTech("Java");
		AlienRepo  repo= context.getBean(AlienRepo.class);
		repo.save(alein1);
		System.out.println(repo.findAll());

	}

}
