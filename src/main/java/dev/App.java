package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		String val = ResourceBundle.getBundle("application").getString("titre");
		String asciiArt = FigletFont.convertOneLine(val);
		System.out.println(asciiArt);
		
		String environnement = ResourceBundle.getBundle("application").getString(
				"environnement");
				System.out.println("Environnement : " + environnement);
	}
}
