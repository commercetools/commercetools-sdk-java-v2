
package com.commercetools.api.models.type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>IDs indicating the customizable resources and data types.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ResourceTypeId {

    /**
    	<p><a href="ctp:api:type:Address">Address</a> on <a href="ctp:api:type:Cart">Cart</a>, <a href="ctp:api:type:Order">Order</a>, <a href="ctp:api:type:OrderEdit">OrderEdit</a>, <a href="ctp:api:type:Customer">Customer</a>, and <a href="ctp:api:type:Channel">Channel</a></p>

    */
    ResourceTypeId ADDRESS = ResourceTypeIdEnum.ADDRESS;
    /**
    	<p><a href="ctp:api:type:Asset">Asset</a> on <a href="ctp:api:type:Category">Category</a> and <a href="ctp:api:type:ProductVariant">ProductVariant</a></p>

    */
    ResourceTypeId ASSET = ResourceTypeIdEnum.ASSET;
    /**
    	<p><a href="ctp:api:type:CartDiscount">CartDiscount</a></p>

    */
    ResourceTypeId CART_DISCOUNT = ResourceTypeIdEnum.CART_DISCOUNT;
    /**
    	<p><a href="ctp:api:type:Category">Category</a></p>

    */
    ResourceTypeId CATEGORY = ResourceTypeIdEnum.CATEGORY;
    /**
    	<p><a href="ctp:api:type:Channel">Channel</a></p>

    */
    ResourceTypeId CHANNEL = ResourceTypeIdEnum.CHANNEL;
    /**
    	<p><a href="ctp:api:type:Customer">Customer</a></p>

    */
    ResourceTypeId CUSTOMER = ResourceTypeIdEnum.CUSTOMER;
    /**
    	<p><a href="ctp:api:type:CustomerGroup">CustomerGroup</a></p>

    */
    ResourceTypeId CUSTOMER_GROUP = ResourceTypeIdEnum.CUSTOMER_GROUP;
    /**
    	<p><a href="ctp:api:type:CustomLineItem">CustomLineItem</a> on <a href="ctp:api:type:Cart">Cart</a> and <a href="ctp:api:type:Order">Order</a></p>

    */
    ResourceTypeId CUSTOM_LINE_ITEM = ResourceTypeIdEnum.CUSTOM_LINE_ITEM;
    /**
    	<p><a href="ctp:api:type:DiscountCode">DiscountCode</a></p>

    */
    ResourceTypeId DISCOUNT_CODE = ResourceTypeIdEnum.DISCOUNT_CODE;
    /**
    	<p><a href="ctp:api:type:InventoryEntry">InventoryEntry</a></p>

    */
    ResourceTypeId INVENTORY_ENTRY = ResourceTypeIdEnum.INVENTORY_ENTRY;
    /**
    	<p><a href="ctp:api:type:LineItem">LineItem</a> on <a href="ctp:api:type:Cart">Cart</a> and <a href="ctp:api:type:Order">Order</a>, and <a href="ctp:api:type:LineItem">LineItem</a> on <a href="ctp:api:type:ShoppingList">ShoppingList</a></p>

    */
    ResourceTypeId LINE_ITEM = ResourceTypeIdEnum.LINE_ITEM;
    /**
    	<p><a href="ctp:api:type:Cart">Cart</a> and <a href="ctp:api:type:Order">Order</a>.
    	When a <a href="ctp:api:type:Cart">Cart</a> is ordered, the <a href="ctp:api:type:CustomFields">CustomFields</a> need to be copied to the <a href="ctp:api:type:Order">Order</a>.
    	For this reason, the Types for Carts are also valid for Orders, and hence both have the same identifier: <code>order</code>.</p>

    */
    ResourceTypeId ORDER = ResourceTypeIdEnum.ORDER;
    /**
    	<p><a href="ctp:api:type:OrderEdit">OrderEdit</a></p>

    */
    ResourceTypeId ORDER_EDIT = ResourceTypeIdEnum.ORDER_EDIT;
    /**
    	<p><a href="/projects/orders#delivery">Delivery</a></p>

    */
    ResourceTypeId ORDER_DELIVERY = ResourceTypeIdEnum.ORDER_DELIVERY;
    /**
    	<p><a href="ctp:api:type:Parcel">Parcel</a></p>

    */
    ResourceTypeId ORDER_PARCEL = ResourceTypeIdEnum.ORDER_PARCEL;
    /**
    	<p><a href="ctp:api:type:ReturnItem">ReturnItem</a></p>

    */
    ResourceTypeId ORDER_RETURN_ITEM = ResourceTypeIdEnum.ORDER_RETURN_ITEM;
    /**
    	<p><a href="ctp:api:type:Payment">Payment</a></p>

    */
    ResourceTypeId PAYMENT = ResourceTypeIdEnum.PAYMENT;
    /**
    	<p><a href="ctp:api:type:PaymentAddInterfaceInteractionAction">InterfaceInteraction</a> on <a href="ctp:api:type:Payment">Payment</a></p>

    */
    ResourceTypeId PAYMENT_INTERFACE_INTERACTION = ResourceTypeIdEnum.PAYMENT_INTERFACE_INTERACTION;
    /**
    	<p><a href="ctp:api:type:Price">Price</a> on <a href="ctp:api:type:ProductVariant">ProductVariant</a></p>

    */
    ResourceTypeId PRODUCT_PRICE = ResourceTypeIdEnum.PRODUCT_PRICE;
    /**
    	<p><a href="ctp:api:type:ProductSelection">ProductSelection</a></p>

    */
    ResourceTypeId PRODUCT_SELECTION = ResourceTypeIdEnum.PRODUCT_SELECTION;
    /**
    	<p><a href="ctp:api:type:Quote">Quote</a>, <a href="ctp:api:type:QuoteRequest">QuoteRequest</a> and <a href="ctp:api:type:StagedQuote">StagedQuote</a>.
    	When a <a href="ctp:api:type:StagedQuote">StagedQuote</a> is created, the <a href="ctp:api:type:CustomFields">CustomFields</a> will be copied from the <a href="ctp:api:type:QuoteRequest">QuoteRequest</a> and when a <a href="ctp:api:type:Quote">Quote</a> is created, the <a href="ctp:api:type:CustomFields">CustomFields</a> will be copied from the <a href="ctp:api:type:StagedQuote">StagedQuote</a>.
    	For this reason, the Types for Quotes are also valid for QuoteRequests and StagedQuotes, and hence all have the same identifier: <code>quote</code>.</p>

    */
    ResourceTypeId QUOTE = ResourceTypeIdEnum.QUOTE;
    /**
    	<p><a href="ctp:api:type:Review">Review</a></p>

    */
    ResourceTypeId REVIEW = ResourceTypeIdEnum.REVIEW;
    /**
    	<p><a href="ctp:api:type:ShippingMethod">ShippingMethod</a></p>

    */
    ResourceTypeId SHIPPING_METHOD = ResourceTypeIdEnum.SHIPPING_METHOD;
    /**
    	<p><a href="ctp:api:type:ShoppingList">ShoppingList</a></p>

    */
    ResourceTypeId SHOPPING_LIST = ResourceTypeIdEnum.SHOPPING_LIST;
    /**
    	<p><a href="ctp:api:type:TextLineItem">TextLineItem</a> on <a href="ctp:api:type:ShoppingList">ShoppingList</a></p>

    */
    ResourceTypeId SHOPPING_LIST_TEXT_LINE_ITEM = ResourceTypeIdEnum.SHOPPING_LIST_TEXT_LINE_ITEM;
    /**
    	<p><a href="ctp:api:type:Store">Store</a></p>

    */
    ResourceTypeId STORE = ResourceTypeIdEnum.STORE;
    /**
    	<p><a href="ctp:api:type:Transaction">Transaction</a> on <a href="ctp:api:type:Payment">Payment</a></p>

    */
    ResourceTypeId TRANSACTION = ResourceTypeIdEnum.TRANSACTION;

    enum ResourceTypeIdEnum implements ResourceTypeId {
        ADDRESS("address"),

        ASSET("asset"),

        CART_DISCOUNT("cart-discount"),

        CATEGORY("category"),

        CHANNEL("channel"),

        CUSTOMER("customer"),

        CUSTOMER_GROUP("customer-group"),

        CUSTOM_LINE_ITEM("custom-line-item"),

        DISCOUNT_CODE("discount-code"),

        INVENTORY_ENTRY("inventory-entry"),

        LINE_ITEM("line-item"),

        ORDER("order"),

        ORDER_EDIT("order-edit"),

        ORDER_DELIVERY("order-delivery"),

        ORDER_PARCEL("order-parcel"),

        ORDER_RETURN_ITEM("order-return-item"),

        PAYMENT("payment"),

        PAYMENT_INTERFACE_INTERACTION("payment-interface-interaction"),

        PRODUCT_PRICE("product-price"),

        PRODUCT_SELECTION("product-selection"),

        QUOTE("quote"),

        REVIEW("review"),

        SHIPPING_METHOD("shipping-method"),

        SHOPPING_LIST("shopping-list"),

        SHOPPING_LIST_TEXT_LINE_ITEM("shopping-list-text-line-item"),

        STORE("store"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<ResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ResourceTypeId[] values() {
        return ResourceTypeIdEnum.values();
    }
}
