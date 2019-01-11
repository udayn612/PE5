package com.stackroute.PE5TestCases;

import com.stackroute.PE5.SetInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SetInterfaceTest {

    SetInterface st;
    String str="Harry Olive Alice Bluto Eugene";
    String str1="Harry Olive Alice Bluto";
    Set<String> set=new TreeSet<String>();
    {
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");
    }
    List<String> list=new ArrayList<String>();
    {
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");
        list.add("Harry");
        list.add("Olive");

    }
    List<String> list1=new ArrayList<String>();
    {
        list1.add("Alice");
        list1.add("Bluto");
        list1.add("Eugene");
        list1.add("Harry");


    }
    @Before
    public void setUp() throws Exception {
        st=new SetInterface();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setInterfaceSuccess() {
        assertEquals(set,st.setInterface(str));

    }
    @Test
    public void setInterfaceFailure() {
        assertNotEquals(set,st.setInterface(str1));

    }

    @Test
    public void convertToListSuccess() {
        assertEquals(list,st.convertToList(set));
    }

    @Test
    public void convertToListFailure() {
        assertNotEquals(list1,st.convertToList(set));
    }
}