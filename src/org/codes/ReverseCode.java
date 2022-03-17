package org.codes;

public class ReverseCode {

	public static void main(String[] args) {
	
		String a = "My Name is godwin Wise";
		String rev = "";
		
		String[] sp = a.split(" ");
		for (String x : sp) {
			String res ="";
			for (int i = x.length()-1; i >=0 ; i--) {
				char c = x.charAt(i);
				res = res + c;
			}	
			rev = rev + res + " ";
		}
		System.out.println(rev);
	}
}
