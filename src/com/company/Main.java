package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        User user = new User();
        Scanner scanner= new Scanner(System.in);
        for (int i = 0;  ; i++) {

          try{
              System.out.println("Ваше имя");
              String name=scanner.nextLine();
              System.out.println("Ваш возраст");
              int age= scanner.nextInt();
              scanner.nextLine();
              user.setName(name);
              user.setAge(age);
          }  catch (IllegalNameLengthException ed){
              ed.printStackTrace();
          }catch (IllegalAgeException ea){
              ea.printStackTrace();
          }


        }
    }
}
