package com.capitalone.bubble;

public class BubbleMySort {

	int temp;

	public void bubblesort(int[] myarr) {
		for (int i = myarr.length; i > 0; i--) {
			for (int j = 0; j < myarr.length - 1; j++) {
				if (myarr[j + 1] < myarr[j]) {
					temp = myarr[j];
					myarr[j] = myarr[j + 1];
					myarr[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < myarr.length; k++) {
			System.out.println(myarr[k]);
		}
	}
}