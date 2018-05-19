package be.faros.testing.tapasapp.catalogue.controller;

import be.faros.testing.tapasapp.catalogue.domain.usecases.CatalogueSearching;
import be.faros.testing.tapasapp.catalogue.domain.usecases.dto.Tapas;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogueController {

  private final CatalogueSearching catalogueSearching;

  public CatalogueController(CatalogueSearching catalogueSearching) {
    this.catalogueSearching = catalogueSearching;
  }

  @RequestMapping("/tapas")
  public List<Tapas> findAllTapas() {
    return catalogueSearching.getAllTapas();
  }

  @RequestMapping("/tapas/{id}")
  public Tapas findTapas(@PathVariable("id") String id) {
    return catalogueSearching.getTapas(id);
  }
}
