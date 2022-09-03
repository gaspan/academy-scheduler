package com.dans.academy.academyscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AcademySchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademySchedulerApplication.class, args);
	}

}
