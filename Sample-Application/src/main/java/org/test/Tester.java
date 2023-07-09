package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {
				
		  String s = "Java articles are Awesome"; 
		  s.chars().distinct().forEach(temp->System.out.println(Character.valueOf((char) temp)));
		  
		  List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		  List<Integer> duplicates = new ArrayList();
		  
		  HashSet<Integer> set = new HashSet();
		  
		  for(Integer i : list) {
			  
			  if(!set.add(i)) {
				  duplicates.add(i);
			  }			  
		  }
		  
		  System.out.println(duplicates);
		  
		  
		
		//List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		//list.stream().filter(temp -> temp)
		
		/*int array1[]  = {10,15,8,49,25,98,98,32,15};		
		int array2[] = new int [array1.length];		
		int counter = 0;
		
		for(int i=0;i<array1.length-1;i++) {
			
			for(int j = i+1;j<array1.length-1;j++) {
				if(array1[i] == array1[j]) {
					array2[counter++] = array1[i];
				}
			}		
		}
		
		System.out.println(Arrays.toString(array2));
		*/
	}
}
