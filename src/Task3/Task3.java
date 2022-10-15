package Task3;


public class Task3 {
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 2, 3);
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }

        try {
            Triangle triangle2 = new Triangle(1, 2, 4);
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}