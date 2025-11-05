package com.ll;

import java.util.Scanner;

public class App {

    Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run(){
        System.out.println("==motivation App 실행==");

        while(true){
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if(cmd.equals("exit")){
                System.out.println("motivation App 종료");
                break;
            }

        }



    }

}
