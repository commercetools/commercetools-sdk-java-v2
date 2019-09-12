package com.commercetools.models.Type;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ResourceTypeId {

  
  @JsonProperty("asset")
  ASSET("asset"),
  
  
  @JsonProperty("category")
  CATEGORY("category"),
  
  
  @JsonProperty("channel")
  CHANNEL("channel"),
  
  
  @JsonProperty("customer")
  CUSTOMER("customer"),
  
  
  @JsonProperty("order")
  ORDER("order"),
  
  
  @JsonProperty("order-edit")
  ORDER_EDIT("order-edit"),
  
  
  @JsonProperty("inventory-entry")
  INVENTORY_ENTRY("inventory-entry"),
  
  
  @JsonProperty("line-item")
  LINE_ITEM("line-item"),
  
  
  @JsonProperty("custom-line-item")
  CUSTOM_LINE_ITEM("custom-line-item"),
  
  
  @JsonProperty("product-price")
  PRODUCT_PRICE("product-price"),
  
  
  @JsonProperty("payment")
  PAYMENT("payment"),
  
  
  @JsonProperty("payment-interface-interaction")
  PAYMENT_INTERFACE_INTERACTION("payment-interface-interaction"),
  
  
  @JsonProperty("review")
  REVIEW("review"),
  
  
  @JsonProperty("shopping-list")
  SHOPPING_LIST("shopping-list"),
  
  
  @JsonProperty("shopping-list-text-line-item")
  SHOPPING_LIST_TEXT_LINE_ITEM("shopping-list-text-line-item"),
  
  
  @JsonProperty("discount-code")
  DISCOUNT_CODE("discount-code"),
  
  
  @JsonProperty("cart-discount")
  CART_DISCOUNT("cart-discount"),
  
  
  @JsonProperty("customer-group")
  CUSTOMER_GROUP("customer-group");

  private final String jsonName;

  private ResourceTypeId(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ResourceTypeId> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}