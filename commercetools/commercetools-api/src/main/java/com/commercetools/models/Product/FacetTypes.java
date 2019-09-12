package com.commercetools.models.Product;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum FacetTypes {

  
  @JsonProperty("terms")
  TERMS("terms"),
  
  
  @JsonProperty("range")
  RANGE("range"),
  
  
  @JsonProperty("filter")
  FILTER("filter");

  private final String jsonName;

  private FacetTypes(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<FacetTypes> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}