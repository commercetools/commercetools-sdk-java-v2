package com.commercetools.models.Common;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ReferenceTypeId {

  
  @JsonProperty("cart")
  CART("cart"),
  
  
  @JsonProperty("cart-discount")
  CART_DISCOUNT("cart-discount"),
  
  
  @JsonProperty("category")
  CATEGORY("category"),
  
  
  @JsonProperty("channel")
  CHANNEL("channel"),
  
  
  @JsonProperty("customer")
  CUSTOMER("customer"),
  
  
  @JsonProperty("customer-group")
  CUSTOMER_GROUP("customer-group"),
  
  
  @JsonProperty("discount-code")
  DISCOUNT_CODE("discount-code"),
  
  
  @JsonProperty("key-value-document")
  KEY_VALUE_DOCUMENT("key-value-document"),
  
  
  @JsonProperty("payment")
  PAYMENT("payment"),
  
  
  @JsonProperty("product")
  PRODUCT("product"),
  
  
  @JsonProperty("product-type")
  PRODUCT_TYPE("product-type"),
  
  
  @JsonProperty("product-discount")
  PRODUCT_DISCOUNT("product-discount"),
  
  
  @JsonProperty("order")
  ORDER("order"),
  
  
  @JsonProperty("review")
  REVIEW("review"),
  
  
  @JsonProperty("shopping-list")
  SHOPPING_LIST("shopping-list"),
  
  
  @JsonProperty("shipping-method")
  SHIPPING_METHOD("shipping-method"),
  
  
  @JsonProperty("state")
  STATE("state"),
  
  
  @JsonProperty("store")
  STORE("store"),
  
  
  @JsonProperty("tax-category")
  TAX_CATEGORY("tax-category"),
  
  
  @JsonProperty("type")
  TYPE("type"),
  
  
  @JsonProperty("zone")
  ZONE("zone"),
  
  
  @JsonProperty("inventory-entry")
  INVENTORY_ENTRY("inventory-entry"),
  
  
  @JsonProperty("order-edit")
  ORDER_EDIT("order-edit");

  private final String jsonName;

  private ReferenceTypeId(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ReferenceTypeId> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}