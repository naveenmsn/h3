
import java.util.*;
import java.io.*;


class int
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int num=input.nextInt();
		System.out.println("Enter the Element "+num+" of an Array");

        Integer[] numbers = new Integer[num];
        System.out.println("Please enter number");

       for (int i = 0; i < numbers.length; i++)
            {

        

        numbers[i] = input.nextInt();
        
            }
            Arrays.sort(numbers);
            System.out.println("The sorted int array is:");
            for(int abc:numbers)
            {
            System.out.println("Number = " + abc);
            }
            for(int i=0;i<numbers.length;i++){ 
            	boolean isDistinct = false; 
            	for(int j=0;j<i;j++){ 
            		if(numbers[i] == numbers[j]){ 
            			isDistinct = true; 
            			break; 
            			} 
            		} if(!isDistinct)
            		{ 
            			System.out.print(numbers[i]+" ");
            			} 
            		}
            }

		
	}


