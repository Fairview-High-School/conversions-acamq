import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {while (true) {
            
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Fortnights to Days");
        System.out.println("8. Days to Fortnights");
        System.out.println("9. Furlongs to Feet");
        System.out.println("10. Feet to Furlongs");
        System.out.println("11. Exit");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.
        /*
        if (selection == 1)
        {
            System.out.println("Enter ___: ");
            double __ = keyboard.nextDouble();
            keyboard.nextLine();
            double __ = __ * (9.0 / 5.0) + 32;
            System.out.println(__ + " __ is " + __ + " __.");
        } 
        */
    

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit.");
        }
        if (selection == 2)
        {
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit =  keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit  - 32 )*(5.0/9.0);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius.");
        }
        if (selection == 3)
        {
            System.out.println("Enter feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet/0.3048;
            System.out.println(feet + " feet is " + meters + " meters.");
        }
        if (selection == 4)
        {
            System.out.println("Enter meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters*3.28084;
            System.out.println(meters + " meters is " + feet + " feet.");
        }
        if (selection == 5)
        {
            System.out.println("Enter ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.5735;
            System.out.println(ounces + " ounces is " + milliliters + " milliters.");
        } 
        if (selection == 6)
        {
            System.out.println("Enter milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters * 0.033814;
            System.out.println(milliliters + " milliliters is " + ounces + " ounces.");
        }
        if (selection == 7)
        {
            System.out.println("Enter fortnights: ");
            double fortnights = keyboard.nextDouble();
            keyboard.nextLine();
            double days = fortnights * 14;
            System.out.println(fortnights + " fortnights is " + days + " days.");
        }  
        if (selection == 8)
        {
            System.out.println("Enter days: ");
            double days = keyboard.nextDouble();
            keyboard.nextLine();
            double fortnights = days / 14;
            System.out.println(days + " days is " + fortnights + " fortnights.");
        }  
        if (selection == 9)
        {
            System.out.println("Enter furlongs: ");
            double furlongs = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = furlongs * 660;
            System.out.println(furlongs + " furlongs is " + feet + " feet.");
        } 
        if (selection == 10)
        {
            System.out.println("Enter feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double furlongs = feet / 660;
            System.out.println(feet + " feet is " + furlongs + " furlongs.");
        } 
        if (selection == 11)
        {
        break;
        } 
        //add more if statements here.
    }
}
}