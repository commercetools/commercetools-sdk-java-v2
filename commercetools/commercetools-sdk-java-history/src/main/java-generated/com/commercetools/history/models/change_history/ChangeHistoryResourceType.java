
package com.commercetools.history.models.change_history;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Value of resource types supported in Change History.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ChangeHistoryResourceType extends JsonEnum {

    /**
    <p>for AssociateRole</p> */
    ChangeHistoryResourceType ASSOCIATE_ROLE = ChangeHistoryResourceTypeEnum.ASSOCIATE_ROLE;
    /**
    <p>for BusinessUnit</p> */
    ChangeHistoryResourceType BUSINESS_UNIT = ChangeHistoryResourceTypeEnum.BUSINESS_UNIT;
    /**
    <p>for CartDiscount</p> */
    ChangeHistoryResourceType CART_DISCOUNT = ChangeHistoryResourceTypeEnum.CART_DISCOUNT;
    /**
    <p>for Category</p> */
    ChangeHistoryResourceType CATEGORY = ChangeHistoryResourceTypeEnum.CATEGORY;
    /**
    <p>for Channel</p> */
    ChangeHistoryResourceType CHANNEL = ChangeHistoryResourceTypeEnum.CHANNEL;
    /**
    <p>for Customer</p> */
    ChangeHistoryResourceType CUSTOMER = ChangeHistoryResourceTypeEnum.CUSTOMER;
    /**
    <p>for CustomerGroup</p> */
    ChangeHistoryResourceType CUSTOMER_GROUP = ChangeHistoryResourceTypeEnum.CUSTOMER_GROUP;
    /**
    <p>for DiscountCode</p> */
    ChangeHistoryResourceType DISCOUNT_CODE = ChangeHistoryResourceTypeEnum.DISCOUNT_CODE;
    /**
    <p>for InventoryEntry</p> */
    ChangeHistoryResourceType INVENTORY_ENTRY = ChangeHistoryResourceTypeEnum.INVENTORY_ENTRY;
    /**
    <p>for CustomObject</p> */
    ChangeHistoryResourceType KEY_VALUE_DOCUMENT = ChangeHistoryResourceTypeEnum.KEY_VALUE_DOCUMENT;
    /**
    <p>for Order</p> */
    ChangeHistoryResourceType ORDER = ChangeHistoryResourceTypeEnum.ORDER;
    /**
    <p>for Payment</p> */
    ChangeHistoryResourceType PAYMENT = ChangeHistoryResourceTypeEnum.PAYMENT;
    /**
    <p>for Product</p> */
    ChangeHistoryResourceType PRODUCT = ChangeHistoryResourceTypeEnum.PRODUCT;
    /**
    <p>for ProductDiscount</p> */
    ChangeHistoryResourceType PRODUCT_DISCOUNT = ChangeHistoryResourceTypeEnum.PRODUCT_DISCOUNT;
    /**
    <p>for ProductSelection</p> */
    ChangeHistoryResourceType PRODUCT_SELECTION = ChangeHistoryResourceTypeEnum.PRODUCT_SELECTION;
    /**
    <p>for ProductType</p> */
    ChangeHistoryResourceType PRODUCT_TYPE = ChangeHistoryResourceTypeEnum.PRODUCT_TYPE;
    /**
    <p>for QuoteRequest</p> */
    ChangeHistoryResourceType QUOTE_REQUEST = ChangeHistoryResourceTypeEnum.QUOTE_REQUEST;
    /**
    <p>for Quote</p> */
    ChangeHistoryResourceType QUOTE = ChangeHistoryResourceTypeEnum.QUOTE;
    /**
    <p>for Review</p> */
    ChangeHistoryResourceType REVIEW = ChangeHistoryResourceTypeEnum.REVIEW;
    /**
    <p>for ShoppingList</p> */
    ChangeHistoryResourceType SHOPPING_LIST = ChangeHistoryResourceTypeEnum.SHOPPING_LIST;
    /**
    <p>for StagedQuote</p> */
    ChangeHistoryResourceType STAGED_QUOTE = ChangeHistoryResourceTypeEnum.STAGED_QUOTE;
    /**
    <p>for State</p> */
    ChangeHistoryResourceType STATE = ChangeHistoryResourceTypeEnum.STATE;
    /**
    <p>for Store</p> */
    ChangeHistoryResourceType STORE = ChangeHistoryResourceTypeEnum.STORE;
    /**
    <p>for TaxCategory</p> */
    ChangeHistoryResourceType TAX_CATEGORY = ChangeHistoryResourceTypeEnum.TAX_CATEGORY;
    /**
    <p>for Type</p> */
    ChangeHistoryResourceType TYPE = ChangeHistoryResourceTypeEnum.TYPE;
    /**
    <p>for Zone</p> */
    ChangeHistoryResourceType ZONE = ChangeHistoryResourceTypeEnum.ZONE;

    /**
     * possible values of ChangeHistoryResourceType
     */
    enum ChangeHistoryResourceTypeEnum implements ChangeHistoryResourceType {
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
         * discount-code
         */
        DISCOUNT_CODE("discount-code"),

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
         * product-type
         */
        PRODUCT_TYPE("product-type"),

        /**
         * quote-request
         */
        QUOTE_REQUEST("quote-request"),

        /**
         * quote
         */
        QUOTE("quote"),

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
         * state
         */
        STATE("state"),

        /**
         * store
         */
        STORE("store"),

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

        private ChangeHistoryResourceTypeEnum(final String jsonName) {
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
     * factory method for a enum value of ChangeHistoryResourceType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ChangeHistoryResourceType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ChangeHistoryResourceType() {
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
    public static Optional<ChangeHistoryResourceType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ChangeHistoryResourceType[] values() {
        return ChangeHistoryResourceTypeEnum.values();
    }

}
