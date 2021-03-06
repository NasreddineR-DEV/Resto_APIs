package com.resto.oncf.repository;

import java.util.Optional;

import com.resto.oncf.model.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImageRepository extends JpaRepository<ImageModel, Long> {
	Optional<ImageModel> findByName(String name);
}
