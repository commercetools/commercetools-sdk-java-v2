
package com.commercetools.api.models.order;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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
    }

    @JsonValue
    String getJsonName();

    String name();

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
        });
    }

    public static Optional<ReturnPaymentState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ReturnPaymentState[] values() {
        return ReturnPaymentStateEnum.values();
    }
}
