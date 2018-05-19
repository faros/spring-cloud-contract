package be.faros.testing.tapaseater.view;

import be.faros.testing.tapaseater.presenter.TapasEaterPresenter;
import java.text.NumberFormat;
import java.util.stream.Collectors;
import javax.validation.constraints.Min;
import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

@ShellComponent
public class StoreView {

  private TapasEaterPresenter tapasEaterPresenter;

  public StoreView(TapasEaterPresenter tapasEaterPresenter) {
    this.tapasEaterPresenter = tapasEaterPresenter;
  }

  @ShellMethod("create a new basket")
  @ShellMethodAvailability("canCreateNewBasket")
  public String createNewBasket() {
    tapasEaterPresenter.createNewBasket();
    return "a new basket has been created";
  }

  @ShellMethod("list Tapas orders")
  @ShellMethodAvailability("canDoBasketInteractions")
  public String listTapasOrders() {
    final String header = "Tapas orders:" + System.lineSeparator() + "id: amount:";
    final String overview = tapasEaterPresenter.retrieveListOfAllTapasOrdersInBasket()
        .stream().map(tapasOrder -> String.format("%s: %s", tapasOrder.getTapasId(), tapasOrder.getAmount()))
        .collect(Collectors.joining(System.lineSeparator()));

    return header + System.lineSeparator() + overview;
  }

  @ShellMethod("add new Tapas to the basket")
  @ShellMethodAvailability("canDoBasketInteractions")
  public String addNewTapasOrder(String tapasId, @Min(1) int amount) {
    tapasEaterPresenter.addNewTapasOrderToBasket(tapasId, amount);
    return "new Tapas added to the basket";
  }

  @ShellMethod("calculate total cost for all the Tapas in the basket")
  @ShellMethodAvailability("canDoBasketInteractions")
  public String calculateTotalCost() {
    return "Total cost: " + NumberFormat.getCurrencyInstance().format(tapasEaterPresenter.calculateCostForBasket());
  }

  public Availability canCreateNewBasket() {
    if (!tapasEaterPresenter.basketIsSelected()) {
      return Availability.available();
    } else {
      return Availability.unavailable("a basket is already available");
    }
  }

  public Availability canDoBasketInteractions() {
    if (tapasEaterPresenter.basketIsSelected()) {
      return Availability.available();
    } else {
      return Availability.unavailable("a new basket has to be created first");
    }
  }
}
