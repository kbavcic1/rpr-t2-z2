package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetnaTacka, krajnjaTacka;
    private boolean daLiPocetnaTackaPripada, daLiKrajnjaTackaPripada;

    public double getPocetnaTacka() {
        return pocetnaTacka;
    }

    public double getKrajnjaTacka() {
        return krajnjaTacka;
    }

    public boolean isDaLiPocetnaTackaPripada() {
        return daLiPocetnaTackaPripada;
    }

    public boolean isDaLiKrajnjaTackaPripada() {
        return daLiKrajnjaTackaPripada;
    }

    public Interval(double pocetnaTacka, double krajnjaTacka, boolean daLiPocetnaTackaPripada, boolean daLiKrajnjaTackaPripada) throws IllegalArgumentException {
        if (pocetnaTacka > krajnjaTacka) throw new IllegalArgumentException("Početna tačka je veća od krajnje");
        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.daLiPocetnaTackaPripada = daLiPocetnaTackaPripada;
        this.daLiKrajnjaTackaPripada = daLiKrajnjaTackaPripada;
    }

    public Interval() {
        pocetnaTacka = 0;
        krajnjaTacka = 0;
        daLiPocetnaTackaPripada = false;
        daLiKrajnjaTackaPripada = false;
    }

    public boolean isNull() {
        if (pocetnaTacka == 0 && krajnjaTacka == 0 && daLiKrajnjaTackaPripada == false && daLiPocetnaTackaPripada == false) return true;
        return false;
    }
    
    public boolean isIn(double koordinataTacke) {
        if (koordinataTacke > pocetnaTacka && koordinataTacke < krajnjaTacka) return true;
        else if (koordinataTacke == pocetnaTacka && daLiPocetnaTackaPripada == true) return true;
        else if (koordinataTacke == krajnjaTacka && daLiKrajnjaTackaPripada == true) return true;
        return false;
    }


    public Interval intersect(Interval interval) {
        if (pocetnaTacka < interval.pocetnaTacka);
        return null;
    }

    public static Interval intersect(Interval i, Interval i2) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        Interval i = (Interval) o;
        return pocetnaTacka == i.pocetnaTacka && krajnjaTacka == i.krajnjaTacka && daLiPocetnaTackaPripada == i.daLiPocetnaTackaPripada && daLiKrajnjaTackaPripada == i.daLiKrajnjaTackaPripada;
    }

    @Override
    public String toString() {
        if (this.isNull()) return "()";
        else if (daLiPocetnaTackaPripada == true && daLiKrajnjaTackaPripada == true) return "[" + pocetnaTacka + "," + krajnjaTacka + "]";
        else if (daLiPocetnaTackaPripada == true && daLiKrajnjaTackaPripada == false) return "[" + pocetnaTacka + "," + krajnjaTacka + ")";
        else if (daLiPocetnaTackaPripada == false && daLiKrajnjaTackaPripada == true) return "(" + pocetnaTacka + "," + krajnjaTacka + "]";
        return "(" + pocetnaTacka + "," + krajnjaTacka + ")";
    }
}
