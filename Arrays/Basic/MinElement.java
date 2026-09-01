package DSA.Arrays.Basic;

class MinElement {
  public static void main(String[] args) {
    int[] arr = { 23, 45, 12, 3, 67, 43 };
    int min = maxElement(arr);
    System.out.println(min);
  }

  public static int maxElement(int[] arr) {
    int min = Integer.MAX_VALUE;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}