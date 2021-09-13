/*
 *  UCF COP3330 Fall 2021 Assignment 1.15 Solution
 *  Copyright 2021 Ronald Lemus
 */

import java.util.Scanner;

public class Password_Validation {
    public static void main(String [] arg){
        System.out.print("What is the username? ");
        Scanner userInp = new Scanner(System.in);
        String user = userInp.nextLine();

        System.out.print("What is the password? ");
        Scanner passInp = new Scanner(System.in);
        String password = passInp.nextLine();

        String realPass = "Password123";

        if(password.equals(realPass)){
            System.out.printf("Welcome %s!", user);
        }
        else{
            System.out.print("I don't know you.");
        }
    }
}
