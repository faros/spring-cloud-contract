package be.faros.testing.tapaseater.gateway;

import be.faros.testing.tapaseater.gateway.dto.Tapas;
import be.faros.testing.tapaseater.gateway.dto.TapasOrder;
import java.math.BigDecimal;
import java.util.List;

public interface TapasAppGateway {

  List<Tapas> getAvailableTapas();

  Tapas getTapasById(String tapasId);

  Integer createNewBasket();

  List<TapasOrder> retrieveListOfAllTapasOrdersInBasket(int basketId);

  void addNewTapasOrderToBasket(int basketId, String tapasId, int amount);

  BigDecimal calculateCostForBasket(int basketId);

}
