package com.commercetools.models.Order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum PaymentState {

  
  @JsonProperty("BalanceDue")
  BALANCE_DUE("BalanceDue"),
  
  
  @JsonProperty("Failed")
  FAILED("Failed"),
  
  
  @JsonProperty("Pending")
  PENDING("Pending"),
  
  
  @JsonProperty("CreditOwed")
  CREDIT_OWED("CreditOwed"),
  
  
  @JsonProperty("Paid")
  PAID("Paid");

  private final String jsonName;

  private PaymentState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<PaymentState> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}