package org.nick.springdemo.service;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private String[] data = { 
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};

	public String getFortune() {
		return data[new Random().nextInt(data.length)];
	}

}
