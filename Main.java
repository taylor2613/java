package com.company;
import java.util.Scanner;
import static java.lang.System.exit;

/**
 * call the status class
 */
class menu {

    public static void Enroll(){
        status_student student = new status_student();
        student.enroll();
    }
    public static void Delete(){
        status_student student = new status_student();
        student.deleting();
    }
    public static void View(){
        status_student student = new status_student();
        student.viewing();
    }
    public static void ViewAll(){
        status_student student = new status_student();
        student.viewing_All();
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        menu menu = new menu();
        status_student init = new status_student();
        init.init();



        while(true) {
            System.out.println("==================");
            System.out.println("Management Programes");
            System.out.println("==================");

            System.out.println("------------------");
            System.out.println(" M A I N   M E N U");
            System.out.println("------------------");

            System.out.println("1. Enrollment ");
            System.out.println("2. Delete");
            System.out.println("3. View");
            System.out.println("4. View All");
            System.out.println("0. Exit");

            System.out.println("------------------");
            System.out.println("What menu do you want?");
            int what_num = num.nextInt();
            switch (what_num) {
                case 1:
                    menu.Enroll();
                    break;
                case 2:
                    menu.Delete();
                    break;
                case 3:
                    menu.View();
                    break;
                case 4:
                    menu.ViewAll();
                    break;
                case 0:
                    exit(0);
                    break;
                default:
                    System.out.println("Wrong! Input another num!");
            }
        }

    }
}
