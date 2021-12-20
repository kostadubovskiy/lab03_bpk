public class SearchDriver {

    public static void main (String[] args) {
    Comparable[] array = new Comparable[102000000];
    for (int i = 0; i < array.length; i++) {
      array[i] = (Comparable) i;
    }

    long startTime = System.currentTimeMillis(); //start time
    BinSearch.binSearchRec((Comparable[])array, 21, 22, 0);
    long endTime = System.currentTimeMillis();   //end time
    System.out.println(endTime - startTime);     //elapsed time

    startTime = System.currentTimeMillis(); //start time
    LinSearch.linSearch((Comparable[])array, 21);
    endTime = System.currentTimeMillis();   //end time
    System.out.println(endTime - startTime);     //elapsed time


}
}
