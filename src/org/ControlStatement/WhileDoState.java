package org.ControlStatement;

public class WhileDoState {
public static void main(String[] args) {
	int a=0;
	 while (a<5) {
		System.out.println(a);
      a++;
	}
	do {
		System.out.println(a);
		a++;
	} 
	      while (a<5);
}
}
