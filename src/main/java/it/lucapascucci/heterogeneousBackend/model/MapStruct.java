package it.lucapascucci.heterogeneousBackend.model;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class MapStruct {

  private String mapStructString;
  private Long mapStructLong;
  private Instant mapStructInstant;
  private LocalDate mapStructLocalDate;
  private Color mapStructColorEnum;
  private Result mapStructResultEnum;
  private List<String> mapStructList;
  private InnerModel innerModel;
  private List<InnerModel> innerModelList;
}
