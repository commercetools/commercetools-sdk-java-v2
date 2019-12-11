package com.commercetools.api.generated.models.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


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
  CANCELLED("Cancelled"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private OrderState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<OrderState> findEnumViaJsonName(String jsonName) {
    Optional<OrderState> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}