package com.commercetools.models.ShippingMethod;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ShippingRateTierType {

  
  @JsonProperty("CartValue")
  CART_VALUE("CartValue"),
  
  
  @JsonProperty("CartClassification")
  CART_CLASSIFICATION("CartClassification"),
  
  
  @JsonProperty("CartScore")
  CART_SCORE("CartScore");

  private final String jsonName;

  private ShippingRateTierType(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ShippingRateTierType> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}