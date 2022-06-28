
package com.commercetools.api.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReferenceTypeId {

    /**
    	<p>References a <a href="ctp:api:type:Cart">Cart</a>.</p>

    */
    ReferenceTypeId CART = ReferenceTypeIdEnum.CART;
    /**
    	<p>References a <a href="ctp:api:type:CartDiscount">CartDiscount</a>.</p>

    */
    ReferenceTypeId CART_DISCOUNT = ReferenceTypeIdEnum.CART_DISCOUNT;
    /**
    	<p>References a <a href="ctp:api:type:Category">Category</a>.</p>

    */
    ReferenceTypeId CATEGORY = ReferenceTypeIdEnum.CATEGORY;
    /**
    	<p>References a <a href="ctp:api:type:Channel">Channel</a>.</p>

    */
    ReferenceTypeId CHANNEL = ReferenceTypeIdEnum.CHANNEL;
    /**
    	<p>References a <a href="ctp:api:type:Customer">Customer</a>.</p>

    */
    ReferenceTypeId CUSTOMER = ReferenceTypeIdEnum.CUSTOMER;
    /**
    	<p>References a <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>

    */
    ReferenceTypeId CUSTOMER_GROUP = ReferenceTypeIdEnum.CUSTOMER_GROUP;
    /**
    	<p>References a <a href="ctp:api:type:DiscountCode">DiscountCode</a>.</p>

    */
    ReferenceTypeId DISCOUNT_CODE = ReferenceTypeIdEnum.DISCOUNT_CODE;
    /**
    	<p>References an <a href="ctp:api:type:Extension">Extension</a>.</p>

    */
    ReferenceTypeId EXTENSION = ReferenceTypeIdEnum.EXTENSION;
    /**
    	<p>References an <a href="ctp:api:type:InventoryEntry">InventoryEntry</a>.</p>

    */
    ReferenceTypeId INVENTORY_ENTRY = ReferenceTypeIdEnum.INVENTORY_ENTRY;
    /**
    	<p>References a <a href="ctp:api:type:CustomObject">CustomObject</a>.</p>

    */
    ReferenceTypeId KEY_VALUE_DOCUMENT = ReferenceTypeIdEnum.KEY_VALUE_DOCUMENT;
    /**
    	<p>References an <a href="ctp:api:type:Order">Order</a>.</p>

    */
    ReferenceTypeId ORDER = ReferenceTypeIdEnum.ORDER;
    /**
    	<p>References an <a href="ctp:api:type:OrderEdit">Order Edit</a>.</p>

    */
    ReferenceTypeId ORDER_EDIT = ReferenceTypeIdEnum.ORDER_EDIT;
    /**
    	<p>References a <a href="ctp:api:type:Payment">Payment</a>.</p>

    */
    ReferenceTypeId PAYMENT = ReferenceTypeIdEnum.PAYMENT;
    /**
    	<p>References a <a href="ctp:api:type:Product">Product</a>.</p>

    */
    ReferenceTypeId PRODUCT = ReferenceTypeIdEnum.PRODUCT;
    /**
    	<p>References a <a href="ctp:api:type:ProductDiscount">ProductDiscount</a>.</p>

    */
    ReferenceTypeId PRODUCT_DISCOUNT = ReferenceTypeIdEnum.PRODUCT_DISCOUNT;
    /**
    	<p>References an <a href="ctp:api:type:EmbeddedPrice">EmbeddedPrice</a>.</p>

    */
    ReferenceTypeId PRODUCT_PRICE = ReferenceTypeIdEnum.PRODUCT_PRICE;
    /**
    	<p>References a <a href="ctp:api:type:ProductSelection">ProductSelection</a>.</p>

    */
    ReferenceTypeId PRODUCT_SELECTION = ReferenceTypeIdEnum.PRODUCT_SELECTION;
    /**
    	<p>References a <a href="ctp:api:type:ProductType">ProductType</a>.</p>

    */
    ReferenceTypeId PRODUCT_TYPE = ReferenceTypeIdEnum.PRODUCT_TYPE;
    /**
    	<p>References a <a href="ctp:api:type:Review">Review</a>.</p>

    */
    ReferenceTypeId REVIEW = ReferenceTypeIdEnum.REVIEW;
    /**
    	<p>References a <a href="ctp:api:type:ShippingMethod">ShippingMethod</a>.</p>

    */
    ReferenceTypeId SHIPPING_METHOD = ReferenceTypeIdEnum.SHIPPING_METHOD;
    /**
    	<p>References a <a href="ctp:api:type:ShoppingList">ShoppingList</a>.</p>

    */
    ReferenceTypeId SHOPPING_LIST = ReferenceTypeIdEnum.SHOPPING_LIST;
    /**
    	<p>References a <a href="ctp:api:type:State">State</a>.</p>

    */
    ReferenceTypeId STATE = ReferenceTypeIdEnum.STATE;
    /**
    	<p>References a <a href="ctp:api:type:Store">Store</a>.</p>

    */
    ReferenceTypeId STORE = ReferenceTypeIdEnum.STORE;
    /**
    	<p>References a <a href="ctp:api:type:Subscription">Subscription</a>.</p>

    */
    ReferenceTypeId SUBSCRIPTION = ReferenceTypeIdEnum.SUBSCRIPTION;
    /**
    	<p>References a <a href="ctp:api:type:TaxCategory">TaxCategory</a>.</p>

    */
    ReferenceTypeId TAX_CATEGORY = ReferenceTypeIdEnum.TAX_CATEGORY;
    /**
    	<p>References a <a href="ctp:api:type:Type">Type</a>.</p>

    */
    ReferenceTypeId TYPE = ReferenceTypeIdEnum.TYPE;
    /**
    	<p>References a <a href="ctp:api:type:Zone">Zone</a>.</p>

    */
    ReferenceTypeId ZONE = ReferenceTypeIdEnum.ZONE;

    enum ReferenceTypeIdEnum implements ReferenceTypeId {
        CART("cart"),

        CART_DISCOUNT("cart-discount"),

        CATEGORY("category"),

        CHANNEL("channel"),

        CUSTOMER("customer"),

        CUSTOMER_GROUP("customer-group"),

        DISCOUNT_CODE("discount-code"),

        EXTENSION("extension"),

        INVENTORY_ENTRY("inventory-entry"),

        KEY_VALUE_DOCUMENT("key-value-document"),

        ORDER("order"),

        ORDER_EDIT("order-edit"),

        PAYMENT("payment"),

        PRODUCT("product"),

        PRODUCT_DISCOUNT("product-discount"),

        PRODUCT_PRICE("product-price"),

        PRODUCT_SELECTION("product-selection"),

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
