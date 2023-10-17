package lesson3;

public class exampleFour {
    public static void main(String[] args) {
        int num = 673;

        int dit1 = num % 10;
        int dit3 = num / 100;
        int dit2 = num % 100 / 10;

        int sum = dit1 + dit2 + dit3;

        System.out.println(sum);

    }
}
