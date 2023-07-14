public class ArrayDisplay {

        public void displayArray(int[][] arr) {
            for (int[] row : arr) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }



        public static void main(String[] args) {
            int[][] array = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };



            ArrayDisplay display = new ArrayDisplay();
            display.displayArray(array);
        }
    }

