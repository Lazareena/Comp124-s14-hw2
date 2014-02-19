package edu.macalester.comp124;


public class CollatzIterator {


    public int recordSettingSeed(int max) {
        int recordseed= 1;
        int recordlength = 0;
        
        for (int seed = 1; seed <= max; seed++) {

            int length = sequenceLength(seed);

            while (length > recordlength) {
                recordlength = length;
                recordseed = seed;
            }
        }
        return recordseed;
    }



    public int sequenceLength(int seed) {
        int iters = 0;

        while (seed > 1) {
           seed = iterate(seed);
            iters++;

        }
        return iters;

    }


    private int iterate(int x) {

        if (x % 2 == 0) {    // x even
            x =  x / 2;
        } else if (x % 2 != 0) {  // x odd
            x =  3 * x + 1;
        }
        return x;
    }


}
