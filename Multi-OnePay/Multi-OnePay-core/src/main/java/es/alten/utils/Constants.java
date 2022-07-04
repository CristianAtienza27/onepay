package es.alten.utils;

import lombok.Data;

@Data
public class Constants {

  private Constants() {
    throw new IllegalStateException("Constants class");
  }

  public static final int PAGES_PER_PAGINATION_BAR = 5;
  public static final Long ANONYMOUS_USER = -1L;
}
