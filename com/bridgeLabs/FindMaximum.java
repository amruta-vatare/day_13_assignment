package com.bridgeLabs;

public class FindMaximum<T extends Comparable<T>> {
    //Test case Refactor 1
    private T var1;
    private T var2;
    private T var3;

    public FindMaximum(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    //Test Case - 1
    public int findMaxInt(Integer n1,Integer n2,Integer n3){
        if(n1.compareTo(n2)>0 && n1.compareTo(n3)>0){
            return n1;
        }else if(n2.compareTo(n1) >0 && n2.compareTo(n3)>0){
            return n2;
        }else{
            return n3;
        }
    }
    //Test Case - 2
    public float findMaxFloat(Float fNum1, Float fNum2, Float fNum3){
        if(fNum1.compareTo(fNum2)>0 && fNum1.compareTo(fNum3)>0){
            return fNum1;
        }else if(fNum2.compareTo(fNum1)>0 && fNum2.compareTo(fNum3)>0){
            return fNum2;
        }else {
            return fNum3;
        }
    }

    //Test Case 3
    private String findMaxString(String str1, String str2, String str3) {
        if(str1.compareTo(str2)>0 && str1.compareTo(str3)>0){
            return str1;
        }else if(str2.compareTo(str1)>0 && str2.compareTo(str3)>0){
            return str2;
        }else{
            return str3;
        }
    }

    //Refactor 2
    public void printMax(){
        FindMaximum.findGreater(var1,var2,var3);
    }
    //Test Case 4
    public static <T extends Comparable<T>> void findGreater(T n1,T n2,T n3){
        if(n1.compareTo(n2)>0 && n1.compareTo(n3)>0){
            System.out.println(n1);
        }else if(n2.compareTo(n1) >0 && n2.compareTo(n3)>0){
            System.out.println(n2);
        }else{
            System.out.println(n3);
        }
    }

    public static void main(String[] args) {

        new FindMaximum(150,300,50).printMax();

        new FindMaximum(22.0f,56.00f,53.0f).printMax();

        new FindMaximum("Raj","Gokul","Roopali").printMax();


    }
}
