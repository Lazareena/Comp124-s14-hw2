package edu.macalester.comp124;


public class CollatzIterator {
    

    public int recordSettingSeed(int max){  //could not figure out this method

        for(int seed = 1; seed <= max; seed++){
                int recordlength = 0;
                 int length = sequenceLength(seed);

            if (length > recordlength){
                recordlength = length;
                int recordseed = seed;
                }

                }

            }

    int iters = 0;
            public int sequenceLength(int seed) {

                while(true){
               int newseed= iterate(seed);
                 iters++;
                if(newseed == 1){
                    break;
                }
                }
                  return iters;


            }


        private int iterate(int x){

                if(x % 2 == 0) {    // x even
                   return x / 2;
                }
                else if(x % 2 != 0) {  // x odd
                   return 3 * x + 1;
                }
            return x;
            }


}
