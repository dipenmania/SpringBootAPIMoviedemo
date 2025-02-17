package com.example.demo.movie.component;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.movie.model.Movie;
import com.example.demo.movie.repository.MovieRepository;

@Component
public class DataLoader implements ApplicationRunner {

	
    private final MovieRepository movieRepository;

    @Autowired
    public DataLoader(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

  
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Date date = new Date(2009, 10, 1);
		Date date1 = new Date(2019, 9, 2);
		Date date2 = new Date(2001, 8, 3);
		Date date3 = new Date(2007, 7, 4);
		Date date4 = new Date(2015, 6, 5);
		Date date5 = new Date(2015, 5, 6);
		Date date6 = new Date(2009, 10, 1);
		Date date7 = new Date(2019, 9, 2);
		Date date8 = new Date(2001, 8, 3);
		Date date9 = new Date(2007, 7, 4);
		Date date10 = new Date(2015, 6, 5);
		Date date11 = new Date(2015, 5, 6);
		Date date12 = new Date(2009, 10, 1);
		Date date13 = new Date(2019, 9, 2);
		Date date14 = new Date(2001, 8, 3);
		Date date15 = new Date(2007, 7, 4);
		Date date16 = new Date(2015, 6, 5);
		Date date17 = new Date(2015, 5, 6);
		Date date18 = new Date(2009, 10, 1);
		Date date19 = new Date(2019, 9, 2);
		Date date20 = new Date(2001, 8, 3);
		Date date21 = new Date(2007, 7, 4);
		Date date22 = new Date(2015, 6, 5);
		Date date23 = new Date(2017, 5, 6);
		Date date24 = new Date(2024, 5, 6);
		Date date25 = new Date(2022, 5, 6);
		Date date26 = new Date(2023, 5, 6);
		Date date27 = new Date(2014, 5, 6);
		Date date28 = new Date(2015, 5, 6);
		Date date29 = new Date(2007, 5, 6);
		Date date30 = new Date(2001, 8, 3);
		Date date31 = new Date(2009, 7, 4);
		Date date32 = new Date(2008, 6, 5);
		Date date33 = new Date(2014, 5, 6);
		Date date34 = new Date(2003, 5, 6);
		Date date35 = new Date(1995, 5, 6);
		Date date36 = new Date(1985, 5, 6);
		Date date37 = new Date(2005, 5, 6);
		Date date38 = new Date(1984, 5, 6);
		Date date39 = new Date(2015, 5, 6);
		Date date40 = new Date(2001, 8, 3);
		Date date41 = new Date(2007, 7, 4);
		Date date42 = new Date(2015, 6, 5);
		Date date43 = new Date(2022, 5, 6);
		Date date44 = new Date(2015, 5, 6);
		Date date45 = new Date(2006, 5, 6);
		Date date46 = new Date(2015, 5, 6);
		Date date47 = new Date(2002, 5, 6);
		Date date48 = new Date(2015, 5, 6);
		Date date49 = new Date(2000, 5, 6);
		Date date50 = new Date(2001, 8, 3);
		Date date51 = new Date(2007, 7, 4);
		Date date52 = new Date(2015, 6, 5);
		Date date53 = new Date(2015, 5, 6);
		Date date54 = new Date(2001, 5, 6);
		Date date55 = new Date(2011, 5, 6);
		Date date56 = new Date(2013, 5, 6);
		Date date57 = new Date(2019, 5, 6);
		Date date58 = new Date(2020, 5, 6);
		Date date59 = new Date(2021, 5, 6);
		
		movieRepository.save(new Movie("Big Boss",date,"www.boss.com","good","U/A",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("The Boss",date,"www.theboss.com","OK","U/A",7,"105 minutes", "English and Hindi"));
		movieRepository.save(new Movie("World Boss",date,"www.worldboss.com","Best","A",8,"65 minutes", "English"));
		movieRepository.save(new Movie("World War I",date,"www.worldwar1.com","Amazing","U/A",9,"145 minutes", "English,and Dutch"));
		movieRepository.save(new Movie("World War II",date,"www.worldwar2.com","SUPER","U/A",10,"195 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("India",date,"www.India.com","Best","U",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Netherland",date6,"www.Netherland.com","Best","U/A",7,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Sudan",date7,"www.Sudan.com","OK","U/A",8,"165 minutes", "English and Hindi"));
		movieRepository.save(new Movie("America",date8,"www.America.com","OK","U",9,"165 minutes", "English,Dutch"));
		movieRepository.save(new Movie("Poland",date9,"www.Poland.com","good","U/A",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Germany",date10,"www.Germany.com","Amazing","U/A",9,"165 minutes", "English and Hindi"));
		movieRepository.save(new Movie("England",date11,"www.England.com","OK","U",8,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Scotland",date12,"www.Scotland.com","good","U/A",5,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Wales",date13,"www.Wales.com","good","U/A",6,"165 minutes", "Dutch and Hindi"));
		movieRepository.save(new Movie("Ireland",date14,"www.Ireland.com","Best","U",5,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Northern Ireland",date15,"www.NorthernIreland.com","Amazing","U/A",8,"165 minutes", "English,Dutch and Hindi"));


		movieRepository.save(new Movie("Boss India",date15,"www.bossindia.com","good","U/A",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("The World",date16,"www.theworld.com","OK","U/A",7,"105 minutes", "English and Hindi"));
		movieRepository.save(new Movie("World India",date17,"www.worldIndia.com","Best","A",8,"65 minutes", "English"));
		movieRepository.save(new Movie("World Netherland Boss",date18,"www.Netherlandboss.com","Amazing","U/A",9,"145 minutes", "English,and Dutch"));
		movieRepository.save(new Movie("Latvia",date19,"www.Latvia.com","SUPER","U/A",10,"195 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Pakistan",date20,"www.India.com","Best","U",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Afghanistan",date21,"www.Netherland.com","Best","U/A",7,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Kazakhkistan",date22,"www.Sudan.com","OK","U/A",8,"165 minutes", "English and Hindi"));
		movieRepository.save(new Movie("Uzbekistan",date23,"www.America.com","OK","U",9,"165 minutes", "English,Dutch"));
		movieRepository.save(new Movie("Turkmenistan",date24,"www.Poland.com","good","U/A",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Tajakistan",date25,"www.Germany.com","Amazing","U/A",9,"165 minutes", "English and Hindi"));
		movieRepository.save(new Movie("Nepal",date26,"www.England.com","OK","U",8,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Bhutan",date27,"www.Scotland.com","good","U/A",5,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Srilanka",date28,"www.Wales.com","good","U/A",6,"165 minutes", "Dutch and Hindi"));
		movieRepository.save(new Movie("Angoloa",date29,"www.Ireland.com","Best","U",5,"165 minutes", "English,Dutch and Hindi"));
		
		
		movieRepository.save(new Movie("Life is good",date30,"www.bossindia.com","good","U/A",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("The Good and the bad",date32,"www.theworld.com","OK","U/A",7,"105 minutes", "English and Hindi"));
		movieRepository.save(new Movie("Best of India",date31,"www.worldIndia.com","Best","A",8,"65 minutes", "English"));
		movieRepository.save(new Movie("World and the Boss",date32,"www.Netherlandboss.com","Amazing","U/A",9,"145 minutes", "English,and Dutch"));
		movieRepository.save(new Movie("Zambia",date33,"www.Latvia.com","SUPER","U/A",10,"195 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Zimbabve",date34,"www.India.com","Best","U",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Australia",date35,"www.Netherland.com","Best","U/A",7,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("New Zealand",date36,"www.Sudan.com","OK","U/A",8,"165 minutes", "English and Hindi"));
		movieRepository.save(new Movie("Peru",date37,"www.America.com","OK","U",9,"165 minutes", "English,Dutch"));
		movieRepository.save(new Movie("Cameroon",date38,"www.Poland.com","good","U/A",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Japan",date39,"www.Germany.com","Amazing","U/A",9,"165 minutes", "English and Hindi"));
		movieRepository.save(new Movie("South korea",date40,"www.England.com","OK","U",8,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Taiwan",date41,"www.Scotland.com","good","U/A",5,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("China",date42,"www.Wales.com","good","U/A",6,"165 minutes", "Dutch and Hindi"));
		movieRepository.save(new Movie("Mangolia",date43,"www.Ireland.com","Best","U",5,"165 minutes", "English,Dutch and Hindi"));
		
		movieRepository.save(new Movie("Vibrant World",date44,"www.bossindia.com","good","U/A",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("The World Saga",date45,"www.theworld.com","OK","U/A",7,"105 minutes", "English and Hindi"));
		movieRepository.save(new Movie("World Cup",date46,"www.worldIndia.com","Best","A",8,"65 minutes", "English"));
		movieRepository.save(new Movie("Ugly Boss",date47,"www.Netherlandboss.com","Amazing","U/A",9,"145 minutes", "English,and Dutch"));
		movieRepository.save(new Movie("DRC",date48,"www.Latvia.com","SUPER","U/A",10,"195 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Congo",date49,"www.India.com","Best","U",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Nigeria",date50,"www.Netherland.com","Best","U/A",7,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Niger",date51,"www.Sudan.com","OK","U/A",8,"165 minutes", "English and Hindi"));
		movieRepository.save(new Movie("Chad",date52,"www.America.com","OK","U",9,"165 minutes", "English,Dutch"));
		movieRepository.save(new Movie("Ghana",date53,"www.Poland.com","good","U/A",6,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Somalia",date54,"www.Germany.com","Amazing","U/A",9,"165 minutes", "English and Hindi"));
		movieRepository.save(new Movie("Ethopia",date55,"www.England.com","OK","U",8,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Djibouti",date56,"www.Scotland.com","good","U/A",5,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Algeria",date57,"www.Wales.com","good","U/A",6,"165 minutes", "Dutch and Hindi"));
		movieRepository.save(new Movie("Libya",date58,"www.Ireland.com","Best","U",5,"165 minutes", "English,Dutch and Hindi"));
		movieRepository.save(new Movie("Tunisia",date59,"www.Ireland.com","Best","U",5,"165 minutes", "English,Dutch and Hindi"));
		
		
		
		
		
		
		
	   	
		
	}
}
