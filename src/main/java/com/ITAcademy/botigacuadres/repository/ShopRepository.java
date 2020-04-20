package com.ITAcademy.botigacuadres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITAcademy.botigacuadres.model.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

	List<Shop> findAll();
}
