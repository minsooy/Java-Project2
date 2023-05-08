package com.likelion.javaproject2.week4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public int runGame(String p1, String p2){
        int player;
        switch (p1){
            case "바위" -> player = 0 ;
            case "가위" ->  player = 1;
            case "보" ->  player = 2;
            default -> throw new IllegalArgumentException("입력하신" + p1 + "는 낼 수 없습니다");

        };
        int opponent;
        switch (p2){
            case "바위" -> opponent = 0 ;
            case "가위" ->  opponent = 1;
            case "보" ->  opponent = 2;
            default -> throw new IllegalArgumentException("입력하신" + p2 + "는 낼 수 없습니다");

        };

        int status = 0;

        if(player == 0 && opponent == 1){
            status = 1;
//            System.out.println("win");
        }else if(player == 1 && opponent ==2){
            status = 1;
//            System.out.println("win");
        } else if (player == 2 && opponent == 0) {
            status = 1;
//            System.out.println("win");
        } else if (player == opponent) {
            status = 2;
//            System.out.println("tie");
        }else{
//            System.out.println("lose");
        }

        return status;
    }

    public String opponentChoice(){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber){
            case 0:
                return "바위";
            case 1:
                return "가위";
            case 2:
                return  "보";
            default:
                return "오류";
        }
    }

    public void repeatGame(){
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String opponent = opponentChoice();
        System.out.println("가위! 바위! 보!!!");

        System.out.printf("플레이어: %s vs 상대: %s\n", user, opponent);
        if(runGame(user, opponent) != 1){
            System.out.println("이기지 못하였습니다. 다시 게임을 실행합니다.");
            repeatGame();
        }
        if(runGame(user, opponent) == 1){
            System.out.println("승리!");
        }
    }

    public static void main(String[] args) {
        RockPaperScissors rpc = new RockPaperScissors();
//        rpc.runGame(2,1);
        rpc.repeatGame();

    }

}
