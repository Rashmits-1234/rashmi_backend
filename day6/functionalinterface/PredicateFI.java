package functionalinterface;

import java.util.function.Predicate;

public class PredicateFI {
	  
	    public static void main(String[] args) 
	    { 
	       
	        Predicate<Integer> lesserthan = i -> (i < 18);  
	  
	        System.out.println(lesserthan.test(10));  
	    } 
	} 