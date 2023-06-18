public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите цифры (для завершения введите -1): ");
        LinkedList<Integer> linkedList = creatList(scanner);
        System.out.println(linkedList);
        Collections.reverse(linkedList);
        System.out.println("Collections.reverse(linkedList) = " + linkedList);
    }

    /**
     * @apiNote вспомогательная функция
     * @param scanner сканер
     * @return создает список
     */
    private static LinkedList creatList(Scanner scanner) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        int n = scanner.nextInt();
        if (n == -1) {
            return integerLinkedList;
        } else {
            integerLinkedList.add(n);
        }
        while (n != -1) {
            int k = scanner.nextInt();
            integerLinkedList.add(k);
            n = k;
        }
        return integerLinkedList;
    }
