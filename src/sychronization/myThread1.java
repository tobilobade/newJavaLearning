package sychronization;

public class myThread1  extends Thread{
    Table t;
    myThread1(Table t){
        this.t= t;
    }

    public void run(){
        t.printTable(2);
    }
}
