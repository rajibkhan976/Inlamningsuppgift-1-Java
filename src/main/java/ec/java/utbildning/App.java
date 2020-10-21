package ec.java.utbildning;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Solutions solutions =  new Solutions();

        solutions.FizzBuzz();
        int[] numArr = {1, 3, 2, 2, 3, 2, 1, 4};
        System.out.println(solutions.uniqueList(numArr));
        System.out.println(solutions.languageTransformerOne("Behåll den första förekomsten av ett värde i listan."));
        System.out.println(solutions.languageTransformerTwo(solutions.languageTransformerOne("Behåll den första förekomsten av ett värde i listan.")));
        System.out.println(solutions.whatSquare(1000000));
    }
}
