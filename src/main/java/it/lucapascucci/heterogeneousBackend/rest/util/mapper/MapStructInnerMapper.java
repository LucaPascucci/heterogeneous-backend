package it.lucapascucci.heterogeneousBackend.rest.util.mapper;

import it.lucapascucci.heterogeneousBackend.model.InnerModel;
import it.lucapascucci.heterogeneousBackend.rest.data.MapStructInnerDTO;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructInnerMapper {

  MapStructInnerMapper INSTANCE = Mappers.getMapper(MapStructInnerMapper.class);

  MapStructInnerDTO toDTO(InnerModel input);

  InnerModel fromDTO(MapStructInnerDTO input);

  List<MapStructInnerDTO> toDTOs(List<InnerModel> input);

  List<InnerModel> fromDTOS(List<MapStructInnerDTO> input);
}
