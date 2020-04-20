package com.ITAcademy.botigacuadres.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ITAcademy.botigacuadres.model.Shop;
import com.ITAcademy.botigacuadres.repository.ShopRepository;



@Configuration

public class LoadDatabaseShops {

@Bean

CommandLineRunner initDatabase(ShopRepository repository) {

return args -> {

System.out.println("Preloading Data to memoryDatabase");

repository.save(new Shop("conde ingles",100));
repository.save(new Shop("galerias preciados",150));
repository.save(new Shop("Macba",200));


System.out.println("Data loaded");

};

}

}