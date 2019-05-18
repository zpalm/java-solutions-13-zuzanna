package pl.coderstrust.hanoi;

public class HanoiTowers {
    public static void main(String[] args) {
        towerOfHanoi(4, "A", "B", "C");
    }

    public static void towerOfHanoi(int numberOfDisks, String firstRod, String secondRod, String thirdRod) {
        if (numberOfDisks == 1) {
            System.out.println("Move disk 1 from " + firstRod + " to " + thirdRod + ".");
            return;
        }
        towerOfHanoi(numberOfDisks - 1, firstRod, thirdRod, secondRod);
        System.out.println("Move disk " + numberOfDisks + " from " + firstRod + " to " + thirdRod + ".");
        towerOfHanoi(numberOfDisks - 1, secondRod, firstRod, thirdRod);
    }
}
