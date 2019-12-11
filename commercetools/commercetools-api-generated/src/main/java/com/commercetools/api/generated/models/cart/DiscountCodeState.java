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
public enum DiscountCodeState {

  
  @JsonProperty("NotActive")
  NOT_ACTIVE("NotActive"),
  
  
  @JsonProperty("DoesNotMatchCart")
  DOES_NOT_MATCH_CART("DoesNotMatchCart"),
  
  
  @JsonProperty("MatchesCart")
  MATCHES_CART("MatchesCart"),
  
  
  @JsonProperty("MaxApplicationReached")
  MAX_APPLICATION_REACHED("MaxApplicationReached"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private DiscountCodeState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<DiscountCodeState> findEnumViaJsonName(String jsonName) {
    Optional<DiscountCodeState> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}