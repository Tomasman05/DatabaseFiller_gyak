import java.util.ArrayList;

public class KonyvtarJava {
    public static void main(String[] args) throws Exception {
        ArrayList<Lender> lenders = new ArrayList<>();
        ArrayList<Renting> rentings = new ArrayList<>();
        ReadFile rf = new ReadFile();

        lenders = rf.readLenders(args[0]);
        System.out.println(lenders.size());
        
        rentings = rf.readRentings(args[1]);
        System.out.println(rentings.size());
    }
}
