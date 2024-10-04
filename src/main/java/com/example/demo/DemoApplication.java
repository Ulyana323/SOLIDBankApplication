package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class DemoApplication {

	private static final String help =
			"""
                    Welcome to CLI bank service
                    Enter operation number:
                    1 - show accounts
                    2 - create account
                    #3 - deposit
                    #4 - withdraw
                    #5 - transfer
                    6 - this message
                    7 - exit""";

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MYCLI myCLI = context.getBean("mycli", MYCLI.class);
		Scanner scanner = myCLI.getScanner();
		String clientId = myCLI.requestClientAmountNumber();
		System.out.println(help);
		AccountDAO memoryAccountDAO = context.getBean("memoryAccountDAO", MemoryAccountDAO.class);
		AccountCreationService accountCreationService =
				context.getBean("accountCreationServiceimpl", AccountCreationServiceImpl.class);
		BankCore bankCore = context.getBean("bankCore", BankCore.class);
		AccountListingService accountListingService =
				context.getBean("accountListingServiceImpl", AccountsListingServiseImpl.class);
		AccountBasicCLI accountBasicCLI = context.getBean("accountBasicCLI", AccountBasicCLI.class);

		while (scanner.hasNext()) {
			switch (scanner.next()) {
				case "1" -> accountBasicCLI.getAcccounts(clientId);
				case "2" -> accountBasicCLI.createAccountRequest(clientId);
				case "6" -> System.out.println(help);
				case "7" -> System.exit(0);
				default -> System.out.println("Wrong operation number");
			}
		}
		context.close();
	}

}
