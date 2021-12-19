package it.lucapascucci.heterogeneousBackend.rest.data;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MapStructDTO {

  private String mapStructString;
  private Long mapStructLong;
  private String mapStructInstant;
  private String mapStructLocalDate;
  private String mapStructColorEnum;
  private Long mapStructResultEnumId;
  private List<String> mapStructList;
  private MapStructInnerDTO mapStructInner;
  private List<MapStructInnerDTO> mapStructInnerList;
}
