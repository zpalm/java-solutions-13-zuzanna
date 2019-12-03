package pl.coderstrust.hanoi;

import java.util.Stack;

public class HanoiTowers {

    public static Stack<Integer>[] towers = new Stack[3];
    public static int noOfDisks;

    public static void main(String[] args) {
        towerOfHanoi(4);
    }

    public static void towerOfHanoi(int numberOfDisks) {
        towers[0] = new Stack<>();
        towers[1] = new Stack<>();
        towers[2] = new Stack<>();
        for (int i = numberOfDisks; i > 0; i--) {
            towers[0].push(i);
        }
        noOfDisks = numberOfDisks;
        displayTheTowers();
        moveDisks(numberOfDisks, 0, 1, 2);
    }

    private static void moveDisks(int numberOfDisks, int A, int B, int C) {
        if (numberOfDisks > 0) {
            moveDisks(numberOfDisks - 1, A, C, B);
            int temp = towers[A].pop();
            towers[C].push(temp);
            displayTheTowers();
            moveDisks(numberOfDisks - 1, B, A, C);
        }
    }

    private static void displayTheTowers() {
        System.out.println("  A  |  B  |  C  ");
        String towerA = " ";
        String towerB = " ";
        String towerC = " ";
        for (int i = noOfDisks - 1; i >= 0; i--) {
            try {
                towerA = String.valueOf(towers[0].get(i));
            } catch (Exception e) {
            }
            try {
                towerB = String.valueOf(towers[1].get(i));
            } catch (Exception e) {
            }
            try {
                towerC = String.valueOf(towers[2].get(i));
            } catch (Exception e) {
            }
            System.out.println("  " + towerA + "  |  " + towerB + "  |  " + towerC);
        }
        System.out.println();
    }
}
