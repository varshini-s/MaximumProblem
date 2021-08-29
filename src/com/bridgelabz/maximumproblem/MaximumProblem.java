package com.bridgelabz.maximumproblem;

public class MaximumProblem 
{
	public static void findMaximum(Integer integerNumber1,Integer integerNumber2,Integer integerNumber3)
	{
		if(integerNumber1.compareTo(integerNumber2)>0)
		{
			if(integerNumber1.compareTo(integerNumber3)>0)
			{
				System.out.println("maximum of three integers is "+integerNumber1);
				
			}
			else
			{
				System.out.println("maximum of three integers is "+integerNumber3);
			}
			
			
		}
		else
		{
			if(integerNumber2.compareTo(integerNumber3)>0)
			{
				System.out.println("maximum of three integers is "+integerNumber2);

			}
			else
			{
				System.out.println("maximum of three integers is "+integerNumber3);

			}
			
		}




	}


	

	public static void main(String[] args) 
	{

		System.out.println("------------welcome to maximum problem program------------");
		Integer integerNumber1,integerNumber2,integerNumber3;
		integerNumber1=10;
		integerNumber2=5;
		integerNumber3=9;
		findMaximum(integerNumber1, integerNumber2, integerNumber3);
		
	}

}
