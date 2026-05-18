
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
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdit</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a></p> */
    ResourceTypeId ADDRESS = ResourceTypeIdEnum.ADDRESS;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Asset" rel="nofollow">Asset</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a></p> */
    ResourceTypeId ASSET = ResourceTypeIdEnum.ASSET;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">ApprovalFlow</a> - Only available for <span>B2B</span>-enabled Projects.</p> */
    ResourceTypeId APPROVAL_FLOW = ResourceTypeIdEnum.APPROVAL_FLOW;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> - Only available for <span>B2B</span>-enabled Projects.</p> */
    ResourceTypeId APPROVAL_RULE = ResourceTypeIdEnum.APPROVAL_RULE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a> - Only available for <span>B2B</span>-enabled Projects.</p> */
    ResourceTypeId ASSOCIATE_ROLE = ResourceTypeIdEnum.ASSOCIATE_ROLE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> - Only available for <span>B2B</span>-enabled Projects.</p> */
    ResourceTypeId BUSINESS_UNIT = ResourceTypeIdEnum.BUSINESS_UNIT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a></p> */
    ResourceTypeId CART_DISCOUNT = ResourceTypeIdEnum.CART_DISCOUNT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a></p> */
    ResourceTypeId CATEGORY = ResourceTypeIdEnum.CATEGORY;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a></p> */
    ResourceTypeId CHANNEL = ResourceTypeIdEnum.CHANNEL;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a></p> */
    ResourceTypeId CUSTOMER = ResourceTypeIdEnum.CUSTOMER;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a></p> */
    ResourceTypeId CUSTOMER_GROUP = ResourceTypeIdEnum.CUSTOMER_GROUP;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a></p> */
    ResourceTypeId CUSTOM_LINE_ITEM = ResourceTypeIdEnum.CUSTOM_LINE_ITEM;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a></p> */
    ResourceTypeId DISCOUNT_CODE = ResourceTypeIdEnum.DISCOUNT_CODE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a></p> */
    ResourceTypeId INVENTORY_ENTRY = ResourceTypeIdEnum.INVENTORY_ENTRY;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a></p> */
    ResourceTypeId LINE_ITEM = ResourceTypeIdEnum.LINE_ITEM;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>. When a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> is ordered, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">CustomFields</a> need to be copied to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>. For this reason, the Types for Carts are also valid for Orders, and hence both have the same identifier: <code>order</code>.</p> */
    ResourceTypeId ORDER = ResourceTypeIdEnum.ORDER;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdit</a></p> */
    ResourceTypeId ORDER_EDIT = ResourceTypeIdEnum.ORDER_EDIT;
    /**
    <p><span>Delivery</span></p> */
    ResourceTypeId ORDER_DELIVERY = ResourceTypeIdEnum.ORDER_DELIVERY;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a></p> */
    ResourceTypeId ORDER_PARCEL = ResourceTypeIdEnum.ORDER_PARCEL;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a></p> */
    ResourceTypeId ORDER_RETURN_ITEM = ResourceTypeIdEnum.ORDER_RETURN_ITEM;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a></p> */
    ResourceTypeId PAYMENT = ResourceTypeIdEnum.PAYMENT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentAddInterfaceInteractionAction" rel="nofollow">InterfaceInteraction</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a></p> */
    ResourceTypeId PAYMENT_INTERFACE_INTERACTION = ResourceTypeIdEnum.PAYMENT_INTERFACE_INTERACTION;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a></p> */
    ResourceTypeId PAYMENT_METHOD = ResourceTypeIdEnum.PAYMENT_METHOD;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfo" rel="nofollow">PaymentMethodInfo</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a></p> */
    ResourceTypeId PAYMENT_METHOD_INFO = ResourceTypeIdEnum.PAYMENT_METHOD_INFO;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Embedded Price</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a></p> */
    ResourceTypeId PRODUCT_PRICE = ResourceTypeIdEnum.PRODUCT_PRICE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelection</a></p> */
    ResourceTypeId PRODUCT_SELECTION = ResourceTypeIdEnum.PRODUCT_SELECTION;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a></p> */
    ResourceTypeId PRODUCT_TAILORING = ResourceTypeIdEnum.PRODUCT_TAILORING;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuote" rel="nofollow">StagedQuote</a>. When a <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuote" rel="nofollow">StagedQuote</a> is created, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">CustomFields</a> will be copied from the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> and when a <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a> is created, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">CustomFields</a> will be copied from the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuote" rel="nofollow">StagedQuote</a>. For this reason, the Types for Quotes are also valid for QuoteRequests and StagedQuotes, and hence all have the same identifier: <code>quote</code>.</p> */
    ResourceTypeId QUOTE = ResourceTypeIdEnum.QUOTE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a></p> */
    ResourceTypeId REVIEW = ResourceTypeIdEnum.REVIEW;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a></p> */
    ResourceTypeId RECURRING_ORDER = ResourceTypeIdEnum.RECURRING_ORDER;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a></p> */
    ResourceTypeId SHIPPING = ResourceTypeIdEnum.SHIPPING;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a></p> */
    ResourceTypeId SHIPPING_METHOD = ResourceTypeIdEnum.SHIPPING_METHOD;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a></p> */
    ResourceTypeId SHOPPING_LIST = ResourceTypeIdEnum.SHOPPING_LIST;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a></p> */
    ResourceTypeId SHOPPING_LIST_TEXT_LINE_ITEM = ResourceTypeIdEnum.SHOPPING_LIST_TEXT_LINE_ITEM;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a></p> */
    ResourceTypeId STANDALONE_PRICE = ResourceTypeIdEnum.STANDALONE_PRICE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a></p> */
    ResourceTypeId STORE = ResourceTypeIdEnum.STORE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a> on <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a></p> */
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
         * payment-method
         */
        PAYMENT_METHOD("payment-method"),

        /**
         * payment-method-info
         */
        PAYMENT_METHOD_INFO("payment-method-info"),

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
