
package com.commercetools.ml.models.common;

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

    ReferenceTypeId CUSTOMER_GROUP = ReferenceTypeIdEnum.CUSTOMER_GROUP;

    ReferenceTypeId DISCOUNT_CODE = ReferenceTypeIdEnum.DISCOUNT_CODE;

    ReferenceTypeId KEY_VALUE_DOCUMENT = ReferenceTypeIdEnum.KEY_VALUE_DOCUMENT;

    ReferenceTypeId PAYMENT = ReferenceTypeIdEnum.PAYMENT;

    ReferenceTypeId PRODUCT = ReferenceTypeIdEnum.PRODUCT;

    ReferenceTypeId PRODUCT_TYPE = ReferenceTypeIdEnum.PRODUCT_TYPE;

    ReferenceTypeId PRODUCT_DISCOUNT = ReferenceTypeIdEnum.PRODUCT_DISCOUNT;

    ReferenceTypeId ORDER = ReferenceTypeIdEnum.ORDER;

    ReferenceTypeId REVIEW = ReferenceTypeIdEnum.REVIEW;

    ReferenceTypeId SHOPPING_LIST = ReferenceTypeIdEnum.SHOPPING_LIST;

    ReferenceTypeId SHIPPING_METHOD = ReferenceTypeIdEnum.SHIPPING_METHOD;

    ReferenceTypeId STATE = ReferenceTypeIdEnum.STATE;

    ReferenceTypeId STORE = ReferenceTypeIdEnum.STORE;

    ReferenceTypeId TAX_CATEGORY = ReferenceTypeIdEnum.TAX_CATEGORY;

    ReferenceTypeId TYPE = ReferenceTypeIdEnum.TYPE;

    ReferenceTypeId ZONE = ReferenceTypeIdEnum.ZONE;

    ReferenceTypeId INVENTORY_ENTRY = ReferenceTypeIdEnum.INVENTORY_ENTRY;

    ReferenceTypeId ORDER_EDIT = ReferenceTypeIdEnum.ORDER_EDIT;

    enum ReferenceTypeIdEnum implements ReferenceTypeId {
        CART("cart"),

        CART_DISCOUNT("cart-discount"),

        CATEGORY("category"),

        CHANNEL("channel"),

        CUSTOMER("customer"),

        CUSTOMER_GROUP("customer-group"),

        DISCOUNT_CODE("discount-code"),

        KEY_VALUE_DOCUMENT("key-value-document"),

        PAYMENT("payment"),

        PRODUCT("product"),

        PRODUCT_TYPE("product-type"),

        PRODUCT_DISCOUNT("product-discount"),

        ORDER("order"),

        REVIEW("review"),

        SHOPPING_LIST("shopping-list"),

        SHIPPING_METHOD("shipping-method"),

        STATE("state"),

        STORE("store"),

        TAX_CATEGORY("tax-category"),

        TYPE("type"),

        ZONE("zone"),

        INVENTORY_ENTRY("inventory-entry"),

        ORDER_EDIT("order-edit");
        private final String jsonName;

        private ReferenceTypeIdEnum(final String jsonName) {
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
        });
    }

    public static Optional<ReferenceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ReferenceTypeId[] values() {
        return ReferenceTypeIdEnum.values();
    }
}
