package domen;

public class Radnik {

	private String radnikID;
	private String jmbg;
	private String ime;
	private String prezime;
	private String korisnickoIme;
	private String sifra;
	public String getRadnikID() {
		return radnikID;
	}
	public void setRadnikID(String radnikID) {
		this.radnikID = radnikID;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	
	public Radnik(String radnikID, String jmbg, String ime, String prezime, String korisnickoIme, String sifra) {
		super();
		this.radnikID = radnikID;
		this.jmbg = jmbg;
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.sifra = sifra;
	}
	
	
}
