package it.lucapascucci.heterogeneousBackend.service;

import it.lucapascucci.heterogeneousBackend.model.Color;
import it.lucapascucci.heterogeneousBackend.model.InnerModel;
import it.lucapascucci.heterogeneousBackend.model.MapStruct;
import it.lucapascucci.heterogeneousBackend.model.Result;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapStructService {

  public MapStruct getMapStruct() {

    MapStruct result = null;

    List<String> values = Arrays.asList("Io", "sono", "una", "lista");

    InnerModel inner = new InnerModel(10L, "Sono un oggetto interno");

    result = new MapStruct(
        "Pascu",
        1L,
        Instant.now(),
        LocalDate.now(),
        Color.BLACK,
        Result.WIN,
        values,
        inner,
        Collections.singletonList(inner)
    );

    return result;
  }

}
