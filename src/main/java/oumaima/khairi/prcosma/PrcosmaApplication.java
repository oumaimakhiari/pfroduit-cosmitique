package oumaima.khairi.prcosma;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import oumaima.khairi.prcosma.entities.Prcosma;
import oumaima.khairi.prcosma.service.PrcosmaService;

@SpringBootApplication
public class PrcosmaApplication implements CommandLineRunner{
 @Autowired
  PrcosmaService   prcosmaService;
	public static void main(String[] args) {
		SpringApplication.run(PrcosmaApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	  prcosmaService.savePrcosma(new Prcosma("rouge",50,new Date()));
	  prcosmaService.savePrcosma(new Prcosma("font",30,new Date()));
}

}
