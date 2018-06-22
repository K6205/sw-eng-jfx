package aufwandsabschaetzung;

public class Funktion_Daten_Abstraktion implements Funktion_Daten_Abstraktion_I{

	private Funktionen_Daten_I impl;
	
	public Funktion_Daten_Abstraktion(Funktionen_Daten_I impl){
		this.impl= impl;
	}

	
}
