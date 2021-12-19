package it.lucapascucci.heterogeneousBackend.rest.util;

import it.lucapascucci.heterogeneousBackend.model.MapStruct;
import it.lucapascucci.heterogeneousBackend.rest.data.MapStructDTO;
import it.lucapascucci.heterogeneousBackend.rest.util.mapper.MapStructMapper;

public class MapStructAssembler {

  private MapStructAssembler() {
  }

  public static MapStructDTO toDTO(MapStruct input) {
    MapStructDTO result = null;

    if (input != null) {
      result = MapStructMapper.INSTANCE.toDTO(input);
    }

    return result;
  }

  public static MapStruct fromDTO(MapStructDTO input) {
    MapStruct result = null;

    if (input != null) {
      result = MapStructMapper.INSTANCE.fromDTO(input);
    }

    return result;
  }
}
