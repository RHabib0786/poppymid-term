package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */


        }
        public static void makePyramid() {
        for (int i=1;i<=10;i++) {
            for(int t=i;t<10;t++)
            {
                System.out.println(" ");
            }
            for(int t = 1;t<(i * 2);t++)
            {
                System.out.println("'");
            }
            System.out.println();
        }
    }
}

