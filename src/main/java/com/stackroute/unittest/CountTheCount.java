package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Scanner;

/*
    Question number 2
    Write a program to find the number of counts in the following  String
    Coded by Uday N

 */

public class CountTheCount {


    public HashMap<String, Integer>FindTheCounts(String str) {

        String result = str.replaceAll("[-+.^:,@___<>*?_]", " ");

        HashMap<String, Integer> find = new HashMap<>();

        String []str1=result.split(" ");

        for(int i=0;i<str1.length;i++)
        {

            if(find.get(str1[i])==null)
            {
                find.put(str1[i],1);
            }
            else
                find.put(str1[i],find.get(str1[i])+1);
        }
        find.remove("");
        return find;
    }

}