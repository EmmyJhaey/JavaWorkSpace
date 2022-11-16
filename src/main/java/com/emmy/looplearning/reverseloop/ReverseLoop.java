package com.emmy.looplearning.reverseloop;

public class ReverseLoop {

    public static void main(String[] args) {

        String str = "kkdakdiaekakiakeeaidkaiekd";

        for(int i = str.length() - 1 ; i >= 0; i--){
            System.out.println(i + "Char At : " + str.charAt(i));
        }

    }

}
