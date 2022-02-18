
package com.commercetools.api.models.type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Defines which resource type a <a href="ctp:api:type:CustomFieldReferenceType">CustomFieldReferenceType</a> can reference.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CustomFieldReferenceValue {

    /**
    	<p><a href="ctp:api:type:Cart">Cart</a></p>

    */
    CustomFieldReferenceValue CART = CustomFieldReferenceValueEnum.CART;
    /**
    	<p><a href="ctp:api:type:Category">Category</a></p>

    */
    CustomFieldReferenceValue CATEGORY = CustomFieldReferenceValueEnum.CATEGORY;
    /**
    	<p><a href="ctp:api:type:Channel">Channel</a></p>

    */
    CustomFieldReferenceValue CHANNEL = CustomFieldReferenceValueEnum.CHANNEL;
    /**
    	<p><a href="ctp:api:type:Customer">Customer</a></p>

    */
    CustomFieldReferenceValue CUSTOMER = CustomFieldReferenceValueEnum.CUSTOMER;
    /**
    	<p><a href="ctp:api:type:CustomObject">CustomObject</a></p>

    */
    CustomFieldReferenceValue KEY_VALUE_DOCUMENT = CustomFieldReferenceValueEnum.KEY_VALUE_DOCUMENT;
    /**
    	<p><a href="ctp:api:type:Order">Order</a></p>

    */
    CustomFieldReferenceValue ORDER = CustomFieldReferenceValueEnum.ORDER;
    /**
    	<p><a href="ctp:api:type:Product">Product</a></p>

    */
    CustomFieldReferenceValue PRODUCT = CustomFieldReferenceValueEnum.PRODUCT;
    /**
    	<p><a href="ctp:api:type:ProductType">ProductType</a></p>

    */
    CustomFieldReferenceValue PRODUCT_TYPE = CustomFieldReferenceValueEnum.PRODUCT_TYPE;
    /**
    	<p><a href="ctp:api:type:Review">Review</a></p>

    */
    CustomFieldReferenceValue REVIEW = CustomFieldReferenceValueEnum.REVIEW;
    /**
    	<p><a href="ctp:api:type:State">State</a></p>

    */
    CustomFieldReferenceValue STATE = CustomFieldReferenceValueEnum.STATE;
    /**
    	<p><a href="ctp:api:type:ShippingMethod">ShippingMethod</a></p>

    */
    CustomFieldReferenceValue SHIPPING_METHOD = CustomFieldReferenceValueEnum.SHIPPING_METHOD;
    /**
    	<p><a href="ctp:api:type:Zone">Zone</a></p>

    */
    CustomFieldReferenceValue ZONE = CustomFieldReferenceValueEnum.ZONE;

    enum CustomFieldReferenceValueEnum implements CustomFieldReferenceValue {
        CART("cart"),

        CATEGORY("category"),

        CHANNEL("channel"),

        CUSTOMER("customer"),

        KEY_VALUE_DOCUMENT("key-value-document"),

        ORDER("order"),

        PRODUCT("product"),

        PRODUCT_TYPE("product-type"),

        REVIEW("review"),

        STATE("state"),

        SHIPPING_METHOD("shipping-method"),

        ZONE("zone");
        private final String jsonName;

        private CustomFieldReferenceValueEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static CustomFieldReferenceValue findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new CustomFieldReferenceValue() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<CustomFieldReferenceValue> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static CustomFieldReferenceValue[] values() {
        return CustomFieldReferenceValueEnum.values();
    }
}
