import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//We have 3 types of exceptions
//Checked exception (can be numerous)
//Unchecked exception || runtime exception
//error handling -(vmError, stackOverflow error, outOfMemory error)




public class exceptionHandling {
    private static Object e;
//    public static void main(String[] args) throws FileNotFoundException {
//       File file = new File("E://file.txt") ;
//       FileReader fr = new FileReader(file); // An example of checked exception
//    }

    public static void main(String[] args)  {
        try(FileReader fr =new FileReader("C:\\Users\\damilola.adetugboboh\\Desktop\\newTest\\src\\file.txt")){
            char[]a=new char[50];
            fr.read(a);
            for (char c:a) {
                System.out.print(c);
            }

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }



