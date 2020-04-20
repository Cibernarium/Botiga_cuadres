package com.ITAcademy.botigacuadres.controller;

import java.awt.print.Pageable;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITAcademy.botigacuadres.exception.ResourceNotFoundException;
import com.ITAcademy.botigacuadres.model.Picture;
import com.ITAcademy.botigacuadres.model.Shop;
import com.ITAcademy.botigacuadres.repository.PictureRepository;
import com.ITAcademy.botigacuadres.repository.ShopRepository;

@RestController
public class PictureController {

	@Autowired
	private PictureRepository pictureRepository;

	@Autowired
	private ShopRepository shopRepository;

	@GetMapping("/shops/{ID}/pictures")

	public List<Picture> getAllPicturesByShopId(@PathVariable(value = "ID") Long shopId) {
		return (List<Picture>) pictureRepository.findByShopId(shopId);
	}

	@PostMapping("/shops/{ID}/pictures")
	public Picture createPicture(@PathVariable(value = "ID") Long shopId, @Valid @RequestBody Picture picture,
			String author) {
		return shopRepository.findById(shopId).map(shop -> {
			picture.setShop(shop);
			return pictureRepository.save(picture);
		}).orElseThrow(() -> new ResourceNotFoundException("shopId " + shopId + " not found"));
	}

	@DeleteMapping("/shops/{ID}/pictures")
	public void deletePicturesByShopId(@PathVariable(value = "ID") Long shopId) {

		for (Picture picture : pictureRepository.findByShopId(shopId)) {
			pictureRepository.delete(picture);
		}
	}

}
