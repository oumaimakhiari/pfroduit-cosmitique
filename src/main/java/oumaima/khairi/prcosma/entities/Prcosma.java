package oumaima.khairi.prcosma.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Prcosma {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idPrcosma;
    private String  monPrcoema;
    private double prixPrcosma;
    private Date dateac;
    private Categorie categorie;
	public Prcosma() {
		super();
	}
	
	public Prcosma(String monPrcoema, double prixPrcosma, Date dateac) {
		super();
		this.monPrcoema = monPrcoema;
		this.prixPrcosma = prixPrcosma;
		this.dateac =dateac;
	}

	public Long getIdPrcosma() {
		return idPrcosma;
	}
	public void setIdPrcosma(Long idPrcosma) {
		this.idPrcosma = idPrcosma;
	}
	public String getMonPrcoema() {
		return monPrcoema;
	}
	public void setMonPrcoema(String monPrcoema) {
		this.monPrcoema = monPrcoema;
	}
	public double getPrixPrcosma() {
		return prixPrcosma;
	}
	public void setPrixPrcosma(double prixPrcosma) {
		this.prixPrcosma = prixPrcosma;
	}
	public Date getDateAcha() {
		return dateac;
	}
	public void setDateAcha(Date dateac) {
		this.dateac =dateac;
	}


	@Override
	public String toString() {
		return "Prcosma [idPrcosma=" + idPrcosma + ", monPrcoema=" + monPrcoema + ", prixPrcosma=" + prixPrcosma
				+ ", dateac=" + dateac + "]";
	}
    
    
}
