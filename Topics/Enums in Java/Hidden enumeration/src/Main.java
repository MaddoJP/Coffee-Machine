
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> where = new ArrayList<String>();
        int counter = 0;
        for (Secret secrets : Secret.values()) {

            where.add(secrets.toString());
        }

        for (String x : where) {
            if (x.toUpperCase().startsWith("STAR")) {
                counter ++;
            }
        }
        System.out.println(counter);

    }
}


