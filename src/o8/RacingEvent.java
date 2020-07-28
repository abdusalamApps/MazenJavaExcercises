/*
package o8;

import se.lth.cs.window.SimpleWindow;

import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.Random;

public class RacingEvent {

    private Turtle turtle1;
    private Turtle turtle2;
    private SimpleWindow window;

    public RacingEvent (SimpleWindow window, Turtle turtle1, Turtle turtle2) {
        this.window = window;
        this.turtle1 = turtle1;
        this.turtle2 = turtle2;
    }

    public void race(SimpleWindow window, int start, int finish) {
        Random random = new Random();
        turtle1.penDown();
        turtle1.jumpTo(100, start);
        turtle1.forward(1 + random.nextInt(10));
        turtle2.penDown();
        turtle2.jumpTo(400, start);
        turtle2.forward(1 + random.nextInt(10));

        while (turtle1.getY() >= finish || turtle2.getY() >= finish) {
            if (turtle1.getY() <= finish || turtle2.getY() <= finish) {
                break;
            }
            turtle1.forward(1 + random.nextInt(1));
            SimpleWindow.delay(1);
            turtle2.forward(1 + random.nextInt(1));
            SimpleWindow.delay(1);
        }
    }
}
*/
