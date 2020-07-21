package guru.springframework.repositories;

import guru.springframework.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UoMRepo extends CrudRepository<UnitOfMeasure,Long> {
}
