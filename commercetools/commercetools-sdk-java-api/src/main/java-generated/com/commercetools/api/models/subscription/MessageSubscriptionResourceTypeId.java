
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource types supported by MessageSubscriptions:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MessageSubscriptionResourceTypeId {

    /**
    	<p>Messages related to <a href="ctp:api:type:BusinessUnit">Business Units</a>.</p>

    */
    MessageSubscriptionResourceTypeId BUSINESS_UNIT = MessageSubscriptionResourceTypeIdEnum.BUSINESS_UNIT;
    /**
    	<p>Messages related to <a href="ctp:api:type:Category">Categories</a>.</p>

    */
    MessageSubscriptionResourceTypeId CATEGORY = MessageSubscriptionResourceTypeIdEnum.CATEGORY;
    /**
    	<p>Messages related to <a href="ctp:api:type:Customer">Customers</a>.</p>

    */
    MessageSubscriptionResourceTypeId CUSTOMER = MessageSubscriptionResourceTypeIdEnum.CUSTOMER;
    /**
    	<p>Messages related to <a href="ctp:api:type:InventoryEntry">InventoryEntries</a>.</p>

    */
    MessageSubscriptionResourceTypeId INVENTORY_ENTRY = MessageSubscriptionResourceTypeIdEnum.INVENTORY_ENTRY;
    /**
    	<p>Messages related to <a href="ctp:api:type:Order">Orders</a>.</p>

    */
    MessageSubscriptionResourceTypeId ORDER = MessageSubscriptionResourceTypeIdEnum.ORDER;
    /**
    	<p>Messages related to <a href="ctp:api:type:Payment">Payments</a>.</p>

    */
    MessageSubscriptionResourceTypeId PAYMENT = MessageSubscriptionResourceTypeIdEnum.PAYMENT;
    /**
    	<p>Messages related to <a href="ctp:api:type:Product">Products</a>.</p>

    */
    MessageSubscriptionResourceTypeId PRODUCT = MessageSubscriptionResourceTypeIdEnum.PRODUCT;
    /**
    	<p>Messages related to <a href="ctp:api:type:ProductSelection">ProductSelections</a>.</p>

    */
    MessageSubscriptionResourceTypeId PRODUCT_SELECTION = MessageSubscriptionResourceTypeIdEnum.PRODUCT_SELECTION;
    /**
    	<p>Messages related to <a href="ctp:api:type:Quote">Quotes</a>.</p>

    */
    MessageSubscriptionResourceTypeId QUOTE = MessageSubscriptionResourceTypeIdEnum.QUOTE;
    /**
    	<p>Messages related to <a href="ctp:api:type:QuoteRequest">Quote Requests</a>.</p>

    */
    MessageSubscriptionResourceTypeId QUOTE_REQUEST = MessageSubscriptionResourceTypeIdEnum.QUOTE_REQUEST;
    /**
    	<p>Messages related to <a href="ctp:api:type:Review">Reviews</a>.</p>

    */
    MessageSubscriptionResourceTypeId REVIEW = MessageSubscriptionResourceTypeIdEnum.REVIEW;
    /**
    	<p>Messages related to <a href="ctp:api:type:StagedQuote">Staged Quotes</a>.</p>

    */
    MessageSubscriptionResourceTypeId STAGED_QUOTE = MessageSubscriptionResourceTypeIdEnum.STAGED_QUOTE;
    /**
    	<p>Messages related to <a href="ctp:api:type:StandalonePrice">StandalonePrices</a>.</p>

    */
    MessageSubscriptionResourceTypeId STANDALONE_PRICE = MessageSubscriptionResourceTypeIdEnum.STANDALONE_PRICE;
    /**
    	<p>Messages related to <a href="ctp:api:type:Store">Stores</a>.</p>

    */
    MessageSubscriptionResourceTypeId STORE = MessageSubscriptionResourceTypeIdEnum.STORE;

    enum MessageSubscriptionResourceTypeIdEnum implements MessageSubscriptionResourceTypeId {
        BUSINESS_UNIT("business-unit"),

        CATEGORY("category"),

        CUSTOMER("customer"),

        INVENTORY_ENTRY("inventory-entry"),

        ORDER("order"),

        PAYMENT("payment"),

        PRODUCT("product"),

        PRODUCT_SELECTION("product-selection"),

        QUOTE("quote"),

        QUOTE_REQUEST("quote-request"),

        REVIEW("review"),

        STAGED_QUOTE("staged-quote"),

        STANDALONE_PRICE("standalone-price"),

        STORE("store");
        private final String jsonName;

        private MessageSubscriptionResourceTypeIdEnum(final String jsonName) {
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
    public static MessageSubscriptionResourceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new MessageSubscriptionResourceTypeId() {
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

    public static Optional<MessageSubscriptionResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static MessageSubscriptionResourceTypeId[] values() {
        return MessageSubscriptionResourceTypeIdEnum.values();
    }

}
