package com.main;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SbShedulingProj01Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SbShedulingProj01Application.class, args);
		System.out.println("App Started At::"+new Date());
	}

}
