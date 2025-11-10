package com.ll;

import com.ll.controller.MotivationController;
import com.ll.controller.SystemController;

import java.util.Scanner;

public class App {
    Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }



    public void run() {
        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController(sc);

        System.out.println("== motivation App 실행 ==");

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();
            if (cmd.equals("exit")) {
                systemController.exit();
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어가 입력되지 않았음");
                continue;
            } else if (cmd.equals("add")) {
                motivationController.add();
            } else if (cmd.equals("list")) {
                motivationController.list();
            } else if (cmd.startsWith("delete")) {
                motivationController.delete(cmd);
            } else {
                System.out.println("그런 명령어는 없습니다.");
            }
        }


    }

}
