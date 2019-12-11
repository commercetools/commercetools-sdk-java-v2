package com.commercetools.api.generated.models.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum AnonymousCartSignInMode {

  
  @JsonProperty("MergeWithExistingCustomerCart")
  MERGE_WITH_EXISTING_CUSTOMER_CART("MergeWithExistingCustomerCart"),
  
  
  @JsonProperty("UseAsNewActiveCustomerCart")
  USE_AS_NEW_ACTIVE_CUSTOMER_CART("UseAsNewActiveCustomerCart"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private AnonymousCartSignInMode(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<AnonymousCartSignInMode> findEnumViaJsonName(String jsonName) {
    Optional<AnonymousCartSignInMode> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}