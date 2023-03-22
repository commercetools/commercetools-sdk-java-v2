
package com.commercetools.api.models.extension;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Extensions are available for:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ExtensionResourceTypeId {

    /**
    	<p>Extension triggered for operations on <a href="/../api/projects/carts">Carts</a>.</p>

    */
    ExtensionResourceTypeId CART = ExtensionResourceTypeIdEnum.CART;
    /**
    	<p>Extension triggered for operations on <a href="/../api/projects/orders">Orders</a>.</p>

    */
    ExtensionResourceTypeId ORDER = ExtensionResourceTypeIdEnum.ORDER;
    /**
    	<p>Extension triggered for operations on <a href="/../api/projects/payments">Payments</a>.</p>

    */
    ExtensionResourceTypeId PAYMENT = ExtensionResourceTypeIdEnum.PAYMENT;
    /**
    	<p>Extension triggered for operations on <a href="/../api/projects/customers">Customers</a>.</p>

    */
    ExtensionResourceTypeId CUSTOMER = ExtensionResourceTypeIdEnum.CUSTOMER;
    /**
    	<p>Extension triggered for operations on <a href="/../api/projects/quote-requests">QuoteRequests</a>.</p>

    */
    ExtensionResourceTypeId QUOTE_REQUEST = ExtensionResourceTypeIdEnum.QUOTE_REQUEST;
    /**
    	<p>Extension triggered for operations on <a href="/../api/projects/staged-quotes">StagedQuotes</a>.</p>

    */
    ExtensionResourceTypeId STAGED_QUOTE = ExtensionResourceTypeIdEnum.STAGED_QUOTE;
    /**
    	<p>Extension triggered for operations on <a href="/../api/projects/quotes">Quotes</a>.</p>

    */
    ExtensionResourceTypeId QUOTE = ExtensionResourceTypeIdEnum.QUOTE;
    /**
    	<p>Extension triggered for operations on <a href="/../api/projects/business-units">BusinessUnits</a>.</p>

    */
    ExtensionResourceTypeId BUSINESS_UNIT = ExtensionResourceTypeIdEnum.BUSINESS_UNIT;

    enum ExtensionResourceTypeIdEnum implements ExtensionResourceTypeId {
        CART("cart"),

        ORDER("order"),

        PAYMENT("payment"),

        CUSTOMER("customer"),

        QUOTE_REQUEST("quote-request"),

        STAGED_QUOTE("staged-quote"),

        QUOTE("quote"),

        BUSINESS_UNIT("business-unit");
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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<ExtensionResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ExtensionResourceTypeId[] values() {
        return ExtensionResourceTypeIdEnum.values();
    }

}
