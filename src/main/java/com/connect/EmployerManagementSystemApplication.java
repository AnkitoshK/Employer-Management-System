package com.connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployerManagementSystemApplication {

	public static void main(String[] args)
	{
		SplashScreen splash = new SplashScreen(5000); // 5000 milliseconds (3 seconds)
		splash.showSplashAndExit();
		SpringApplication.run(EmployerManagementSystemApplication.class, args);
	}

}


