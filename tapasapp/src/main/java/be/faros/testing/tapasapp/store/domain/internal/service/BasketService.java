package be.faros.testing.tapasapp.store.domain.internal.service;

import be.faros.testing.tapasapp.store.domain.internal.entity.BasketEntity;

public interface BasketService {

  int createNewBasket();

  BasketEntity getExpectedBasket(int basketId);

  void changeTapasOrder(BasketEntity basket, String tapasId, long amount);

}
