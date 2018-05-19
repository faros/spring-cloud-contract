package be.faros.testing.tapasapp.catalogue.domain.internal.usecases.impl;

import be.faros.testing.tapasapp.catalogue.domain.usecases.CatalogueSearching;
import be.faros.testing.tapasapp.catalogue.domain.usecases.dto.Tapas;
import be.faros.testing.tapasapp.catalogue.domain.internal.service.CatalogueService;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CatalogueSearchingImpl implements CatalogueSearching {

  private final CatalogueService catalogueService;

  public CatalogueSearchingImpl(CatalogueService catalogueService) {
    this.catalogueService = catalogueService;
  }

  @Override
  public List<Tapas> getAllTapas() {
    return catalogueService.getAllTapas();
  }

  @Override
  public Tapas getTapas(String tapasId) {
    return catalogueService.getTapas(tapasId);
  }

}
