package ch.bbw.ms.consolecalculator;

/**
 * Console Calculator App
 *
 * @author Marc Schwendemann
 * @version 19.05.2021
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();

        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        valueA = 10;
        valueB = 20;

        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
    }
}
