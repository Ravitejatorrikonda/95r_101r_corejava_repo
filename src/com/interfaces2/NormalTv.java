package com.interfaces2;

public class NormalTv implements Telivision{

	
	@Override
	public void vloumeIncrease(int volume) {
		System.out.println("Volume of the Tv  increased : "+(Telivision.volume+volume));
		
	}

	@Override
	public void volumeDecrease(int volume) {
		System.out.println("volume of the TV Decrease : "+(Telivision.volume-volume));
		
	}

}
