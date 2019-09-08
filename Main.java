package com.sherry;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InValidNameException {
        User user = null;
        Task task = null;
        int choice = 0;
        boolean isLogedIn = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> userArrayList = new ArrayList<User>();
        ArrayList<Task> taskArrayList = new ArrayList<Task>();

        while (isLogedIn != true) {
            System.out.println("1: login" +
                    "\t\n2: SignUp" +
                    "\t\n3: Exit");
            choice = scanner.nextInt();
            if (choice == 1) {
                scanner.nextLine();
                System.out.println("Username");
                String username = scanner.nextLine();
                System.out.println("Password");
                String password = scanner.nextLine();
                for (User user1 : userArrayList) {
                    if (user1.getUserName().equals(username)) {
                        if (user1.getPassword().equals(password)) {
                            System.out.println("Login Successfully");
                            isLogedIn = true;
                            break;
                        } else {
                            System.out.println("password is incorrect");
                        }
                    }

                }

            } else if (choice == 2) {
                scanner.nextLine();
                System.out.println("First Name");
                String firstName = scanner.nextLine();
                System.out.println("Last Name");
                String lastName = scanner.nextLine();
                System.out.println("Username");
                String username = scanner.nextLine();
                System.out.println("password");
                String password = scanner.nextLine();
                user = new User(firstName, lastName, username, password);
                userArrayList.add(user);

            } else if (choice == 3) {
                System.exit(0);
            }

        }
        while (true) {
            int i = 0;
            for (Task task1 : taskArrayList) {
                System.out.print(i + "-   " + task1.getText());
                if (task1.getIs_done()) {
                    System.out.println(".....completed");
                } else {
                    System.out.println(".....pending");
                }
                i++;
            }
            System.out.println("1: Create new task");
            if (taskArrayList.size() > 0) {
                System.out.println("\t2: Mark as done");
                System.out.println("\t3: Delete Task");
            }
            System.out.println("4: exit");
            choice = scanner.nextInt();
            if(choice==2||choice==3){
                System.out.println("invalid choice");
            }else if (choice == 1) {
                scanner.nextLine();
                System.out.println("Enter task:");
                String text = scanner.nextLine();
                task = new Task(text, user, false);
                taskArrayList.add(task);
            } else if (choice == 2) {
                System.out.print("Which task? :");
                int integer = scanner.nextInt();
                scanner.nextLine();
                taskArrayList.get(integer).setIs_done(true);

            } else if (choice == 3) {
                System.out.print("which task? :");
                int integer = scanner.nextInt();
                scanner.nextLine();
                taskArrayList.remove(integer);

            } else if (choice == 4) {
                System.exit(0);
            }else{
                System.out.println("Invalid choice");
            }
        }

    }

}

