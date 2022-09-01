package com.bridgeLabs;

public class FindMaximum {
    //Test Case - 1
    public static void findMaxInt(Integer n1,Integer n2,Integer n3){
        if(n1.compareTo(n2)>0 && n1.compareTo(n3)>0){
            System.out.println(n1+" is greater");
        }else if(n2.compareTo(n1) >0 && n2.compareTo(n3)>0){
            System.out.println(n2+" is greater");
        }else if(n3.compareTo(n1)>0 && n3.compareTo(n2)>0){
            System.out.println(n3+" is greater");
        }
    }
    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 99;
        Integer num3 = 50;
        findMaxInt(num1,num2,num3);




    }
}
