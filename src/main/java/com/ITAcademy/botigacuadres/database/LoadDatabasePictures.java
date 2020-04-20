/*package com.ITAcademy.botigacuadres.database;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ITAcademy.botigacuadres.model.Picture;
import com.ITAcademy.botigacuadres.model.Shop;
import com.ITAcademy.botigacuadres.repository.PictureRepository;
import com.ITAcademy.botigacuadres.repository.ShopRepository;

@Configuration

public class LoadDatabasePictures {

@Bean

CommandLineRunner initDatabase(PictureRepository repository) {

return args -> {

System.out.println("Preloading Data to memoryDatabase");

Date date;
Shop shop1=new Shop("Loubre", 250);

repository.save(new Picture("Picaso", "meninas", 12500, date=new Date(),shop1));



System.out.println("Data loaded");

};

}

}*/