package be.faros.testing.tapaseater.gateway.dto;

public class TapasOrder {

  private final String tapasId;
  private final long amount;

  public TapasOrder(String tapasId, long amount) {
    this.tapasId = tapasId;
    this.amount = amount;
  }

  public String getTapasId() {
    return tapasId;
  }

  public long getAmount() {
    return amount;
  }
}