package utlities;

public class MultiTh  extends Thread{
    @Override
    public void run() {
        DBUtilSingleton.getInstance();
    }
}
