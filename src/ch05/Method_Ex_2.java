package ch05;

import java.util.SplittableRandom;

public class Method_Ex_2 {

    private String word;
    public void setWord(String word){
        this.word = word;
    }

    public int getWord() {
        int wordVal = word.length();
        return wordVal;
    }

    private int factorial;
    public int Fac(int[] arr){
        this.factorial = factorial;
        int gop = 0;
        for (int val : arr) {
            gop *= val;
            }
        return gop;
        }
    private String concatenate;

    public String  contect(String al1, String al2){
        String con = al1 + al2;
        return con;
    }

    private double calaulateAverage;

    public void setCal(double[] dArr){
        double avr = 0;
        double dAver = 0;
        for (double dVal : dArr){
            avr += dVal;
            dAver = avr / dArr.length;
        }
    }
}



