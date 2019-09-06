package com.commercetools.models.Order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ReturnShipmentState {

  
  @JsonProperty("Advised")
  ADVISED("Advised"),
  
  
  @JsonProperty("Returned")
  RETURNED("Returned"),
  
  
  @JsonProperty("BackInStock")
  BACK_IN_STOCK("BackInStock"),
  
  
  @JsonProperty("Unusable")
  UNUSABLE("Unusable");

  private final String jsonName;

  private ReturnShipmentState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ReturnShipmentState> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}