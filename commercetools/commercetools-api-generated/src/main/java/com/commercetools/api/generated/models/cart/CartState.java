package com.commercetools.api.generated.models.cart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum CartState {

  
  @JsonProperty("Active")
  ACTIVE("Active"),
  
  
  @JsonProperty("Merged")
  MERGED("Merged"),
  
  
  @JsonProperty("Ordered")
  ORDERED("Ordered"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private CartState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<CartState> findEnumViaJsonName(String jsonName) {
    Optional<CartState> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}