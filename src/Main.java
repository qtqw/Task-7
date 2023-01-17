import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String SEQUENCEASK = "Введите последовательность (для завершения введите букву): ";
    public static void main(String[] args) {
        Tests.test1();
        Tests.test2();
        Tests.test3();
        Tests.test4();
        Tests.test5();
        Tests.test6();
        Tests.test7();
        Tests.test8();
        Tests.test9();
        Tests.test10();

        int[] sequence = Input();
           Result result = solution(sequence);
            System.out.print(result.position + " ");
        System.out.print(result.count);
        }



    private static int[] Input() {
        List<Integer> sequence = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println(SEQUENCEASK);
        while (scanner.hasNextInt()){
            sequence.add(scanner.nextInt());
        }
        return SeqtoArray(sequence);
    }

    public static class Result {
        public int position;
        public int count;
        public Result(){
            position = 0;
            count = 1;
        }
    }

    public static Result solution(int[] sequence) {
        Result result = new Result();
        Result maxResult = new Result();
        for (int i = 0; i < sequence.length-1; i++) {
            if (sequence[i] <= sequence[i+1]) {
                result.count++;
            }
            else {
                if (result.count >= maxResult.count)
                {
                    maxResult.count = result.count;
                    maxResult.position = result.position;
                }

                result.position = i+1;
                result.count = 1;
            }

            if (result.count >= maxResult.count)
            {
                maxResult.count = result.count;
                maxResult.position = result.position;
            }
        }
        return maxResult;
    }

    public static int[] SeqtoArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}