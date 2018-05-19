package be.faros.testing.tapasapp.catalogue.domain.internal.service.impl;

import be.faros.testing.tapasapp.catalogue.domain.internal.service.CatalogueService;
import be.faros.testing.tapasapp.catalogue.domain.usecases.dto.Tapas;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CatalogueServiceImpl implements CatalogueService {

  final List<Tapas> tapasOverview = Arrays.asList(
      new Tapas("0", "All i oli", BigDecimal.valueOf(1.5)),
      new Tapas("1", "Banderillas", BigDecimal.valueOf(3)),
      new Tapas("2", "Calamares", BigDecimal.valueOf(3)),
      new Tapas("3", "Chopitos", BigDecimal.valueOf(3)),
      new Tapas("4", "Croquetas", BigDecimal.valueOf(3)),
      new Tapas("5", "Gambas", BigDecimal.valueOf(3)),
      new Tapas("6", "Patatas bravas", BigDecimal.valueOf(3)),
      new Tapas("7", "Tortilla de patatas", BigDecimal.valueOf(3)),
      new Tapas("8", "Tortilla paisana", BigDecimal.valueOf(3)),
      new Tapas("9", "Tortillitas de camarones", BigDecimal.valueOf(3))
  );

  @Override
  public List<Tapas> getAllTapas() {
    return tapasOverview;
  }

  @Override
  public Tapas getTapas(String tapasId) {
    return tapasOverview.stream().filter(t -> tapasId.equals(t.getId())).findFirst().orElseThrow(() -> new IllegalArgumentException("No Tapas found for given ID"));
  }

}
