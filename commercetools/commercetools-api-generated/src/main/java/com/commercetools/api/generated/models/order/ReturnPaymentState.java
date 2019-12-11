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
public enum ReturnPaymentState {

  
  @JsonProperty("NonRefundable")
  NON_REFUNDABLE("NonRefundable"),
  
  
  @JsonProperty("Initial")
  INITIAL("Initial"),
  
  
  @JsonProperty("Refunded")
  REFUNDED("Refunded"),
  
  
  @JsonProperty("NotRefunded")
  NOT_REFUNDED("NotRefunded"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private ReturnPaymentState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ReturnPaymentState> findEnumViaJsonName(String jsonName) {
    Optional<ReturnPaymentState> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}