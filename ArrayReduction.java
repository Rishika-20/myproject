package com.example;

// A java program to convert an array to reduced form where, range is from 0 to N-1.
public class ArrayReduction {  
	
// This function is used to sort an array using a third variable.
    public static int[] arraySorting(int firstarray[])
    {        
        for(int firstindex = 0; firstindex<firstarray.length; firstindex++)
         {            
             for(int secondindex = firstindex+1;secondindex<firstarray.length;secondindex++)
                {                  
                    int thirdvariable = 0;                    
                    if(firstarray[firstindex]>firstarray[secondindex])
                    {                        
                        thirdvariable = firstarray[secondindex];                        
                        firstarray[secondindex] = firstarray[firstindex];                        
                        firstarray[firstindex] = thirdvariable;                        
                    }
                }
        }
        return firstarray;
    }    
// This  function is used to print the index of the given array after reduction.   
public static void printIndex(int arraySorting[],int secondArray[])
    {
        for(int firstindex=0 ; firstindex<arraySorting.length; firstindex++){                    
                    for(int secondindex = 0; secondindex<arraySorting.length;secondindex++){                        
                        if(secondArray[firstindex] == arraySorting[secondindex])
                        {
                            System.out.print(" "+secondindex);
                            break;
                        }
                    }
                }       
    }
 public static void main(String[] args) 
    {        
        int firstarray[] = {5,10,40,30,20};        
        int secondArray[] ={5,10,40,30,20};        
        int arraySorting1 [] = arraySorting(firstarray);        
        printIndex(arraySorting1,secondArray);               
                
    }
    

}
 
