package com.example.demo.schedule;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
@Component
public class TaskSchedulerGemini {
	
	/*
	 * @Scheduled (cron = "0 0/05 * * * ?" )
	 * 
	 * @Async public void print100() {
	 * 
	 * for(int i=0; 0<=50; i++) { System.out.println("M1");
	 * System.out.println("Thread Name" + Thread.currentThread().getName());
	 * 
	 * 
	 * }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * @Scheduled (cron = "0 0/03 * * * ?" )
	 * 
	 * @Async public void print101() {
	 * 
	 * for(int i=0; 0<=10; i++) { System.out.println("M2");
	 * System.out.println("Thread Name" + Thread.currentThread().getName());
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * //@Scheduled ( fixedDelay = 200 )
	 * 
	 * @Scheduled ( initialDelay = 100, fixedDelayString = "${gemini.schedule.time}"
	 * )
	 * 
	 * @Async public void print102() {
	 * 
	 * for(int i=0; 0<=20; i++) { System.out.println("M3");
	 * 
	 * System.out.println("Thread Name" + Thread.currentThread().getName());
	 * 
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 */			
			//@Scheduled ( initialDelay = 100, fixedDelayString = "${gemini.schedule.time}" )
			@Scheduled ( initialDelay = 100, fixedRateString  = "${gemini.schedule.time}" )
			//@Async
			public void demoThread() {
				
				try {
					printThis();
					printThat();
					
				}catch (Exception e) {
					// TODO: handle exception
				}
			
			}
			
	
			
			public void printThis() throws Exception {
				
				
				System.out.print("M4");
				System.out.println(" Starting the Task"+Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println("Ending the Task"+Thread.currentThread().getName() );
				System.out.print("M4");
			}
			
			public void printThat() throws Exception {
				
				System.out.print("M5");
				System.out.println(" Starting the Task"+Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println("Ending the Task"+Thread.currentThread().getName() );
				System.out.print("M5");
			}

}
