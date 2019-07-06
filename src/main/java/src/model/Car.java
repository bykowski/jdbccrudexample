package src.model;

import java.sql.Date;

public class Car {

  private long id;
  private String color;
  private java.sql.Date prodYear;
  private String mark;

  public Car(long id, String color, Date prodYear, String mark) {
    this.id = id;
    this.color = color;
    this.prodYear = prodYear;
    this.mark = mark;
  }

  public Car() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public java.sql.Date getProdYear() {
    return prodYear;
  }

  public void setProdYear(java.sql.Date prodYear) {
    this.prodYear = prodYear;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  @Override
  public String toString() {
    return "Car{" +
            "id=" + id +
            ", color='" + color + '\'' +
            ", prodYear=" + prodYear +
            ", mark='" + mark + '\'' +
            '}';
  }


}
