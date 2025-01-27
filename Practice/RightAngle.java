public class RightAngle {
    public static void main(String[] args) {
        int row = 6;
        System.out.println("Left Angle Reverser: ");
        for (int i = row; i >= 0; i--) {
            // for(int j=(row-i);j>=0;j--)
            // {
            // System.out.print(" ");
            // }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Left Angle: ");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("RIGHT ANGLE ");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 2*(row - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();System.out.println();
        System.out.println("Pyramid ");
        System.out.println();
        for(int i=0;i<row;i++)
        {
            for(int j=row-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
