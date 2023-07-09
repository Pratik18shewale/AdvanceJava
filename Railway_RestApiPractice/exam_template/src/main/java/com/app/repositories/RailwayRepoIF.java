package com.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Category;
import com.app.entities.MyRailway;

public interface RailwayRepoIF extends JpaRepository<MyRailway, Integer>{

	List<MyRailway> findByCategory(Category category);

}
