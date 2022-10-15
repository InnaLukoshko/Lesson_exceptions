package Task2;

public class Task2 {
    public static void main(String[] args) {
        try {
            inputNumber(50);
        } catch (NegativeException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    public static void inputNumber(int number) throws NegativeException {
        if (number < 0) {
            throw new NegativeException();
        } else if (number > 100) {
            throw new IllegalArgumentException("Число больше 100!");
        } else
            System.out.println(number);
    }

}
