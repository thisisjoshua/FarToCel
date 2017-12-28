

import java.util.Scanner;

public class FarToCel {



    public static void main(String args[]) {
        Scanner oper = new Scanner(System.in);
        String op;
        System.out.println("Enter 1 to convert from Fahrenheit to Celsius" );
        System.out.println("Enter 2 to convert from Celsius to Fahrenheit");

        op = oper.nextLine();

        if("1" .equals(op)) {
            float temperature;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Temperature in Fahrenheit");
            temperature=in.nextFloat();
            temperature=((temperature - 32)*5)/9;
            System.out.println("Temperature in Celsius = " + temperature);

        }

        if("2" .equals(op)) {
            float temperature;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter temperature in Celsius");
            temperature=in.nextFloat();
            temperature=temperature *9/5 + 32;
            System.out.println("Temperature in Fahrenheit = " +temperature);
            }
        }
    }