package oumaima.khairi.prcosma.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oumaima.khairi.prcosma.entities.Prcosma;
import oumaima.khairi.prcosma.service.PrcosmaService;

@Controller
public class PrcosmaController {
	@Autowired
	PrcosmaService prcosmaService;
	
	@RequestMapping ("/showCreate")
	public  String  showCreate ()
	{
		return  "createPrcosma";
	}
	@RequestMapping("/savePrcosma")
	public String savePrcosma(@ModelAttribute("prcosma") Prcosma prcosma,
	                          @RequestParam("dateac") String date,
	                          ModelMap modelMap) throws ParseException
	{
	//conversion de la date
	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	Date dateA = dateformat.parse(String.valueOf(date));
	prcosma.setDateAcha(dateA);
	Prcosma savePrcosma = prcosmaService.savePrcosma(prcosma);
	String msg = "prcosma enregistré avec Id "+savePrcosma.getIdPrcosma();
	modelMap.addAttribute("msg",msg);
	return"createPrcosma";
	}
	@RequestMapping("/listeprcosma")
	public String listePrcosma(ModelMap modelMap,
			@RequestParam (name="page",defaultValue = "0") int page,
			@RequestParam (name="size", defaultValue = "2") int size)
	{
		Page<Prcosma> prods = prcosmaService.getAllPrcosmaParPage(page, size);
		modelMap.addAttribute("prcosma", prods);
		 modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
		modelMap.addAttribute("currentPage", page);
		return "listePrcosma";
		}

	@RequestMapping("/supprimerPrcosma")
	public String supprimerPrcosma(@RequestParam("id") Long id,
			                        ModelMap modelMap,
			                        @RequestParam (name="page",defaultValue = "0") int page,
			            			@RequestParam (name="size", defaultValue = "2") int size)
	{
	  prcosmaService.deletePrcosmaById(id);
	  Page<Prcosma> prods = prcosmaService.getAllPrcosmaParPage(page,
			  size);
			  modelMap.addAttribute("procosma", prods);
			  modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
			  modelMap.addAttribute("currentPage", page);
			  modelMap.addAttribute("size", size);
	  return"listePrcosma";
	}
	@RequestMapping("/modifierPrcosma")
	public String editerPrcosma(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Prcosma p= prcosmaService.getPrcosma(id);
	modelMap.addAttribute("prcosma", p);
	return "editePrcosma";
	}
	@RequestMapping("/updatePrcosma")
	public String updatePrcosma(@ModelAttribute("prcosma") Prcosma prcosma,
	                            @RequestParam("dateac") String date,
	                            ModelMap modelMap) throws
	ParseException
	{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateA = dateformat.parse(String.valueOf(date));
	 prcosma.setDateAcha(dateA);

	 prcosmaService.updatePrcosma(prcosma);
	 List<Prcosma> prods = prcosmaService.getAllPrcosma();
	 modelMap.addAttribute("prcosma", prods);
	return "listePrcosma";
	}
	}
   
