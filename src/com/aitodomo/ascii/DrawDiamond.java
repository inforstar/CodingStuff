package com.aitodomo.ascii;
/**
 * Draw Diamond in console using X
 *
 * Author: Robert Kaiser
 * Email: kaiser@aitodomo.ch
 * Software development, Testing, Automation, Test Automation
 */

import java.util.Scanner;

public class DrawDiamond {
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
        for (int n = 0; n < width/2+1; n++) {
            for (int j = 0; j < (width/2)-n; j++) draw(" ");
            for (int j = (width/2)-n; j < (width/2)+n+1; j++) draw("X");
            System.out.println();
        }
        for (int n = (width/2)-1; n >= 0; n--) {
            for (int j = 0; j < (width/2)-n; j++) draw(" ");
            for (int j = (width/2)-n; j < (width/2)+n+1; j++) draw("X");
            System.out.println();
        }
    }

    private void draw(String s) {
        System.out.print(s);
    }
}
