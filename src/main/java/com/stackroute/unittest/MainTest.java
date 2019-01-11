package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class MainTest {

    public List<Student> SortStudents(List<Student> s)
    {
        String str="";
        Collections.sort(s,new StudentSorter());
        Iterator it1 = s.iterator();
        while (it1.hasNext()) {
            Student element = (Student) it1.next();
            System.out.println(element.getId() + " " + element.getName() + " " + element.getAge()+" ");
        }
        return s;
    }
}