package com.commercetools.models.cart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ShippingMethodState {

  
  @JsonProperty("DoesNotMatchCart")
  DOES_NOT_MATCH_CART("DoesNotMatchCart"),
  
  
  @JsonProperty("MatchesCart")
  MATCHES_CART("MatchesCart");

  private final String jsonName;

  private ShippingMethodState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ShippingMethodState> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}