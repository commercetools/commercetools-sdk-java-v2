
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource types supported by ChangeSubscriptions:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ChangeSubscriptionResourceTypeId extends JsonEnum {

    /**
    	<p>Changes related to <a href="ctp:api:type:ApprovalFlow">ApprovalFlows</a>.</p>

    */
    ChangeSubscriptionResourceTypeId APPROVAL_FLOW = ChangeSubscriptionResourceTypeIdEnum.APPROVAL_FLOW;
    /**
    	<p>Changes related to <a href="ctp:api:type:ApprovalRule">ApprovalRules</a>.</p>

    */
    ChangeSubscriptionResourceTypeId APPROVAL_RULE = ChangeSubscriptionResourceTypeIdEnum.APPROVAL_RULE;
    /**
    	<p>Changes related to <a href="ctp:api:type:AssociateRole">AssociateRoles</a>.</p>

    */
    ChangeSubscriptionResourceTypeId ASSOCIATE_ROLE = ChangeSubscriptionResourceTypeIdEnum.ASSOCIATE_ROLE;
    /**
    	<p>Changes to <a href="ctp:api:type:BusinessUnit">BusinessUnits</a>.</p>

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
    	<p>Changes to <a href="ctp:api:type:QuoteRequest">QuoteRequests</a>.</p>

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
    	<p>Changes to <a href="ctp:api:type:StagedQuote">StagedQuotes</a>.</p>

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

    /**
     * possible values of ChangeSubscriptionResourceTypeId
     */
    enum ChangeSubscriptionResourceTypeIdEnum implements ChangeSubscriptionResourceTypeId {
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
         * cart
         */
        CART("cart"),

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
         * discount-code
         */
        DISCOUNT_CODE("discount-code"),

        /**
         * extension
         */
        EXTENSION("extension"),

        /**
         * inventory-entry
         */
        INVENTORY_ENTRY("inventory-entry"),

        /**
         * key-value-document
         */
        KEY_VALUE_DOCUMENT("key-value-document"),

        /**
         * order
         */
        ORDER("order"),

        /**
         * order-edit
         */
        ORDER_EDIT("order-edit"),

        /**
         * payment
         */
        PAYMENT("payment"),

        /**
         * product
         */
        PRODUCT("product"),

        /**
         * product-discount
         */
        PRODUCT_DISCOUNT("product-discount"),

        /**
         * product-price
         */
        PRODUCT_PRICE("product-price"),

        /**
         * product-selection
         */
        PRODUCT_SELECTION("product-selection"),

        /**
         * product-type
         */
        PRODUCT_TYPE("product-type"),

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
         * shipping-method
         */
        SHIPPING_METHOD("shipping-method"),

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
         * state
         */
        STATE("state"),

        /**
         * store
         */
        STORE("store"),

        /**
         * subscription
         */
        SUBSCRIPTION("subscription"),

        /**
         * tax-category
         */
        TAX_CATEGORY("tax-category"),

        /**
         * type
         */
        TYPE("type"),

        /**
         * zone
         */
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
     * factory method for a enum value of ChangeSubscriptionResourceTypeId
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ChangeSubscriptionResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ChangeSubscriptionResourceTypeId[] values() {
        return ChangeSubscriptionResourceTypeIdEnum.values();
    }

}
