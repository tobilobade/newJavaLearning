public class continueStatement {
    public static void main(String[] args) {
        int x =1;
        int y=10;

        do{
            if(x==y/2){
                x++;
                System.out.println("Condition met");
                continue;
            }
            System.out.println(x);
            x++;
        }while(x<=y);
    }

}
