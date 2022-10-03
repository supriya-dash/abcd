package org.oct3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SurveyClass {
	public static void main(String[] args) 
    {
    Survey ob;    	
    	Scanner sc = new Scanner(System.in);
        
        Map<Integer,Survey> mapValue = new HashMap<Integer,Survey>();
        
        System.out.println("Enter the Number ");
        
        
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++) 
        {
            mapValue.put(i, new Survey());
        }
        for(Map.Entry<Integer, Survey> entry:mapValue.entrySet()){    
            int key=entry.getKey();  
            Survey b=entry.getValue();  
            System.out.println(key+" Data:");  
            System.out.println( "\nMember Type: " + b.memberType);    
            } 
        
       System.out.println(Survey.countMembers());
        
    }
}
