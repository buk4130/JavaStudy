import java.util.Scanner;

/**
 * Created by samsung on 2017-05-23.
 */
public class Main {
    static int Answer;

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {

            int stoneNum = getNum();
            int[] stoneList = getList(stoneNum);
            int jump = getNum();

            int jumpNum = getJumpNum(stoneList, jump);
            Answer = jumpNum;

            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }

    public static int getJumpNum(int[] stoneList, int jump) {
        int startPoint = 0;
        int jumpIndex = 1;

        int failCheck = 0;

        for (int i = 0; i < stoneList.length; i++) {
            int index = startPoint + jump;

            if(stoneList[stoneList.length-1] == index) break;

            if (stoneList[i] < index) {
                failCheck++;
            } else if (stoneList[i] == index){
                startPoint = stoneList[i];
                jumpIndex++;
                failCheck = 0;
            } else if ((stoneList[i] > index) && (failCheck != 0)){
                startPoint = stoneList[i-1];
                i = i-1;
                jumpIndex++;
                failCheck = 0;
            } else if ((stoneList[i] > index) && (failCheck == 0)) {
                jumpIndex = -1;
                break;
            }
        }


        return jumpIndex;
    }

    public static int getNum() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        return num;
    }

    public static int[] getList(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[length];

        for (int i = 0; i < length; i++) {
            list[i] = scanner.nextInt();
        }

        return list;
    }
}
