
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
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">ApprovalFlow</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    ReferenceTypeId APPROVAL_FLOW = ReferenceTypeIdEnum.APPROVAL_FLOW;
    /**
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    ReferenceTypeId APPROVAL_RULE = ReferenceTypeIdEnum.APPROVAL_RULE;
    /**
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    ReferenceTypeId ASSOCIATE_ROLE = ReferenceTypeIdEnum.ASSOCIATE_ROLE;
    /**
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeGroup" rel="nofollow">AttributeGroup</a>.</p> */
    ReferenceTypeId ATTRIBUTE_GROUP = ReferenceTypeIdEnum.ATTRIBUTE_GROUP;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    ReferenceTypeId BUSINESS_UNIT = ReferenceTypeIdEnum.BUSINESS_UNIT;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p> */
    ReferenceTypeId CART = ReferenceTypeIdEnum.CART;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>.</p> */
    ReferenceTypeId CART_DISCOUNT = ReferenceTypeIdEnum.CART_DISCOUNT;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a>.</p> */
    ReferenceTypeId CATEGORY = ReferenceTypeIdEnum.CATEGORY;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p> */
    ReferenceTypeId CHANNEL = ReferenceTypeIdEnum.CHANNEL;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>.</p> */
    ReferenceTypeId CUSTOMER = ReferenceTypeIdEnum.CUSTOMER;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerToken" rel="nofollow">CustomerToken</a> for <span>email verification</span>.</p> */
    ReferenceTypeId CUSTOMER_EMAIL_TOKEN = ReferenceTypeIdEnum.CUSTOMER_EMAIL_TOKEN;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a>.</p> */
    ReferenceTypeId CUSTOMER_GROUP = ReferenceTypeIdEnum.CUSTOMER_GROUP;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerToken" rel="nofollow">CustomerToken</a> for <span>password reset</span>.</p> */
    ReferenceTypeId CUSTOMER_PASSWORD_TOKEN = ReferenceTypeIdEnum.CUSTOMER_PASSWORD_TOKEN;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscount</a>.</p> */
    ReferenceTypeId DIRECT_DISCOUNT = ReferenceTypeIdEnum.DIRECT_DISCOUNT;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p> */
    ReferenceTypeId DISCOUNT_CODE = ReferenceTypeIdEnum.DISCOUNT_CODE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a>.</p> */
    ReferenceTypeId DISCOUNT_GROUP = ReferenceTypeIdEnum.DISCOUNT_GROUP;
    /**
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>.</p> */
    ReferenceTypeId EXTENSION = ReferenceTypeIdEnum.EXTENSION;
    /**
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a>.</p> */
    ReferenceTypeId INVENTORY_ENTRY = ReferenceTypeIdEnum.INVENTORY_ENTRY;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomObject" rel="nofollow">CustomObject</a>.</p> */
    ReferenceTypeId KEY_VALUE_DOCUMENT = ReferenceTypeIdEnum.KEY_VALUE_DOCUMENT;
    /**
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p> */
    ReferenceTypeId ORDER = ReferenceTypeIdEnum.ORDER;
    /**
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">Order Edit</a>.</p> */
    ReferenceTypeId ORDER_EDIT = ReferenceTypeIdEnum.ORDER_EDIT;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a>.</p> */
    ReferenceTypeId PAYMENT_METHOD = ReferenceTypeIdEnum.PAYMENT_METHOD;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a>.</p> */
    ReferenceTypeId PAYMENT = ReferenceTypeIdEnum.PAYMENT;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p> */
    ReferenceTypeId PRODUCT = ReferenceTypeIdEnum.PRODUCT;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a>.</p> */
    ReferenceTypeId PRODUCT_DISCOUNT = ReferenceTypeIdEnum.PRODUCT_DISCOUNT;
    /**
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Embedded Price</a>.</p> */
    ReferenceTypeId PRODUCT_PRICE = ReferenceTypeIdEnum.PRODUCT_PRICE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelection</a>.</p> */
    ReferenceTypeId PRODUCT_SELECTION = ReferenceTypeIdEnum.PRODUCT_SELECTION;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>.</p> */
    ReferenceTypeId PRODUCT_TAILORING = ReferenceTypeIdEnum.PRODUCT_TAILORING;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>.</p> */
    ReferenceTypeId PRODUCT_TYPE = ReferenceTypeIdEnum.PRODUCT_TYPE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a>.</p> */
    ReferenceTypeId QUOTE = ReferenceTypeIdEnum.QUOTE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a>.</p> */
    ReferenceTypeId QUOTE_REQUEST = ReferenceTypeIdEnum.QUOTE_REQUEST;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>.</p> */
    ReferenceTypeId RECURRENCE_POLICY = ReferenceTypeIdEnum.RECURRENCE_POLICY;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p> */
    ReferenceTypeId RECURRING_ORDER = ReferenceTypeIdEnum.RECURRING_ORDER;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>.</p> */
    ReferenceTypeId REVIEW = ReferenceTypeIdEnum.REVIEW;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>.</p> */
    ReferenceTypeId SHIPPING_METHOD = ReferenceTypeIdEnum.SHIPPING_METHOD;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p> */
    ReferenceTypeId SHOPPING_LIST = ReferenceTypeIdEnum.SHOPPING_LIST;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuote" rel="nofollow">StagedQuote</a>.</p> */
    ReferenceTypeId STAGED_QUOTE = ReferenceTypeIdEnum.STAGED_QUOTE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p> */
    ReferenceTypeId STANDALONE_PRICE = ReferenceTypeIdEnum.STANDALONE_PRICE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p> */
    ReferenceTypeId STATE = ReferenceTypeIdEnum.STATE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p> */
    ReferenceTypeId STORE = ReferenceTypeIdEnum.STORE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Subscription" rel="nofollow">Subscription</a>.</p> */
    ReferenceTypeId SUBSCRIPTION = ReferenceTypeIdEnum.SUBSCRIPTION;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a>.</p> */
    ReferenceTypeId TAX_CATEGORY = ReferenceTypeIdEnum.TAX_CATEGORY;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p> */
    ReferenceTypeId TYPE = ReferenceTypeIdEnum.TYPE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a>.</p> */
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
         * discount-group
         */
        DISCOUNT_GROUP("discount-group"),

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
         * payment-method
         */
        PAYMENT_METHOD("payment-method"),

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
         * product-tailoring
         */
        PRODUCT_TAILORING("product-tailoring"),

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
         * recurrence-policy
         */
        RECURRENCE_POLICY("recurrence-policy"),

        /**
         * recurring-order
         */
        RECURRING_ORDER("recurring-order"),

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
