package sychronization;

import sychronization.Table;
import sychronization.myThread1;
import sychronization.myThread2;

public class syncMain {
    public static void main(String[] args) {
        Table t = new Table();
        myThread1 t1 = new myThread1(t);
        myThread2 t2 = new myThread2(t);
        t1.start();
        t2.start();
    }
}
