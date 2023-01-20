    public class Calculator
    {
        //constructor method
        public Calculator()
        {

        }

        //addition method
        public int add(int x, int y)
        {
            return x+y;
        }

        //subtract method
        public int subtract(int x, int y)
        {
            return x-y;
        }
        //multiplication method
        public int multiply(int x, int y)
        {
            return x*y;
        }
        //divide method
        public int divide(int x, int y)
        {
            return x/y;
        }
        //modulo method
        public int modulo(int x, int y)
        {
            return x%y;
        }

        //main method
        public static void main(String[] args)
        {
    /*create a calculator object inside the main method
    Here, you can print the results directly or save them to a variable, and then print it*/
            Calculator myCalculator= new Calculator();
            System.out.println("The addition result is "+myCalculator.add(5,7));
            System.out.println("The subtraction result is "+myCalculator.subtract(45,11));
            System.out.println("The product of the two numbers is "+myCalculator.multiply(17, 10));
            int division=myCalculator.divide(100, 25);
            System.out.println("The division result is "+division);
            int modulous=myCalculator.modulo(21, 4);
            System.out.println("The modulo of the two integers is "+modulous);
        }
    }

