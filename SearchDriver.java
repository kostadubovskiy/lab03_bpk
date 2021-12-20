public class SearchDriver {

    public static void main (String[] args) {
    int almostMax = 212000000; 
    Comparable[] array = new Comparable[almostMax + 1];
    for (int i = 0; i < array.length; i++) {
      array[i] = (Comparable) i;
    }

    long startTime = System.currentTimeMillis(); //start time
    BinSearch.binSearchRec(array, almostMax, 0, almostMax);
    long endTime = System.currentTimeMillis();   //end time
    System.out.println(endTime - startTime);     //elapsed time

    startTime = System.currentTimeMillis(); //start time
    LinSearch.linSearch(array, almostMax);
    endTime = System.currentTimeMillis();   //end time
    System.out.println(endTime - startTime);     //elapsed time


}
}
