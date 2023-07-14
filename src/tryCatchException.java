//A method catches an excepion with the combination of try and catch keywords: it is placed around the code that might
//generate an exception
//SYNTAX =
//         try{
//              //protected code;
//      } catch (Exception Name e){
//              Catch block;
//       }



public class tryCatchException {
    public static void main(String[] args) {
        try {
            int a[]=new int [2];
            System.out.println("Access element three:" +a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown : " + "Use index of 0-2" );
        }

        System.out.println("out of block");
    }
}
