package be.faros.testing.tapasapp.catalogue.domain.usecases;

import be.faros.testing.tapasapp.catalogue.domain.usecases.dto.Tapas;
import java.util.List;

public interface CatalogueSearching {

  List<Tapas> getAllTapas();

  Tapas getTapas(String tapasId);

}
