package com.cg.abstraction;

abstract class Bike{
	abstract void run();
}

class Honda extends Bike{
	void run() {
		System.out.println(" it is running safely");
	}
}
public class Demo {
	
	public static void main(String[] args) {
		
		Honda Obj=new Honda();
	Obj.run();	
	}

}
