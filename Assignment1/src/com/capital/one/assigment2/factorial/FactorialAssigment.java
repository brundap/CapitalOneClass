package com.capital.one.assigment2.factorial;

public class FactorialAssigment {

	static int temp = 1;
	
	public static void main(String[] args) {
		cal(6);
	}

	public static void cal(int n) {
//		for (int i = 1; i <= n; i++)
		for (int i = n; i >= 1; i--)
	{
			temp = temp * i ;
			System.out.println("this is the n logic " + i + "*");
		}
		System.out.println(" this is the Total value " +temp);

	}
}