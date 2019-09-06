package com.commercetools.models.CartDiscount;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum SelectionMode {

  
  @JsonProperty("Cheapest")
  CHEAPEST("Cheapest"),
  
  
  @JsonProperty("MostExpensive")
  MOST_EXPENSIVE("MostExpensive");

  private final String jsonName;

  private SelectionMode(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<SelectionMode> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}