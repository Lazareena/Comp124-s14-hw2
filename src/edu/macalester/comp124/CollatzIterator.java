package edu.macalester.comp124;


public class CollatzIterator {
    
    public int recordSettingSeed(int max) {
        int record = 0, recordSeed = 1, seed, iters, x;
        seed = 1;
        while(seed < max || seed == max) {
            iters = 0;
            x = seed;
            while((x == 1) == false) {
                int newx = x;
                if(x % 2 == 0) {    // x even
                    newx = x / 2;
                }
                if(x % 2 != 0) {  // x odd
                    newx = 3 * x + 1;
                }
                x = newx;
                iters = iters + 1;
                if(x == 1)
                    break;
            }
            if(iters > record) {
                record = iters;
                recordSeed = seed;
            }
            seed++;
        }
        return recordSeed;
    }
}
