import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by samsung on 2017-05-24.
 */
public class Main {
    static int Answer;

    public static void main(String args[]) throws Exception	{
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {

            int num = sc.nextInt();
            ArrayList<Integer> pointList = new ArrayList<Integer>();
            for(int i=0; i<num; i++) {
                pointList.add(sc.nextInt());
            }

            Collections.sort(pointList);
            int maxPoint = 0;

            int pointSize = pointList.size();

            for(int i=0; i<pointSize; i++) {
                int tmp = pointList.get(i) + (pointSize-i);
                if(tmp>maxPoint) maxPoint = tmp;
            }

            Answer = 0;

            for(int i=0; i<pointSize; i++) {
                if ((pointSize+pointList.get(i)) >= maxPoint) {
                    Answer++;
                }
            }


            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
}
