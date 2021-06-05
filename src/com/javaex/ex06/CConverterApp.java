package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        System.out.print("백만원은 ");
        System.out.print(CConverter.toDoller(1000000.0));
        System.out.println("달러입니다.");

        
        //100달려를 원으로 출력하기
        System.out.print("백달려는 ");
        System.out.print(CConverter.toKWR(100.0));
        System.out.println("입니다.");

        
    }

}
