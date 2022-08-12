package com.gyuone.concert;

import org.springframework.stereotype.Component;

@Component("iuConcert")
public class IUConcert implements Performance {

	@Override
	public void perform() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("노래도 잘 불러, 맘씨도 고와, 연기도 잘 해, 대체 못하는게 뭔데????");
		throw new Exception();
	}

	
	
}
