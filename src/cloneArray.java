public class cloneArray {
    public static void main(String[] args) {
        int arr[]= {33,3,4,5};
        int newArr[]= {33,3,4,5};
        System.out.println("Printing original array");
        for (int i:arr){
            System.out.println(i);
        }

        System.out.println("printing clone");
        int clone[] =arr.clone();
        for (int i:clone){
            System.out.println(i);
        }
        System.out.println("Are they equal?");
        System.out.print(arr==newArr);

    }
}
