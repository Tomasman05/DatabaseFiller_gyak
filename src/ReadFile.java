import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public ReadFile(){

    }
    public ArrayList<Lender> readLenders(String kolcsonzok){
        FileReader fr = null;
        Scanner sc;
        try {
            fr= new FileReader(kolcsonzok);
        } catch (FileNotFoundException e) {
            System.out.println("A fájl nem található:\n"+e);
        }
        sc=new Scanner(fr);
        ArrayList<Lender> lenders = new ArrayList<>();
        sc.nextLine();
        while (sc.hasNextLine()) {
            String row = sc.nextLine();
            String[] rowSp = row.split(";");
            Lender lender = new Lender();
            lender.setName(rowSp[0]);
            lender.setBorn(rowSp[1]);
            lenders.add(lender);
        }
        sc.close();
        return lenders;
    }
    public ArrayList<Renting> readRentings(String kolcsonzesek){
        FileReader fr = null;
        Scanner sc;
        try {
            fr= new FileReader(kolcsonzesek);
        } catch (FileNotFoundException e) {
            System.out.println("A fájl nem található:\n"+e);
        }
        sc=new Scanner(fr);
        ArrayList<Renting> rentings = new ArrayList<>();
        sc.nextLine();
        while (sc.hasNextLine()) {
            String row = sc.nextLine();
            String[] rowSp = row.split(";");
            Renting renting = new Renting();
            renting.setLender_id(rowSp[0]);
            renting.setWriter(rowSp[1]);
            renting.setTitle(rowSp[2]);
            renting.setType(rowSp[3]);
            rentings.add(renting);
        }
        sc.close();
        return rentings;
    }
}
