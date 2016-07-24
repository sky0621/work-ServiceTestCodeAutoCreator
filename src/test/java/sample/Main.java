package sample;

import rootpackage.Parameter;

public class Main {

    public static void main(String[] args) {

        try {
            Parameter p = new Parameter(args);

            MstMovieService mm = new MstMovieService(p);
            mm.operation();

        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }

        System.exit(0);
    }

}
