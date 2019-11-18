
public class GestoreApplicativo {
	/* Se false non c'è alcun problema
	   Se true allora è presente un problema segnalato da qualcuno */
	boolean problema_presente = false;
	
	public void InstallazioneSoftware() {
		// Il gestore applicativo installa il software
		return;
	}
	
	public boolean ManutenzioneSoftware() {
		// Il gestore applicativo effettua la manutenzione del software
		// Se e' stato segnalato un problema (e quindi problema_presente == true)...
		if(problema_presente == true) {
			System.out.println("E' presente un problema, stiamo risolvendo al piu' presto\n");
			return problema_presente;
		}
		// Altrimenti non esiste nessun problema e ritorniamo false
		return false;
	}
	
	public void DismissioneSoftware() {
		// Il gestore applicativo effettua la dismissione e rimozione del software
		return;
	}
	
	public void RisoluzioneProblema() {
		// il gestore applicativo risponde alle richieste di assistenza
		return;
	}
}
