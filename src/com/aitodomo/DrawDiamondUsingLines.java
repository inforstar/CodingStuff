package com.aitodomo;
/**
 * Draw Diamond in console using ASCII
 *
 * Author: Robert Kaiser
 * Email: kaiser@aitodomo.ch
 * Software development, Testing, Automation, Test Automation
 */

import java.util.Scanner;

public class DrawDiamondUsingLines {
    public void doit() {
        Scanner in = new Scanner(System.in);
        int width = 0;
        do {
            System.out.println("Drawing Diamond of given width. Width can be between 3 and 80. Even width will be reduced by 1.");
            draw("Width: ");
            width = in.nextInt();

            if (width < 3 || width > 80)
                System.out.println("** Width out of limits **");
        } while (width < 3 || width > 80);

        if (Math.floorMod(width,2) == 0) {
            width--;
            System.out.println("***  Drawing Diamond " + width + " ***");
        }
        drawDiamond(width);
    }

    private void drawDiamond(int width) {
        int middle = (width/2);
        for (int n = 0; n < width/2+1; n++) {
            draw(String.format( "%02d", n+1) + ":");
            for (int j = 0; j < (width/2)-n; j++) draw(" ");
            int first = (width/2)-n;
            int last = (width/2)+n;
            for (int j = first; j <= last; j++) {
                if (n == 0)
                    draw("▲");
                else if (first == j)
                    draw(middle == n ? "<" : "/");
                else if (last == j)
                    draw(middle == n ? ">" : "\\");
                else
                    draw(" ");
            }
            System.out.println();
        }
        for (int n = (width/2)-1; n >= 0; n--) {
            draw(String.format( "%02d", (++middle+1)) + ":");
            for (int j = 0; j < (width/2)-n; j++) draw(" ");
            int first = (width/2)-n;
            int last = (width/2)+n;
            for (int j = first; j <= last; j++)
                if (n == 0)
                    draw("▼");
                else if (first == j)
                    draw("\\");
                else if (last == j)
                    draw("/");
                else
                    draw(" ");
            System.out.println();
        }
    }

    private void draw(String s) {
        System.out.print(s);
    }
}
