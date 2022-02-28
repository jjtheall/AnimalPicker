/*
@author jackjtheall
24 Feb 2022
 */

import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean invalid = false;

        do{
            System.out.println("Which animal would you like to see: dog, cat, or fish?");
            String userAnimal = sc.nextLine().toLowerCase();

            switch(userAnimal){
                case "dog":
                    invalid = false;
                    System.out.println("   / \\__\n  (    @\\___\n  /         O\n /   (_____/\n/_____/   U");
                    break;
                case "cat":
                    invalid = false;
                    System.out.println(" /\\_/\\\n( o o )\n==_Y_==\n  \\-/");
                    break;
                case "fish":
                    invalid = false;
                    System.out.println("      /`·.¸\n     /¸...¸`:·\n ¸.·´  ¸   `·.¸.·´)\n: © ):´;      ¸  " +
                            "{\n `·.¸ `·  ¸.·´\\`·¸)\n     `\\\\´´\\¸.·´\n");
                    break;
                default:
                    invalid = true;
                    System.out.println("Error: invalid input");
                    break;
            }
        }while(invalid);

    }
}