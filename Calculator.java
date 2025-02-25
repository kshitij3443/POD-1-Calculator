public class Calculator{

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 5;

        int addedNumber  = add(firstNumber, secondNumber);
        System.out.println("The added number is: " + addedNumber);

        int subtractedNumber  = subtract(addedNumber, addedNumber);
        System.out.println("The subtracted number is: " + subtractedNumber);
    }
}