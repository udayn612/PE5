package com.stackroute.PE5;

import java.util.Comparator;

class StudentSorter implements Comparator<Student>  {
    public int compare(Student a, Student b)
    {
        if(a.getAge()-b.getAge()!=0){
            return b.getAge()-a.getAge();
        }else {
            return a.getName().compareTo(b.getName());
        }
    }
}