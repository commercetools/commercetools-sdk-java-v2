
package com.commercetools.api.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ReferenceTypeId {

    ReferenceTypeId CART = ReferenceTypeIdEnum.CART;

    ReferenceTypeId CART_DISCOUNT = ReferenceTypeIdEnum.CART_DISCOUNT;

    ReferenceTypeId CATEGORY = ReferenceTypeIdEnum.CATEGORY;

    ReferenceTypeId CHANNEL = ReferenceTypeIdEnum.CHANNEL;

    ReferenceTypeId CUSTOMER = ReferenceTypeIdEnum.CUSTOMER;

    ReferenceTypeId CUSTOMER_EMAIL_TOKEN = ReferenceTypeIdEnum.CUSTOMER_EMAIL_TOKEN;

    ReferenceTypeId CUSTOMER_GROUP = ReferenceTypeIdEnum.CUSTOMER_GROUP;

    ReferenceTypeId CUSTOMER_PASSWORD_TOKEN = ReferenceTypeIdEnum.CUSTOMER_PASSWORD_TOKEN;

    ReferenceTypeId DISCOUNT_CODE = ReferenceTypeIdEnum.DISCOUNT_CODE;

    ReferenceTypeId EXTENSION = ReferenceTypeIdEnum.EXTENSION;

    ReferenceTypeId INVENTORY_ENTRY = ReferenceTypeIdEnum.INVENTORY_ENTRY;

    ReferenceTypeId KEY_VALUE_DOCUMENT = ReferenceTypeIdEnum.KEY_VALUE_DOCUMENT;

    ReferenceTypeId ORDER = ReferenceTypeIdEnum.ORDER;

    ReferenceTypeId ORDER_EDIT = ReferenceTypeIdEnum.ORDER_EDIT;

    ReferenceTypeId PAYMENT = ReferenceTypeIdEnum.PAYMENT;

    ReferenceTypeId PRODUCT = ReferenceTypeIdEnum.PRODUCT;

    ReferenceTypeId PRODUCT_DISCOUNT = ReferenceTypeIdEnum.PRODUCT_DISCOUNT;

    ReferenceTypeId PRODUCT_TYPE = ReferenceTypeIdEnum.PRODUCT_TYPE;

    ReferenceTypeId REVIEW = ReferenceTypeIdEnum.REVIEW;

    ReferenceTypeId SHIPPING_METHOD = ReferenceTypeIdEnum.SHIPPING_METHOD;

    ReferenceTypeId SHOPPING_LIST = ReferenceTypeIdEnum.SHOPPING_LIST;

    ReferenceTypeId STATE = ReferenceTypeIdEnum.STATE;

    ReferenceTypeId STORE = ReferenceTypeIdEnum.STORE;

    ReferenceTypeId SUBSCRIPTION = ReferenceTypeIdEnum.SUBSCRIPTION;

    ReferenceTypeId TAX_CATEGORY = ReferenceTypeIdEnum.TAX_CATEGORY;

    ReferenceTypeId TYPE = ReferenceTypeIdEnum.TYPE;

    ReferenceTypeId ZONE = ReferenceTypeIdEnum.ZONE;

    enum ReferenceTypeIdEnum implements ReferenceTypeId {
        CART("cart"),

        CART_DISCOUNT("cart-discount"),

        CATEGORY("category"),

        CHANNEL("channel"),

        CUSTOMER("customer"),

        CUSTOMER_EMAIL_TOKEN("customer-email-token"),

        CUSTOMER_GROUP("customer-group"),

        CUSTOMER_PASSWORD_TOKEN("customer-password-token"),

        DISCOUNT_CODE("discount-code"),

        EXTENSION("extension"),

        INVENTORY_ENTRY("inventory-entry"),

        KEY_VALUE_DOCUMENT("key-value-document"),

        ORDER("order"),

        ORDER_EDIT("order-edit"),

        PAYMENT("payment"),

        PRODUCT("product"),

        PRODUCT_DISCOUNT("product-discount"),

        PRODUCT_TYPE("product-type"),

        REVIEW("review"),

        SHIPPING_METHOD("shipping-method"),

        SHOPPING_LIST("shopping-list"),

        STATE("state"),

        STORE("store"),

        SUBSCRIPTION("subscription"),

        TAX_CATEGORY("tax-category"),

        TYPE("type"),

        ZONE("zone");
        private final String jsonName;

        private ReferenceTypeIdEnum(final String jsonName) {
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
    public static ReferenceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ReferenceTypeId() {
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

    public static Optional<ReferenceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ReferenceTypeId[] values() {
        return ReferenceTypeIdEnum.values();
    }
}
