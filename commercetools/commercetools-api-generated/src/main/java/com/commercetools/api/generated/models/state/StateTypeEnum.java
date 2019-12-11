package com.commercetools.api.generated.models.state;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum StateTypeEnum {

  
  @JsonProperty("OrderState")
  ORDER_STATE("OrderState"),
  
  
  @JsonProperty("LineItemState")
  LINE_ITEM_STATE("LineItemState"),
  
  
  @JsonProperty("ProductState")
  PRODUCT_STATE("ProductState"),
  
  
  @JsonProperty("ReviewState")
  REVIEW_STATE("ReviewState"),
  
  
  @JsonProperty("PaymentState")
  PAYMENT_STATE("PaymentState"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private StateTypeEnum(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<StateTypeEnum> findEnumViaJsonName(String jsonName) {
    Optional<StateTypeEnum> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}