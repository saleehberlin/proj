/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Student {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         Scanner scanner = new Scanner(System.in);
         
          System.out.print("Enter your name: ");
        String studentName= scanner.next();

         System.out.print("Enter student id number: ");
       int idNo = scanner.nextInt();
        
         System.out.print("Enter the age of the student: ");
        int age = scanner.nextInt();

        System.out.print("have you paid fees? (yes/no): ");
        String fees = scanner.next();
        
        System.out.println("_________choose one course________");
        System.out.println("1. SOEN");
        System.out.println("2. ACMP");
        System.out.println("3. BIT");
        System.out.println("4.CMP");
        System.out.println("Which course number do you want to apply for?");
       int course = scanner.nextInt();
       
        if (fees.equalsIgnoreCase("yes")) {
               System.out.println("You can register units for applied course");
            } else {
                System.out.println("work on decreasing your fee balance");
                
            }    
       String courses="";
        
       switch(course){
           case 1:
                courses="SOEN";
                break;
                case 2:
               courses="ACMP";
                break;
                case 3:
               courses="BIT";
                break;
                case 4:
                courses="CMP";
                break;
                default:
                courses="unknown input";
       }
        
        System.out.println(studentName +" you have applied for "+ courses);
        
    }
}
