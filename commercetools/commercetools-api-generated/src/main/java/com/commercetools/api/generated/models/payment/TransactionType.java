package com.commercetools.api.generated.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum TransactionType {

  
  @JsonProperty("Authorization")
  AUTHORIZATION("Authorization"),
  
  
  @JsonProperty("CancelAuthorization")
  CANCEL_AUTHORIZATION("CancelAuthorization"),
  
  
  @JsonProperty("Charge")
  CHARGE("Charge"),
  
  
  @JsonProperty("Refund")
  REFUND("Refund"),
  
  
  @JsonProperty("Chargeback")
  CHARGEBACK("Chargeback"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private TransactionType(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<TransactionType> findEnumViaJsonName(String jsonName) {
    Optional<TransactionType> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}