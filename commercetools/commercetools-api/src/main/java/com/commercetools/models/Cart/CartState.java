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
public enum CartState {

  
  @JsonProperty("Active")
  ACTIVE("Active"),
  
  
  @JsonProperty("Merged")
  MERGED("Merged"),
  
  
  @JsonProperty("Ordered")
  ORDERED("Ordered");

  private final String jsonName;

  private CartState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<CartState> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}