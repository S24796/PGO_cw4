import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Klient> Klienci;
    private ArrayList<Wydarzenie> Wydarzenia;

    public SystemRezerwacji() {
        this.Klienci = new ArrayList<>();
        this.Wydarzenia = new ArrayList<>();
    }

    public void dodajWydarzenie(String nazwa, String data) {
        Wydarzenia.add(new Wydarzenie(nazwa, data));
    }

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        Wydarzenia.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, String data, String miejsce) {
        Wydarzenia.add(new Wydarzenie(nazwa, data, miejsce));
    }
    public void dodajWydarzenie(String nazwa, String data, String miejsce, double cena) {
        Wydarzenia.add(new Wydarzenie(nazwa, data, miejsce, cena));
    }

    public void dodajKlient(String imie, String nazwisko) {
        Klienci.add(new Klient(imie, nazwisko));
    }

    public void dodajKlient(Klient klient) {
        Klienci.add(klient);
    }

    public void dodajKlient(String imie, String nazwisko, String email) {
        Klienci.add(new Klient(imie, nazwisko, email));
    }

    public void dokonajRezerwacji(String nazwisko, String nazwaWydarzenia) {
        Klient klient = znajdzKlienta(nazwisko);
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwaWydarzenia);

        if (klient != null && wydarzenie != null) {
            klient.dodajRezerwacje(wydarzenie);
        }else{
            System.out.println("Nie znaleziono klienta lub wydarzenia.");
        }
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (klient != null && wydarzenie != null) {
            klient.dodajRezerwacje(wydarzenie);
        }
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie Wydarzenie : Wydarzenia) {
            if (Wydarzenie.getNazwa().equalsIgnoreCase(nazwa)) {
                return Wydarzenie;
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (Klient Klient : Klienci) {
            if (Klient.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return Klient;
            }
        }
        return null;
    }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena){
        Wydarzenie Wydarzenie = znajdzWydarzenie(nazwa);
        if (Wydarzenie != null) {
            Wydarzenie.setCena(nowaCena);
        }
    }
}