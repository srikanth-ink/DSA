package DSA.Arrays.Basic;

class SearchElement {
  public static void main(String[] args) {
    int[] arr = { 23, 45, 12, 3, 67, 43 };
    int element = 43;
    int index = searchElement(arr, element);
    System.out.println(index);
  }

  public static int searchElement(int[] arr, int element) {
    int index = -1;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == element) {
        index = i;
        return index;
      }
    }
    return index;
  }
}