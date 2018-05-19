package be.faros.testing.tapasapp.store.domain.internal.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BasketEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @OneToMany(targetEntity=TapasOrderEntity.class, mappedBy="basket", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
  private List<TapasOrderEntity> tapasOrders = new ArrayList<>();

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<TapasOrderEntity> getTapasOrders() {
    return tapasOrders;
  }

  public void setTapasOrders(List<TapasOrderEntity> tapasOrders) {
    this.tapasOrders = tapasOrders;
  }

  public Optional<TapasOrderEntity> getTapasOrder(String tapasId) {
    return tapasOrders.stream().filter(t -> tapasId.equals(t.getTapasId())).findFirst();
  }
}
