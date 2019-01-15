package com.stackroute.PE5;

import java.util.*;

/* Java program to update specific array element by given element
 * Coded by Uday N
 * Question number 1
 *
 *   */

public class UpdateSpecificElement {


    public List<String> updateElement(List<String> list,String value ,String updatevalue)
    {
       ListIterator<String> itr=list.listIterator();

        while(itr.hasNext())
        {
            String next=itr.next();
            if(next.equals(value))
            {
                itr.set(updatevalue);
            }

        }
        return list;

    }

}
