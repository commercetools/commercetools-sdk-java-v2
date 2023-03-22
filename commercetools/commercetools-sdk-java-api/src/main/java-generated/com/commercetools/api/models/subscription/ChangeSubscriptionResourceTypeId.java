
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource types supported by ChangeSubscriptions:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ChangeSubscriptionResourceTypeId {

    /**
    	<p>Changes to <a href="ctp:api:type:BusinessUnit">Business Units</a>.</p>

    */
    ChangeSubscriptionResourceTypeId BUSINESS_UNIT = ChangeSubscriptionResourceTypeIdEnum.BUSINESS_UNIT;
    /**
    	<p>Changes to <a href="ctp:api:type:Cart">Carts</a>.</p>

    */
    ChangeSubscriptionResourceTypeId CART = ChangeSubscriptionResourceTypeIdEnum.CART;
    /**
    	<p>Changes to <a href="ctp:api:type:CartDiscount">CartDiscounts</a>.</p>

    */
    ChangeSubscriptionResourceTypeId CART_DISCOUNT = ChangeSubscriptionResourceTypeIdEnum.CART_DISCOUNT;
    /**
    	<p>Changes to <a href="ctp:api:type:Category">Categories</a>.</p>

    */
    ChangeSubscriptionResourceTypeId CATEGORY = ChangeSubscriptionResourceTypeIdEnum.CATEGORY;
    /**
    	<p>Changes to <a href="ctp:api:type:Channel">Channels</a>.</p>

    */
    ChangeSubscriptionResourceTypeId CHANNEL = ChangeSubscriptionResourceTypeIdEnum.CHANNEL;
    /**
    	<p>Changes to <a href="ctp:api:type:Customer">Customers</a>.</p>

    */
    ChangeSubscriptionResourceTypeId CUSTOMER = ChangeSubscriptionResourceTypeIdEnum.CUSTOMER;
    /**
    	<p>Changes to <a href="ctp:api:type:CustomerToken">CustomerTokens</a>.</p>

    */
    ChangeSubscriptionResourceTypeId CUSTOMER_EMAIL_TOKEN = ChangeSubscriptionResourceTypeIdEnum.CUSTOMER_EMAIL_TOKEN;
    /**
    	<p>Changes to <a href="ctp:api:type:CustomerGroup">CustomerGroups</a>.</p>

    */
    ChangeSubscriptionResourceTypeId CUSTOMER_GROUP = ChangeSubscriptionResourceTypeIdEnum.CUSTOMER_GROUP;
    /**
    	<p>Changes to <a href="ctp:api:type:CustomerToken">CustomerTokens</a>.</p>

    */
    ChangeSubscriptionResourceTypeId CUSTOMER_PASSWORD_TOKEN = ChangeSubscriptionResourceTypeIdEnum.CUSTOMER_PASSWORD_TOKEN;
    /**
    	<p>Changes to <a href="ctp:api:type:DiscountCode">DiscountCodes</a>.</p>

    */
    ChangeSubscriptionResourceTypeId DISCOUNT_CODE = ChangeSubscriptionResourceTypeIdEnum.DISCOUNT_CODE;
    /**
    	<p>Changes to <a href="ctp:api:type:Extension">Extensions</a>.</p>

    */
    ChangeSubscriptionResourceTypeId EXTENSION = ChangeSubscriptionResourceTypeIdEnum.EXTENSION;
    /**
    	<p>Changes to <a href="ctp:api:type:InventoryEntry">InventoryEntries</a>.</p>

    */
    ChangeSubscriptionResourceTypeId INVENTORY_ENTRY = ChangeSubscriptionResourceTypeIdEnum.INVENTORY_ENTRY;
    /**
    	<p>Changes to <a href="ctp:api:type:CustomObject">CustomObjects</a>.</p>

    */
    ChangeSubscriptionResourceTypeId KEY_VALUE_DOCUMENT = ChangeSubscriptionResourceTypeIdEnum.KEY_VALUE_DOCUMENT;
    /**
    	<p>Changes to <a href="ctp:api:type:Order">Orders</a>. Changes to Orders via <a href="/../api/projects/order-edits">Order Edits</a> do not trigger a Message. To achieve this, a <a href="ctp:api:type:MessageSubscription">MessageSubscription</a> to <a href="ctp:api:type:OrderEditAppliedMessage">Order Edit Applied Message</a> is necessary.</p>

    */
    ChangeSubscriptionResourceTypeId ORDER = ChangeSubscriptionResourceTypeIdEnum.ORDER;
    /**
    	<p>Changes to <a href="ctp:api:type:OrderEdit">OrderEdits</a>.</p>

    */
    ChangeSubscriptionResourceTypeId ORDER_EDIT = ChangeSubscriptionResourceTypeIdEnum.ORDER_EDIT;
    /**
    	<p>Changes to <a href="ctp:api:type:Payment">Payments</a>.</p>

    */
    ChangeSubscriptionResourceTypeId PAYMENT = ChangeSubscriptionResourceTypeIdEnum.PAYMENT;
    /**
    	<p>Changes to <a href="ctp:api:type:Product">Products</a>.</p>

    */
    ChangeSubscriptionResourceTypeId PRODUCT = ChangeSubscriptionResourceTypeIdEnum.PRODUCT;
    /**
    	<p>Changes to <a href="ctp:api:type:ProductDiscount">ProductDiscount</a>.</p>

    */
    ChangeSubscriptionResourceTypeId PRODUCT_DISCOUNT = ChangeSubscriptionResourceTypeIdEnum.PRODUCT_DISCOUNT;
    /**
    	<p>Changes to <a href="ctp:api:type:Price">EmbeddedPrices</a>.</p>

    */
    ChangeSubscriptionResourceTypeId PRODUCT_PRICE = ChangeSubscriptionResourceTypeIdEnum.PRODUCT_PRICE;
    /**
    	<p>Changes to <a href="ctp:api:type:ProductSelection">ProductSelections</a>.</p>

    */
    ChangeSubscriptionResourceTypeId PRODUCT_SELECTION = ChangeSubscriptionResourceTypeIdEnum.PRODUCT_SELECTION;
    /**
    	<p>Changes to <a href="ctp:api:type:ProductType">ProductTypes</a>.</p>

    */
    ChangeSubscriptionResourceTypeId PRODUCT_TYPE = ChangeSubscriptionResourceTypeIdEnum.PRODUCT_TYPE;
    /**
    	<p>Changes to <a href="ctp:api:type:Quote">Quotes</a>.</p>

    */
    ChangeSubscriptionResourceTypeId QUOTE = ChangeSubscriptionResourceTypeIdEnum.QUOTE;
    /**
    	<p>Changes to <a href="ctp:api:type:QuoteRequest">Quote Requests</a>.</p>

    */
    ChangeSubscriptionResourceTypeId QUOTE_REQUEST = ChangeSubscriptionResourceTypeIdEnum.QUOTE_REQUEST;
    /**
    	<p>Changes to <a href="ctp:api:type:Review">Reviews</a>.</p>

    */
    ChangeSubscriptionResourceTypeId REVIEW = ChangeSubscriptionResourceTypeIdEnum.REVIEW;
    /**
    	<p>Changes to <a href="ctp:api:type:ShippingMethod">ShippingMethods</a>.</p>

    */
    ChangeSubscriptionResourceTypeId SHIPPING_METHOD = ChangeSubscriptionResourceTypeIdEnum.SHIPPING_METHOD;
    /**
    	<p>Changes to <a href="ctp:api:type:ShoppingList">ShoppingLists</a>.</p>

    */
    ChangeSubscriptionResourceTypeId SHOPPING_LIST = ChangeSubscriptionResourceTypeIdEnum.SHOPPING_LIST;
    /**
    	<p>Changes to <a href="ctp:api:type:StagedQuote">Staged Quotes</a>.</p>

    */
    ChangeSubscriptionResourceTypeId STAGED_QUOTE = ChangeSubscriptionResourceTypeIdEnum.STAGED_QUOTE;
    /**
    	<p>Changes to <a href="ctp:api:type:StandalonePrice">StandalonePrices</a>.</p>

    */
    ChangeSubscriptionResourceTypeId STANDALONE_PRICE = ChangeSubscriptionResourceTypeIdEnum.STANDALONE_PRICE;
    /**
    	<p>Changes to <a href="ctp:api:type:State">States</a>.</p>

    */
    ChangeSubscriptionResourceTypeId STATE = ChangeSubscriptionResourceTypeIdEnum.STATE;
    /**
    	<p>Changes to <a href="ctp:api:type:Store">Stores</a>.</p>

    */
    ChangeSubscriptionResourceTypeId STORE = ChangeSubscriptionResourceTypeIdEnum.STORE;
    /**
    	<p>Changes to <a href="ctp:api:type:Subscription">Subscriptions</a>.</p>

    */
    ChangeSubscriptionResourceTypeId SUBSCRIPTION = ChangeSubscriptionResourceTypeIdEnum.SUBSCRIPTION;
    /**
    	<p>Changes to <a href="ctp:api:type:TaxCategory">TaxCategories</a>.</p>

    */
    ChangeSubscriptionResourceTypeId TAX_CATEGORY = ChangeSubscriptionResourceTypeIdEnum.TAX_CATEGORY;
    /**
    	<p>Changes to <a href="ctp:api:type:Type">Types</a>.</p>

    */
    ChangeSubscriptionResourceTypeId TYPE = ChangeSubscriptionResourceTypeIdEnum.TYPE;
    /**
    	<p>Changes to <a href="ctp:api:type:Zone">Zones</a>.</p>

    */
    ChangeSubscriptionResourceTypeId ZONE = ChangeSubscriptionResourceTypeIdEnum.ZONE;

    enum ChangeSubscriptionResourceTypeIdEnum implements ChangeSubscriptionResourceTypeId {
        BUSINESS_UNIT("business-unit"),

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

        PRODUCT_PRICE("product-price"),

        PRODUCT_SELECTION("product-selection"),

        PRODUCT_TYPE("product-type"),

        QUOTE("quote"),

        QUOTE_REQUEST("quote-request"),

        REVIEW("review"),

        SHIPPING_METHOD("shipping-method"),

        SHOPPING_LIST("shopping-list"),

        STAGED_QUOTE("staged-quote"),

        STANDALONE_PRICE("standalone-price"),

        STATE("state"),

        STORE("store"),

        SUBSCRIPTION("subscription"),

        TAX_CATEGORY("tax-category"),

        TYPE("type"),

        ZONE("zone");
        private final String jsonName;

        private ChangeSubscriptionResourceTypeIdEnum(final String jsonName) {
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
    public static ChangeSubscriptionResourceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ChangeSubscriptionResourceTypeId() {
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

    public static Optional<ChangeSubscriptionResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ChangeSubscriptionResourceTypeId[] values() {
        return ChangeSubscriptionResourceTypeIdEnum.values();
    }

}
