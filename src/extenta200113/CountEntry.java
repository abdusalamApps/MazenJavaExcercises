package extenta200113;

public class CountEntry {

    private String name;
    private int count;

    /** Skapar ett räkneobjekt name med värdet 1 */
    public CountEntry(String name) {
        this.name = name;
        this.count = 1;
    }
    /** Returnerar namnet */
    public String getName() {
        return name;
    }

    /** Returnerar värdet */
    public int getCount() {
        return count;
    }
    /** Ökar värdet med 1 */
    public void inc() {
        count++;
    }
    /** Minskar värdet med 1 */
    public void dec() {
        count--;
    }

    /** Returnerar räkneobjektet namn och värde på formen:
     "Namn 20" */
    public String toString() {
        return name + " " + count;
    }


}
