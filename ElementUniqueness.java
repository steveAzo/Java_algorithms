import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ElementUniqueness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean allUnique = areElementsUnique(arr);
        if (allUnique) {
            System.out.println("All elements are unique.");
        } else {
            System.out.println("There are duplicate elements.");
        }
    }

    public static boolean areElementsUnique(int[] arr) {
        Set<Integer> elements = new HashSet<>();
        for (int element : arr) {
            if (elements.contains(element)) {
                return false;
            }
            elements.add(element);
        }
        return true;
    }
}
