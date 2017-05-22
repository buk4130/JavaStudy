import java.util.Scanner;

/**
 * Created by samsung on 2017-05-23.
 */
public class Main {
    static int Answer;

    public static void main(String args[]) throws Exception	{
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {
            Answer = 0;

            int length = sc.nextInt();
            int[] list = getList(length, sc);
            int[] numList = getNumList(list);

            Answer = getResult(numList);
            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }

    public static int getResult(int[] numList){
        int result = 0;

        for(int i=0; i<numList.length; i++){
            result = result ^ numList[i];
        }

        return result;
    }

    public static int[] getList(int listLength, Scanner sc) {
        int[] returnList = new int[listLength];

        for (int i = 0; i < listLength; i++) {
            returnList[i] = sc.nextInt();
        }

        return returnList;
    }

    public static int[] getNumList(int[] list) {
        int listIndex = 1;

        for(int j=listIndex; j<list.length; j++) {
            int count = 0;
            if (list[j-1] == list[j]) {
                list[j] = 0;
                count++;
            }
            if (count % 2 != 0)  list[j-1] = 0;
            listIndex++;
        }

        return list;
    }
}
