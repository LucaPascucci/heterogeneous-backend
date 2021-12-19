package it.lucapascucci.heterogeneousBackend.model;

import lombok.Getter;

public enum Result {
  WIN(0L),
  LOSE(1L),
  DRAFT(2L);

  @Getter
  private final Long id;

  Result(Long id) {
    this.id = id;
  }

  public static Result getResultFromId(Long id) {
    for (Result e : values()) {
      if (e.id.equals(id)) {
        return e;
      }
    }
    return null;
  }
}
