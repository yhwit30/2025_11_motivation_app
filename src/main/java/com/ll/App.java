package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc;

    List<Motivation> motivationList = new ArrayList<>();

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run(){

        int lastId = 0;

        System.out.println("== motivation App 실행 ==");

        while(true){
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if(cmd.equals("exit")){
                System.out.println("== motivation App 종료 ==");
                break;
            }
            else if (cmd.length() == 0){
                System.out.println("명령어가 입력되지 않았음");
                continue;
            }

            if(cmd.equals("add")){
                lastId++;
                System.out.print("내용 : ");
                String motiv = sc.nextLine().trim();
                System.out.print("저자 : ");
                String writer = sc.nextLine().trim();
                System.out.println((lastId) + "번 명언이 생성되었습니다.");

                Motivation motivation = new Motivation(lastId, motiv, writer);

                motivationList.add(motivation);
            }
            if(cmd.equals("list")){
                System.out.println("번호  /   명언   /    저자");

                if(motivationList.size() == 0){
                    System.out.println("등록된 명언이 없음");
                } else{
                    System.out.println("1개 이상 명언이 있음");
                }
//                System.out.println(motivationList.toString());

            }


        }



    }

}
