package org.example.tests;

import base.BaseTest;
import org.testng.annotations.Test;
import utlities.DBUtilSingleton;
import utlities.MultiTh;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DbUtilSingletonTests extends BaseTest {

    @Test
    public void testDBUtilMultiThreading(){
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().availableProcessors());
        for(int i=0;i<100;i++){
            executorService.execute(new MultiTh());
        }

        executorService.shutdown();

    }

    @Test
    public void testDBUtilMultiThreading2(){
        for(int i=0;i<100;i++) {
            MultiTh t1 = new MultiTh();
            t1.start();
        }

    }

    @Test
    public void testDBUtil2(){
        DBUtilSingleton dbUtilSingleton = DBUtilSingleton.getInstance();
    }

    @Test
    public void testDBUtil9(){
        DBUtilSingleton dbUtilSingleton = DBUtilSingleton.getInstance();
    }

    @Test
    public void testDBUtil10(){
        DBUtilSingleton dbUtilSingleton = DBUtilSingleton.getInstance();
    }

    @Test
    public void testDBUtil11(){
        DBUtilSingleton dbUtilSingleton = DBUtilSingleton.getInstance();
    }

    @Test
    public void testDBUtil12(){
        DBUtilSingleton dbUtilSingleton = DBUtilSingleton.getInstance();
    }

//    @Test
//    public void testDBUtil3(){
//        dbUtilSingleton.runQuery("select * from fewaf");
//    }

//    @Test
//    public void testDBUtil4(){
//        dbUtilSingleton.runQuery("select * from fewaf");
//    }
//
//    @Test
//    public void testDBUtil5(){
//        dbUtilSingleton.runQuery("select * from testDBUtil5");
//    }

//    @Test
//    public void testDBUtil6(){
//        DBUtil dbUtil = new DBUtil();
//    }

//    @Test
//    public void testDBUtil7(){
//        DBUtil dbUtil = new DBUtil();
//    }
//
//    @Test
//    public void testDBUtil8(){
//        DBUtil dbUtil = new DBUtil();
//    }
//
//    @Test
//    public void testDBUtil9(){
//        dbUtil.runQuery("testDBUtil9");
//    }
//
//    @Test
//    public void testDBUtil10(){
//        dbUtil.runQuery("testDBUtil10");
//    }
}
