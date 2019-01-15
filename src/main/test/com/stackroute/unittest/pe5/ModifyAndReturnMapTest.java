package com.stackroute.PE5TestCases;

import com.stackroute.PE5.ModifyAndReturnMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyAndReturnMapTest {

    ModifyAndReturnMap mod;
    Map<String, String> hm = new HashMap<String, String>();
    {
        hm.put("value1", "java");
        hm.put("value2", "c++");
    }
    Map<String, String> hm1 = new HashMap<String, String>();
    {
        hm1.put("value1", " ");
        hm1.put("value2", "java");

    }
    Map<String, String> hm2 = new HashMap<String, String>();
    {
        hm2.put("value1", "java");
        hm2.put("value2", " ");

    }


    @Before
    public void setUp() throws Exception {
        mod=new ModifyAndReturnMap();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void modifysuccess() {
        assertEquals(hm1,mod.modify(hm));
    }

    @Test
    public void modifyfailure() {
        assertNotEquals(hm2,mod.modify(hm));
    }
}