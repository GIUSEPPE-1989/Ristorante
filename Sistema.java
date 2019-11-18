
public class Sistema {
	
	public void InviaOrdine() {
		// Il sistema invia l'ordine allo chef in cucina
		return;
	}
	
	/* Se uguale a false allora il cliente deve ancora pagare
	   Se uguale a true il cliente ha gia' pagato */
	boolean pagamento_effettuato = false;
	
	public boolean Paga() {
		// Il cliente decide di pagare direttamente dal software
		return pagamento_effettuato;
	}
}
