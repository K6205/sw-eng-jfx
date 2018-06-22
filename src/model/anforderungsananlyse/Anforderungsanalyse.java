package anforderungsananlyse;
// Die interfaces und die anderen Klassen( Zielbestimmung, Produkteinstatz und Umgebung) fehlen leider noch 
public class Anforderungsanalyse {
private static Anforderungsanalyse instance;
private Anforderungsanalyse(){};
public static Anforderungsanalyse getInstance(){
	if(Anforderungsanalyse.instance==null){
		Anforderungsanalyse.instance= new Anforderungsanalyse();
	}
	return Anforderungsanalyse.instance;
}
}
