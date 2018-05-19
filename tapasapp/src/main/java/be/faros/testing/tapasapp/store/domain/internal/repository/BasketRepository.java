package be.faros.testing.tapasapp.store.domain.internal.repository;

import be.faros.testing.tapasapp.store.domain.internal.entity.BasketEntity;
import org.springframework.data.repository.CrudRepository;

public interface BasketRepository extends CrudRepository<BasketEntity, Integer> {

}
