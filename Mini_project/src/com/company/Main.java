package com.company;
import java.util.Scanner;
public class Main {
    public static void option(){

    }

    public static void main(String[] args) {

        ////////////MINI PROJECT = GUSS THE NUMBER////////////////

        int my_number=(int)(Math.random()*100);
        //System.out.println(my_number);
        int userchoice;
        do {

//            Scanner op =new Scanner(System.in);
//            System.out.println("choice ur option=");
//            int ch = op.nextInt();
//            int choice=ch;
//            switch(choice){
//                case 1:
//                    System.out.println("Start the game..");
//                    break;
//                case 2:
//                    System.out.println("EXIST");
//                    break;
//                default:
//                    System.out.println("Invalid choice");
//            }

            Scanner num = new Scanner(System.in);
            System.out.println("Guss the number = ");
            userchoice=num.nextInt();
            System.out.println("Your choice is = "+userchoice);

            if(my_number==userchoice){
                System.out.println("your answer is ....correct..");
                break;
            }
            else if (my_number>userchoice){
                System.out.println("The number is bigger from your choice");
            }
            else{
                System.out.println("The number is smaller from your choice");
            }
        }while (my_number>=0);

        System.out.println("My number is " +my_number);




    }
}
