package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String myAsciiArt = FigletFont.convertOneLine("Hello World!");
        System.out.println(myAsciiArt);
    	//System.out.println( "Hello World!" );
    }
}
