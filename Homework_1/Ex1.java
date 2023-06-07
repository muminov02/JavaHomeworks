public static void main(String[] args) {
    int[] num = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
    System.out.println(findSum(num));
    }
private static Integer findSum(int[] num) {
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
        if ((num[i] != num[0]) && (num[i] < 0)){
            sum += num[i-1];
        }
    }
    return sum;
}
