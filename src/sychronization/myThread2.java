
package sychronization;

    public class myThread2  extends Thread{
        Table t;
        myThread2(Table t){
            this.t= t;
        }

        public void run(){
            t.printTable(3);
        }
    }

