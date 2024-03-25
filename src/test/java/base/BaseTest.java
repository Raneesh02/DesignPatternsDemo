package base;

import org.testng.annotations.BeforeSuite;
import utlities.DBUtil;
import utlities.DBUtilSingleton;

public class BaseTest {

//    protected DBUtilSingleton dbUtilSingleton;
    protected DBUtil dbUtil;

    @BeforeSuite
    public void beforeSuite(){
//        dbUtilSingleton = DBUtilSingleton.getInstance();
//        dbUtil = new DBUtil();
    }
}
