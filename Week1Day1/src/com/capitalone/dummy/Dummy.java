package com.capitalone.dummy;

public class Dummy {
	public static void main(String[] args) {
		Integer myarr = new Integer(2);

		for(int i=2; i < myarr.doubleValue(); i++){
			myarr = i;
			System.out.println("the valid" + myarr);
		}
				
	}

//	private static int myarr() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	

}