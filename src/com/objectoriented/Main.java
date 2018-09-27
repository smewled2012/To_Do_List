package com.objectoriented;

import java.util.Scanner;

public class Main {

    private final  String[] catagory ={"chores","outdoor","family"};

    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        List_Favourite fav1 = new List_Favourite();
        System.out.println("Enter the item you have to do !");
        String task = input.nextLine();
        fav1.setName(task);

        System.out.println("Enter the catagory of this item 1. chores, 2. outdoor and 3. family");
        Integer num = input.nextInt();
        if(num==1){
            String cat =
        }





    }
}
