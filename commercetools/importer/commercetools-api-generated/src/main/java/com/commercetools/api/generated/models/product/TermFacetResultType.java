package com.commercetools.api.generated.models.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum TermFacetResultType {

  
  @JsonProperty("text")
  TEXT("text"),
  
  
  @JsonProperty("date")
  DATE("date"),
  
  
  @JsonProperty("time")
  TIME("time"),
  
  
  @JsonProperty("datetime")
  DATETIME("datetime"),
  
  
  @JsonProperty("boolean")
  BOOLEAN("boolean"),
  
  
  @JsonProperty("number")
  NUMBER("number");

  private final String jsonName;

  private TermFacetResultType(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<TermFacetResultType> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}