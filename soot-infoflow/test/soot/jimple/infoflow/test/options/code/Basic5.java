package soot.jimple.infoflow.test.options.code;

import soot.jimple.infoflow.test.options.Options;

public class Basic5 {

    private static Options options = new Options();

    public static void main(String[] args) throws InterruptedException {
        boolean A = Basic5.options.getOption();
        Basic5.foo(A);

        boolean B = A;
        Basic5.foo(B);

    }

    public static void foo(boolean x) {
        int i = 0;

        if(Basic5.options.getDecision(x)) {
            i++;
        }
    }

}
