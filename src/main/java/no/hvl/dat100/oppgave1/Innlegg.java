package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int like;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.like = likes;
	}
	
	public String getBruker() {return bruker;}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {return dato;}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {return id;}

	public int getLikes() {return like;}
	
	public void doLike () {
		this.like++;
	}

	public boolean erLik(Innlegg innlegg) {
        return this.id == innlegg.getId();
	}
	
	@Override
	public String toString() {
		return id + "\n" + bruker + "\n" + dato + "\n" + like + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
