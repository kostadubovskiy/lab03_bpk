public class SearchDriver {

    public static void main (String[] args) {
    int almostMax = 100000000; 
    Comparable[] array = new Comparable[almostMax + 1];
    for (int i = 0; i < array.length; i++) {
      array[i] = (Comparable) i;
    }

    int numTests = 5;
    long[][] data = new long[numTests][2]; // array of arrays to store data, {{binTime, linTime}, {binTime, linTime}, {binTime, linTime}, ...etc}

    int i = 0;
    while (i < numTests) { // run designated number of tests
      long startTime = System.currentTimeMillis(); //start time
      BinSearch.binSearchRec(array, almostMax, 0, almostMax);
      long endTime = System.currentTimeMillis();   //end time
      System.out.println(endTime - startTime);     //elapsed time
      data[i][0] = endTime - startTime; // log data

      startTime = System.currentTimeMillis(); //start time
      LinSearch.linSearch(array, almostMax);
      endTime = System.currentTimeMillis();   //end time
      System.out.println(endTime - startTime);     //elapsed time
      data[i][1] = endTime - startTime; // log data
      i++;
    }
    System.out.println("");
    for (long[] m : data) {
      for (long k : m) {
        System.out.println(k);
      }
    }

}
}
