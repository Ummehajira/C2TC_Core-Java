package com.cg.inheritance;

public class MainModule {
	public static void main(String[] args)  {
		Mobile mobj=new Mobile("Samsung","66565656","gh789-89",9000d);
				System.out.println(mobj.getModel());
			
				blackberry blackObj=new blackberry("BlackBerry","Blackberry","SAI-00",2000);
				System.out.println(blackObj.getModel());
				System.out.println(blackObj);
				
				Android AndObj=new Android("Android","Android","th-9876",678);
				System.out.println(AndObj.getModel());
				System.out.println(AndObj);
	}

}
