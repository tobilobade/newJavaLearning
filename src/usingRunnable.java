public class usingRunnable implements Runnable{

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i);
        }


    }

    public static void main(String args[]){
        usingRunnable m1=new usingRunnable();
        Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
    }
}
