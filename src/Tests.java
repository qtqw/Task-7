public class Tests {
    private static final String RESULT = "результат:";
    public static void test1() {
        int[] testData = {1, 2, 3, 4, 5};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

    public static void test2() {
        int[] testData = {1, 2, 3, 1, 2, 3, 4};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

    public static void test3() {
        int[] testData = {1, 2, 3, 1, 2, 3};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

    public static void test4() {
        int[] testData = {-1, -2, -3, 1, 2};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

    public static void test5() {
        int[] testData = {-1, 0, 1, 2, 3};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

    public static void test6() {
        int[] testData = {1, 100, 1000, 10000, 1000000000};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

    public static void test7() {
        int[] testData = {9, 8, 7, 6, 5, 4, 3, 2};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

    public static void test8() {
        int[] testData = {1, 1, 1, 2, 2, 2, 2};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

    public static void test9() {
        int[] testData = {1, 2, 1, 2, 1, 2, 1, 2};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

    public static void test10() {
        int[] testData = {7, -3, -2, -1, 0, 1, 2, 3, 0};
        for (int item : testData) {
            System.out.print(item + " ");

        }
        Main.Result result = Main.solution(testData);
        System.out.printf("%s %d, %d",RESULT,result.position,result.count);
        System.out.println();
    }

}
