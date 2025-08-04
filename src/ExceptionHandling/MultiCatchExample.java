package ExceptionHandling;

public  class MultiCatchExample {
    public static void main(String [] args){
        try{
            int[] numbers={1,2,3};
            System.out.println(numbers[5]);

            int result=10/0;
            System.out.println("Result : "+ result);

        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Exception caught : " + e);
        }finally {
            System.out.println("Final block has executed");

            }
        System.out.println("Program continues ...");
        }
    }
