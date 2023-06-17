public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = str.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("n[" + (i+1) + "]=");
            arr[i] = str.nextInt();
            if (isPrime(arr[i])) sum+=arr[i];
        }
        System.out.println(sum);
        str.close();
    }

    private static boolean isPrime(int n) {
        int temp;
        if (n == 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            temp = n % i;
            if (temp == 0) return false;
        }
        return true;
    }
