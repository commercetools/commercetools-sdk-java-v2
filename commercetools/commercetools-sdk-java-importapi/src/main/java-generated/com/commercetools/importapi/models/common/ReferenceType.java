
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The type of the referenced resource.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ReferenceType {

    /**
    	<p>References a cart discount.</p>

    */
    ReferenceType CART_DISCOUNT = ReferenceTypeEnum.CART_DISCOUNT;
    /**
    	<p>References a category.</p>

    */
    ReferenceType CATEGORY = ReferenceTypeEnum.CATEGORY;
    /**
    	<p>References a channel.</p>

    */
    ReferenceType CHANNEL = ReferenceTypeEnum.CHANNEL;
    /**
    	<p>References a customer.</p>

    */
    ReferenceType CUSTOMER = ReferenceTypeEnum.CUSTOMER;
    /**
    	<p>References a customer group.</p>

    */
    ReferenceType CUSTOMER_GROUP = ReferenceTypeEnum.CUSTOMER_GROUP;
    /**
    	<p>References a price.</p>

    */
    ReferenceType PRICE = ReferenceTypeEnum.PRICE;
    /**
    	<p>References a product.</p>

    */
    ReferenceType PRODUCT = ReferenceTypeEnum.PRODUCT;

    ReferenceType PRODUCT_DISCOUNT = ReferenceTypeEnum.PRODUCT_DISCOUNT;
    /**
    	<p>References a product type.</p>

    */
    ReferenceType PRODUCT_TYPE = ReferenceTypeEnum.PRODUCT_TYPE;
    /**
    	<p>References a product variant.</p>

    */
    ReferenceType PRODUCT_VARIANT = ReferenceTypeEnum.PRODUCT_VARIANT;
    /**
    	<p>References a shipping method.</p>

    */
    ReferenceType SHIPPING_METHOD = ReferenceTypeEnum.SHIPPING_METHOD;
    /**
    	<p>References a state.</p>

    */
    ReferenceType STATE = ReferenceTypeEnum.STATE;
    /**
    	<p>References a store.</p>

    */
    ReferenceType STORE = ReferenceTypeEnum.STORE;
    /**
    	<p>References a tax-category.</p>

    */
    ReferenceType TAX_CATEGORY = ReferenceTypeEnum.TAX_CATEGORY;
    /**
    	<p>References a type.</p>

    */
    ReferenceType TYPE = ReferenceTypeEnum.TYPE;

    enum ReferenceTypeEnum implements ReferenceType {
        CART_DISCOUNT("cart-discount"),

        CATEGORY("category"),

        CHANNEL("channel"),

        CUSTOMER("customer"),

        CUSTOMER_GROUP("customer-group"),

        PRICE("price"),

        PRODUCT("product"),

        PRODUCT_DISCOUNT("product-discount"),

        PRODUCT_TYPE("product-type"),

        PRODUCT_VARIANT("product-variant"),

        SHIPPING_METHOD("shipping-method"),

        STATE("state"),

        STORE("store"),

        TAX_CATEGORY("tax-category"),

        TYPE("type");
        private final String jsonName;

        private ReferenceTypeEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    @JsonCreator
    public static ReferenceType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ReferenceType() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }
        });
    }

    public static Optional<ReferenceType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ReferenceType[] values() {
        return ReferenceTypeEnum.values();
    }
}
