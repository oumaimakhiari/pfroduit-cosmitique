package oumaima.khairi.prcosma;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import oumaima.khairi.prcosma.entities.Categorie;
import oumaima.khairi.prcosma.entities.Prcosma;
import oumaima.khairi.prcosma.repos.PrcosmaRepository;
import oumaima.khairi.prcosma.service.PrcosmaService;

@SpringBootTest
class PrcosmaApplicationTests {
  
	@Autowired
	private  PrcosmaRepository prcosmaRepository;
	@Autowired
	private   PrcosmaService  prcosmaService;
	@Test
	public void testCreatePrcosma() {
	Prcosma prod = new Prcosma("rouge",20.500,new Date());
	prcosmaRepository.save(prod);
	}
	@Test
	public  void  testFindPrcosma ()
	{
	Prcosma p = prcosmaRepository.findById( 1L ).get();
	System.out.println(p);
	}
	@Test
	public  void  testupdatePrcosma ()
	{
	Prcosma p = prcosmaRepository.findById( 1L ).get();
	p.setPrixPrcosma(200.0);
	prcosmaRepository.save(p);
	System.out.println(p);
	
	}
	@Test
	public  void  testDeletePrcosma()
	{
		prcosmaRepository.deleteById(1L);
	}
	@Test
	public  void  testFindAllPrcosma ()
	{
		List<Prcosma>prods = prcosmaRepository.findAll();
		
		for ( Prcosma p : prods)
			 System.out.println (p);
		
	}
	

	@Test
	public void testFindByNomPrcosma()
	{
	List<Prcosma> prods = prcosmaRepository.findBynonPrcosma("rouge");
	for (Prcosma p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNonPrcosmaContains ()
	{
	List<Prcosma> prods=prcosmaRepository.findBynonPrcosma("rouge");
	for (Prcosma p : prods)
	{
	System.out.println(p);
	}} 
	@Test
	public void testfindByNonPrix()
	{
	List<Prcosma> prods = prcosmaRepository.findByNonPrix("rouge", 1000.0);
	for (Prcosma p : prods)
	{
	System.out.println(p);
	}}
	@Test
	public void testfindByCategorie()
	{
	Categorie cat = new Categorie();
	cat.setIdCat(1L);
	List<Prcosma> prods = prcosmaRepository.findByCategorie(cat);
	for (Prcosma p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByCategorieIdCat()
	{
	List<Prcosma> prods = prcosmaRepository.findByCategorieIdCat(1L);
	for (Prcosma p : prods)
	{
	System.out.println(p);
	}}
	@Test
	public void testfindByOrderByNonPrcosmaAsc()
	{
	List<Prcosma> prods =prcosmaRepository.findByOrderBynonPrcosmaAsc();
	for (Prcosma p : prods)
	{
	System.out.println(p);
	}
	
	 }
	@Test
	public void testTrierPrcosmaNomsPrix()
	{
	List<Prcosma> prods = prcosmaRepository.trierPrcosmaNomsSPrix();
	for (Prcosma p : prods)
	{
	System.out.println(p);
	}
	}
	}
