package com.ITAcademy.botigacuadres.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITAcademy.botigacuadres.model.Picture;

@Repository
public interface PictureRepository extends JpaRepository<Picture,Long> {

	
	List<Picture> findByShopId(Long shopId);
   
    
}
