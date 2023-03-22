
package com.commercetools.api.models.state;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource or object type the State can be assigned to.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StateTypeEnum {

    /**
    	<p>Used by <a href="ctp:api:type:Order">Orders</a>.</p>

    */
    StateTypeEnum ORDER_STATE = StateTypeEnumEnum.ORDER_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:LineItem">LineItems</a> and <a href="ctp:api:type:CustomLineItem">CustomLineItems</a> in <a href="ctp:api:type:Cart">Carts</a> and <a href="ctp:api:type:Order">Orders</a>.</p>

    */
    StateTypeEnum LINE_ITEM_STATE = StateTypeEnumEnum.LINE_ITEM_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:Product">Products</a>.</p>

    */
    StateTypeEnum PRODUCT_STATE = StateTypeEnumEnum.PRODUCT_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:Review">Reviews</a>.</p>

    */
    StateTypeEnum REVIEW_STATE = StateTypeEnumEnum.REVIEW_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:PaymentStatus">PaymentStatus</a> in <a href="ctp:api:type:Payment">Payments</a>.</p>

    */
    StateTypeEnum PAYMENT_STATE = StateTypeEnumEnum.PAYMENT_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:QuoteRequest">QuoteRequest</a>.</p>

    */
    StateTypeEnum QUOTE_REQUEST_STATE = StateTypeEnumEnum.QUOTE_REQUEST_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:StagedQuote">StagedQuote</a>.</p>

    */
    StateTypeEnum STAGED_QUOTE_STATE = StateTypeEnumEnum.STAGED_QUOTE_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:Quote">Quote</a>.</p>

    */
    StateTypeEnum QUOTE_STATE = StateTypeEnumEnum.QUOTE_STATE;

    enum StateTypeEnumEnum implements StateTypeEnum {
        ORDER_STATE("OrderState"),

        LINE_ITEM_STATE("LineItemState"),

        PRODUCT_STATE("ProductState"),

        REVIEW_STATE("ReviewState"),

        PAYMENT_STATE("PaymentState"),

        QUOTE_REQUEST_STATE("QuoteRequestState"),

        STAGED_QUOTE_STATE("StagedQuoteState"),

        QUOTE_STATE("QuoteState");
        private final String jsonName;

        private StateTypeEnumEnum(final String jsonName) {
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
    public static StateTypeEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new StateTypeEnum() {
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

    public static Optional<StateTypeEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static StateTypeEnum[] values() {
        return StateTypeEnumEnum.values();
    }

}
