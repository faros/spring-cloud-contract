package be.faros.testing.tapasapp.catalogue.domain.internal.service;

import be.faros.testing.tapasapp.catalogue.domain.usecases.dto.Tapas;
import java.util.List;

public interface CatalogueService {

  List<Tapas> getAllTapas();

  Tapas getTapas(String tapasId);

}
