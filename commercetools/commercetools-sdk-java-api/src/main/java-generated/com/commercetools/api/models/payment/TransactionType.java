
package com.commercetools.api.models.payment;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TransactionType {

    TransactionType AUTHORIZATION = TransactionTypeEnum.AUTHORIZATION;

    TransactionType CANCEL_AUTHORIZATION = TransactionTypeEnum.CANCEL_AUTHORIZATION;

    TransactionType CHARGE = TransactionTypeEnum.CHARGE;

    TransactionType REFUND = TransactionTypeEnum.REFUND;

    TransactionType CHARGEBACK = TransactionTypeEnum.CHARGEBACK;

    enum TransactionTypeEnum implements TransactionType {
        AUTHORIZATION("Authorization"),

        CANCEL_AUTHORIZATION("CancelAuthorization"),

        CHARGE("Charge"),

        REFUND("Refund"),

        CHARGEBACK("Chargeback");
        private final String jsonName;

        private TransactionTypeEnum(final String jsonName) {
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
    public static TransactionType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TransactionType() {
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

    public static Optional<TransactionType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static TransactionType[] values() {
        return TransactionTypeEnum.values();
    }
}
