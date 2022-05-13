package com;

public class demo implements Comparable<demo> 
{
     int age;
     
     
     demo(int age)
     {
    	 this.age=age;
    	 
     }
     @Override
     public String toString()
     {
    	 return "age:"+this.age;
    	 
     }
     
     public int compareTo(demo d)
     {
		return this.age-d.age;
    	 
     }
}
