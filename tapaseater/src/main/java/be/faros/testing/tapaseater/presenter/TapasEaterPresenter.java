package be.faros.testing.tapaseater.presenter;

import be.faros.testing.tapaseater.gateway.dto.Tapas;
import be.faros.testing.tapaseater.gateway.dto.TapasOrder;
import java.math.BigDecimal;
import java.util.List;

public interface TapasEaterPresenter {

  List<Tapas> listAvailableTapas();

  Tapas getTapasById(String tapasId);

  void createNewBasket();

  boolean basketIsSelected();

  List<TapasOrder> retrieveListOfAllTapasOrdersInBasket();

  void addNewTapasOrderToBasket(String tapasId, int amount);

  BigDecimal calculateCostForBasket();

}
