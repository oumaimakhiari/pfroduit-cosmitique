package oumaima.khairi.prcosma.repos;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import oumaima.khairi.prcosma.entities.Categorie;
import oumaima.khairi.prcosma.entities.Prcosma;

public interface PrcosmaRepository extends JpaRepository<Prcosma,Long> {

	List<Prcosma> findBynonPrcosma(String nonPrcosma);

	List<Prcosma> findBynonPrcosmaContains(String nonPrcosma);

	List<Prcosma> findByprixPrcosma(String nonPrcosma, double prixPrcosma);

	List<Prcosma> findByOrderBynonPrcosmaAsc();

	List<Prcosma> trierPrcosmanonPrix();

	Page<Prcosma> getAllProduitsParPage(int i, int j);
	@Query("select p from Produit p where p.nonprcosma like %?1 and p.prixPrcosma > ?2")
	List<Prcosma> findByNonPrix1(String non, Double prix);
	@Query("select p from Produit p where p.nonPrcosma like %:nom and p.prixPrcosma > :prix")
	List<Prcosma> findByNonPrix (@Param("non") String non,@Param("prix") Double prix);
	@Query("select p from Produit p where p.categorie = ?1")
	List<Prcosma> findByCategorie (Categorie categorie);
	List<Prcosma> findByCategorieIdCat(Long id);
	List<Prcosma> findByOrderByNomProduitAsc();
	@Query("select p from Produit p order by p.nonPrcosma ASC, p.prixPrcosma DESC")
	List<Prcosma> trierPrcosmaNomsSPrix ();

}