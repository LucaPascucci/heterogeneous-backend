package it.lucapascucci.heterogeneousBackend.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProjectLombokTest {

  private String stringProperty;
  private Long longProperty;
  private Instant instantProperty;
  private LocalDate localDateProperty;
  private LocalTime localTimeProperty;
  private Color colorEnumProperty;
  private List<String> listProperty;
  private InnerModel innerModelProperty;
  private List<InnerModel> innerModelListProperty;

}
