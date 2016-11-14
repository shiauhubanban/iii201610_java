package tw.org.iii.javatest;

import java.util.Timer;
import java.util.TimerTask;

public class shine52 {
    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new MyTask(),3*1000,1000);  //第一次三秒 後面都一秒
        timer.schedule(new StopTime(timer),10*1000);
        System.out.println("Wait......");
    }
}
class MyTask extends TimerTask{
    int i ;
    @Override
    public void run() {
        System.out.println(i++);
    }
}
class StopTime extends TimerTask{
    private  Timer timer;
    StopTime(Timer timer){this.timer = timer;}
    @Override
    public void run() {
        timer.purge();   //任務拿掉
        timer.cancel();  //不走了
        timer = null;    //拿去記憶體回收
    }
}