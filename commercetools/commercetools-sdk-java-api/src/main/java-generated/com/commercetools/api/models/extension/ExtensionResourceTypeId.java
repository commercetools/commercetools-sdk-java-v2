
package com.commercetools.api.models.extension;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Extensions are available for:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ExtensionResourceTypeId extends JsonEnum {

    /**
    <p>Extension triggered for operations on <span>Carts</span>.</p> */
    ExtensionResourceTypeId CART = ExtensionResourceTypeIdEnum.CART;
    /**
    <p>Extension triggered for operations on <span>Orders</span>.</p> */
    ExtensionResourceTypeId ORDER = ExtensionResourceTypeIdEnum.ORDER;
    /**
    <p>Extension triggered for operations on <span>Payments</span>.</p> */
    ExtensionResourceTypeId PAYMENT = ExtensionResourceTypeIdEnum.PAYMENT;
    /**
    <p>Extension triggered for operations on <span>PaymentMethods</span></p> */
    ExtensionResourceTypeId PAYMENT_METHOD = ExtensionResourceTypeIdEnum.PAYMENT_METHOD;
    /**
    <p>Extension triggered for operations on <span>Customers</span>.</p> */
    ExtensionResourceTypeId CUSTOMER = ExtensionResourceTypeIdEnum.CUSTOMER;
    /**
    <p>Extension triggered for operations on <span>CustomerGroups</span>.</p> */
    ExtensionResourceTypeId CUSTOMER_GROUP = ExtensionResourceTypeIdEnum.CUSTOMER_GROUP;
    /**
    <p>Extension triggered for operations on <span>QuoteRequests</span>.</p> */
    ExtensionResourceTypeId QUOTE_REQUEST = ExtensionResourceTypeIdEnum.QUOTE_REQUEST;
    /**
    <p>Extension triggered for operations on <span>StagedQuotes</span>.</p> */
    ExtensionResourceTypeId STAGED_QUOTE = ExtensionResourceTypeIdEnum.STAGED_QUOTE;
    /**
    <p>Extension triggered for operations on <span>Quotes</span>.</p> */
    ExtensionResourceTypeId QUOTE = ExtensionResourceTypeIdEnum.QUOTE;
    /**
    <p>Extension triggered for operations on <span>BusinessUnits</span>.</p> */
    ExtensionResourceTypeId BUSINESS_UNIT = ExtensionResourceTypeIdEnum.BUSINESS_UNIT;
    /**
    <p>Extension triggered for operations on <span>ShoppingLists</span>.</p> */
    ExtensionResourceTypeId SHOPPING_LIST = ExtensionResourceTypeIdEnum.SHOPPING_LIST;

    /**
     * possible values of ExtensionResourceTypeId
     */
    enum ExtensionResourceTypeIdEnum implements ExtensionResourceTypeId {
        /**
         * cart
         */
        CART("cart"),

        /**
         * order
         */
        ORDER("order"),

        /**
         * payment
         */
        PAYMENT("payment"),

        /**
         * payment-method
         */
        PAYMENT_METHOD("payment-method"),

        /**
         * customer
         */
        CUSTOMER("customer"),

        /**
         * customer-group
         */
        CUSTOMER_GROUP("customer-group"),

        /**
         * quote-request
         */
        QUOTE_REQUEST("quote-request"),

        /**
         * staged-quote
         */
        STAGED_QUOTE("staged-quote"),

        /**
         * quote
         */
        QUOTE("quote"),

        /**
         * business-unit
         */
        BUSINESS_UNIT("business-unit"),

        /**
         * shopping-list
         */
        SHOPPING_LIST("shopping-list");
        private final String jsonName;

        private ExtensionResourceTypeIdEnum(final String jsonName) {
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
     * factory method for a enum value of ExtensionResourceTypeId
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ExtensionResourceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ExtensionResourceTypeId() {
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
    public static Optional<ExtensionResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ExtensionResourceTypeId[] values() {
        return ExtensionResourceTypeIdEnum.values();
    }

}
