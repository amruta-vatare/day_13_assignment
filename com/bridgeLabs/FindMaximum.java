package com.bridgeLabs;

public class FindMaximum {
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
    public static void main(String[] args) {
        FindMaximum maximum = new FindMaximum();
        Integer num1 = 100;
        Integer num2 = 99;
        Integer num3 = 50;
        int maxInt = maximum.findMaxInt(num1,num2,num3);
        System.out.println("Maximum Integer Value is "+maxInt);
        Float fNum1 = 19.20f;
        Float fNum2 = 5.0f;
        Float fNum3 = 39.00f;
        float maxFloat = maximum.findMaxFloat(fNum1,fNum2,fNum3);
        System.out.println("Maximum Float Value is "+maxFloat);




    }
}
