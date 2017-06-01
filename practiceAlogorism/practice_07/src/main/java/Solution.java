/**
 * Created by samsung on 2017-05-31.
 */
public class Solution {
    public static int solution(int N, String S, String T) {
        String[] barrelList = S.split(" ");
        String[] alreadyList = T.split(" ");

        int[][] barrelIntList = new int[barrelList.length][2];
        int[][] alreadyIntList = new int[alreadyList.length][2];

        for (int i = 0; i < barrelList.length; i++) {
            barrelIntList[i] = setList(barrelList[i]);
        }

        for (int i = 0; i < alreadyList.length; i++) {
            alreadyIntList[i] = setList(alreadyList[i]);
        }

        int part1Index = 0;
        int part2Index = 0;
        int part3Index = 0;
        int part4Index = 0;

        for (int i = 0; i < barrelIntList.length; i++) {
            int[] barrel = barrelIntList[i];

            if (barrel[0] < N / 2 && barrel[1] < N / 2) {
                part1Index++;
            } else if (barrel[0] < N / 2 && barrel[1] >= N / 2) {
                part2Index++;
            } else if (barrel[0] >= N / 2 && barrel[1] < N / 2) {
                part3Index++;
            } else if (barrel[0] >= N / 2 && barrel[1] >= N / 2) {
                part4Index++;
            }
        }

        int part1Weight = 0;
        int part2Weight = 0;
        int part3Weight = 0;
        int part4Weight = 0;

        for (int i = 0; i < alreadyIntList.length; i++) {
            int[] already = alreadyIntList[i];

            if (already[0] < N / 2 && already[1] < N / 2) {
                part1Index++;
                part1Weight++;
            } else if (already[0] < N / 2 && already[1] >= N / 2) {
                part2Index++;
                part2Weight++;
            } else if (already[0] >= N / 2 && already[1] < N / 2) {
                part3Index++;
                part3Weight++;
            } else if (already[0] >= N / 2 && already[1] >= N / 2) {
                part4Index++;
                part4Weight++;
            }
        }

        int addPeople = 0;
        int possiblePeople = N;

        if (part1Weight >= part4Weight) {
            int pushPeople = part1Weight - part4Weight;
            part4Weight += pushPeople;
            addPeople += pushPeople;
            part4Index += pushPeople;

            if (part1Index > 4 || part4Index > 4) {
                return addPeople = -1;
            } else if (part1Index >= part4Index) {
                addPeople += (4 - part1Index);
            } else if (part1Index < part4Index) {
                addPeople += (4 - part4Index);
            }
        } else {
            int pushPeople = part4Weight - part1Weight;
            part1Weight += pushPeople;
            addPeople += pushPeople;
            part1Index += pushPeople;

            if (part1Index > 4 || part4Index > 4) {
                return addPeople = -1;
            } else if (part1Index >= part4Index) {
                addPeople += (4 - part1Index);
            } else if (part1Index < part4Index) {
                addPeople += (4 - part4Index);
            }
        }

        if (part2Weight >= part3Weight) {
            int pushPeople = part2Weight - part3Weight;
            part3Weight += pushPeople;
            addPeople += pushPeople;
            part3Index += pushPeople;

            if (part2Index > 4 || part3Index > 4) {
                return addPeople = -1;
            } else if (part2Index >= part3Index) {
                addPeople += (4 - part2Index);
            } else if (part2Index < part3Index) {
                addPeople += (4 - part3Index);
            }
        } else {
            int pushPeople = part3Weight - part2Weight;
            part2Weight += pushPeople;
            addPeople += pushPeople;
            part2Index += pushPeople;

            if (part2Index > 4 || part3Index > 4) {
                return addPeople = -1;
            } else if (part2Index >= part3Index) {
                addPeople += (4 - part2Index);
            } else if (part2Index < part3Index) {
                addPeople += (4 - part3Index);
            }
        }

        return addPeople * 2;
    }

    public static int[] setList(String set) {
        int[] sit = new int[2];
        sit[0] = (int) set.charAt(0) - 49;

        if ('A' == set.charAt(1)) sit[1] = 0;
        else if ('B' == set.charAt(1)) sit[1] = 1;
        else if ('C' == set.charAt(1)) sit[1] = 2;
        else if ('D' == set.charAt(1)) sit[1] = 3;
        else if ('E' == set.charAt(1)) sit[1] = 4;
        else if ('F' == set.charAt(1)) sit[1] = 5;
        else if ('G' == set.charAt(1)) sit[1] = 6;
        else if ('H' == set.charAt(1)) sit[1] = 7;
        else if ('I' == set.charAt(1)) sit[1] = 8;
        else if ('J' == set.charAt(1)) sit[1] = 9;
        else if ('K' == set.charAt(1)) sit[1] = 10;
        else if ('L' == set.charAt(1)) sit[1] = 11;
        else if ('N' == set.charAt(1)) sit[1] = 12;
        else if ('M' == set.charAt(1)) sit[1] = 13;
        else if ('O' == set.charAt(1)) sit[1] = 14;
        else if ('P' == set.charAt(1)) sit[1] = 15;
        else if ('Y' == set.charAt(1)) sit[1] = 16;
        else if ('Q' == set.charAt(1)) sit[1] = 17;
        else if ('R' == set.charAt(1)) sit[1] = 18;
        else if ('S' == set.charAt(1)) sit[1] = 19;
        else if ('T' == set.charAt(1)) sit[1] = 20;
        else if ('U' == set.charAt(1)) sit[1] = 21;
        else if ('V' == set.charAt(1)) sit[1] = 22;
        else if ('W' == set.charAt(1)) sit[1] = 23;
        else if ('X' == set.charAt(1)) sit[1] = 24;
        else if ('Z' == set.charAt(1)) sit[1] = 25;

        return sit;
    }

    public static void main(String[] args) {
        int N = 4;
        String S = "1B 1C 4B 1D 2A";
        String T = "3B 2D";

        int a = solution(N, S, T);

        System.out.print(a);
    }
}
