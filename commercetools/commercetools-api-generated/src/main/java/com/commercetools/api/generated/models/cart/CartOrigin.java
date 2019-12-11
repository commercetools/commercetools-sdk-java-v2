package com.commercetools.api.generated.models.cart;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.vrap.rmf.base.client.utils.Generated;

import java.util.Arrays;
import java.util.Optional;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum CartOrigin {

  
  @JsonProperty("Customer")
  CUSTOMER("Customer"),
  
  
  @JsonProperty("Merchant")
  MERCHANT("Merchant"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private CartOrigin(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<CartOrigin> findEnumViaJsonName(String jsonName) {
    Optional<CartOrigin> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}