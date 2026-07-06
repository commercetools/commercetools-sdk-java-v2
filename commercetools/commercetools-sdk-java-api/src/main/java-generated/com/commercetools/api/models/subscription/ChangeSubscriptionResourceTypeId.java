
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource types supported by <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscriptions</a>:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ChangeSubscriptionResourceTypeId extends JsonEnum {

    /**
    <p>Changes related to <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">ApprovalFlows</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    ChangeSubscriptionResourceTypeId APPROVAL_FLOW = ChangeSubscriptionResourceTypeIdEnum.APPROVAL_FLOW;
    /**
    <p>Changes related to <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRules</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    ChangeSubscriptionResourceTypeId APPROVAL_RULE = ChangeSubscriptionResourceTypeIdEnum.APPROVAL_RULE;
    /**
    <p>Changes related to <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    ChangeSubscriptionResourceTypeId ASSOCIATE_ROLE = ChangeSubscriptionResourceTypeIdEnum.ASSOCIATE_ROLE;
    /**
    <p>Changes related to <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeGroup" rel="nofollow">AttributeGroups</a>.</p> */
    ChangeSubscriptionResourceTypeId ATTRIBUTE_GROUP = ChangeSubscriptionResourceTypeIdEnum.ATTRIBUTE_GROUP;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnits</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    ChangeSubscriptionResourceTypeId BUSINESS_UNIT = ChangeSubscriptionResourceTypeIdEnum.BUSINESS_UNIT;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>. Only notification of creation is supported.</p> */
    ChangeSubscriptionResourceTypeId CART = ChangeSubscriptionResourceTypeIdEnum.CART;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a>.</p> */
    ChangeSubscriptionResourceTypeId CART_DISCOUNT = ChangeSubscriptionResourceTypeIdEnum.CART_DISCOUNT;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a>.</p> */
    ChangeSubscriptionResourceTypeId CATEGORY = ChangeSubscriptionResourceTypeIdEnum.CATEGORY;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channels</a>.</p> */
    ChangeSubscriptionResourceTypeId CHANNEL = ChangeSubscriptionResourceTypeIdEnum.CHANNEL;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customers</a>.</p> */
    ChangeSubscriptionResourceTypeId CUSTOMER = ChangeSubscriptionResourceTypeIdEnum.CUSTOMER;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerToken" rel="nofollow">CustomerTokens</a>.</p> */
    ChangeSubscriptionResourceTypeId CUSTOMER_EMAIL_TOKEN = ChangeSubscriptionResourceTypeIdEnum.CUSTOMER_EMAIL_TOKEN;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a>.</p> */
    ChangeSubscriptionResourceTypeId CUSTOMER_GROUP = ChangeSubscriptionResourceTypeIdEnum.CUSTOMER_GROUP;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerToken" rel="nofollow">CustomerTokens</a>.</p> */
    ChangeSubscriptionResourceTypeId CUSTOMER_PASSWORD_TOKEN = ChangeSubscriptionResourceTypeIdEnum.CUSTOMER_PASSWORD_TOKEN;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a>.</p> */
    ChangeSubscriptionResourceTypeId DISCOUNT_CODE = ChangeSubscriptionResourceTypeIdEnum.DISCOUNT_CODE;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroups</a>.</p> */
    ChangeSubscriptionResourceTypeId DISCOUNT_GROUP = ChangeSubscriptionResourceTypeIdEnum.DISCOUNT_GROUP;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extensions</a>.</p> */
    ChangeSubscriptionResourceTypeId EXTENSION = ChangeSubscriptionResourceTypeIdEnum.EXTENSION;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a>.</p> */
    ChangeSubscriptionResourceTypeId INVENTORY_ENTRY = ChangeSubscriptionResourceTypeIdEnum.INVENTORY_ENTRY;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomObject" rel="nofollow">CustomObjects</a>.</p> */
    ChangeSubscriptionResourceTypeId KEY_VALUE_DOCUMENT = ChangeSubscriptionResourceTypeIdEnum.KEY_VALUE_DOCUMENT;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>. Modifying Orders via <span>Order Edits</span> does not trigger a notification. To achieve this, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MessageSubscription" rel="nofollow">MessageSubscription</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEditAppliedMessage" rel="nofollow">OrderEditApplied</a> Message is necessary.</p> */
    ChangeSubscriptionResourceTypeId ORDER = ChangeSubscriptionResourceTypeIdEnum.ORDER;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdits</a>.</p> */
    ChangeSubscriptionResourceTypeId ORDER_EDIT = ChangeSubscriptionResourceTypeIdEnum.ORDER_EDIT;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payments</a>.</p> */
    ChangeSubscriptionResourceTypeId PAYMENT = ChangeSubscriptionResourceTypeIdEnum.PAYMENT;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a>.</p> */
    ChangeSubscriptionResourceTypeId PRODUCT = ChangeSubscriptionResourceTypeIdEnum.PRODUCT;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a>.</p> */
    ChangeSubscriptionResourceTypeId PRODUCT_DISCOUNT = ChangeSubscriptionResourceTypeIdEnum.PRODUCT_DISCOUNT;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelections</a>.</p> */
    ChangeSubscriptionResourceTypeId PRODUCT_SELECTION = ChangeSubscriptionResourceTypeIdEnum.PRODUCT_SELECTION;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailorings</a>.</p> */
    ChangeSubscriptionResourceTypeId PRODUCT_TAILORING = ChangeSubscriptionResourceTypeIdEnum.PRODUCT_TAILORING;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductTypes</a>.</p> */
    ChangeSubscriptionResourceTypeId PRODUCT_TYPE = ChangeSubscriptionResourceTypeIdEnum.PRODUCT_TYPE;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>.</p> */
    ChangeSubscriptionResourceTypeId QUOTE = ChangeSubscriptionResourceTypeIdEnum.QUOTE;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequests</a>.</p> */
    ChangeSubscriptionResourceTypeId QUOTE_REQUEST = ChangeSubscriptionResourceTypeIdEnum.QUOTE_REQUEST;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicies</a>.</p> */
    ChangeSubscriptionResourceTypeId RECURRENCE_POLICY = ChangeSubscriptionResourceTypeIdEnum.RECURRENCE_POLICY;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrders</a>.</p> */
    ChangeSubscriptionResourceTypeId RECURRING_ORDER = ChangeSubscriptionResourceTypeIdEnum.RECURRING_ORDER;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Reviews</a>.</p> */
    ChangeSubscriptionResourceTypeId REVIEW = ChangeSubscriptionResourceTypeIdEnum.REVIEW;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethods</a>.</p> */
    ChangeSubscriptionResourceTypeId SHIPPING_METHOD = ChangeSubscriptionResourceTypeIdEnum.SHIPPING_METHOD;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingLists</a>.</p> */
    ChangeSubscriptionResourceTypeId SHOPPING_LIST = ChangeSubscriptionResourceTypeIdEnum.SHOPPING_LIST;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuote" rel="nofollow">StagedQuotes</a>.</p> */
    ChangeSubscriptionResourceTypeId STAGED_QUOTE = ChangeSubscriptionResourceTypeIdEnum.STAGED_QUOTE;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrices</a>.</p> */
    ChangeSubscriptionResourceTypeId STANDALONE_PRICE = ChangeSubscriptionResourceTypeIdEnum.STANDALONE_PRICE;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">States</a>.</p> */
    ChangeSubscriptionResourceTypeId STATE = ChangeSubscriptionResourceTypeIdEnum.STATE;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a>.</p> */
    ChangeSubscriptionResourceTypeId STORE = ChangeSubscriptionResourceTypeIdEnum.STORE;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Subscription" rel="nofollow">Subscriptions</a>.</p> */
    ChangeSubscriptionResourceTypeId SUBSCRIPTION = ChangeSubscriptionResourceTypeIdEnum.SUBSCRIPTION;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategories</a>.</p> */
    ChangeSubscriptionResourceTypeId TAX_CATEGORY = ChangeSubscriptionResourceTypeIdEnum.TAX_CATEGORY;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Types</a>.</p> */
    ChangeSubscriptionResourceTypeId TYPE = ChangeSubscriptionResourceTypeIdEnum.TYPE;
    /**
    <p>Changes to <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zones</a>.</p> */
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
