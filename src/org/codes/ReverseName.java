package org.codes;

public class ReverseName {
public static void main(String[] args) {
	String s = "My name is Godwin Wise";
	String res ="";
	for (int i = s.length()-1; i >=0; i--) {
		char c = s.charAt(i);
		res = res + c;
	
	}
	System.out.println(res);
}

}