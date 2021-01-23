  package flow;
import java.util.*;

public class flow {

    Scanner reader = new Scanner(System.in);

    // variables for types of usage
    double shower_input;
    double shower_total;

    double hand_input;
    double hand_total;
    double washer_input;
    double washer_total;
    double cups_input;
    double cups_total;
    double dishwasher_input;
    double dishwasher_total;
    double toilet_input;
    double toilet_total;

    boolean sprinklers;

    double extra_input;
    double extra_total;
    double total;

    private float calcTotal(String type) {
        /*shower_total = 2.5 * shower_input;
        hand_total = 1.5 * hand_input;

        washer_total = 19 * washer_input;
        cups_total = 0.0625 * cups_input;

        dishwasher_total = 6 * dishwasher_input;

        toilet_total = 1.6 * toilet_input;

        // running total
        total = shower_total + hand_total + washer_total + cups_total + dishwasher_total + toilet_total;*/

        switch(type) {
            case "shower":
                total+=shower*2.5;
            case "hand:":
                total += toilet*1.5;
            case "washer":
                total += washer* 19;
            case "cups":
                total += cups*0.0625;
            case "dishwasher":
                total += dishwasher * 6;
            case "toilet":
                total += toilet * 1.6;
            case "other":
                total += other;

        }

        System.out.println("Enter the type of water usage you would like to log: ");
        type = reader.nextLine();
        input = 

    }






}
