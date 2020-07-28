package extenta200113;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SurroundingFlights {

    private List<MonitorAircraft> surroundingPlanes;
    private Aircraft myPlane;

    public SurroundingFlights(Aircraft plane) {
        this.myPlane = plane;
        surroundingPlanes = new ArrayList<>();
    }

    /**
     * Returnerar det flygplan som är närmast, null om det inte finns något
     */
    public Aircraft getClosest() {
        if (surroundingPlanes.isEmpty())
            return null;
        Aircraft closest = surroundingPlanes.get(0).getAircraft();
        for (MonitorAircraft monitorAircraft : surroundingPlanes) {
            if (monitorAircraft.getAircraft().distanceTo(myPlane) < closest.distanceTo(myPlane)) {
                closest = monitorAircraft.getAircraft();
            }
        }
        return closest;
    }

    /**
     * Uppdaterar listan av monitorobjekt efter innehållet i act:
     * Om ett plan i listan saknas i act, ta bort det från listan (då är
     * det inte i närheten längre)
     * Om ett plan i act inte finns i listan är det ett nytt plan, lägg
     * till det i listan och markera det YELLOW
     * Om ett plan är närmare än 3000 feet markera det RED
     * Om ett plan kommit närmare (men inte är närmare än 3000 feet)
     * markera det YELLOW
     * Om ett plan ej kommit närmare (och inte är närmare än 3000 feet)
     * markera det GREEN
     */

    public void updateList(ArrayList<Aircraft> act) {
        sortList(act);
        int listPos = 0;
        int actPos = 0;
        while (listPos < surroundingPlanes.size() && actPos < act.size()) {
            Aircraft oldPlane = surroundingPlanes.get(listPos).getAircraft();
            Aircraft newPlane = act.get(actPos);
            int compareValue = act.get(actPos).getCode()
                    .compareTo(surroundingPlanes.get(listPos).getAircraft().getCode());
            if (compareValue > 0) {
                surroundingPlanes.remove(listPos);
            } else if (compareValue < 0) {
                MonitorAircraft newMonitorAircraft = new MonitorAircraft(newPlane);
                newMonitorAircraft.setColor(Color.YELLOW);
                surroundingPlanes.add(listPos, newMonitorAircraft);
                listPos++;
                actPos++;
            } else {
                if (newPlane.distanceTo(myPlane) < 3000) {
                    surroundingPlanes.get(listPos).setColor(Color.RED);
                } else if (newPlane.distanceTo(myPlane) < oldPlane.distanceTo(myPlane)) {
                    surroundingPlanes.get(listPos).setColor(Color.YELLOW);
                } else {
                    surroundingPlanes.get(listPos).setColor(Color.GREEN);
                }
                oldPlane.update(newPlane.getLatitude(), newPlane.getLongitude(), newPlane.getAltitude());
                listPos++;
                actPos++;
            }
        }
        while (listPos < surroundingPlanes.size()) {
            surroundingPlanes.remove(listPos);
            listPos++;
        }
        while (actPos < act.size()) {
            MonitorAircraft monitorAircraft = new MonitorAircraft(act.get(actPos));
            monitorAircraft.setColor(Color.YELLOW);
            surroundingPlanes.add(monitorAircraft);
            actPos++;
        }
    }

    /**
     * Returnerar en lista med alla monitorobjekt med färgen col
     */
    public ArrayList<MonitorAircraft> getColored(Color col) {
        ArrayList<MonitorAircraft> returnList = new ArrayList<>();
        for (MonitorAircraft monitorAircraft : surroundingPlanes) {
            if (monitorAircraft.getColor() == col) {
                returnList.add(monitorAircraft);
            }
        }
        return returnList;
    }

    /**
     * Sorterar aircraftList på flygplanskod i stigande ordning
     */
    private void sortList(ArrayList<Aircraft> aircraftList) {
        for (int i = 0; i < aircraftList.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < aircraftList.size(); j++) {
                if (aircraftList.get(minIndex).getCode()
                        .compareTo(aircraftList.get(j).getCode()) > 0) {
                    minIndex = j;
                }
            }
            Aircraft temp = aircraftList.get(minIndex);
            aircraftList.set(minIndex, aircraftList.get(i));
            aircraftList.set(i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(20);
        integers.add(12);
        integers.add(10);
        integers.add(15);
        integers.add(2);
        for (int i = 0; i < integers.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(minIndex) > integers.get(j)) {
                    minIndex = j;
                }
            }
            int temp = integers.get(minIndex);
            integers.set(minIndex, integers.get(i));
            integers.set(i, temp);
        }

        for (Integer n : integers) {
            System.out.print(n + " ");
        }
    }
}
