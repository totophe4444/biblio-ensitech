package com.example.biliotheque1;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.biliotheque1.entity.Livre;
import com.example.biliotheque1.repository.LivreRepository;



@SpringBootApplication
public class Biliotheque1Application {
	private static LivreRepository livreRepository = null;
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Biliotheque1Application.class, args);
		livreRepository = ctx.getBean(LivreRepository.class);
		initialiser();
	}
	public static void initialiser()  {
		Livre livre1 = new Livre("Les quatre accords", 1, 1602, "tolteques.jpg", "Castaneda a fait découvrir au grand public les enseignements des chamans mexicains qui ont pour origine la tradition toltèque, gardienne des connaissances de Quetzacoatl, le serpent à plumes. Dans ce livre, Don Miguel révèle la source des croyances limi-tatrices qui nous privent de joie et créent des souffrances inutiles. br/ br/ Il montre en des termes très simples comment on peut se libérer du conditionnement collectif - le rêve de la planète, basé sur la peur - afin de retrouver la dimension d'amour inconditionnel qui est à notre origine et constitue le fondement des enseignements toltèques. br/ br/ Les quatre accords proposent un puissant code de conduite capable de transformer rapidement notre vie en une expérience de liberté, de vrai bonheur et d'amour. Le monde fascinant de la Connaissance véritable et incarnée est enfin à la portée de chacun.");
		Livre livre2 = new Livre("Saturne", 2, 466, "saturne.jpg", "Sa fille est encore un bébé quand Harry meurt à 34 ans dans des circonstances tragiques. Il est issu d’une grande lignée de médecins contraints à l’exil au moment de l’indépendance de l’Algérie, et qui ont rebâti un empire médical en France. L’aîné, Armand, mettra ses pas dans ceux de sa famille. Mais la passion de Harry pour une femme à la beauté incendiaire fera voler en éclats les reliques d’un royaume où l’argent coule à flots. Saturne dépeint le crépuscule d’un monde et de ses dieux. C’est aussi un roman sur l’épreuve de nos deuils, et une grande histoire d’amour : celle d’une enfant guettée par la folie et la mort, mais qui est devenue écrivain parce que, une nuit, elle en avait fait la promesse au fantôme de son père.\n" +
			      "Sarah Chiche est l’auteure de plusieurs romans et essais. Son quatrième roman, Saturne, sélectionné par les prix littéraires les plus prestigieux, a rencontré un grand succès public et critique.");
		livreRepository.save(livre1);
		livreRepository.save(livre2);
	}
}
