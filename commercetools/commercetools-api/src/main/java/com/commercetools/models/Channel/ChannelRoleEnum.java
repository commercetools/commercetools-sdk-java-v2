package com.commercetools.models.Channel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ChannelRoleEnum {

  
  @JsonProperty("InventorySupply")
  INVENTORY_SUPPLY("InventorySupply"),
  
  
  @JsonProperty("ProductDistribution")
  PRODUCT_DISTRIBUTION("ProductDistribution"),
  
  
  @JsonProperty("OrderExport")
  ORDER_EXPORT("OrderExport"),
  
  
  @JsonProperty("OrderImport")
  ORDER_IMPORT("OrderImport"),
  
  
  @JsonProperty("Primary")
  PRIMARY("Primary");

  private final String jsonName;

  private ChannelRoleEnum(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ChannelRoleEnum> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}