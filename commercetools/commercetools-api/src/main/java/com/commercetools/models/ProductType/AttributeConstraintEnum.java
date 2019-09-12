package com.commercetools.models.ProductType;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum AttributeConstraintEnum {

  
  @JsonProperty("None")
  NONE("None"),
  
  
  @JsonProperty("Unique")
  UNIQUE("Unique"),
  
  
  @JsonProperty("CombinationUnique")
  COMBINATION_UNIQUE("CombinationUnique"),
  
  
  @JsonProperty("SameForAll")
  SAME_FOR_ALL("SameForAll");

  private final String jsonName;

  private AttributeConstraintEnum(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<AttributeConstraintEnum> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}