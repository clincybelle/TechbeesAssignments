package com.techbeesolutions.assignments;

import java.util.Arrays;

public class LastLetterCount{

     public static void main(String []args){
       
       String sampleText = "This is used for any tool and technology";
       int i,count=0;
       int sPosition = -1;
       int yPosition = -1;
       String sVal = "";
       String yVal = "";
    String[] splited = sampleText.split("\\s+");
    for (i = 0; i < splited.length; i++) {

            if(splited[i].endsWith("s") && sVal=="") {
            	count++;
                sPosition = i;
                sVal = splited[i];
              

            }
            if(splited[i].endsWith("y") && yVal=="") {
            	count++;
                yPosition = i;
                yVal = splited[i];
                
            }
            if(sVal!="" && yVal!="") {
                break;
            }

}

splited[sPosition] = yVal;
splited[yPosition] = sVal;
        StringBuilder builder = new StringBuilder();
        for (String value : splited) {
        builder.append(value+" ");
        }
        String outputString = builder.toString();
System.out.println("Given Sentence: " +sampleText);    

System.out.println("After swapping: " + outputString);

     }
}
