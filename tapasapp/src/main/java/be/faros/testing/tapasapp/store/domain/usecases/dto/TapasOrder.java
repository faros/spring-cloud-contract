package be.faros.testing.tapasapp.store.domain.usecases.dto;

public class TapasOrder {

  private final String tapasId;
  private final long amount;

  public TapasOrder(String tapasId, long amount) {
    if(tapasId == null || tapasId.isEmpty()) {
      throw new IllegalArgumentException("A tapas ID is required");
    }

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
