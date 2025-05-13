public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsce = 100;
    private int dostepneMiejsca;
    private double cena;

    public Wydarzenie(String nazwa, String data){
        this.nazwa = nazwa;
        this.data = data;
    }

    public Wydarzenie(String nazwa, String data, String miejsce){
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;
    }

    public Wydarzenie (String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, String data, String miejsce, double cena){
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;
        this.cena = cena;
    }

    public String toString(){
        return "nazwa: " + nazwa +", \n data: "+ data + ",\n miejsce: "+ miejsce + ",\n cena: "+ cena;
    }

    public void zarezerwujMiejsce(){
        if (dostepneMiejsca > 0){
        dostepneMiejsca--;
    }else{
        System.out.println("Brak dostępnych miejsc");
    }}

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsce() {
        return maxLiczbaMiejsce;
    }

    public void setMaxLiczbaMiejsce(int maxLiczbaMiejsce) {
        this.maxLiczbaMiejsce = maxLiczbaMiejsce;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}





