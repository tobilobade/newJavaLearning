public class Multi extends Thread{
    public void run() {
        System.out.println("threading...");
    }

    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
    }
}
