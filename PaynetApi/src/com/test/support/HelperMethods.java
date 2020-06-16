package com.test.support;

import java.io.File;


public class HelperMethods {
	
	public  void slowDown(){
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			System.out.println("Error performing wait");
		}

	}

	 public void driverWait(long ms){
		  try {
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	
}
