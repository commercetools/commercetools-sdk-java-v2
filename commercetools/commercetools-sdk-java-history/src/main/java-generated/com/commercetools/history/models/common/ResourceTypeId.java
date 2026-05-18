
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>With Types, you can model your own Custom Fields on the following resources and data types.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ResourceTypeId extends JsonEnum {

    ResourceTypeId ADDRESS = ResourceTypeIdEnum.ADDRESS;

    ResourceTypeId ASSET = ResourceTypeIdEnum.ASSET;

    ResourceTypeId APPROVAL_FLOW = ResourceTypeIdEnum.APPROVAL_FLOW;

    ResourceTypeId APPROVAL_RULE = ResourceTypeIdEnum.APPROVAL_RULE;

    ResourceTypeId ASSOCIATE_ROLE = ResourceTypeIdEnum.ASSOCIATE_ROLE;

    ResourceTypeId BUSINESS_UNIT = ResourceTypeIdEnum.BUSINESS_UNIT;

    ResourceTypeId CART_DISCOUNT = ResourceTypeIdEnum.CART_DISCOUNT;

    ResourceTypeId CATEGORY = ResourceTypeIdEnum.CATEGORY;

    ResourceTypeId CHANNEL = ResourceTypeIdEnum.CHANNEL;

    ResourceTypeId CUSTOMER = ResourceTypeIdEnum.CUSTOMER;

    ResourceTypeId CUSTOMER_GROUP = ResourceTypeIdEnum.CUSTOMER_GROUP;

    ResourceTypeId CUSTOM_LINE_ITEM = ResourceTypeIdEnum.CUSTOM_LINE_ITEM;

    ResourceTypeId DISCOUNT_CODE = ResourceTypeIdEnum.DISCOUNT_CODE;

    ResourceTypeId INVENTORY_ENTRY = ResourceTypeIdEnum.INVENTORY_ENTRY;

    ResourceTypeId LINE_ITEM = ResourceTypeIdEnum.LINE_ITEM;

    ResourceTypeId ORDER = ResourceTypeIdEnum.ORDER;

    ResourceTypeId ORDER_EDIT = ResourceTypeIdEnum.ORDER_EDIT;

    ResourceTypeId ORDER_DELIVERY = ResourceTypeIdEnum.ORDER_DELIVERY;

    ResourceTypeId ORDER_PARCEL = ResourceTypeIdEnum.ORDER_PARCEL;

    ResourceTypeId ORDER_RETURN_ITEM = ResourceTypeIdEnum.ORDER_RETURN_ITEM;

    ResourceTypeId PAYMENT = ResourceTypeIdEnum.PAYMENT;

    ResourceTypeId PAYMENT_INTERFACE_INTERACTION = ResourceTypeIdEnum.PAYMENT_INTERFACE_INTERACTION;

    ResourceTypeId PRODUCT_PRICE = ResourceTypeIdEnum.PRODUCT_PRICE;

    ResourceTypeId PRODUCT_SELECTION = ResourceTypeIdEnum.PRODUCT_SELECTION;

    ResourceTypeId PRODUCT_TAILORING = ResourceTypeIdEnum.PRODUCT_TAILORING;

    ResourceTypeId QUOTE = ResourceTypeIdEnum.QUOTE;

    ResourceTypeId REVIEW = ResourceTypeIdEnum.REVIEW;

    ResourceTypeId RECURRING_ORDER = ResourceTypeIdEnum.RECURRING_ORDER;

    ResourceTypeId SHIPPING = ResourceTypeIdEnum.SHIPPING;

    ResourceTypeId SHIPPING_METHOD = ResourceTypeIdEnum.SHIPPING_METHOD;

    ResourceTypeId SHOPPING_LIST = ResourceTypeIdEnum.SHOPPING_LIST;

    ResourceTypeId SHOPPING_LIST_TEXT_LINE_ITEM = ResourceTypeIdEnum.SHOPPING_LIST_TEXT_LINE_ITEM;

    ResourceTypeId STANDALONE_PRICE = ResourceTypeIdEnum.STANDALONE_PRICE;

    ResourceTypeId STORE = ResourceTypeIdEnum.STORE;

    ResourceTypeId TRANSACTION = ResourceTypeIdEnum.TRANSACTION;

    /**
     * possible values of ResourceTypeId
     */
    enum ResourceTypeIdEnum implements ResourceTypeId {
        /**
         * address
         */
        ADDRESS("address"),

        /**
         * asset
         */
        ASSET("asset"),

        /**
         * approval-flow
         */
        APPROVAL_FLOW("approval-flow"),

        /**
         * approval-rule
         */
        APPROVAL_RULE("approval-rule"),

        /**
         * associate-role
         */
        ASSOCIATE_ROLE("associate-role"),

        /**
         * business-unit
         */
        BUSINESS_UNIT("business-unit"),

        /**
         * cart-discount
         */
        CART_DISCOUNT("cart-discount"),

        /**
         * category
         */
        CATEGORY("category"),

        /**
         * channel
         */
        CHANNEL("channel"),

        /**
         * customer
         */
        CUSTOMER("customer"),

        /**
         * customer-group
         */
        CUSTOMER_GROUP("customer-group"),

        /**
         * custom-line-item
         */
        CUSTOM_LINE_ITEM("custom-line-item"),

        /**
         * discount-code
         */
        DISCOUNT_CODE("discount-code"),

        /**
         * inventory-entry
         */
        INVENTORY_ENTRY("inventory-entry"),

        /**
         * line-item
         */
        LINE_ITEM("line-item"),

        /**
         * order
         */
        ORDER("order"),

        /**
         * order-edit
         */
        ORDER_EDIT("order-edit"),

        /**
         * order-delivery
         */
        ORDER_DELIVERY("order-delivery"),

        /**
         * order-parcel
         */
        ORDER_PARCEL("order-parcel"),

        /**
         * order-return-item
         */
        ORDER_RETURN_ITEM("order-return-item"),

        /**
         * payment
         */
        PAYMENT("payment"),

        /**
         * payment-interface-interaction
         */
        PAYMENT_INTERFACE_INTERACTION("payment-interface-interaction"),

        /**
         * product-price
         */
        PRODUCT_PRICE("product-price"),

        /**
         * product-selection
         */
        PRODUCT_SELECTION("product-selection"),

        /**
         * product-tailoring
         */
        PRODUCT_TAILORING("product-tailoring"),

        /**
         * quote
         */
        QUOTE("quote"),

        /**
         * review
         */
        REVIEW("review"),

        /**
         * recurring-order
         */
        RECURRING_ORDER("recurring-order"),

        /**
         * shipping
         */
        SHIPPING("shipping"),

        /**
         * shipping-method
         */
        SHIPPING_METHOD("shipping-method"),

        /**
         * shopping-list
         */
        SHOPPING_LIST("shopping-list"),

        /**
         * shopping-list-text-line-item
         */
        SHOPPING_LIST_TEXT_LINE_ITEM("shopping-list-text-line-item"),

        /**
         * standalone-price
         */
        STANDALONE_PRICE("standalone-price"),

        /**
         * store
         */
        STORE("store"),

        /**
         * transaction
         */
        TRANSACTION("transaction");
        private final String jsonName;

        private ResourceTypeIdEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of ResourceTypeId
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ResourceTypeId[] values() {
        return ResourceTypeIdEnum.values();
    }

}
