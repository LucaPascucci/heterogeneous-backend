package it.lucapascucci.heterogeneousBackend.rest;

import it.lucapascucci.heterogeneousBackend.model.MapStruct;
import it.lucapascucci.heterogeneousBackend.rest.data.MapStructDTO;
import it.lucapascucci.heterogeneousBackend.rest.util.MapStructAssembler;
import it.lucapascucci.heterogeneousBackend.service.MapStructService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestAPI {

  private final MapStructService mapStructService = new MapStructService();

  @GetMapping("/map-struct-test")
  public MapStructDTO getMapStructTest() {
    MapStructDTO result = null;

    MapStruct data = mapStructService.getMapStruct();

    result = MapStructAssembler.toDTO(data);

    return result;
  }

  @PostMapping("/map-struct-test")
  public String postMapStructTest(@RequestBody MapStructDTO mapStruct) {

    String result = null;

    MapStruct data = MapStructAssembler.fromDTO(mapStruct);

    if (data != null) {
      result = data.toString();
    }

    return result;
  }

}
