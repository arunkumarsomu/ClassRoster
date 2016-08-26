package ssa;

import java.util.ArrayList;
import java.util.Collections;

public class ClassRoster {

	
	  ArrayList<String> classRoster = new ArrayList<String>();
	  
	  public void classRosterReport(){
		  classRoster.add("Arun");
		  classRoster.add("Mike Sykes");
		  classRoster.add("Jarrett");
		  classRoster.add("Karen"); 
		  classRoster.add("Shaquil");
		  classRoster.add("Evan");
		  classRoster.add("Aisha");
		  classRoster.add("Daniel");
		  classRoster.add("Kevin");
		  classRoster.add("Joesph");
		  classRoster.add("Li");
		  classRoster.add("Stephen");
		  classRoster.add("Stephen R");
		  classRoster.add("Peter");
		  classRoster.add("Michael C");
		  classRoster.add("Reuben");
		  classRoster.add("Dax");
		  classRoster.add("Joshua");
		  classRoster.add("Gabriel");
		  classRoster.add("Jonathan");
		  classRoster.add("Kyle");
	  
	      Collections.sort(classRoster);
	      System.out.println(" Class Roster in Ascending Order");
	      for (String s: classRoster){
	    	  System.out.println(s);
	      }
	      
	      System.out.println(" Class Roster in Descending Order");
	      Collections.sort(classRoster,Collections.reverseOrder());
	      for (String s: classRoster){
	    	  System.out.println(s);
	      }
	      
	      
	  }
	  
}
