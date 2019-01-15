package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/*
    * Question number 5
    * a method that accepts a Map object having two key-value
      pairs with the keys val1 and val2.Modify and return the given map as follows
    * Coded by Uday N

 */

public class ModifyAndReturnMap {


    public  Map<String, String> modify(Map<String, String> hm) {

        Iterator it = hm.entrySet().iterator();
        int flag=0;
        String prevkey="";
        String prevvalue="";
        String nextkey="";
        String nextvalue="";
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();

            if(flag==0)
            {
                prevkey =pair.getKey().toString();
                prevvalue=pair.getValue().toString();
                flag=1;
            }
            else
            {
                nextkey=pair.getKey().toString();
                nextvalue=pair.getValue().toString();
            }

        }
        hm.put(prevkey,nextvalue);
        hm.put(nextkey," ");


        return hm;

    }

}
