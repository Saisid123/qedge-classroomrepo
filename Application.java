Java is a widely used object-oriented programming language and software platform that runs on billions of devices, including notebook computers, mobile devices, gaming consoles, medical devices and many others. The rules and syntax of Java are based on the C and C++ languages.

#feature202 changes by Siva on services module 08-feb-2023

//sample code to write 100 random ints to a file, 1 per line

import java.io.PrintStream;
import java.io.IOException;
import java.io.File;

import java.util.Random;

public class WriteToFile
{	public static void main(String[] args)
	{	try
		{	PrintStream writer = new PrintStream( new File("randInts.txt"));
			Random r = new Random();
			final int LIMIT = 100;

			for(int i = 0; i < LIMIT; i++)
			{	writer.println( r.nextInt() );
			}
			writer.close();
		}
		catch(IOException e)
		{	System.out.println("An error occured while trying to write to the file");
		}
	}
}//sample code to write 100 random ints to a file, 1 per line

import java.io.PrintStream;
import java.io.IOException;
import java.io.File;

import java.util.Random;

public class WriteToFile
{	public static void main(String[] args)
	{	try
		{	PrintStream writer = new PrintStream( new File("randInts.txt"));
			Random r = new Random();
			final int LIMIT = 100;

			for(int i = 0; i < LIMIT; i++)
			{	writer.println( r.nextInt() );
			}
			writer.close();
		}
		catch(IOException e)
		{	System.out.println("An error occured while trying to write to the file");
		}
	}
}



There will be 4 pilars of OOPS.

Features 201 changes done by Saikumar Siddagoni

/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}

