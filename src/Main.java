import task07.Biker;
import task14.GameRoom;
import task15.TaxOffice;

public class Main {
    public static void main(String[] args) {
//        Task08 task08 = new Task08();
//        System.out.println("***SHOW***");
//        task08.show();
//        System.out.println("***SHOW END***");
//        System.out.println();
//        System.out.println("***SORT BY LEVEL***");
//        task08.sortByLevel();
//        System.out.println("***SORT BY LEVEL END***");
//        System.out.println("***Count Passengers***");
//        task08.countPassengers();
//        System.out.println("***Count passengers END");
//        System.out.println("***SEARCH BY PASS COUNT***");
//        task08.searchByPassCount(15,38);
//        System.out.println("***SEARCH BY PASS COUNT END");

       // new TaxOffice().sortByTaxSum();
        //new GameRoom().fillRoom(60);
        new Biker().fullSum();
        new Biker().sortByWeight();
        System.out.println("***");
        new Biker().search(100,900);
    }
}
