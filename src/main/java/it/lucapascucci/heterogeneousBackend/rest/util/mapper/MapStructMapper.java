package it.lucapascucci.heterogeneousBackend.rest.util.mapper;

import it.lucapascucci.heterogeneousBackend.model.MapStruct;
import it.lucapascucci.heterogeneousBackend.model.Result;
import it.lucapascucci.heterogeneousBackend.rest.data.MapStructDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructMapper {

  MapStructMapper INSTANCE = Mappers.getMapper(MapStructMapper.class);

  @Mapping(target = "mapStructResultEnumId", source = "mapStructResultEnum.id")
  MapStructDTO toDTO(MapStruct input);

  @Mapping(target = "mapStructResultEnum", source = "mapStructResultEnumId")
  MapStruct fromDTO(MapStructDTO input);


  default Result map(Long id) {
    return Result.getResultFromId(id);
  }
}
