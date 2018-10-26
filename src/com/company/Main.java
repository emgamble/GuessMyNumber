package com.company;


import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String names[] = {"Emma", "Liam", "Olivia", "Noah", "Ava", "Oliver", "Isabella", "Mason", "Sophia",
                "Lucas", "Amelia", "Elijah", "Mia", "Logan", "Charlotte", "Ethan", "Harper", "James", "Mila",
                "Aiden", "Aria", "Jackson", "Avery", "Carter", "Ella", "Sebastian", "Evelyn", "Alexander", "Luna",
                "Benjamin", "Sofia", "Jacob", "Abigail", "Michael", "Layla", "William", "Scarlett", "Daniel",
                "Riley", "Grayson", "Ellie", "Jack", "Emily", "Leo", "Lily", "Luke", "Chloe", "Henry", "Madison",
                "Jayden"};


        Scanner AorZ = new Scanner(System.in);
        Scanner YesorNo = new Scanner(System.in);

        System.out.println("Choose a name from the list: " + "Emma, Liam, Olivia, Noah, Ava, Oliver, Isabella, Mason, Sophia, Lucas," +
                " Amelia, Elijah, Mia, Logan, Charlotte, Ethan, Harper, " + "James, Mila, Aiden, Aria, Jackson, Avery,");
        System.out.println(" Carter, Ella, Sebastian, Evelyn, Alexander, Luna, Benjamin, Sofia, Jacob," +
                " Abigail, Michael, Layla, William, Scarlett, Daniel, Riley, Grayson, " + "Ellie, Jack, Emily, Leo, Lily, " +
                "Luke, Chloe, Henry, Madison, Jayden");


        Arrays.sort(names);

        int a = 2;

        System.out.println("Is the name you chose " + names[(names.length / 2)] + "? Yes or No?");
        String response = YesorNo.nextLine();
        response.toLowerCase();
        if (response.equals("yes"))
            System.out.println("Thanks for playing! Goodbye");


        else if (response.equals("no")) {
            while (response.equals("no")) {

                a = a * 2;
                int length = names.length;
                int j = (length / 2);


                System.out.println("Is it closer to A or Z?");
                String aorz = AorZ.nextLine();
                aorz.toLowerCase();


                if (aorz.equals("a")) {

                    j = j - (int) (length / Math.pow(2, a));
                    System.out.println("Is the name you chose " + names[j] + "? Yes or No?");
                    response = YesorNo.nextLine();
                    response.toLowerCase();
                    if (response.equals("yes")) {
                        System.out.println("Thanks for playing! Goodbye");
                    }
                }
                    else if (aorz.equals("z")) {

                    j = j + (int) (length / Math.pow(2, a));
                    System.out.println("Is the name you chose " + names[j] + "? Yes or No?");
                    response = YesorNo.nextLine();
                    response.toLowerCase();
                    if (response.equals("yes")) {
                        System.out.println("Thanks for playing! Goodbye");
                    }
                }
            }
        }
    }}