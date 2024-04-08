package base;

import org.example.pages.factory.PageFactory;
import org.testng.annotations.BeforeSuite;
import utlities.DBUtil;
import utlities.DBUtilSingleton;

import java.io.IOException;

public class BaseTest {

//    protected DBUtilSingleton dbUtilSingleton;
    protected DBUtil dbUtil;
    protected PageFactory pageFactory;

    @BeforeSuite
    public void beforeSuite() throws IOException {
//        dbUtilSingleton = DBUtilSingleton.getInstance();
//        dbUtil = new DBUtil();
        pageFactory = PageFactory.getPageFactory();
    }
}
