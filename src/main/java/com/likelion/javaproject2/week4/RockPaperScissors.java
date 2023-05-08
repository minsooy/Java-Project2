package com.likelion.javaproject2.week4;

public class RockPaperScissors {
    public void runGame(int player, int opponent){
        if(player == 0 && opponent == 1){
            System.out.println("win");
        }else if(player == 1 && opponent ==2){
            System.out.println("win");
        } else if (player == 2 && opponent == 0) {
            System.out.println("win");
        } else if (player == opponent) {
            System.out.println("tie");
        }else{
            System.out.println("lose");
        }
    }

    public static void main(String[] args) {
        RockPaperScissors rpc = new RockPaperScissors();
        rpc.runGame(2,1);
    }

}
