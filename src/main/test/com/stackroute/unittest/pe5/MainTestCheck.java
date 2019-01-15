package com.stackroute.PE5TestCases;

import com.stackroute.PE5.MainTest;
import com.stackroute.PE5.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MainTestCheck {

    @Before
    public void setUp() throws Exception {

        MainTest test = new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        mainTest = null;
    }

    MainTest mainTest;

    @Test
    public void studentInfoTest() {

        MainTest test = new MainTest();

        Student obj1 = new Student(111, "Akshay", 22);
        Student obj2 = new Student(112, "Naneeth", 20);
        Student obj3 = new Student(113, "Uday", 24);
        Student obj4 = new Student(114, "Gaurav", 10);
        Student obj5 = new Student(115, "Santosh", 22);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        List<Student> ans = test.SortStudents(list);

        assertEquals(list, ans);
    }
}