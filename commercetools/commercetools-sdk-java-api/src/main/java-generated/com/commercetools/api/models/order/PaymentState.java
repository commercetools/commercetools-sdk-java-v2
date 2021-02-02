
package com.commercetools.api.models.order;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface PaymentState {

    PaymentState BALANCE_DUE = PaymentStateEnum.BALANCE_DUE;

    PaymentState FAILED = PaymentStateEnum.FAILED;

    PaymentState PENDING = PaymentStateEnum.PENDING;

    PaymentState CREDIT_OWED = PaymentStateEnum.CREDIT_OWED;

    PaymentState PAID = PaymentStateEnum.PAID;

    enum PaymentStateEnum implements PaymentState {
        BALANCE_DUE("BalanceDue"),

        FAILED("Failed"),

        PENDING("Pending"),

        CREDIT_OWED("CreditOwed"),

        PAID("Paid");
        private final String jsonName;

        private PaymentStateEnum(final String jsonName) {
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
    public static PaymentState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new PaymentState() {
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

    public static Optional<PaymentState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static PaymentState[] values() {
        return PaymentStateEnum.values();
    }
}
