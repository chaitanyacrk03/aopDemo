package com.flashyy.aopDemo;

import com.flashyy.aopDemo.Account.Account;
import com.flashyy.aopDemo.dao.AccountDao;
import com.flashyy.aopDemo.dao.MembershipDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(AccountDao accountDao, MembershipDao membershipDao){
		return runner->{
				demoTheBeforeAdvice(accountDao, membershipDao);
		};
	}

	private void demoTheBeforeAdvice(AccountDao accountDao, MembershipDao membershipDao) {
		Account account=new Account("sachin","god");
		accountDao.addAccount(account);
		membershipDao.addAccount();
	}

}
