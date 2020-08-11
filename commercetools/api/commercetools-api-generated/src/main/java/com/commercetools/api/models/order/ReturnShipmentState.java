package com.commercetools.api.models.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ReturnShipmentState {


  @JsonProperty("Advised")
  ADVISED("Advised"),


  @JsonProperty("Returned")
  RETURNED("Returned"),


  @JsonProperty("BackInStock")
  BACK_IN_STOCK("BackInStock"),


  @JsonProperty("Unusable")
  UNUSABLE("Unusable");

  private final String jsonName;

  private ReturnShipmentState(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ReturnShipmentState> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}
