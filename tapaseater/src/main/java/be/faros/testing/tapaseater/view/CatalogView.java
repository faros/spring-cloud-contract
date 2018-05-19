package be.faros.testing.tapaseater.view;

import be.faros.testing.tapaseater.presenter.TapasEaterPresenter;
import java.text.NumberFormat;
import java.util.stream.Collectors;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CatalogView {

  private TapasEaterPresenter tapasEaterPresenter;

  public CatalogView(TapasEaterPresenter tapasEaterPresenter) {
    this.tapasEaterPresenter = tapasEaterPresenter;
  }

  @ShellMethod("Catalogue of available Tapas")
  public String catalogue() {
    final String header = "Available Tapas:" + System.lineSeparator();

    final String tapasOverview = tapasEaterPresenter.listAvailableTapas()
        .stream()
        .map(tapas -> String.format("[%s] %s €%s", tapas.getId(), tapas.getName(), NumberFormat.getCurrencyInstance().format(tapas.getPrice())))
        .collect(Collectors.joining(System.lineSeparator()));

    return header + tapasOverview;
  }

}
