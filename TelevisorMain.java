package com.Victor;

public class TelevisorMain {

	public static void main(String[] args) {
		
		Televisor tv = new Televisor();
		
		tv.setCanal(30);
		tv.setVolume(10);
		
		System.out.println(tv.toString());

	}

}
