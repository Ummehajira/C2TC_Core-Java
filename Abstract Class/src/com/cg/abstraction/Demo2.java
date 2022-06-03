package com.cg.abstraction;

abstract class Bank{
	abstract int rateofinterest();
	}
class HDFC extends Bank{
	int rateofinterest() {
		return 8;
		
	}
}
class SBI extends Bank{
	int rateofinterest() {
		return 6;
	}
}
  public class Demo2{
        public static void main(String[] args) {
        	
        }
 
 
}
