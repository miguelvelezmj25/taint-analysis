package edu.cmu.cs.mvelezce.taint.programs;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/*
    This code does not have the bug as in Interaction 2 because the compiler optimizes the try catch and
    does not put in the the bytecode.

    There are no exception edges in this example

    There are 2 results.
 */
public class Interaction3 {

    public static void main(String[] args) {
        Sink.init();

        boolean A = Source.getOptionA(true);

        boolean a = false;
        boolean b = false;

        if(A) {
            a = true;
        }

        try {
            if(b) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(a) {
            System.out.println("");
        }

        if(b) {
            System.out.println("");
        }
    }

}
