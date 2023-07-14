public class breakStatementLabelled {
    public static void main(String[] args) {
        int j, k;

        outerMost:
        for (j=1;j<5;j++){
            System.out.println("j="+j);
            innerMost:
            for(k=1;k<3;k++){
                System.out.println(k);
                System.out.println("j= " + j+ " " + "k= " +k);
                if(j==3)
                    break innerMost;
            }
        }
    }
}
