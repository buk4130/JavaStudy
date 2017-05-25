import java.util.Scanner;

/**
 * Created by samsung on 2017-05-24.
 */
public class Main {

    static int Answer;
    private static int num;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {

            int num = getNum();
            int[] pointList = getPointList(num);

            Answer = solution(pointList);

            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }

    private static int solution(int[] pointList) {


        return num;
    }

    public static int getNum() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        return num;
    }

    public static int[] getPointList(int num) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[num];

        for (int i=0; i<num; i++) {
            list[i] = scanner.nextInt();
        }

        return list;
    }
}
