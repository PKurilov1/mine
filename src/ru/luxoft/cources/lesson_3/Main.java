//
// d:\vol\Work\OneDrive_1_4-6-2021\mine\src\ru\luxoft\cources\lesson_3\Main.java
//
//	Apr.07.2021 [01:42:42]
//	Apr.07.2021 [05:01:53]
//	Apr.07.2021 [17:04:35]


// path=c:\Program Files\Java\jdk-15.0.2\bin;%path%
// d:
// cd d:\vol\Work\OneDrive_1_4-6-2021\mine\src
// javac ru\luxoft\cources\lesson_3\Main.java
// java ru.luxoft.cources.lesson_3.Main

package ru.luxoft.cources.lesson_3;

import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		calculator.calcLoop();
	}
}

class Calculator
{
	Scanner scanner = new Scanner(System.in);

	void calcLoop()
	{
		while (true)
		{
			System.out.print("q for quit or enter ");

			if ("q".equals(scanner.nextLine())) break;

			try
			{
				System.out.println(calcStep());
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Wrong input data!");
			}
		}
	}

	double calcStep()
	{
		int numberOne = Integer.parseInt(scanner.nextLine());
		int numberTwo = Integer.parseInt(scanner.nextLine());

		return switch (scanner.nextLine())
		{
			default -> throw new NumberFormatException();
			case "+" -> numberOne + numberTwo;
			case "-" -> numberOne - numberTwo;
			case "*" -> numberOne * numberTwo;
			case "/" -> divide(numberOne, numberTwo);
			case "!" -> factorial(numberOne);
		};
	}

	int divide(int numberOne, int numberTwo)
	{
		if (numberTwo == 0)
		{
			throw new NumberFormatException();
		}

		return numberOne / numberTwo;
	}

	int factorial(int number)
	{
		int res = 1;

		for (int i = 1; i <= number; i++)
		{
			res *= i;
		}

		return res;
	}
}
