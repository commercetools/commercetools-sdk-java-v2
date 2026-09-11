
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource types supported by <a href="https://docs.commercetools.com/apis/ctp:api:type:MessageSubscription" rel="nofollow">MessageSubscriptions</a>:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MessageSubscriptionResourceTypeId extends JsonEnum {

    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">ApprovalFlows</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    MessageSubscriptionResourceTypeId APPROVAL_FLOW = MessageSubscriptionResourceTypeIdEnum.APPROVAL_FLOW;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRules</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    MessageSubscriptionResourceTypeId APPROVAL_RULE = MessageSubscriptionResourceTypeIdEnum.APPROVAL_RULE;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    MessageSubscriptionResourceTypeId ASSOCIATE_ROLE = MessageSubscriptionResourceTypeIdEnum.ASSOCIATE_ROLE;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnits</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    MessageSubscriptionResourceTypeId BUSINESS_UNIT = MessageSubscriptionResourceTypeIdEnum.BUSINESS_UNIT;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a>.</p> */
    MessageSubscriptionResourceTypeId CATEGORY = MessageSubscriptionResourceTypeIdEnum.CATEGORY;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customers</a>.</p> */
    MessageSubscriptionResourceTypeId CUSTOMER = MessageSubscriptionResourceTypeIdEnum.CUSTOMER;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerToken" rel="nofollow">CustomerTokens</a> for email verification.</p> */
    MessageSubscriptionResourceTypeId CUSTOMER_EMAIL_TOKEN = MessageSubscriptionResourceTypeIdEnum.CUSTOMER_EMAIL_TOKEN;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a>.</p> */
    MessageSubscriptionResourceTypeId CUSTOMER_GROUP = MessageSubscriptionResourceTypeIdEnum.CUSTOMER_GROUP;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerToken" rel="nofollow">CustomerTokens</a> for password reset.</p> */
    MessageSubscriptionResourceTypeId CUSTOMER_PASSWORD_TOKEN = MessageSubscriptionResourceTypeIdEnum.CUSTOMER_PASSWORD_TOKEN;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a>.</p> */
    MessageSubscriptionResourceTypeId INVENTORY_ENTRY = MessageSubscriptionResourceTypeIdEnum.INVENTORY_ENTRY;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>.</p> */
    MessageSubscriptionResourceTypeId ORDER = MessageSubscriptionResourceTypeIdEnum.ORDER;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payments</a>.</p> */
    MessageSubscriptionResourceTypeId PAYMENT = MessageSubscriptionResourceTypeIdEnum.PAYMENT;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a>.</p> */
    MessageSubscriptionResourceTypeId PRODUCT = MessageSubscriptionResourceTypeIdEnum.PRODUCT;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelections</a>.</p> */
    MessageSubscriptionResourceTypeId PRODUCT_SELECTION = MessageSubscriptionResourceTypeIdEnum.PRODUCT_SELECTION;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>.</p> */
    MessageSubscriptionResourceTypeId PRODUCT_TAILORING = MessageSubscriptionResourceTypeIdEnum.PRODUCT_TAILORING;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>.</p> */
    MessageSubscriptionResourceTypeId QUOTE = MessageSubscriptionResourceTypeIdEnum.QUOTE;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>.</p> */
    MessageSubscriptionResourceTypeId QUOTE_REQUEST = MessageSubscriptionResourceTypeIdEnum.QUOTE_REQUEST;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Reviews</a>.</p> */
    MessageSubscriptionResourceTypeId REVIEW = MessageSubscriptionResourceTypeIdEnum.REVIEW;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a>.</p> */
    MessageSubscriptionResourceTypeId SHOPPING_LIST = MessageSubscriptionResourceTypeIdEnum.SHOPPING_LIST;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuote" rel="nofollow">Staged Quotes</a>.</p> */
    MessageSubscriptionResourceTypeId STAGED_QUOTE = MessageSubscriptionResourceTypeIdEnum.STAGED_QUOTE;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrices</a>.</p> */
    MessageSubscriptionResourceTypeId STANDALONE_PRICE = MessageSubscriptionResourceTypeIdEnum.STANDALONE_PRICE;
    /**
    <p>Messages related to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a>.</p> */
    MessageSubscriptionResourceTypeId STORE = MessageSubscriptionResourceTypeIdEnum.STORE;

    /**
     * possible values of MessageSubscriptionResourceTypeId
     */
    enum MessageSubscriptionResourceTypeIdEnum implements MessageSubscriptionResourceTypeId {
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
         * category
         */
        CATEGORY("category"),

        /**
         * customer
         */
        CUSTOMER("customer"),

        /**
         * customer-email-token
         */
        CUSTOMER_EMAIL_TOKEN("customer-email-token"),

        /**
         * customer-group
         */
        CUSTOMER_GROUP("customer-group"),

        /**
         * customer-password-token
         */
        CUSTOMER_PASSWORD_TOKEN("customer-password-token"),

        /**
         * inventory-entry
         */
        INVENTORY_ENTRY("inventory-entry"),

        /**
         * order
         */
        ORDER("order"),

        /**
         * payment
         */
        PAYMENT("payment"),

        /**
         * product
         */
        PRODUCT("product"),

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
         * quote-request
         */
        QUOTE_REQUEST("quote-request"),

        /**
         * review
         */
        REVIEW("review"),

        /**
         * shopping-list
         */
        SHOPPING_LIST("shopping-list"),

        /**
         * staged-quote
         */
        STAGED_QUOTE("staged-quote"),

        /**
         * standalone-price
         */
        STANDALONE_PRICE("standalone-price"),

        /**
         * store
         */
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
     * factory method for a enum value of MessageSubscriptionResourceTypeId
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<MessageSubscriptionResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static MessageSubscriptionResourceTypeId[] values() {
        return MessageSubscriptionResourceTypeIdEnum.values();
    }

}
