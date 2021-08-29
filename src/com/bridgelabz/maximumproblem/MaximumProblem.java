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
		
	public static void findMaximum(Float floatNumber1,Float floatNumber2,Float floatNumber3)
	{
		if(floatNumber1.compareTo(floatNumber2)>0)
		{
			if(floatNumber1.compareTo(floatNumber3)>0)
			{
				System.out.println("maximum of three float is "+floatNumber1);

			}
			else
			{
				System.out.println("maximum of three float is "+floatNumber3);
			}


		}
		else
		{
			if(floatNumber2.compareTo(floatNumber3)>0)
			{
				System.out.println("maximum of three float is "+floatNumber2);

			}
			else
			{
				System.out.println("maximum of three float is "+floatNumber3);

			}

		}

	}
	
	public static void findMaximum(String string1,String string2,String string3)
	{
		if(string1.compareTo(string2)>0)
		{
			if(string1.compareTo(string3)>0)
			{
				System.out.println("maximum of three string is "+string1);

			}
			else
			{
				System.out.println("maximum of three string is "+string3);
			}


		}
		else
		{
			if(string2.compareTo(string3)>0)
			{
				System.out.println("maximum of three string is "+string2);

			}
			else
			{
				System.out.println("maximum of three string is "+string3);

			}

		}

	}
	
	


	

	public static void main(String[] args) 
	{

		System.out.println("------------welcome to maximum problem program------------");
		Integer integerNumber1=1,integerNumber2=23,integerNumber3=4;
		Float floatNumber1=1f,floatNumber2=7f,floatNumber3=4f;
		String string1="apple",string2="banana",string3="papaya";
		
		findMaximum(integerNumber1, integerNumber2, integerNumber3);
		findMaximum(floatNumber1, floatNumber2, floatNumber3);
		findMaximum(string1, string2, string3);
		

	}

}
