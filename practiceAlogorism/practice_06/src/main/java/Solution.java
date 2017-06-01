import java.util.ArrayList;


public class Solution {
    public static int solution(int[] A, int X) {
      for(int i=0; i<A.length; i++) {
          int checkNum = A[i];
          int checkIndex = 0;
          for(int j=i+1; j<A.length; j++) {
              if(checkNum == A[j]) {
                  A[j] = 0;
                  checkIndex = 1;
                  break;
              }
          }
          if(checkIndex == 0) A[i] = 0;
      }

      ArrayList<Integer> sizeList = new ArrayList<Integer>();

      for(int i=0; i<A.length; i++) {
          int ver = A[i];
          for(int j=i+1; j<A.length; j++) {
              int hor = A[j];

              int size = ver*hor;
              if (size >= X)sizeList.add(size);
          }
      }

      int Answer = 0;
      for(int i=0; i<sizeList.size(); i++) {
          int chechSize = sizeList.get(i);

          for(int j=i+1; j<sizeList.size(); j++) {
              if (chechSize == sizeList.get(j)) {
                  sizeList.remove(j);
                  j--;
              }
          }
      }

      if(sizeList.size() < 1000000000)Answer = sizeList.size();
      else Answer = -1;

      return Answer;
    }

    public static void main(String args[]) {
        int[] A = {6,6,6,6,6,6,6,6,6,6};
        int X = 5;

        int a = solution(A, X);
        System.out.print(a);
    }
}
