package com.jspider;

import java.util.Scanner;

public class Circle 
{
   double rad;
   final double pi=3.143;
   
   Circle(double arg1)
   {
	   rad = arg1;
   }
   void area()
   {
	   double area = pi*rad*rad;
	   System.out.println("area:"+area);
   }
   public static void main(String[] args) {
	
	   Scanner sc1 = new Scanner(System.in);
	   System.out.println("Enter the radius");
	   double radius = sc1.nextDouble();
	   
	   Circle c1 = new Circle(6.05);
	   c1.area();
}
   
}
