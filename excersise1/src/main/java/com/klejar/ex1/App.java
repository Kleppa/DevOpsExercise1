package com.klejar.ex1;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.forEach(System.out::print);
	}
}
