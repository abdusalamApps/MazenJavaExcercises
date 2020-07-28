package extenta200113;

import java.awt.*;

public class MonitorAircraft {

    private Color color;
    private Aircraft plane;

    /**
     * Skapar ett monitorobjekt för flygplanet plane med färgen GRAY
     */
    MonitorAircraft(Aircraft plane) {
        this.plane = plane;
        this.color = Color.GRAY;
    }

    /**
     * Ändrar färgen till col
     */
    void setColor(Color col) {
        this.color = col;
    }

    /**
     * Returnerar flygplanet
     */
    Aircraft getAircraft() {
        return plane;
    }

    /**
     * Returnerar färgen
     */
    Color getColor() {
        return color;
    }

}
