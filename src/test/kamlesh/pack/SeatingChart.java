package test.kamlesh.pack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class SeatingChart {
    public static void main(String[] args) {
        // instanced variables
        Scanner kb = new Scanner(System.in);
        String name = "";
        int r = 0;
        int c = 0;
        int k = 0;
        String row = "";
        String column = "";
        ArrayList<String> names = new ArrayList<String>();
        while (!name.equals("quit")) {
            System.out.print("Enter first name of student: ");
            // takes the name of kb and sets it to name
            name = kb.nextLine();
            // if the ArrayList names isEmpty then it adds the value at index
            if (names.isEmpty()) {
                names.add(name);
            } else if (name.compareTo(names.get(names.size() - 1)) > 0) {
                names.add(name);
            } else {
                // for loop going through the list of names to insert where it belongs
                for (int i = 0; i < names.size(); i++) {
                    if (name.compareTo(names.get(i)) < 0) {
                        names.add(i, name);
                        i = names.size();
                    }
                }
            }
            if (names.contains("quit")) {
                names.remove("quit");
            }
        }
        System.out.println(names);
        // System.out.println(names);
        System.out.println("how many rows do you have: ");
        r = kb.nextInt();
        System.out.println();
        System.out.println("how many columns do you have: ");
        c = kb.nextInt();
        System.out.println();
        System.out.println("Should students be seated row major(1) or column major(0)?");
        if (kb.nextInt() == 1) {
            // String arr[] = new String[names.size()];
            String[][] chart = new String[r][c];
            for (int i = 0; i < chart.length; i++) {
                for (int j = 0; j < chart[0].length; j++) {
                    if (k < names.size()) {
                        chart[i][j] = names.get(k);
                        k += 1;
                    }
                    System.out.printf("%10s ", chart[i][j]);
                }
            }

        } else if (kb.nextInt() == 2) {
            String arr[] = new String[names.size()];
            String[][] chart = new String[r][c];
            for (int i = 0; i < names.size(); i++) {
                arr[i] = names.get(i);
            }
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i] = chart[r][c];
                    k++;
                }
            }
            for (int i = 0; i < chart[0].length; i++) {
                for (int j = 0; j < chart.length; j++) {
                    System.out.printf("%10s ", chart[i][j]);
                }
            }
            System.out.println("Column order!");
        }
    }
}