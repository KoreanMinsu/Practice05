package com.javaex.ex09;

public class StringUtil {
    
	public static String concatString(String[] strArray){
		
		String concatString = "";
		for(int i=0; i<strArray.length; i++) {
			concatString = concatString+strArray[i];
		}
		return concatString;
        //메소드 내용작성
        
    }

}
