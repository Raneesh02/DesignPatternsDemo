package org.example.tests;

import org.testng.annotations.Test;
import testdata.TestDataBuilder;

public class TestDataTests {

    @Test
    public void testDataUtil(){


        Object a = new TestDataBuilder().withAnyPost().build();

    }
}
