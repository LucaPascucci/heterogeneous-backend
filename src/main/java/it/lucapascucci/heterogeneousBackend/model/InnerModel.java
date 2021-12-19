package it.lucapascucci.heterogeneousBackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class InnerModel {

  private Long innerId;
  private String innerName;

}
