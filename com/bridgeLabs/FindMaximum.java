package com.bridgeLabs;

public class FindMaximum<T extends Comparable<T>> {

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
    //Test Case 4
    public T findGreater(T n1,T n2,T n3){
        if(n1.compareTo(n2)>0 && n1.compareTo(n3)>0){
            return n1;
        }else if(n2.compareTo(n1) >0 && n2.compareTo(n3)>0){
            return n2;
        }else{
            return n3;
        }
    }

    public static void main(String[] args) {

        FindMaximum<Integer> maximum = new FindMaximum();
        int maxInt = maximum.findGreater(100,200,50);
        System.out.println("Maximum Integer Value is "+maxInt);

        FindMaximum<Float> maximum1 = new FindMaximum();
        float maxFloat = maximum1.findGreater(20.0f,50.00f,5.0f);
        System.out.println("Maximum Float Value is "+maxFloat);

        FindMaximum<String> maximum2 = new FindMaximum();
        String result = maximum2.findGreater("Amruta","Megha","Roopali");
        System.out.println("Maximum String value is "+result);

    }
}
