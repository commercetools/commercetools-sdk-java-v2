
package com.commercetools.api.models.type;

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

    /**
    <p>Address on BusinessUnit, Cart, Order, OrderEdit, Customer, and Channel</p> */
    ResourceTypeId ADDRESS = ResourceTypeIdEnum.ADDRESS;
    /**
    <p>Asset on Category and ProductVariant</p> */
    ResourceTypeId ASSET = ResourceTypeIdEnum.ASSET;
    /**
    <p>ApprovalFlow</p> */
    ResourceTypeId APPROVAL_FLOW = ResourceTypeIdEnum.APPROVAL_FLOW;
    /**
    <p>ApprovalRule</p> */
    ResourceTypeId APPROVAL_RULE = ResourceTypeIdEnum.APPROVAL_RULE;
    /**
    <p>AssociateRole</p> */
    ResourceTypeId ASSOCIATE_ROLE = ResourceTypeIdEnum.ASSOCIATE_ROLE;
    /**
    <p>BusinessUnit</p> */
    ResourceTypeId BUSINESS_UNIT = ResourceTypeIdEnum.BUSINESS_UNIT;
    /**
    <p>CartDiscount</p> */
    ResourceTypeId CART_DISCOUNT = ResourceTypeIdEnum.CART_DISCOUNT;
    /**
    <p>Category</p> */
    ResourceTypeId CATEGORY = ResourceTypeIdEnum.CATEGORY;
    /**
    <p>Channel</p> */
    ResourceTypeId CHANNEL = ResourceTypeIdEnum.CHANNEL;
    /**
    <p>Customer</p> */
    ResourceTypeId CUSTOMER = ResourceTypeIdEnum.CUSTOMER;
    /**
    <p>CustomerGroup</p> */
    ResourceTypeId CUSTOMER_GROUP = ResourceTypeIdEnum.CUSTOMER_GROUP;
    /**
    <p>CustomLineItem on Cart and Order</p> */
    ResourceTypeId CUSTOM_LINE_ITEM = ResourceTypeIdEnum.CUSTOM_LINE_ITEM;
    /**
    <p>DiscountCode</p> */
    ResourceTypeId DISCOUNT_CODE = ResourceTypeIdEnum.DISCOUNT_CODE;
    /**
    <p>InventoryEntry</p> */
    ResourceTypeId INVENTORY_ENTRY = ResourceTypeIdEnum.INVENTORY_ENTRY;
    /**
    <p>LineItem on Cart and Order, and LineItem on ShoppingList</p> */
    ResourceTypeId LINE_ITEM = ResourceTypeIdEnum.LINE_ITEM;
    /**
    <p>Cart and Order. When a Cart is ordered, the CustomFields need to be copied to the Order. For this reason, the Types for Carts are also valid for Orders, and hence both have the same identifier: <code>order</code>.</p> */
    ResourceTypeId ORDER = ResourceTypeIdEnum.ORDER;
    /**
    <p>OrderEdit</p> */
    ResourceTypeId ORDER_EDIT = ResourceTypeIdEnum.ORDER_EDIT;
    /**
    <p>Delivery</p> */
    ResourceTypeId ORDER_DELIVERY = ResourceTypeIdEnum.ORDER_DELIVERY;
    /**
    <p>Parcel</p> */
    ResourceTypeId ORDER_PARCEL = ResourceTypeIdEnum.ORDER_PARCEL;
    /**
    <p>ReturnItem</p> */
    ResourceTypeId ORDER_RETURN_ITEM = ResourceTypeIdEnum.ORDER_RETURN_ITEM;
    /**
    <p>Payment</p> */
    ResourceTypeId PAYMENT = ResourceTypeIdEnum.PAYMENT;
    /**
    <p>InterfaceInteraction on Payment</p> */
    ResourceTypeId PAYMENT_INTERFACE_INTERACTION = ResourceTypeIdEnum.PAYMENT_INTERFACE_INTERACTION;
    /**
    <p>Embedded Price on ProductVariant</p> */
    ResourceTypeId PRODUCT_PRICE = ResourceTypeIdEnum.PRODUCT_PRICE;
    /**
    <p>ProductSelection</p> */
    ResourceTypeId PRODUCT_SELECTION = ResourceTypeIdEnum.PRODUCT_SELECTION;
    /**
    <p>ProductTailoring</p> */
    ResourceTypeId PRODUCT_TAILORING = ResourceTypeIdEnum.PRODUCT_TAILORING;
    /**
    <p>Quote, QuoteRequest and StagedQuote. When a StagedQuote is created, the CustomFields will be copied from the QuoteRequest and when a Quote is created, the CustomFields will be copied from the StagedQuote. For this reason, the Types for Quotes are also valid for QuoteRequests and StagedQuotes, and hence all have the same identifier: <code>quote</code>.</p> */
    ResourceTypeId QUOTE = ResourceTypeIdEnum.QUOTE;
    /**
    <p>Review</p> */
    ResourceTypeId REVIEW = ResourceTypeIdEnum.REVIEW;
    /**
    <p>Shipping</p> */
    ResourceTypeId SHIPPING = ResourceTypeIdEnum.SHIPPING;
    /**
    <p>ShippingMethod</p> */
    ResourceTypeId SHIPPING_METHOD = ResourceTypeIdEnum.SHIPPING_METHOD;
    /**
    <p>ShoppingList</p> */
    ResourceTypeId SHOPPING_LIST = ResourceTypeIdEnum.SHOPPING_LIST;
    /**
    <p>TextLineItem on ShoppingList</p> */
    ResourceTypeId SHOPPING_LIST_TEXT_LINE_ITEM = ResourceTypeIdEnum.SHOPPING_LIST_TEXT_LINE_ITEM;
    /**
    <p>StandalonePrice</p> */
    ResourceTypeId STANDALONE_PRICE = ResourceTypeIdEnum.STANDALONE_PRICE;
    /**
    <p>Store</p> */
    ResourceTypeId STORE = ResourceTypeIdEnum.STORE;
    /**
    <p>Transaction on Payment</p> */
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
