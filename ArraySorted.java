import java.util.Scanner;

public class ArraySorted {
  static boolean isSorted(int arr[], int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1])
        return false;
    }

    return true;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int n = scanner.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    boolean sorted = isSorted(arr, n);

    if (sorted) {
      System.out.println("The array is sorted.");
    } else {
      System.out.println("The array is not sorted.");
    }

    scanner.close();
  }
}
