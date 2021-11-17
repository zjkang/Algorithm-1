public class AmazonMapingCoins {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


    class Result {

        /*
         * Complete the 'minimumCoinFlips' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING coins as parameter.
         */

        public static int minimumCoinFlips(String coins) {
            // Write your code here
            // 1. Find how many flips we need to get all 'T' result.
            // 2. Find min flips for 'H...T...' result.
            int flips = 0;
            int minFlips = 0;
            // Check how many flips we need if flip all 'H' to 'T' to get a valid result.
            for (int i = 0; i < coins.length(); i++) {
                if (coins.charAt(i) == 'H') {
                    flips += 1;
                }
            }
            minFlips = flips;
            // Now we allow 'H' in result. Decrement 1 when we meet 'H' and increment when we see 'T'.
            for (int i = 0; i < coins.length(); i++) {
                if (coins.charAt(i) == 'H') {
                    flips -= 1; // 'H' is no longer needed to be flipped, need to substract from original flips.
                } else {
                    flips += 1; // 'T' must be flipped.
                }
                minFlips = Math.min(flips, minFlips);
            }
            return minFlips;
        }

    }
}
