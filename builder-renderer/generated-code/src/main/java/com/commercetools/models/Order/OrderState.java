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
public enum OrderState {

  
  @JsonProperty("Open")
  OPEN("Open"),
  
  
  @JsonProperty("Confirmed")
  CONFIRMED("Confirmed"),
  
  
  @JsonProperty("Complete")
  COMPLETE("Complete"),
  
  
  @JsonProperty("Cancelled")
  CANCELLED("Cancelled");

  private final String jsonName;

  private OrderState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<OrderState> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}