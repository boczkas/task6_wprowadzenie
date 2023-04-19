import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        1. Lambda

        Pracownik staszek = new Pracownik("Staszek", 0);
        Pracownik tomek = new Pracownik("Tomek", 1000000);
        Pracownik anna = new Pracownik("Anna", 5000);
        Pracownik dominika = new Pracownik("Dominika", 20000);

        Pracownik[] pracownicy = {staszek, tomek, anna, dominika};

//        Chcemy posortować sobie pracowników.
//        Najpierw po wypłacie, a potem po długości imienia.
//
//        Jak to zrobić? Nie da się przecież zaimplementować dwa razy Comparabla

//        To nam rzuca wyjątek:
        Arrays.sort(pracownicy);

        //        To co możemy zrobić to użyć Arrays.sort() z podawanym sposobem sortowania


//        Comparator<Pracownik> comparatorWyplaty = new Comparator<Pracownik>() {
//            @Override
//            public int compare(Pracownik o1, Pracownik o2) {
//                return (int) (o1.wyplata - o2.wyplata);
//            }
//        };


//

//        Arrays.sort(pracownicy, comparatorWyplaty);
//
//        for (Pracownik pracownik : pracownicy) {
//            System.out.println(pracownik);
//        }



//        To teraz po imionach


//        Comparator<Pracownik> comparatorImienia = new Comparator<Pracownik>() {
//            @Override
//            public int compare(Pracownik o1, Pracownik o2) {
//                return  o1.imie.length() - o2.imie.length();
//            }
//        };


//


//        System.out.println("========================");
//        Arrays.sort(pracownicy, comparatorImienia);
//
//        for (Pracownik pracownik : pracownicy) {
//            System.out.println(pracownik);
//        }



//        Popatrzmy sobie, że w obu przypadkach coś nam się świeci na szaro. Skopiowany Comparator imienia:


//        Comparator<Pracownik> comparatorImienia2 = new Comparator<Pracownik>() {
//            @Override
//            public int compare(Pracownik o1, Pracownik o2) {
//                return  o1.imie.length() - o2.imie.length();
//            }
//        };


//

//        System.out.println("========================");
//        Arrays.sort(pracownicy, comparatorImienia2);


//


//        for (Pracownik pracownik : pracownicy) {
//            System.out.println(pracownik);
//        }


//
//        To co nam się tu pojawiło to lambda
//        Lambdy umożliwiają przekazywanie sobie między obiektami kawałków kodu
//        Lambdy należy traktować jak funkcje, które możemy sobie przekazywać

//        2. Interfejsy funkcyjne
//          Interfejsy z jedną metodą abstrakcyjną.
//          Interfejs Krzykacz

//        Krzykacz polskiKrzykacz = () -> System.out.println("O Ty małpo!");
//        Krzykacz angielskiKrzykacz = () -> System.out.println("You son of a donkey!");
//
//        polskiKrzykacz.wydajDzwiek();
//        angielskiKrzykacz.wydajDzwiek();

        //        Wielokrotny krzykacz

//        Krzykacz wielokrotnyKrzykacz = () -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Krzyczę po raz " + (i + 1) + "!");
//            }
//        };

//        wielokrotnyKrzykacz.wydajDzwiek();

//        Możemy przekazać teraz tą konkretną implementację do metody

//        nakrzykiwacz(polskiKrzykacz);
//        nakrzykiwacz(angielskiKrzykacz);
//        nakrzykiwacz(wielokrotnyKrzykacz);


//        Manager podwyzszajacyManager = p ->
//                System.out.println("Wysokosc twojej wypłaty to " + p.wyplata + " a będzie " + (p.wyplata + 100));
//
//        podwyzszajacyManager.przekazInformacje(staszek);


//      2.  Streamy
//        List<Pracownik> listaPracownikow = Arrays.asList(pracownicy);

//        Chcemy wyciągnąć wszystkich pracowników o wypłatach większych niż 10 000

//        List<Pracownik> pracownicyBogaci = new ArrayList<>();
//        for(Pracownik pracownik : pracownicy) {
//            if(pracownik.wyplata > 10000) {
//                pracownicyBogaci.add(pracownik);
//            }
//        }

//        wypisz(pracownicyBogaci);

//        List<Pracownik> bogacze = listaPracownikow.stream()
//                .filter(pracownik -> pracownik.wyplata > 10000)
//                .collect(Collectors.toList());
//
//        wypisz(bogacze);

//        Chcemy obniżyć wszystkim pensje o 1000


//        List<Pracownik> poObnizce = listaPracownikow.stream()
//                .map(pracownik -> new Pracownik(pracownik.imie, pracownik.wyplata - 1000))
//                .collect(Collectors.toList());


//        wypisz(poObnizce);

//        Dziwnie, że Staszek dopłaca za to, że pracuje. Nie bądźmy tacy okrutni

//        poObnizce = listaPracownikow.stream()
//                .filter(pracownik -> pracownik.wyplata > 0)
//                .map(pracownik -> new Pracownik(pracownik.imie, pracownik.wyplata - 1000))
//                .collect(Collectors.toList());

//        wypisz(poObnizce);

//        Chcemy posortować po wypłacie

//        List<Pracownik> posortowani = poObnizce.stream()
//                .sorted((o1, o2) -> (int) (o1.wyplata - o2.wyplata))
//                .collect(Collectors.toList());

//        wypisz(posortowani);

//        Streamy składają się z operacji pośrednich i jednej terminalnej
    }


    public static void nakrzykiwacz(Krzykacz krzykacz) {
        krzykacz.wydajDzwiek();
    }

    private static <T> void wypisz(List<T> list) {
        System.out.println("============================");
        for(T tekst : list) {
            System.out.println(tekst);
        }
    }

}
