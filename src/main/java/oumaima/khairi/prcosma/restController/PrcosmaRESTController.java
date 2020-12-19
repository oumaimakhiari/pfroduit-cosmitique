package oumaima.khairi.prcosma.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import oumaima.khairi.prcosma.entities.Prcosma;
import oumaima.khairi.prcosma.service.PrcosmaService;

@RestController
@RequestMapping("/api")
@CrossOrigin
 class PrcosmaRESTController {

	@Autowired
	PrcosmaService prcosmaService;
	@RequestMapping(method=RequestMethod.GET)
	List<Prcosma>getAllPrcosma()
	{
		return prcosmaService.getAllPrcosma();
	}
	@RequestMapping(method = RequestMethod.POST)
	public Prcosma createPrcosma(@RequestBody Prcosma prcosma) {
	return prcosmaService.savePrcosma(prcosma);
	}

}
