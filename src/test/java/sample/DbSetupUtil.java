package sample;

import com.ninja_squad.dbsetup.destination.Destination;
import com.ninja_squad.dbsetup.destination.DriverManagerDestination;

public class DbSetupUtil {

    public static Destination getDestination() {
        return new DriverManagerDestination(
            "jdbc:mysql://localhost:3306/ym",
            "root",
            "root");
    }

}
