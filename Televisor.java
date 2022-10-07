package com.Victor;

public class Televisor {
	private int canal;
	private int volume;
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(canal <= 100 && canal >= 1)
			this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume <= 10 && volume >= 0)
			this.volume = volume;
	}
	
	public Televisor(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}
	
	public Televisor() {
	
	}
	@Override
	public String toString() {
		return "Televisor [canal=" + canal + ", volume=" + volume + "]";
	}
	
	
	
}
