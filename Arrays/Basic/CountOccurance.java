package DSA.Arrays.Basic;

import java.util.Scanner;

class CountOccurance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = userInput(sc);
    int element = sc.nextInt();
    int occurance = searchOccurance(arr, element);
    System.out.println(occurance);
    sc.close();
  }

  public static int[] userInput(Scanner sc) {
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    return arr;
  }

  public static int searchOccurance(int[] arr, int element) {
    int occurance = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == element) {
        occurance++;
      }
    }
    return occurance;
  }
}