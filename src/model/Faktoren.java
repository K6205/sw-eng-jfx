package model;

import java.io.Serializable;
import java.util.Arrays;

public class Faktoren implements Serializable {
	private double verfechtung;
    private double dezentraleDaten;
    private double transaktionsrate;
    private double rechenoperationen;
	private double kontrollverfahren;
	private double ausnahmeregelung;
	private double logik;
	private double wiederverwendbarkeit;
	private double datenbestandskonvertierung;
	private double anpassbarkeit;
	private double[] faktoren;
	private double faktor;
	
	public Faktoren(){
		this.faktoren= new double[10];
        this.verfechtung = 0.0;
        this.dezentraleDaten = 0.0;
        this.transaktionsrate = 0.0;
        this.rechenoperationen = 0.0;
        this.kontrollverfahren = 0.0;
        this.ausnahmeregelung = 0.0;
        this.logik = 0.0;
        this.wiederverwendbarkeit = 0.0;
        this.datenbestandskonvertierung = 0.0;
        this.anpassbarkeit = 0.0;

	}
	public Faktoren(double[] faktoren){
		int pos=0;
		this.faktoren= new double[10];
		for(double faktor: faktoren){
			this.faktoren[pos]=faktor;
			pos++;
		}
	}
	public double getVerfechtung() {
		return verfechtung;
	}
	public void setVerfechtung(double verfechtung) {
		this.verfechtung = verfechtung;
	}

    public double getDezentraleDaten() {
        return dezentraleDaten;
    }

    public void setDezentraleDaten(double dezentraleDaten) {
        this.dezentraleDaten = dezentraleDaten;
    }

    public double getTransaktionsrate() {
        return transaktionsrate;
    }

    public void setTransaktionsrate(double transaktionsrate) {
        this.transaktionsrate = transaktionsrate;
    }

    public double getRechenoperationen() {
        return rechenoperationen;
    }

    public void setRechenoperationen(double rechenoperationen) {
        this.rechenoperationen = rechenoperationen;
	}
	public double getKontrollverfahren() {
		return kontrollverfahren;
	}
	public void setKontrollverfahren(double kontrollverfahren) {
		this.kontrollverfahren = kontrollverfahren;
	}
	public double getAusnahmeregelung() {
		return ausnahmeregelung;
	}
	public void setAusnahmeregelung(double ausnahmeregelung) {
		this.ausnahmeregelung = ausnahmeregelung;
	}
	public double getLogik() {
		return logik;
	}
	public void setLogik(double logik) {
		this.logik = logik;
	}
	public double getWiederverwendbarkeit() {
		return wiederverwendbarkeit;
	}
	public void setWiederverwendbarkeit(double wiederverwendbarkeit) {
		this.wiederverwendbarkeit = wiederverwendbarkeit;
	}
	public double getDatenbestandskonvertierung() {
		return datenbestandskonvertierung;
	}
	public void setDatenbestandskonvertierung(double datenbestandskonvertierung) {
		this.datenbestandskonvertierung = datenbestandskonvertierung;
	}
	public double getAnpassbarkeit() {
		return anpassbarkeit;
	}
	public void setAnpassbarkeit(double anpassbarkeit) {
		this.anpassbarkeit = anpassbarkeit;
	}

	public double[] getFaktoren() {
		this.faktoren[0]=this.verfechtung;
        this.faktoren[1] = this.dezentraleDaten;
        this.faktoren[2] = this.transaktionsrate;
        this.faktoren[3] = this.rechenoperationen;
		this.faktoren[4]=this.kontrollverfahren;
		this.faktoren[5]=this.ausnahmeregelung;
		this.faktoren[6]=this.logik;
		this.faktoren[7]=this.wiederverwendbarkeit;
		this.faktoren[8]=this.datenbestandskonvertierung;
		this.faktoren[9]=this.anpassbarkeit;
		return faktoren;
	}
	public static double calcunbewertefp(double bewertetefp, double[] factors){
		double fac= Faktoren.calcfac(factors);
		double unbewertetefp=  bewertetefp/ fac;
		return unbewertetefp;
	}
	public static  double calcbewertefp(double unbewertefp, double []factors){
		double fac = Faktoren.calcfac(factors);
		return unbewertefp*fac;
		
	}
	public static double calcfac(double[] factors){
		int sumfactors=0;
		double fac;
		for( double factor :factors){
			sumfactors+=factor;
		}
		fac= sumfactors/100 +0.7;
		return fac;
	}
	public double calcbewertetefp(double unbewertetefp){
		this.faktor= this.calcfacin();
		return unbewertetefp* this.faktor;
	}
	private double calcfacin(){
		double sumfactors=0;
		for( double factor :this.faktoren){
			sumfactors+=factor;
		}
		return sumfactors/100 +0.7;
	}

	@Override
	public String toString() {
		return "Faktoren{" +
				"verfechtung=" + verfechtung +
				", dezentraleDaten=" + dezentraleDaten +
				", transaktionsrate=" + transaktionsrate +
				", rechenoperationen=" + rechenoperationen +
				", kontrollverfahren=" + kontrollverfahren +
				", ausnahmeregelung=" + ausnahmeregelung +
				", logik=" + logik +
				", wiederverwendbarkeit=" + wiederverwendbarkeit +
				", datenbestandskonvertierung=" + datenbestandskonvertierung +
				", anpassbarkeit=" + anpassbarkeit +
				", faktoren=" + Arrays.toString(faktoren) +
				", faktor=" + faktor +
				'}';
	}


	public String Userausgabe(){
		StringBuilder sb= new StringBuilder();
		sb.append("Verfechtung:");
		sb.append(this.verfechtung);
		sb.append("\nDezentrale Daten:");
		sb.append(this.dezentraleDaten);
		sb.append("\nTransaktionsrate:");
		sb.append(this.transaktionsrate);
		sb.append("\nRechenoperationen:");
		sb.append(this.rechenoperationen);
		sb.append("\nKontrollverfahren:");
		sb.append(this.kontrollverfahren);
		sb.append("\nAusnahmeregelung:");
		sb.append(this.ausnahmeregelung);
		sb.append("\nLogik");
		sb.append(this.logik);
		sb.append("\nWiederverwendbarkeit");
		sb.append(this.wiederverwendbarkeit);
		sb.append("\nDatenbestandskonvertierung");
		sb.append(this.datenbestandskonvertierung);
		sb.append("\nAnpassbarkeit");
		sb.append(this.anpassbarkeit);
		return sb.toString();
	}
}
