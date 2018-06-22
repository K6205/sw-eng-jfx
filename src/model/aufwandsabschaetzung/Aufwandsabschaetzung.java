package aufwandsabschaetzung;
import nachkalkulation.*;

import java.util.LinkedList;
/**
 * Repräsentiert die Aufwandsabschätzung mit den Produktfunktionen und Produktdaten
 * Wenn sie neu aneglegt werden, musst du, lieber, guter HS siehst heute , sie der Linkedlist hinzufügen
 * @author RFN2FE
 *
 */
public class Aufwandsabschaetzung implements Aufwandsabschaetzung_I {
	/**
	 * wird immer aufgerufen, wenn die Dauer des Projektes berechnet werden soll
	 */
	private LinkedList<Funktion_Daten_Abstraktion_I> daten_funktion= new LinkedList<Funktion_Daten_Abstraktion_I>();
	private int calculatedTime;
	private int realTime;
	private int[] factors; // müssen von dem User eingegeben werden, kannst sie in unserer Spezifikation nachschauen
	private Optimieren_I opti;
	private int functionPoints;
	/**
	 * Berchnet die Zeit nach der FunctionPointMethode
	 */
	@Override
	public int calcTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	public void optimieren(){
		opti.optimieren(realTime, calculatedTime, functionPoints, factors);
	}
	// Hier musst du Produktdaten oder Produktfunktionen hinzufügen
	public void hinzufuegen(){
		this.daten_funktion.add(new Funktion_Daten_Abstraktion(new Abfrage(10,10)));
		
		// Unterscheide hier halt dei verschiedenen Sachen
	}
}
