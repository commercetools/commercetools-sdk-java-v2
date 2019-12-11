package com.commercetools.api.generated.models.channel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


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
  PRIMARY("Primary"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private ChannelRoleEnum(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ChannelRoleEnum> findEnumViaJsonName(String jsonName) {
    Optional<ChannelRoleEnum> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}