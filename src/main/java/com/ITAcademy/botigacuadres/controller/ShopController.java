package com.ITAcademy.botigacuadres.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITAcademy.botigacuadres.model.Shop;
import com.ITAcademy.botigacuadres.repository.ShopRepository;

@RestController
public class ShopController {

	@Autowired
	private ShopRepository shopRepository;

	@GetMapping("/shops")
	// public Page<Shop> getAllShops(Pageable pageable) {
	// return shopRepository.findAll(pageable);
	public List<Shop> getAllShops() {
		return shopRepository.findAll();
	}

	@PostMapping("/shops")
	public Shop createShop(@Valid @RequestBody Shop shop, Integer maxPictures) {
		return shopRepository.save(shop);
	}

}
