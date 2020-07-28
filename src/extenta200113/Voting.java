package extenta200113;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        CountEntry[] votes = new CountEntry[1000];
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("END_VOTING")) {
                break;
            }
            boolean found = false;
            int firstNullIndex = 999;
            for (int i = 0; i < votes.length; i++) {
                if (votes[i] == null) {
                    firstNullIndex = i;
                    break;
                }

                if (line.equals(votes[i].getName())) {
                    votes[i].inc();
                    for (int j = i; j >= 0; j--) {
                        if (votes[j].getCount() < votes[i].getCount()) {
                            CountEntry temp = votes[i];
                            votes[i] = votes[j];
                            votes[j] = temp;
                        }
                    }
                    found = true;
                    break;
                }
            }
            if (!found){
                CountEntry newEntry = new CountEntry(line);
                votes[firstNullIndex] = newEntry;
            }
        }

        System.out.println("-----------All Votes-----------");
        for (CountEntry entry : votes) {
            System.out.println(entry);
        }
    }
}
