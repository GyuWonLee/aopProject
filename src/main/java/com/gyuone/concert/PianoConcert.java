package com.gyuone.concert;

import org.springframework.stereotype.Component;

@Component("pianoConcert")
public class PianoConcert implements Performance{

	@Override
	public void perform() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("피아노 연주");
	}
	
	
	
}
