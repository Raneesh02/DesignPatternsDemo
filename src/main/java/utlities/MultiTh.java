package utlities;

public class MultiTh  implements Runnable{
    @Override
    public void run() {
        DBUtilSingleton.getInstance();
    }
}
