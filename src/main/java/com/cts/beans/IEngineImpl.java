package com.cts.beans;

import org.springframework.stereotype.Component;

@Component
public class IEngineImpl implements IEngine {

	 public IEngineImpl()
	 {
         System.out.println("+++  Implementation class method");
	 }
	@Override
	public int start() {
		// TODO Auto-generated method stub
		return 0;
	}

}
