public class SearchDriver {

    public static void main (String[] args) {
      int almostMax = 100_000_000;
      Comparable[] array = new Comparable[almostMax + 1];
      for (int i = 0; i < array.length; i++) {
        array[i] = (Comparable) i;
      }
      int numTests = 1000;
      while(numTests <= 10000000){
          numTests *= 10;
        }
      
      long[][] data = new long[numTests][2];  // array of arrays to store data, {{binTime, linTime}, {binTime, linTime}, {binTime, linTime}, ...etc}

      int i = 0;
      while (i < numTests) {                                     // run designated number of tests
        long startTime = System.currentTimeMillis();             //start time
        BinSearch.binSearchRec(array, almostMax, 0, almostMax);
        long endTime = System.currentTimeMillis();               //end time
        data[i][0] = endTime - startTime;                        // log data

        startTime = System.currentTimeMillis(); //start time
        LinSearch.linSearch(array, almostMax);
        endTime = System.currentTimeMillis();   //end time
        data[i][1] = endTime - startTime;       // log data
        i++;
      }

      System.out.println(""); // line break

      long binTotal = 0;
      long linTotal = 0;

      for (long[] m : data) { // print the data just to double check
        binTotal += m[0];
        linTotal += m[1];
        System.out.print("{" + m[0] + ", " + m[1] + "}");
      }

      System.out.println(""); // line break
      System.out.println("Binary search total time over " + numTests + " tests: " + binTotal);
      System.out.println("Binary search average time over " + numTests + " tests: " + binTotal * 1.0 / data.length);
      System.out.println("Linear search total time over " + numTests + " tests: " + linTotal);
      System.out.println("Linear search average time over " + numTests + " tests: " + linTotal * 1.0 / data.length);
  }
}
