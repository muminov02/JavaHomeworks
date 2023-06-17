public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = str.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("n[" + (i + 1) + "]=");
            arr[i] = str.nextInt();
        }

        str.close();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > 9) && (arr[i] < 100)) {
                sum += i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = sum;
            }
        }

        System.out.println(Arrays.toString(arr));
