
package com.commercetools.api.models.type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ResourceTypeId {

    ResourceTypeId ASSET = ResourceTypeIdEnum.ASSET;

    ResourceTypeId CATEGORY = ResourceTypeIdEnum.CATEGORY;

    ResourceTypeId CHANNEL = ResourceTypeIdEnum.CHANNEL;

    ResourceTypeId CUSTOMER = ResourceTypeIdEnum.CUSTOMER;

    ResourceTypeId ORDER = ResourceTypeIdEnum.ORDER;

    ResourceTypeId ORDER_EDIT = ResourceTypeIdEnum.ORDER_EDIT;

    ResourceTypeId INVENTORY_ENTRY = ResourceTypeIdEnum.INVENTORY_ENTRY;

    ResourceTypeId LINE_ITEM = ResourceTypeIdEnum.LINE_ITEM;

    ResourceTypeId CUSTOM_LINE_ITEM = ResourceTypeIdEnum.CUSTOM_LINE_ITEM;

    ResourceTypeId PRODUCT_PRICE = ResourceTypeIdEnum.PRODUCT_PRICE;

    ResourceTypeId PAYMENT = ResourceTypeIdEnum.PAYMENT;

    ResourceTypeId PAYMENT_INTERFACE_INTERACTION = ResourceTypeIdEnum.PAYMENT_INTERFACE_INTERACTION;

    ResourceTypeId REVIEW = ResourceTypeIdEnum.REVIEW;

    ResourceTypeId SHIPPING_METHOD = ResourceTypeIdEnum.SHIPPING_METHOD;

    ResourceTypeId SHOPPING_LIST = ResourceTypeIdEnum.SHOPPING_LIST;

    ResourceTypeId SHOPPING_LIST_TEXT_LINE_ITEM = ResourceTypeIdEnum.SHOPPING_LIST_TEXT_LINE_ITEM;

    ResourceTypeId DISCOUNT_CODE = ResourceTypeIdEnum.DISCOUNT_CODE;

    ResourceTypeId CART_DISCOUNT = ResourceTypeIdEnum.CART_DISCOUNT;

    ResourceTypeId CUSTOMER_GROUP = ResourceTypeIdEnum.CUSTOMER_GROUP;

    enum ResourceTypeIdEnum implements ResourceTypeId {
        ASSET("asset"),

        CATEGORY("category"),

        CHANNEL("channel"),

        CUSTOMER("customer"),

        ORDER("order"),

        ORDER_EDIT("order-edit"),

        INVENTORY_ENTRY("inventory-entry"),

        LINE_ITEM("line-item"),

        CUSTOM_LINE_ITEM("custom-line-item"),

        PRODUCT_PRICE("product-price"),

        PAYMENT("payment"),

        PAYMENT_INTERFACE_INTERACTION("payment-interface-interaction"),

        REVIEW("review"),

        SHIPPING_METHOD("shipping-method"),

        SHOPPING_LIST("shopping-list"),

        SHOPPING_LIST_TEXT_LINE_ITEM("shopping-list-text-line-item"),

        DISCOUNT_CODE("discount-code"),

        CART_DISCOUNT("cart-discount"),

        CUSTOMER_GROUP("customer-group");
        private final String jsonName;

        private ResourceTypeIdEnum(final String jsonName) {
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
    public static ResourceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ResourceTypeId() {
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

    public static Optional<ResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ResourceTypeId[] values() {
        return ResourceTypeIdEnum.values();
    }
}
