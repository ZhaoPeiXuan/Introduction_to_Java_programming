package chapter19;

public class GenericSort {
  public static void main(String[] args) {
    // Create an Integer array
    Integer[] intArray = {new Integer(2), new Integer(4),
      new Integer(3)};

    // Create a Double array
    Double[] doubleArray = {new Double(3.4), new Double(1.3),
      new Double(-22.1)};

    // Create a Character array
    Character[] charArray = {new Character('a'),
      new Character('J'), new Character('r')};

    // Create a String array
    String[] stringArray = {"Tom", "Susan", "Kim"};

    // Sort the arrays
    sort(intArray);
    sort(doubleArray);
    sort(charArray);
    sort(stringArray);

    // Display the sorted arrays
    System.out.print("Sorted Integer objects: ");
    printList(intArray);
    System.out.print("Sorted Double objects: ");
    printList(doubleArray);
    System.out.print("Sorted Character objects: ");
    printList(charArray);
    System.out.print("Sorted String objects: ");
    printList(stringArray);
  }

  /** Sort an array of comparable objects */
  public static <E extends Comparable<E>> void sort(E[] list) {
    //currentMin的类型是跟着泛型变的，所以用E
    E currentMin;
    //记录最小数值下标的
    int currentMinIndex;

    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      currentMin = list[i];
      currentMinIndex = i;

      //进行排序，先拿后面的数和第一个数挨个比较找出最小值
      //当时有疑惑就是为啥j不会出现越界，但是后来发现
      //j是小于总长度的，所以不会出现越界
      for (int j = i + 1; j < list.length; j++) {
        //如果发现currentMin比后面的数大，就记录最小值，记录最小值下标
        if (currentMin.compareTo(list[j]) > 0) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary;
      //查看最小值下标和当前排序下标是否一致，不一致就说明发现了其他最小值
      //然后将最小值地方写上当前比较的数值，然后把当前值放上最小值
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }

  /** Print an array of objects */
  public static void printList(Object[] list) {
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
    System.out.println();
  }
}
