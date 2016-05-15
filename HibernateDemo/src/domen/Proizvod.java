package domen;

public class Proizvod {

	private String proizvodID;
	private String nazivProizvoda;
	private int dimenzije;
	private String proizvodjac;
	private String opis;
	private Radnik radnik;
	
	
	public String getProizvodID() {
		return proizvodID;
	}
	public void setProizvodID(String proizvodID) {
		this.proizvodID = proizvodID;
	}
	public String getNazivProizvoda() {
		return nazivProizvoda;
	}
	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}
	public int getDimenzije() {
		return dimenzije;
	}
	public void setDimenzije(int dimenzije) {
		this.dimenzije = dimenzije;
	}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public Radnik getRadnik() {
		return radnik;
	}
	public void setRadnik(Radnik radnik) {
		this.radnik = radnik;
	}
	public Proizvod(String proizvodID, String nazivProizvoda, int dimenzije, String proizvodjac, String opis) {
		super();
		this.proizvodID = proizvodID;
		this.nazivProizvoda = nazivProizvoda;
		this.dimenzije = dimenzije;
		this.proizvodjac = proizvodjac;
		this.opis = opis;
	}
	
	
	
}
