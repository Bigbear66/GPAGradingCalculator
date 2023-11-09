/*
 * Part1.java
 * I will be prompting the user for grade information for four classes they have taken and then my
 *   program will determine the users final GPA.
 * Author: Eldin Pita
 * Creation Date: 9/26/2019
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Part1
{

    public static void main(String[] args)
    {

        //Creating the Name String.//

        String fullName;
        String firstName="";
        String lastName="";

        System.out.println("Welcome to the UNG GPA calculator!");

        Scanner your_name = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        fullName = your_name.nextLine();


        Scanner your_major = new Scanner(System.in);
        String major;
        System.out.println("Please enter your major: ");
        major = your_major.nextLine();

        Scanner course_number = new Scanner(System.in);
        String coursenum;
        System.out.println("Please enter your course number: ");
        coursenum = course_number.nextLine();

        Scanner number_credits = new Scanner(System.in);
        int credits;
        System.out.println("Please enter the number of credits for your class: ");
        credits = number_credits.nextInt();

        System.out.println();

        // We define that grades using double.//

        final double A_1= 4.00;
        final double A_MINUS_1= 3.67;
        final double B_PLUS_1= 3.33;
        final double B_1= 3.00;
        final double B_MINUS_1= 2.67;
        final double C_PLUS_1= 2.33;
        final double C_1= 2.00;
        final double C_MINUS_1= 1.67;
        final double D_PLUS_1= 1.33;
        final double D_1= 1.00;
        final double F_1= 0.00;

        System.out.print("A = " + A_1 + "    ");
        System.out.println("  A- = " + A_MINUS_1);
        System.out.print("B+ = " + B_PLUS_1 + "    ");
        System.out.print("B = " + B_1 + "    ");
        System.out.println("B- = " + B_MINUS_1);
        System.out.print("C+ = " + C_PLUS_1 + "    ");
        System.out.print("C = " + C_1 + "    ");
        System.out.println("C- = " + C_MINUS_1);
        System.out.print("D+ = " + D_PLUS_1 + "    ");
        System.out.println("D = " + D_1);
        System.out.println("F = " + F_1);

        System.out.println();

        Scanner current_grade1 = new Scanner(System.in);
        String grade1;
        System.out.println("Please enter your current grade for the class: ");
        grade1 = current_grade1.nextLine();

        System.out.println();

        Scanner course2_number = new Scanner(System.in);
        String course2;
        System.out.println("Please present your next course: ");
        course2 = course2_number.nextLine();

        System.out.println();


        Scanner number_credits2 = new Scanner(System.in);
        int credits2;
        System.out.println("Please enter the number of credits for this class: ");
        credits2 = number_credits2.nextInt();

        System.out.println();


        System.out.print("A = " + A_1 + "    ");
        System.out.println("  A- = " + A_MINUS_1);
        System.out.print("B+ = " + B_PLUS_1 + "    ");
        System.out.print("B = " + B_1 + "    ");
        System.out.println("B- = " + B_MINUS_1);
        System.out.print("C+ = " + C_PLUS_1 + "    ");
        System.out.print("C = " + C_1 + "    ");
        System.out.println("C- = " + C_MINUS_1);
        System.out.print("D+ = " + D_PLUS_1 + "    ");
        System.out.println("D = " + D_1);
        System.out.println("F = " + F_1);

        System.out.println();

        Scanner current_grade2 = new Scanner(System.in);
        String grade2;
        System.out.println("Please enter your current grade for the class: ");
        grade2 = current_grade2.nextLine();


        System.out.println();

        Scanner course3_number = new Scanner(System.in);
        String course3;
        System.out.println("Please present your next course: ");
        course3 = course3_number.nextLine();

        System.out.println();


        Scanner number_credits3 = new Scanner(System.in);
        int credits3;
        System.out.println("Please enter the number of credits for this class: ");
        credits3 = number_credits3.nextInt();

        System.out.println();

        System.out.print("A = " + A_1 + "    ");
        System.out.println("  A- = " + A_MINUS_1);
        System.out.print("B+ = " + B_PLUS_1 + "    ");
        System.out.print("B = " + B_1 + "    ");
        System.out.println("B- = " + B_MINUS_1);
        System.out.print("C+ = " + C_PLUS_1 + "    ");
        System.out.print("C = " + C_1 + "    ");
        System.out.println("C- = " + C_MINUS_1);
        System.out.print("D+ = " + D_PLUS_1 + "    ");
        System.out.println("D = " + D_1);
        System.out.println("F = " + F_1);


        System.out.println();

        Scanner current_grade3 = new Scanner(System.in);
        String grade3;
        System.out.println("Please enter your current grade for the class: ");
        grade3 = current_grade3.nextLine();

        Scanner course4_number = new Scanner(System.in);
        String course4;

        System.out.println();

        System.out.println("Please present your next course: ");
        course4 = course4_number.nextLine();

        System.out.println();


        Scanner number_credits4 = new Scanner(System.in);
        int credits4;
        System.out.println("Please enter the number of credits for this class: ");
        credits4 = number_credits4.nextInt();

        System.out.println();

        System.out.print("A = " + A_1 + "    ");
        System.out.println("  A- = " + A_MINUS_1);
        System.out.print("B+ = " + B_PLUS_1 + "    ");
        System.out.print("B = " + B_1 + "    ");
        System.out.println("B- = " + B_MINUS_1);
        System.out.print("C+ = " + C_PLUS_1 + "    ");
        System.out.print("C = " + C_1 + "    ");
        System.out.println("C- = " + C_MINUS_1);
        System.out.print("D+ = " + D_PLUS_1 + "    ");
        System.out.println("D = " + D_1);
        System.out.println("F = " + F_1);

        System.out.println();


        Scanner current_grade4 = new Scanner(System.in);
        String grade4;
        System.out.println("Please enter your current grade for the class: ");
        grade4 = current_grade4.nextLine();

        // This is where we convert from String to Floating Point number.//

        float A_2= 4.00f;
        float A_MINUS_2= 3.67f;
        float B_PLUS_2= 3.33f;
        float B_2= 3.00f;
        float B_MINUS_2= 2.67f;
        float C_PLUS_2= 2.33f;
        float C_2= 2.00f;
        float C_MINUS_2= 1.67f;
        float D_PLUS_2= 1.33f;
        float D_2= 1.00f;
        float F_2= 0.00f;


        Scanner course5_number = new Scanner(System.in);
        String course5;

        System.out.println();

        System.out.println("Please present your next course: ");
        course5 = course5_number.nextLine();

        System.out.println();

        Scanner number_credits5 = new Scanner(System.in);
        int credits5;
        System.out.println("Please enter the number of credits for this class: ");
        credits5 = number_credits5.nextInt();

        System.out.println();

        System.out.print("A = " + A_2 + "    ");
        System.out.println("  A- = " + A_MINUS_2);
        System.out.print("B+ = " + B_PLUS_2 + "    ");
        System.out.print("B = " + B_2 + "    ");
        System.out.println("B- = " + B_MINUS_2);
        System.out.print("C+ = " + C_PLUS_2 + "    ");
        System.out.print("C = " + C_2 + "    ");
        System.out.println("C- = " + C_MINUS_2);
        System.out.print("D+ = " + D_PLUS_2 + "    ");
        System.out.println("D = " + D_2);
        System.out.println("F = " + F_2);

        System.out.println();

        Scanner current_grade5 = new Scanner(System.in);
        String grade5;
        System.out.println("Please enter your current grade for the class: ");
        grade5 = current_grade5.nextLine();

        System.out.println();

        Scanner course6_number = new Scanner(System.in);
        String course6;
        System.out.println("Please present your next course: ");
        course6 = course6_number.nextLine();

        System.out.println();


        Scanner number_credits6 = new Scanner(System.in);
        int credits6;
        System.out.println("Please enter the number of credits for this class: ");
        credits6 = number_credits6.nextInt();

        System.out.println();

        System.out.print("A = " + A_2 + "    ");
        System.out.println("  A- = " + A_MINUS_2);
        System.out.print("B+ = " + B_PLUS_2 + "    ");
        System.out.print("B = " + B_2 + "    ");
        System.out.println("B- = " + B_MINUS_2);
        System.out.print("C+ = " + C_PLUS_2 + "    ");
        System.out.print("C = " + C_2 + "    ");
        System.out.println("C- = " + C_MINUS_2);
        System.out.print("D+ = " + D_PLUS_2 + "    ");
        System.out.println("D = " + D_2);
        System.out.println("F = " + F_2);

        System.out.println();

        Scanner current_grade6 = new Scanner(System.in);
        String grade6;
        System.out.println("Please enter your current grade for the class: ");
        grade6 = current_grade6.nextLine();

        System.out.println();

        Scanner course7_number = new Scanner(System.in);
        String course7;
        System.out.println("Please present your next course: ");

        course7 = course7_number.nextLine();

        System.out.println();


        Scanner number_credits7 = new Scanner(System.in);
        int credits7;
        System.out.println("Please enter the number of credits for this class: ");
        credits7 = number_credits7.nextInt();

        System.out.println();

        System.out.print("A = " + A_2 + "    ");
        System.out.println("  A- = " + A_MINUS_2);
        System.out.print("B+ = " + B_PLUS_2 + "    ");
        System.out.print("B = " + B_2 + "    ");
        System.out.println("B- = " + B_MINUS_2);
        System.out.print("C+ = " + C_PLUS_2 + "    ");
        System.out.print("C = " + C_2 + "    ");
        System.out.println("C- = " + C_MINUS_2);
        System.out.print("D+ = " + D_PLUS_2 + "    ");
        System.out.println("D = " + D_2);
        System.out.println("F = " + F_2);

        System.out.println();

        Scanner current_grade7 = new Scanner(System.in);
        String grade7;
        System.out.println("Please enter your current grade for the class: ");
        grade7 = current_grade7.nextLine();

        System.out.println();

        //Converting the grades from String into Float//

        float grade9 = Float.parseFloat(grade1);
        float grade10 = Float.parseFloat(grade2);
        float grade11 = Float.parseFloat(grade3);
        float grade12 = Float.parseFloat(grade4);
        float grade13 = Float.parseFloat(grade5);
        float grade14 = Float.parseFloat(grade6);
        float grade15 = Float.parseFloat(grade7);

        // Calculating the Final GPA.//


       float total_GPA = (credits*grade9)+(credits2*grade10)+(credits3*grade11)+(credits4*grade12)+(credits5*grade13)+(credits6*grade14)+(credits7*grade15);

        int total_Credits = credits+credits2+credits3+credits4+credits5+credits6+credits7;

        System.out.println("The total is: " + total_GPA);

        System.out.println("Your Total Credits is: " + total_Credits);

        float final_gpa = (total_GPA/total_Credits);

        DecimalFormat fmt = new DecimalFormat("0.##");

        System.out.println(fullName + "-" + fmt.format(final_gpa));

    //The Program should display the persons name and their final GPA with 2 decimal Places.//


    }
}


