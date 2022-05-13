package com;

import java.util.TreeSet;

public class MainClass 
{
  public static void main(String[] args)
  {
	  demo d1 = new demo(21);
	  demo d2 = new demo(23);
	  demo d3 = new demo(22);
	  
	  TreeSet<demo> t = new TreeSet<demo>();
	  
	 t.add(d1);
	 t.add(d2);
	 t.add(d3);
	 
	 for(demo d: t)
	 {
		 System.out.println(d);
	 }
  }
}
