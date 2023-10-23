
package com.commercetools.api.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReferenceTypeId extends JsonEnum {

    /**
    	<p>References an <a href="ctp:api:type:ApprovalFlow">ApprovalFlow</a>.</p>

    */
    ReferenceTypeId APPROVAL_FLOW = ReferenceTypeIdEnum.APPROVAL_FLOW;
    /**
    	<p>References an <a href="ctp:api:type:ApprovalRule">ApprovalRule</a>.</p>

    */
    ReferenceTypeId APPROVAL_RULE = ReferenceTypeIdEnum.APPROVAL_RULE;
    /**
    	<p>References an <a href="ctp:api:type:AssociateRole">AssociateRole</a>.</p>

    */
    ReferenceTypeId ASSOCIATE_ROLE = ReferenceTypeIdEnum.ASSOCIATE_ROLE;
    /**
    	<p>References an <a href="ctp:api:type:AttributeGroup">AttributeGroup</a>.</p>

    */
    ReferenceTypeId ATTRIBUTE_GROUP = ReferenceTypeIdEnum.ATTRIBUTE_GROUP;
    /**
    	<p>References a <a href="ctp:api:type:BusinessUnit">BusinessUnit</a>.</p>

    */
    ReferenceTypeId BUSINESS_UNIT = ReferenceTypeIdEnum.BUSINESS_UNIT;
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
    	<p>References a <a href="ctp:api:type:CustomerToken">CustomerToken</a> for <a href="/../api/projects/customers#email-verification-of-customer">email verification</a>.</p>

    */
    ReferenceTypeId CUSTOMER_EMAIL_TOKEN = ReferenceTypeIdEnum.CUSTOMER_EMAIL_TOKEN;
    /**
    	<p>References a <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>

    */
    ReferenceTypeId CUSTOMER_GROUP = ReferenceTypeIdEnum.CUSTOMER_GROUP;
    /**
    	<p>References a <a href="ctp:api:type:CustomerToken">CustomerToken</a> for <a href="/../api/projects/customers#password-reset-of-customer">password reset</a>.</p>

    */
    ReferenceTypeId CUSTOMER_PASSWORD_TOKEN = ReferenceTypeIdEnum.CUSTOMER_PASSWORD_TOKEN;
    /**
    	<p>References a <a href="ctp:api:type:DirectDiscount">DirectDiscount</a>.</p>

    */
    ReferenceTypeId DIRECT_DISCOUNT = ReferenceTypeIdEnum.DIRECT_DISCOUNT;
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
    	<p>References an <a href="/projects/products#embedded-price">Embedded Price</a>.</p>

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
    	<p>References a <a href="ctp:api:type:Quote">Quote</a>.</p>

    */
    ReferenceTypeId QUOTE = ReferenceTypeIdEnum.QUOTE;
    /**
    	<p>References a <a href="ctp:api:type:QuoteRequest">QuoteRequest</a>.</p>

    */
    ReferenceTypeId QUOTE_REQUEST = ReferenceTypeIdEnum.QUOTE_REQUEST;
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
    	<p>References a <a href="ctp:api:type:StagedQuote">StagedQuote</a>.</p>

    */
    ReferenceTypeId STAGED_QUOTE = ReferenceTypeIdEnum.STAGED_QUOTE;
    /**
    	<p>References a <a href="ctp:api:type:StandalonePrice">StandalonePrice</a>.</p>

    */
    ReferenceTypeId STANDALONE_PRICE = ReferenceTypeIdEnum.STANDALONE_PRICE;
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

    /**
     * possible values of ReferenceTypeId
     */
    enum ReferenceTypeIdEnum implements ReferenceTypeId {
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
         * attribute-group
         */
        ATTRIBUTE_GROUP("attribute-group"),

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
         * direct-discount
         */
        DIRECT_DISCOUNT("direct-discount"),

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
     * factory method for a enum value of ReferenceTypeId
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ReferenceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ReferenceTypeId[] values() {
        return ReferenceTypeIdEnum.values();
    }

}
