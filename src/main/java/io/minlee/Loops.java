package io.minlee;

import java.util.Random;

/**
 * Created by minlee on 5/3/16.
 */
public class Loops {

    public String oneToTen(){
        String output = "*** Output ***";
        for(int i = 1; i < 11; i++){
            output+="\n"+Integer.toString(i);
        }
        return output;
    }

    public String oddNumbers(){
        String output = "*** Output ***";
        for(int i = 1; i < 21; i++){
            if((i % 2) != 0){
                output+="\n"+Integer.toString(i);
            }
        }
        return output;
    }

    public String squares(){
        String output = "*** Output ***";
        for(int i = 1; i < 11; i++){
            output+="\n"+Integer.toString(i*i);
        }
        return output;
    }

    public String random4(){
        Random random = new Random();
        String output = "*** Output ***";
        for(int i = 0; i < 4; i++){
            output+="\n"+Integer.toString(random.nextInt(10)+1);
        }
        return output;
    }

    public String even(int n){
        String output = "*** Output ***";
        for(int i = 1; i < n; i++){
            if((i % 2) == 0){
                output+="\n"+Integer.toString(i);
            }
        }
        return output;
    }

    public String powers(int n){
        String output = "*** Output ***";
        int powers = 1;
        for(int i = 1; i < n+1; i++){
            powers = powers * 2;
            output+="\n"+Integer.toString(powers);
        }
        return output;
    }

    public String areWeThereYet(String input){
        String output = "";
        switch (input){
            case "Yes":
                output = "Good!";
        }
        return output;

    }

    public String triangle(int n){
        String output = "*** Output ***";
        for(int i = 0; i < n; i++){
            output+="\n";
            for(int j = 0; j < i+1; j ++){
                output +="*";
            }
        }
        return output;
    }

    public String tableSquare(int n){
        int[][] timesTable = timesTableCreator(n);
        int[] digitsPerColumn = digitsPerColumn(n);
        String output = "*** Output ***";
        output += "\nA "+n+" x "+n + " table square";

        for(int i = 0; i < n; i++){
            output+="\n|";
            for(int j = 0; j < n; j ++){
                int digitDifference = digitsPerColumn[j]-digitsOfSingleNumber(timesTable[i][j]);
                output+=" ";
                for(int k = 0; k < digitDifference; k++){
                    output+=" ";
                }
                output+=Integer.toString(timesTable[i][j])+" |";
            }
        }
        System.out.println(output);
        return output;
    }

    public int digitsOfSingleNumber(int n){
        return(int) Math.log10(n)+1;
    }

    public int[] digitsPerColumn(int n){
        //Returns the max number of digits of each column
        int[] digitsPerColumn = new int[n];
        for(int i = 1; i < n+1; i++){
            digitsPerColumn[i-1] = (int) Math.log10(n*i)+1;
        }
        return digitsPerColumn;
    }

    public int[][] timesTableCreator(int n){
        int[][] timesTable = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
                timesTable[i][j] = (i+1)*(j+1);
            }
        }
        return timesTable;
    }



}
