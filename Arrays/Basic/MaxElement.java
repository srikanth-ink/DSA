package DSA.Arrays.Basic;

class MaxElement {
  public static void main(String[] args) {
    int[] arr = { 23, 45, 12, 3, 67, 43 };
    int max = maxElement(arr);
    System.out.println(max);
  }

  public static int maxElement(int[] arr) {
    int max = Integer.MIN_VALUE;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}