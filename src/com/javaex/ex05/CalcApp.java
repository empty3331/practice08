package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
	    	System.out.print(">>");
	    	String numLine = sc.nextLine();
	    	String[] sArray = numLine.split(" ");
	    	
	    	if(sArray[0].equals("/q")) {
	    		System.out.println("종료합니다.");
	    		break;
	    	}
    	
	    	int numA = Integer.parseInt(sArray[0]);
	    	int numB = Integer.parseInt(sArray[2]);
	    	
	    	switch(sArray[1]) {
    		case "+":
    			Add add = new Add();
    			add.setValue(numA, numB);
    			System.out.println(">> "+add.calculate());
    			break;
    			
    		case "-":
    			Sub sub = new Sub();
    			sub.setValue(numA, numB);
    			System.out.println(">> "+sub.calculate());
    			break;
    			
    		case "*":
    			Mul mul = new Mul();
    			mul.setValue(numA, numB);
    			System.out.println(">> "+mul.calculate());
    			break;
    		
    		case "/":
    			Div div = new Div();
    			div.setValue(numA, numB);
    			System.out.println(">> "+div.calculate());
    			break;
    			
    		default:
    			System.out.println("알 수 없는 연산입니다");
    			break;
    	}
    	
    	}
    	
    	
    	
    	sc.close();

    }
     
    
}
