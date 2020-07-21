package guru.springframework.repositories;


import guru.springframework.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepo extends CrudRepository<Recipe,Long> {
}
