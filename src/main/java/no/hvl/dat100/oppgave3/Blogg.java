package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Bilde;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig = 0;
	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int temp = -1;
		for (int i = 0; i < nesteledig; i++) {
			if (innlegg.erLik(innleggtabell[i])){
				temp = 1;
				break;
			}
		}
		return temp;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innlegg.erLik(innleggtabell[i])) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		boolean ledig = true;
		if (nesteledig == innleggtabell.length){
			ledig = false;
		}
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;
			if (ledigPlass() && !finnes(innlegg)){
				innleggtabell[nesteledig] = innlegg;
				nesteledig++;
				lagtTil = true;
			}
		return lagtTil;
	}
	
	public String toString() {
		String temp = nesteledig + "\n";
		for(int i = 0; i < nesteledig; i++){
			temp += innleggtabell[i];
		}
		return temp;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}