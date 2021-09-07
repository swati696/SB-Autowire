package com.cts.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	// field level injection are used.
	@Autowired
	private IEngine eng;
   public void drive()
   {
	   int status = eng.start();
	   if(status == 0)
	   {
		   System.out.println("Engine started");
	   }
   }
}
