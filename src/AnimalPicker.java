/*
@author jackjtheall
24 Feb 2022
 */

import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Which animal would you like to see: dog or cat?");
        String userAnimal = sc.nextLine().toLowerCase();

        if(userAnimal.equals("cat")){
            System.out.println("CAT ASCII ART");
        }
        else if(userAnimal.equals("dog")){
            System.out.println("DOG ASCII ART");
        }
        else{
            System.out.println("Error: invalid input");
        }
    }
}
