public class ArithmeticEngine {

        private double firstNumber;
        private double secondNumber;
        public ArithmeticEngine(double fn, double sn){
            this.firstNumber = fn;
            this.secondNumber = sn;
        }
        public double addTwoNumbers(){
            return this.firstNumber + this.secondNumber;
        }

        public double subTwoNumbers() {
            return this.firstNumber - this.secondNumber;
        }

        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }
    }

