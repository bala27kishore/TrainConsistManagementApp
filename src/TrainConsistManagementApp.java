import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println(" UC17 - Alphabetical Sorting using Arrays.sort() ");
        System.out.println("==========================================================\n");

        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original Bogie Types:");
        displayArray(bogieTypes);

        sortBogieTypes(bogieTypes);

        System.out.println("\nSorted Bogie Types (Alphabetical):");
        displayArray(bogieTypes);

        System.out.println("\nUC17 sorting completed...");
    }

    public static void sortBogieTypes(String[] types) {
        if (types != null) {
            Arrays.sort(types);
        }
    }

    private static void displayArray(String[] arr) {
        for (String type : arr) {
            System.out.print("[" + type + "] ");
        }
        System.out.println();
    }
}
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop controls number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop compares adjacent values
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap values when required
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void displayArray(int[] arr) {
        for (int c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}