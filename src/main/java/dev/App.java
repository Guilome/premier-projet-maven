package dev;

//import
import com.github.lalyos.jfiglet.FigletFont;
import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	//Affichage avec Figlet    	
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	String asciiArt = FigletFont.convertOneLine(titre);
    	System.out.println(asciiArt);
    	//Affichage de l'environnement
    	String environnement = ResourceBundle.getBundle("application").getString("environnement");
    	System.out.println("Environnement : " + environnement);
    }
}
