public class Activity {

    public int calc(int x){
        return x * x;

    }

    public static void main(String[] args) {
        Activity calculator = new Activity();
        System.out.println(calculator.calc(3));
    }
}
