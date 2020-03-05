package com.epam.task6;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customcollections {
    private static Logger LOGGER = LogManager.getLogger(Customcollections.class);

    public static void main(String arg[]) {
        EpamCollection obj = new EpamCollection();
        LOGGER.error("1.Add an element to the list ");
        LOGGER.error("2.Remove an  element from the list");
        LOGGER.error("3.Print the List");
        LOGGER.error("4.Exit ");
        while (true) {
            LOGGER.error("Enter your choice (1-4) :");
            Scanner sc = new Scanner(System.in);
            try {
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        //LOGGER.info("Enter the element to add : ");
                        String s1 = sc.next();
                        String s2 = sc.nextLine();
                        obj.add(s1 + s2);
                        break;
                    case 2:
                        //LOGGER.info("The removed element from the list is : ");
                        obj.remove();
                        break;
                    case 3:
                        LOGGER.error("The elements present in the List are : " + obj);
                        break;

                    case 4:
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        LOGGER.error("Invalid selection...");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer between 1-4");
             //used to handle when user enters choice as char or other datatype than int
            }
        }
    }
}
