package com.commercetools.models.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ShipmentState {

  
  @JsonProperty("Shipped")
  SHIPPED("Shipped"),
  
  
  @JsonProperty("Ready")
  READY("Ready"),
  
  
  @JsonProperty("Pending")
  PENDING("Pending"),
  
  
  @JsonProperty("Delayed")
  DELAYED("Delayed"),
  
  
  @JsonProperty("Partial")
  PARTIAL("Partial"),
  
  
  @JsonProperty("Backorder")
  BACKORDER("Backorder");

  private final String jsonName;

  private ShipmentState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ShipmentState> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}