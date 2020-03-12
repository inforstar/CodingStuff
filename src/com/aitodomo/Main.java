package com.aitodomo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String exec = (args.length > 0 ? args[0] : "");
        switch (exec) {
            case "1":(new DrawDiamond()).doit();break;
            case "2":(new DrawDiamondUsingLines()).doit();break;
            default:System.out.println("Pick option between 1 and 2");
        }
    }
}
