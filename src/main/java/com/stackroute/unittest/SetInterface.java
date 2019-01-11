package com.stackroute.PE5;

import java.util.*;


/*
   * Question no 06
   * a program to implement set interface which sorts the given randomly ordered names
    in ascending order. Convert the sorted set in to an  array list
   * Coded by Uday N
 */

public class SetInterface {


    public  Set<String> setInterface(String str)
    {
        String[] arr=str.split(" ");
        Set<String> st=new TreeSet<String>();

        for(String s:arr)
        {
            st.add(s);
        }

        return st;
    }

    public  List<String> convertToList(Set<String> st)
    {
        List<String> mainList = new ArrayList<String>();
        mainList.addAll(st);

        return  mainList;
    }

}
