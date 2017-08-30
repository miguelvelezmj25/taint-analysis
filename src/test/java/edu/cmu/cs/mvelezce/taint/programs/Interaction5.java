package edu.cmu.cs.mvelezce.taint.programs;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/*
    Try catch with a control flow decision that uses a tainted value. The compiler optimizes the bytecode an removes
    the try catch since no statement can throw an exception.

    There are 5 correct results.
 */
public class Interaction5 {

    public static void main(String[] args) {
        Sink.init();

        boolean A = Source.getOptionA(true);
        boolean B = Source.getOptionB(true);

        boolean a = false;
        boolean b = false;

        if(A) {
            a = true;
        }

        if(B) {
            b = true;
        }

        try {
            if(a) {
                int i = 0;
                i = i % 2;
            }
        } catch (Exception e) {
            System.out.println();
        }

        if(a) {
            System.out.println("");
        }

        if(b) {
            System.out.println("");
        }
    }
}
