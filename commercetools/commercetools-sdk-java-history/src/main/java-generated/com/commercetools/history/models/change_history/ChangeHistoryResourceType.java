
package com.commercetools.history.models.change_history;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This data type represents the supported resource types.
*  The value must be one of the following:</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ChangeHistoryResourceType {

    ChangeHistoryResourceType CART_DISCOUNT = ChangeHistoryResourceTypeEnum.CART_DISCOUNT;

    ChangeHistoryResourceType CATEGORY = ChangeHistoryResourceTypeEnum.CATEGORY;

    ChangeHistoryResourceType CHANNEL = ChangeHistoryResourceTypeEnum.CHANNEL;

    ChangeHistoryResourceType CUSTOMER = ChangeHistoryResourceTypeEnum.CUSTOMER;

    ChangeHistoryResourceType CUSTOMER_GROUP = ChangeHistoryResourceTypeEnum.CUSTOMER_GROUP;

    ChangeHistoryResourceType DISCOUNT_CODE = ChangeHistoryResourceTypeEnum.DISCOUNT_CODE;

    ChangeHistoryResourceType INVENTORY_ENTRY = ChangeHistoryResourceTypeEnum.INVENTORY_ENTRY;

    ChangeHistoryResourceType KEY_VALUE_DOCUMENT = ChangeHistoryResourceTypeEnum.KEY_VALUE_DOCUMENT;

    ChangeHistoryResourceType ORDER = ChangeHistoryResourceTypeEnum.ORDER;

    ChangeHistoryResourceType PAYMENT = ChangeHistoryResourceTypeEnum.PAYMENT;

    ChangeHistoryResourceType PRODUCT = ChangeHistoryResourceTypeEnum.PRODUCT;

    ChangeHistoryResourceType PRODUCT_DISCOUNT = ChangeHistoryResourceTypeEnum.PRODUCT_DISCOUNT;

    ChangeHistoryResourceType PRODUCT_TYPE = ChangeHistoryResourceTypeEnum.PRODUCT_TYPE;

    ChangeHistoryResourceType REVIEW = ChangeHistoryResourceTypeEnum.REVIEW;

    ChangeHistoryResourceType SHOPPING_LIST = ChangeHistoryResourceTypeEnum.SHOPPING_LIST;

    ChangeHistoryResourceType STATE = ChangeHistoryResourceTypeEnum.STATE;

    ChangeHistoryResourceType STORE = ChangeHistoryResourceTypeEnum.STORE;

    ChangeHistoryResourceType TAX_CATEGORY = ChangeHistoryResourceTypeEnum.TAX_CATEGORY;

    ChangeHistoryResourceType TYPE = ChangeHistoryResourceTypeEnum.TYPE;

    ChangeHistoryResourceType ZONE = ChangeHistoryResourceTypeEnum.ZONE;

    enum ChangeHistoryResourceTypeEnum implements ChangeHistoryResourceType {
        CART_DISCOUNT("cart-discount"),

        CATEGORY("category"),

        CHANNEL("channel"),

        CUSTOMER("customer"),

        CUSTOMER_GROUP("customer-group"),

        DISCOUNT_CODE("discount-code"),

        INVENTORY_ENTRY("inventory-entry"),

        KEY_VALUE_DOCUMENT("key-value-document"),

        ORDER("order"),

        PAYMENT("payment"),

        PRODUCT("product"),

        PRODUCT_DISCOUNT("product-discount"),

        PRODUCT_TYPE("product-type"),

        REVIEW("review"),

        SHOPPING_LIST("shopping-list"),

        STATE("state"),

        STORE("store"),

        TAX_CATEGORY("tax-category"),

        TYPE("type"),

        ZONE("zone");
        private final String jsonName;

        private ChangeHistoryResourceTypeEnum(final String jsonName) {
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
    public static ChangeHistoryResourceType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ChangeHistoryResourceType() {
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

    public static Optional<ChangeHistoryResourceType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ChangeHistoryResourceType[] values() {
        return ChangeHistoryResourceTypeEnum.values();
    }
}
