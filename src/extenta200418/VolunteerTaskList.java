package extenta200418;

import java.util.ArrayList;

public class VolunteerTaskList {

    private ArrayList<VolunteerTask> tasks;

    /**
     * Skapar en tom lista för frivilligpass.
     */
    public VolunteerTaskList() {
        tasks = new ArrayList<>();
    }

    /**
     * Lägger till ett nytt frivilligpass för uppgiften task,
     * med starttiden hour och längden length timmar.
     */
    public void add(String task, int hour, int length) {
        tasks.add(
                new VolunteerTask(task, hour, length)
        );
    }

    /**
     * Returnerar en vektor som innehåller frivilligpassen
     * sorterade stigande efter starttid.
     * Om inga frivilligpass är inlagda returneras en tom vektor
     */
    public VolunteerTask[] toSortedArray() {
        if (tasks.isEmpty())
            return new VolunteerTask[0];
        VolunteerTask[] sortedTasks = new VolunteerTask[tasks.size()];
        for (int i = 0; i < tasks.size(); i++) {
            sortedTasks[i] = tasks.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (sortedTasks[i].getStart() < sortedTasks[j].getStart()) {
                    VolunteerTask temp = sortedTasks[i];
                    sortedTasks[i] = sortedTasks[j];
                    sortedTasks[j] = temp;
                }
            }
        }
        return sortedTasks;
    }

    /**
     * Returnerar en lista med de frivilligpass som är möjliga att arbeta
     * om man redan också arbetar de pass som ligger i v.
     * D.v.s. metoden returnerar de pass för denna lista som inte
     * kolliderar med något av de pass som finns i listan v.
     */
    public ArrayList<VolunteerTask> possibleTasks(ArrayList<VolunteerTask> v) {
        ArrayList<VolunteerTask> possibleTasks = new ArrayList<>();
        for (VolunteerTask t : tasks) {
            for (VolunteerTask t2 : v) {
                if (!t.collidesWith(t2)) {
                    possibleTasks.add(t);
                }
            }
        }
        return possibleTasks;
    }
}
