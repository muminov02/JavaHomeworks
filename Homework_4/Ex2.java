public static void main(String[] args) {
        String[] brackets = {"{", "}", "[", "]", "(", ")"};

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String str = sc.nextLine();

        boolean res = true;
        for (int i = 0; i < str.length(); i++) {
            if (i != str.length()-1) {
                if ((Character.toString(str.charAt(i)).contains(brackets[0])) && (Character.toString(str.charAt(i + 1)).contains(brackets[1]))) {
                    i++;
                } else if ((Character.toString(str.charAt(i)).contains(brackets[2])) && (Character.toString(str.charAt(i + 1)).contains(brackets[3]))) {
                    i++;
                } else if ((Character.toString(str.charAt(i)).contains(brackets[4])) && (Character.toString(str.charAt(i + 1)).contains(brackets[5]))) {
                    i++;
                } else {
                    res = false;
                }
            }else {
                res=false;
            }
        }
        System.out.println(res);
    }
