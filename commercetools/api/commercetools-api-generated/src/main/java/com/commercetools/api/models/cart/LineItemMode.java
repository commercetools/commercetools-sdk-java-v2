package com.commercetools.api.models.cart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum LineItemMode {

  
  @JsonProperty("Standard")
  STANDARD("Standard"),
  
  
  @JsonProperty("GiftLineItem")
  GIFT_LINE_ITEM("GiftLineItem");

  private final String jsonName;

  private LineItemMode(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<LineItemMode> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}
