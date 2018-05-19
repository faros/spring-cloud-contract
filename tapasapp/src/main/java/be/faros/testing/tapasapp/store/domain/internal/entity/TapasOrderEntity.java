package be.faros.testing.tapasapp.store.domain.internal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TapasOrderEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column
  private String tapasId;
  @Column
  private long amount;
  @ManyToOne
  @JoinColumn(name = "basket_id", nullable = false)
  private BasketEntity basket;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTapasId() {
    return tapasId;
  }

  public void setTapasId(String tapasId) {
    this.tapasId = tapasId;
  }

  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }

  public BasketEntity getBasket() {
    return basket;
  }

  public void setBasket(BasketEntity basket) {
    this.basket = basket;
  }
}
