
package com.commercetools.history.models.common;

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

    StateTypeEnum ORDER_STATE = StateTypeEnumEnum.ORDER_STATE;

    StateTypeEnum RECURRING_ORDER_STATE = StateTypeEnumEnum.RECURRING_ORDER_STATE;

    StateTypeEnum LINE_ITEM_STATE = StateTypeEnumEnum.LINE_ITEM_STATE;

    StateTypeEnum PRODUCT_STATE = StateTypeEnumEnum.PRODUCT_STATE;

    StateTypeEnum REVIEW_STATE = StateTypeEnumEnum.REVIEW_STATE;

    StateTypeEnum PAYMENT_STATE = StateTypeEnumEnum.PAYMENT_STATE;

    StateTypeEnum QUOTE_REQUEST_STATE = StateTypeEnumEnum.QUOTE_REQUEST_STATE;

    StateTypeEnum STAGED_QUOTE_STATE = StateTypeEnumEnum.STAGED_QUOTE_STATE;

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
         * RecurringOrderState
         */
        RECURRING_ORDER_STATE("RecurringOrderState"),

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
