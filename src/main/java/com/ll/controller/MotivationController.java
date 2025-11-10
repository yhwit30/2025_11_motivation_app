package com.ll.controller;

import com.ll.entity.Motivation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotivationController {
    Scanner sc;
    List<Motivation> motivationList = new ArrayList<>();

    public MotivationController(Scanner sc) {
        this.sc = sc;
    }

    int lastId = 0;

    public void add() {
        lastId++;
        System.out.print("내용 : ");
        String motiv = sc.nextLine().trim();
        System.out.print("저자 : ");
        String writer = sc.nextLine().trim();
        System.out.println((lastId) + "번 명언이 생성되었습니다.");

        Motivation motivation = new Motivation(lastId, motiv, writer);

        motivationList.add(motivation);
    }

    public void list() {
        System.out.println("번호  /   명언   /    저자");

        if (motivationList.size() == 0) {
            System.out.println("등록된 명언이 없음");
        } else {

            for (int i = motivationList.size() - 1; i >= 0; i--) {
                if (motivationList.get(i).getMotiv().length() > 5) {
                    System.out.printf("%d    /  %s    /   %s\n", motivationList.get(i).getId(), motivationList.get(i).getMotiv().substring(0, 5) + "...", motivationList.get(i).getWriter());
                } else {
                    System.out.printf("%d    /  %s    /   %s\n", motivationList.get(i).getId(), motivationList.get(i).getMotiv(), motivationList.get(i).getWriter());
                }


            }

        }
    }

    public void delete(String cmd) {
        String[] deleteWords = cmd.split(" ");

        int deleteId = Integer.parseInt(deleteWords[1]);

        Motivation foundMotivation = null;

        for (Motivation motivation : motivationList) {
            if (motivation.getId() == deleteId) {
                foundMotivation = motivation;
            }
        }
        if (foundMotivation == null) {
            System.out.println("해당 명언은 없습니다.");
            return;
        }
        motivationList.remove(foundMotivation);
        System.out.println(deleteId + "번 명언이 삭제되었습니다.");

    }

}
