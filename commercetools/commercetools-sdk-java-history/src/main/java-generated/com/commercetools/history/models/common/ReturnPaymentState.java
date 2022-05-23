
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnPaymentState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReturnPaymentState {

    ReturnPaymentState NON_REFUNDABLE = ReturnPaymentStateEnum.NON_REFUNDABLE;

    ReturnPaymentState INITIAL = ReturnPaymentStateEnum.INITIAL;

    ReturnPaymentState REFUNDED = ReturnPaymentStateEnum.REFUNDED;

    ReturnPaymentState NOT_REFUNDED = ReturnPaymentStateEnum.NOT_REFUNDED;

    enum ReturnPaymentStateEnum implements ReturnPaymentState {
        NON_REFUNDABLE("NonRefundable"),

        INITIAL("Initial"),

        REFUNDED("Refunded"),

        NOT_REFUNDED("NotRefunded");
        private final String jsonName;

        private ReturnPaymentStateEnum(final String jsonName) {
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
    public static ReturnPaymentState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ReturnPaymentState() {
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

    public static Optional<ReturnPaymentState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ReturnPaymentState[] values() {
        return ReturnPaymentStateEnum.values();
    }
}
