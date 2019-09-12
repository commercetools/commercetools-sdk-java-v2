package com.commercetools.models.Cart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum InventoryMode {

  
  @JsonProperty("TrackOnly")
  TRACK_ONLY("TrackOnly"),
  
  
  @JsonProperty("ReserveOnOrder")
  RESERVE_ON_ORDER("ReserveOnOrder"),
  
  
  @JsonProperty("None")
  NONE("None");

  private final String jsonName;

  private InventoryMode(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<InventoryMode> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}