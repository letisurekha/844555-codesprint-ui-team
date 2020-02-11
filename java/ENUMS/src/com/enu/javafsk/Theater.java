package com.enu.javafsk;

public enum Theater {
	PLATINUM,
	GOLD,
	SILVER;
	
	int rate=100;
	public int getRate(){
		if(this==PLATINUM)
		   return rate+30;
		else if(this==GOLD)
			return rate+0;
		else
			return rate-30;
		
	}

}
