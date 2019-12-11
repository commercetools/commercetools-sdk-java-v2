package com.commercetools.api.generated.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.vrap.rmf.base.client.utils.Generated;

import java.util.Arrays;
import java.util.Optional;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum TransactionState {

  
  @JsonProperty("Initial")
  INITIAL("Initial"),
  
  
  @JsonProperty("Pending")
  PENDING("Pending"),
  
  
  @JsonProperty("Success")
  SUCCESS("Success"),
  
  
  @JsonProperty("Failure")
  FAILURE("Failure"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private TransactionState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<TransactionState> findEnumViaJsonName(String jsonName) {
    Optional<TransactionState> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}