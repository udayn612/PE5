package com.stackroute.PE5TestCases;

import com.stackroute.PE5.CountTheCount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountTheCountTest {

    CountTheCount ct;
    HashMap<String, Integer> find = new HashMap<>();
    {
        find.put("one",5);
        find.put("two",2);
        find.put("three",2);
    }
    String test="one one -one___two,,three,one @three*one?two";
    String test1="one one -one___two,,three,one @three";

    @Before
    public void setUp() throws Exception {
        ct=new CountTheCount();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findTheCountsSuceess() {
        assertEquals(find,ct.FindTheCounts(test));
    }


    @Test
    public void findTheCountsFailure() {
        assertNotEquals(find,ct.FindTheCounts(test1));
    }
}