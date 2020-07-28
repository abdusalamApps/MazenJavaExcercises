package extenta200418;

public class VolunteerTask {

    private String task;
    private int hour;
    private int length;

    /**
     * Skapar ett frivilligpass för uppgiften task, med
     * starttiden hour och längden length timmar.
     */
    public VolunteerTask(String task, int hour, int length) {
        this.task = task;
        this.hour = hour;
        this.length = length;
    }

    /**
     * Returnerar starttiden för frivilligpasset
     */
    int getStart() {
        return hour;
    }

    /**
     * Returnerar true om frivilligpasset helt
     * eller delvis kolliderar med
     * frivilligpasset vt, annars false.
     */
    boolean collidesWith(VolunteerTask vt) {
        return this.hour == vt.getStart() ||
                this.hour + length > vt.getStart();
    }

    /**
     * Returnerar frivilligpasset som en sträng
     * enligt följande exempel: "Handla åt Gun 17-19"
     */
    public String toString() {
        String s = task + " " + hour + "-" + (hour + length);
        return s;
    }
}
