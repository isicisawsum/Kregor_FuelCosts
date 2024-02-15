import java.util.Scanner; //importing Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //naming Scanner

        boolean loop = true; //ability for question to loop if user inputs wrong

        double numGas = 0;

        double MPG = 0;

        double gas = 0;

        System.out.println("What is the number of gallons of gas in your tank?"); //asking user for variable numGas

        do {
            if (in.hasNextDouble()) { //testing if user entered a number

                numGas = in.nextDouble(); //calculating variable numGas to user input

                loop = false; //turning off this loop

            }
            else if (!in.hasNextDouble()) {

                String trash = in.nextLine(); //user entered something wrong

                System.out.println(trash + " is not a number"); //telling user they entered something wrong

            }
        } while(loop); //loops while 'loop' = true

        System.out.println("What is the fuel efficiency in miles/gallon? (Just type the number)"); //asking user for variable MPG

        loop = true; //turning loop back on

        do {
            if (in.hasNextDouble()) { //testing if user entered a number

                MPG = in.nextDouble(); //calculating variable MPG to user input

                loop = false; //turning off this loop

            }
            else if (!in.hasNextDouble()) {

                String trash = in.nextLine(); //user entered something wrong

                System.out.println(trash + " is not a number"); //telling user they entered something wrong

            }
        } while(loop); //loops while 'loop' = true

        System.out.println("What is price of gas per gallon? (Just enter the number)"); //asking user for variable gas

        loop = true; //turning loop back on

        do {
            if (in.hasNextDouble()) { //testing if user entered a number

                gas = in.nextDouble(); //calculating variable miles to user input

                loop = false; //turning off this loop

            }
            else if (!in.hasNextDouble()) {

                String trash = in.nextLine(); //user entered something wrong

                System.out.println(trash + " is not a number"); //telling user they entered something wrong

            }
        } while(loop); //loops while 'loop' = true

        double far = (numGas * MPG); //calculating how far they can go

        double totPrice = ((100/MPG) * gas); //calculating the total price

        System.out.println("The cost to go 100 miles is $" + totPrice);

        System.out.println("The car can go " + far + " miles"); //telling user both things

    }
}
