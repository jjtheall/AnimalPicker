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
            System.out.println("Which animal would you like to see: dog or cat?");
            String userAnimal = sc.nextLine().toLowerCase();

            switch(userAnimal){
                case "dog":
                    invalid = false;
                    System.out.println("DOG ASCII ART");
                    break;
                case "cat":
                    invalid = false;
                    System.out.println("CAT ASCII ART");
                    break;
                default:
                    invalid = true;
                    System.out.println("Error: invalid input");
                    break;
            }
        }while(invalid);

    }
}