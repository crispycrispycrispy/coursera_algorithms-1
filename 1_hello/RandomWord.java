/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        int i = 0;
        String winner = "";

        while (!StdIn.isEmpty()) {
            i = i + 1;
            String str = StdIn.readString();

            double param = (double) 1 / i;
            boolean prob = StdRandom.bernoulli(param);
            if (prob) {
                winner = str;
            }
            // StdOut.println(i + " => " + str + " => " + prob);
        }
        StdOut.println(winner);
    }
}
