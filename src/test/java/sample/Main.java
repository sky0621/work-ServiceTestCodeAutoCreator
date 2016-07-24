package sample;

public class Main {

    public static void main(String[] args) {

        try {
            Parameter p = new Parameter(args);

            MstMovieService mm = new MstMovieService(p);
            mm.operation();

        } catch (IllegalArgumentException e) {
            System.exit(1);
        }

        System.exit(0);
    }

}
