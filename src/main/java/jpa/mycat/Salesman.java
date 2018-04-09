package jpa.mycat;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by zxing on 17-1-5.
 */
@Entity
@Table(name = "salesman")
public class Salesman {
  @Id
  @GenericGenerator(name = "idgen", strategy = "increment")
  @GeneratedValue(generator = "idgen")
  @Column(name = "id")
  private Long id;//业务员ID

  private String name;//工号

  public Salesman() {
  }

  public Salesman(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Salesman{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
