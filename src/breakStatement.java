public class breakStatement {
    public static void main(String[] args) {
        String[]arr={"Damilola", "Naomi", "Tega", "Tuyo", "Tolu"};

        String searchName="Tuyo";

        int i;
        boolean  foundName=false;


        for (i=0; i<arr.length;i++){
            if (arr[i]==searchName){
                foundName= true;
                break;
            }
        }

        if (foundName) {
            System.out.println("The name " + searchName + " " + "is found at index" + i);

        }else{
            System.out.println("The name " + searchName + "is not found in array");
        }
    }
}
