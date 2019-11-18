
public class Cameriere {
	
	/* Istanziamo una nuova istanza della classe Chef chiamata chef */
	Chef chef = new Chef();
	
	public boolean ConsegnaOrdine() {
		// Il cameriere consegna l'ordine al cliente
		
		if(chef.ordine_pronto == false) {
			System.out.println("L'ordine non e' ancora pronto, ripassa piu' tardi");
		}
		return chef.ordine_pronto == true;
	}
	
	public void RichiestaAssistenza() {
		/* Il Cameriere richiede l'assistenza al gestore applicativo 
		   per un problema del software */
		return;
	}
}
