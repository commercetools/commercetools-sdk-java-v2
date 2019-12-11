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
public enum TaxMode {

  
  @JsonProperty("Platform")
  PLATFORM("Platform"),
  
  
  @JsonProperty("External")
  EXTERNAL("External"),
  
  
  @JsonProperty("ExternalAmount")
  EXTERNAL_AMOUNT("ExternalAmount"),
  
  
  @JsonProperty("Disabled")
  DISABLED("Disabled"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private TaxMode(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<TaxMode> findEnumViaJsonName(String jsonName) {
    Optional<TaxMode> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}