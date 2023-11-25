package br.com.nerdonhub.cardapio.repository;

import br.com.nerdonhub.cardapio.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
