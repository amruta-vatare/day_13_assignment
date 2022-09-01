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
        String str1 = "Sunny";
        String str2 = "Jhone";
        String str3 = "Raj";
        String result = maximum.findMaxString(str1,str2,str3);
        System.out.println("Maximum String value is "+result);

    }
}
