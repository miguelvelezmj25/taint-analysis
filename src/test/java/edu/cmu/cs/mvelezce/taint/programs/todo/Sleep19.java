package edu.cmu.cs.mvelezce.taint.programs.todo;

import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Sleep19 {

    public static boolean A = false;

    public static void main(String[] args) throws InterruptedException {
        A = Source.getOptionA(Boolean.valueOf(args[0]));

        boolean a;

        if(A) {
            a = true;
        }
        else {
            a = false;
        }

        boolean x = a;

        if(x) {
            x = !x;
        }
    }
}
