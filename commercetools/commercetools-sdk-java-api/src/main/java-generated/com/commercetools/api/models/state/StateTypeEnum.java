
package com.commercetools.api.models.state;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource or object type the State can be assigned to.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StateTypeEnum extends JsonEnum {

    /**
    <p>Used by Orders.</p> */
    StateTypeEnum ORDER_STATE = StateTypeEnumEnum.ORDER_STATE;
    /**
    <p>Used by LineItems and CustomLineItems in Carts and Orders, with the <code>builtin</code> field always set to <code>true</code> by default. In addition, the <code>initial</code> field is set to <code>true</code> upon creation.</p> */
    StateTypeEnum LINE_ITEM_STATE = StateTypeEnumEnum.LINE_ITEM_STATE;
    /**
    <p>Used by Products.</p> */
    StateTypeEnum PRODUCT_STATE = StateTypeEnumEnum.PRODUCT_STATE;
    /**
    <p>Used by Reviews.</p> */
    StateTypeEnum REVIEW_STATE = StateTypeEnumEnum.REVIEW_STATE;
    /**
    <p>Used by PaymentStatus in Payments.</p> */
    StateTypeEnum PAYMENT_STATE = StateTypeEnumEnum.PAYMENT_STATE;
    /**
    <p>Used by QuoteRequest.</p> */
    StateTypeEnum QUOTE_REQUEST_STATE = StateTypeEnumEnum.QUOTE_REQUEST_STATE;
    /**
    <p>Used by StagedQuote.</p> */
    StateTypeEnum STAGED_QUOTE_STATE = StateTypeEnumEnum.STAGED_QUOTE_STATE;
    /**
    <p>Used by Quote.</p> */
    StateTypeEnum QUOTE_STATE = StateTypeEnumEnum.QUOTE_STATE;

    /**
     * possible values of StateTypeEnum
     */
    enum StateTypeEnumEnum implements StateTypeEnum {
        /**
         * OrderState
         */
        ORDER_STATE("OrderState"),

        /**
         * LineItemState
         */
        LINE_ITEM_STATE("LineItemState"),

        /**
         * ProductState
         */
        PRODUCT_STATE("ProductState"),

        /**
         * ReviewState
         */
        REVIEW_STATE("ReviewState"),

        /**
         * PaymentState
         */
        PAYMENT_STATE("PaymentState"),

        /**
         * QuoteRequestState
         */
        QUOTE_REQUEST_STATE("QuoteRequestState"),

        /**
         * StagedQuoteState
         */
        STAGED_QUOTE_STATE("StagedQuoteState"),

        /**
         * QuoteState
         */
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
     * factory method for a enum value of StateTypeEnum
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<StateTypeEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static StateTypeEnum[] values() {
        return StateTypeEnumEnum.values();
    }

}
