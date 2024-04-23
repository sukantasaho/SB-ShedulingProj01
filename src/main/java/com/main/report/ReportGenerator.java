package com.main.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("reportGeneration")
public class ReportGenerator
{
    
	
	/*@Scheduled(initialDelay = 2000, fixedDelay = 5000) 
	public void generateSalesReport()
	{ 
	  System.out.println("Sales Report On::"+new Date()); 
	}*/
	 
	
	/*@Scheduled(fixedDelayString = "3000")
	public void generateSalesReport()
	{
		System.out.println("Sales Report On::"+new Date());
	}*/
	
	/*@Scheduled(fixedDelay = 3000)
	public void generateReport()
	{
		System.out.println("Sales Report Start On::"+new Date());
		try
		{
			Thread.sleep(10000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Sales Report End On::"+new Date());
	}*/
	
	/*@Scheduled(fixedDelay = 3000)
	public void generateReport()
	{
		System.out.println("Sales Report Start On::"+new Date());
		try
		{
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Sales Report End On::"+new Date());
	}*/
	
	@Scheduled(fixedRate = 10000)
	public void generateReport()
	{
		System.out.println("Sales Report Start On::"+new Date());
		try
		{
			Thread.sleep(5000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Sales Report End On::"+new Date());
	}
	}
