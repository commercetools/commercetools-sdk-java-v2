package com.commercetools.importapi.models.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The type of the referenced resource.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ReferenceType {

    /**
    	<p>References a cart discount.</p>

    */
    @JsonProperty("cart-discount")
    CART_DISCOUNT("cart-discount"),

    /**
    	<p>References a category.</p>

    */
    @JsonProperty("category")
    CATEGORY("category"),

    /**
    	<p>References a channel.</p>

    */
    @JsonProperty("channel")
    CHANNEL("channel"),

    /**
    	<p>References a customer.</p>

    */
    @JsonProperty("customer")
    CUSTOMER("customer"),

    /**
    	<p>References a customer group.</p>

    */
    @JsonProperty("customer-group")
    CUSTOMER_GROUP("customer-group"),

    /**
    	<p>References a price.</p>

    */
    @JsonProperty("price")
    PRICE("price"),

    /**
    	<p>References a product.</p>

    */
    @JsonProperty("product")
    PRODUCT("product"),


    @JsonProperty("product-discount")
    PRODUCT_DISCOUNT("product-discount"),

    /**
    	<p>References a product type.</p>

    */
    @JsonProperty("product-type")
    PRODUCT_TYPE("product-type"),

    /**
    	<p>References a product variant.</p>

    */
    @JsonProperty("product-variant")
    PRODUCT_VARIANT("product-variant"),

    /**
    	<p>References a shipping method.</p>

    */
    @JsonProperty("shipping-method")
    SHIPPING_METHOD("shipping-method"),

    /**
    	<p>References a state.</p>

    */
    @JsonProperty("state")
    STATE("state"),

    /**
    	<p>References a store.</p>

    */
    @JsonProperty("store")
    STORE("store"),

    /**
    	<p>References a tax-category.</p>

    */
    @JsonProperty("tax-category")
    TAX_CATEGORY("tax-category"),

    /**
    	<p>References a type.</p>

    */
    @JsonProperty("type")
    TYPE("type");

    private final String jsonName;

    private ReferenceType(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<ReferenceType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}
