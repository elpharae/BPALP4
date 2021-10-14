package pkg;

public class Main {

    //Prvočísla
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 1; i <= Math.sqrt(num); i++)
            if (num % i == 0 && i > 1 && i < num) return false;
        return true;
    }

    private Main() {
        System.out.println(isPrime(1));
        System.out.println(isPrime(3));
        System.out.println(isPrime(17));
        System.out.println(isPrime(25));
    }

    public static void main(String[] args) {
        new Main();
    }
}
