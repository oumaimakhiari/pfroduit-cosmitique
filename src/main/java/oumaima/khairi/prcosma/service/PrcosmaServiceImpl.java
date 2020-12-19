package oumaima.khairi.prcosma.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import oumaima.khairi.prcosma.entities.Categorie;
import oumaima.khairi.prcosma.entities.Prcosma;
import oumaima.khairi.prcosma.repos.PrcosmaRepository;
@Service
public class PrcosmaServiceImpl implements PrcosmaService {
	PrcosmaRepository prcosmaRepository;

	@Override
	public Prcosma savePrcosma(Prcosma p) {
		
		return prcosmaRepository.save(p);
	}

	@Override
	public Prcosma updatePrcosma(Prcosma p) {
		return prcosmaRepository.save(p);
	}

	@Override
	public void deletePrcosma(Prcosma p) {
	 prcosmaRepository.delete(p);
		
	}

	@Override
	public void deletePrcosmaById(Long id) {
		 prcosmaRepository.deleteById(id);
		
	}

	@Override
	public Prcosma getPrcosma(Long id) {
		return prcosmaRepository.findById(id).get();
	}

	@Override
	public List<Prcosma> getAllPrcosma() {
		return prcosmaRepository.findAll();
	}

	@Override
	public List<Prcosma> findBynonPrcosma(String nonPrcosma) {
		
		return prcosmaRepository.findBynonPrcosma(nonPrcosma);
	}

	@Override
	public List<Prcosma> findBynonPrcosmaContains(String nonPrcosma) {
		
		return prcosmaRepository.findBynonPrcosmaContains(nonPrcosma);
	}

	@Override
	public List<Prcosma> findByprixPrcosma(String nonPrcosma, double prixPrcosma) {
	
		return prcosmaRepository.findByprixPrcosma( nonPrcosma, prixPrcosma);
	}

	@Override
	public List<Prcosma> findByOrderBynonPrcosmaAsc() {
		
		return prcosmaRepository.findByOrderBynonPrcosmaAsc();
	}

	@Override
	public List<Prcosma> trierPrcosmanonPrix() {
		
		return prcosmaRepository.trierPrcosmanonPrix();
	}

	@Override
	public Page<Prcosma> getAllPrcosmaParPage(int page, int size) {

		return prcosmaRepository.findAll(PageRequest.of(page, size));

	}



	public List<Prcosma> findByNomPrcosma(String nom) {
	return prcosmaRepository.findBynonPrcosma(nom);
	}
	
	
	public List<Prcosma> findByNomPrcosmaContains(String nom) {
	return prcosmaRepository.findBynonPrcosmaContains(nom);
	}
	
	public List<Prcosma> findByNomPrix(String nom, Double prix) {
		return prcosmaRepository.findByNonPrix(nom, prix);
	}
	
	public List<Prcosma> findByCategorie(Categorie categorie) {
	return prcosmaRepository.findByCategorie(categorie);
	}
	
	public List<Prcosma> findByCategorieIdCat(Long id) {
	return prcosmaRepository.findByCategorieIdCat(id);
	}
	
	
	public List<Prcosma> findByOrderByNomPrcosmatAsc() {
	return prcosmaRepository.findByOrderByNomProduitAsc();
	}
	
	
	public List<Prcosma> trierPrcosmaNomsPrix() {
	return prcosmaRepository.trierPrcosmaNomsSPrix();
	}
}
