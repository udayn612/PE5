package com.stackroute.PE5TestCases;

import com.stackroute.PE5.UpdateSpecificElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateSpecificElementTest {

    UpdateSpecificElement up;
    List<String> list =new ArrayList<String>();
    {
        list.add("apple");
        list.add("orange");
        list.add("grapes");
        list.add("mango");
    }
    List<String> updatedlist =new ArrayList<String>();
    {
        updatedlist.add("kiwi");
        updatedlist.add("orange");
        updatedlist.add("grapes");
        updatedlist.add("mango");
    }


    @Before
    public void setUp() throws Exception {
        up=new UpdateSpecificElement();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void updateElementSuccess() {

        assertEquals(updatedlist, up.updateElement(list,"apple","kiwi"));
    }

    @Test
    public void updateElementFailure()
    {
        assertNotEquals(list,up.updateElement(updatedlist,"apple","kiwi"));
    }

}