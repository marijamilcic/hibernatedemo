package domen;

public class Cena {

	private String cenaID;
	private Double iznos;
	private Double popust;
	private Proizvod proizvod;
	
	public String getCenaID() {
		return cenaID;
	}
	public void setCenaID(String cenaID) {
		this.cenaID = cenaID;
	}
	public Double getIznos() {
		return iznos;
	}
	public void setIznos(Double iznos) {
		this.iznos = iznos;
	}
	public Double getPopust() {
		return popust;
	}
	public void setPopust(Double popust) {
		this.popust = popust;
	}
	public Proizvod getProizvod() {
		return proizvod;
	}
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	public Cena(String cenaID, Double iznos, Double popust) {
		super();
		this.cenaID = cenaID;
		this.iznos = iznos;
		this.popust = popust;
	}
	
	
	
}
