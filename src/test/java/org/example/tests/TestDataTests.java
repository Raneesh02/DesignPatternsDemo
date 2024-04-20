package org.example.tests;

import org.testng.annotations.Test;
import testdata.Car;
import testdata.TestDataBuilder;
import utlities.MultiTh;

public class TestDataTests {

    @Test
    public void testDataUtil(){
        Object a = new TestDataBuilder().withAnyPost().build();
    }

    @Test
    public void testDataUtil3(){

        for(int i=0;i<100;i++) {
            MultiTh multiTh = new MultiTh();
            multiTh.start();
        }

    }

    @Test
    public void testDataUtil2(){
       Car car1 = new Car.CarBuilder().setTransmission("manual").setCruiseControl(true).build();
       car1.printObj();

       Car car2 = new Car.CarBuilder("tata",2023).setTransmission("automatic").setCruiseControl(false).build();
       car2.printObj();

    }
}
