package be.faros.testing.tapasapp.catalogue.domain.usecases.dto;

import java.math.BigDecimal;

public class Tapas {

  private String id;
  private String name;
  private BigDecimal price;

  public Tapas(String id, String name, BigDecimal price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }
}
