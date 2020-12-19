package oumaima.khairi.prcosma.service;

import java.util.List;

import org.springframework.data.domain.Page;

import oumaima.khairi.prcosma.entities.Categorie;
import oumaima.khairi.prcosma.entities.Prcosma;

public interface PrcosmaService {
	Prcosma  savePrcosma (Prcosma  prcosma);
	Prcosma  updatePrcosma (Prcosma  p);
	void  deletePrcosma (Prcosma  p);
	void  deletePrcosmaById ( Long  id );
	Prcosma  getPrcosma ( Long  id );
	List <Prcosma>  getAllPrcosma ();
	List <Prcosma> findBynonPrcosma(String nonPrcosma);
	List <Prcosma> findBynonPrcosmaContains(String nonPrcosma);
	List <Prcosma> findByprixPrcosma(String nonPrcosma,double prixPrcosma );
	List <Prcosma> findByOrderBynonPrcosmaAsc();
	List <Prcosma> trierPrcosmanonPrix();
    Page<Prcosma> getAllPrcosmaParPage(int page, int size);
	List<Prcosma> findByNomPrix(String nom, Double prix);
	List<Prcosma> findByNomPrcosmaContains(String nom);
	List<Prcosma> findByNomPrcosma(String nom);
	List<Prcosma> findByCategorie(Categorie categorie);
	List<Prcosma> findByCategorieIdCat(Long id);
	List<Prcosma> findByOrderByNomPrcosmatAsc();
	List<Prcosma> trierPrcosmaNomsPrix();

	
	
	
}
