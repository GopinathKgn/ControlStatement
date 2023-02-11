package org.ControlStatement;

public class IfElse {
public static void main(String[] args) {
	int a =10,b=20,c=30;
	if (a<b && b<c) {
		System.out.println("A is lesser");
	}
	else if (b>a && b>c){
		System.out.println("B is greaterthan A and lessthan C");
	}
	else if (c>a && c<b) {
		System.out.println("C is greaterthan A and B ");
	}
	else {
		System.out.println("C is greater");
	}
}
}

