package be.faros.testing.tapasapp.store.domain.usecases;

import be.faros.testing.tapasapp.store.domain.usecases.dto.TapasOrder;
import java.math.BigDecimal;
import java.util.List;

public interface UserBasketManagement {

  int createNewBasket();

  List<TapasOrder> retrieveListOfAllTapasOrdersInBasket(int basketId);

  void addTapasOrderInBasket(int basketId, TapasOrder tapasOrder);

  void changeTapasOrderInBasket(int basketId, TapasOrder tapasOrder);

  BigDecimal calculateCostForBasket(int basketId);

}
