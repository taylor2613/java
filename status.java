package com.company;
import java.util.*;

class status_student {
     public static int TOTAL_NUM=10;
     static String name;
     static int age;
     static int id;
     static String job;
     static int del_num;
     static int i_enroll=0;
     public static String[][] info = new String[TOTAL_NUM][4];
     static void init(){
         for(int i=0;i<TOTAL_NUM;i++){
             for(int j=0;j<4;j++){
                 info[i][j]=null;
             }
         }
     }
     static int enroll(){

        Scanner inputinfo = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("Management Programes");
        System.out.println("==================");
        System.out.println("------------------");
        System.out.println(" ENROLL       MENU");
        System.out.println("------------------");
        System.out.print(" Name : ");
        name = inputinfo.next();
        System.out.print(" Age : ");
        age = inputinfo.nextInt();
        System.out.print(" ID : ");
        id = inputinfo.nextInt();
        System.out.print(" Job : ");
        job = inputinfo.next();


        if(i_enroll==10){
            System.out.println("You cannot enroll anymore!");
            return -1;
        }
        //if id is duplicated then enrolling will be stop
         for(int k=0;k<TOTAL_NUM;k++) {
             if (Integer.toString(id).equals(info[k][2])) {
                 System.out.println("this Id is already exist");
                 return -1;
             }
         }



         for(int k=0;k<TOTAL_NUM;k++){

             if (info[i_enroll][0]!=null){
                 System.out.println(i_enroll +" 번째 열에는 이미 데이터가 존재하니 다음 빈칸을 탐색하고 저장합니다.");
                 i_enroll++;
             }else{
                 info[i_enroll][0] = name;
                 info[i_enroll][1] = Integer.toString(age);
                 info[i_enroll][2] = Integer.toString(id);
                 info[i_enroll][3] = job;

                 i_enroll++;
                 break;

             }

         }



        return 0;
      }

    public void viewing(){
        Scanner inputid = new Scanner(System.in);
        System.out.println("searching a person useing ID : ");
        int id1 = inputid.nextInt();

            for(int i=0;i<TOTAL_NUM;i++) {
                if(info[i][2]!=null) {
                    if (Integer.parseInt(info[i][2]) == id1) {
                        System.out.println(" Name : " + info[i][0]);
                        System.out.println(" Age : " + info[i][1]);
                        System.out.println(" ID : " + info[i][2]);
                        System.out.println(" Job : " + info[i][3]);
                        System.out.println();
                        break;
                    }
                }
            }

      }




    public void viewing_All(){

        for(int i=0;i<10;i++){
            if(info[i][0]!=null) {
                System.out.println(" Name : " + info[i][0]);
                System.out.println(" Age : " + info[i][1]);
                System.out.println(" ID : " + info[i][2]);
                System.out.println(" Job : " + info[i][3]);

                System.out.println();
            }
        }
    }
    public void deleting(){
        Scanner del = new Scanner(System.in);

        System.out.println("What person do you want to delete? (input id) : ");
        del_num=del.nextInt();
        for(int j=0;j<TOTAL_NUM;j++) {


            if(info[j][2] == null){
                continue;
            }else if (Integer.parseInt(info[j][2]) == del_num) {

                info[j][0] = null;
                info[j][1] = null;
                info[j][2] = null;
                info[j][3] = null;
                i_enroll = 0;
                break;
            }else if(j>9) {
                System.out.println("Nothing in database!");
                break;
            }

        }
    }
 // end of class
}