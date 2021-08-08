package Patterns;

// You are required to print a 'z' of size 5 using '*'.
public class printZ {
    public static void main(String[] args) {

        int spaces = 3;
        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print('*');
                }
                System.out.println();
            } else {
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                spaces--;
            }
        }

    }
}
