
/**
 * Created by samsung on 2017-05-30.
 */
public class Solution {
    public static int solution(int[] A) {
        int Answer = 0;
        int[] B = new int[A.length+1];

        for(int i=0; i<B.length+1; i++) {
            if (i!=A.length) B[i] = A[i];
            else {
                B[A.length] = 0;
                break;
            }
        }

        int startIndex = 0;
        int dept = 0;
        for(int i = startIndex; i<B.length; i++) {
            if(B[startIndex] <= B[i]) {
                dept = getdept(B, startIndex, i);
                startIndex = i;
            } else if((i > 1 && i < B.length-1) && (B[i-1] < B[i] && B[i] > B[i+1])){
                dept = getdept(B, startIndex, i);
            }
            if (dept > Answer) Answer = dept;
        }

        return Answer;
    }

    public static int getdept(int[] list, int startIndex, int endIndex) {
        int dept = 0;

        int lowPoint;
        int highPoint;

        if(list[startIndex] >= list[endIndex]) {
            highPoint = list[endIndex];
            lowPoint = list[endIndex];
        }
        else  {
            highPoint = list[startIndex];
            lowPoint = list[startIndex];
        }

        for(int i = startIndex; i<endIndex; i++) {
            if(lowPoint > list[i]) lowPoint = list[i];
        }

        dept = highPoint - lowPoint;

        return dept;
    }

    public static void main(String[] args) {

        int[] A = {3,1,2};
        int a = solution(A);
        System.out.println("");
        System.out.println(a);
    }
}
