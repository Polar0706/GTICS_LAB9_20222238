package com.tele.lab9_20222238.repository;

import com.tele.lab9_20222238.entity.FavoriteMeal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteMealRepository extends JpaRepository<FavoriteMeal, String> {
    // Métodos personalizados si necesitas
}
