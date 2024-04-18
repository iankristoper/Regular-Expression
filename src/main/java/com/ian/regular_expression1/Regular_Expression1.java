package com.ian.regular_expression1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author Ian Tagano
 */
public class Regular_Expression1 
{
    
    public static boolean isIanThere(String name)
    {
        String nameRegEx = "\\bian\\b";
        
        Pattern pattern = Pattern.compile(nameRegEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        
        
        return matcher.find();
    }
   
    

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your text: ");
        String name = scanner.nextLine();
        
        if(isIanThere(name) == true)
        {
            System.out.println("There is \"Ian\" string in thier paper");
        }
        else
        {
            System.out.println("No Ian in there paper");
        }
        
        
       
    }
}
