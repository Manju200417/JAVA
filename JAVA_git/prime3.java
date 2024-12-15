package M_OK;

public class prime3 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static boolean isPrime(int num) {
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) return false;
        }
        return num > 1;
    }
}
