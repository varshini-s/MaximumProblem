package com.bridgelabz.maximumproblem;

public class MaximumProblem <E extends Comparable<E>>
{

	E firstValue, secondValue, thirdValue;

	public MaximumProblem(E firstValue, E secondValue, E thirdValue) 
	{
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

	public void testMaximum() 
	
	{
		MaximumProblem.findMaximum(this.firstValue, this.secondValue, this.thirdValue);
	}

	
	
	public static <E extends Comparable<E>> void findMaximum(E firstInput,E secondInput,E thirdInput)
	{
		if(firstInput.compareTo(secondInput)>0)
		{
			if(firstInput.compareTo(thirdInput)>0)
			{
				System.out.println("maximum of three  is "+firstInput);

			}
			else
			{
				System.out.println("maximum of three  is "+thirdInput);
			}


		}
		else
		{
			if(secondInput.compareTo(thirdInput)>0)
			{
				System.out.println("maximum of three  is "+secondInput);

			}
			else
			{
				System.out.println("maximum of three  is "+thirdInput);

			}

		}

	}
	
	


	public static void main(String[] args) 
	{

		System.out.println("------------welcome to maximum problem program------------");
		Integer integerNumber1=1,integerNumber2=23,integerNumber3=4;
		Float floatNumber1=1f,floatNumber2=7f,floatNumber3=4f;
		String string1="apple",string2="banana",string3="papaya";
		
		new MaximumProblem<Integer>(integerNumber1, integerNumber2, integerNumber3).testMaximum();;
		new MaximumProblem<Float>(floatNumber1, floatNumber2, floatNumber3).testMaximum();;
		new MaximumProblem<String>(string1, string2, string3).testMaximum();;

		

	}

}
