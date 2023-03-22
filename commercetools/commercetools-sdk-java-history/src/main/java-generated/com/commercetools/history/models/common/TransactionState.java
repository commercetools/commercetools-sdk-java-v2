
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TransactionState {

    TransactionState INITIAL = TransactionStateEnum.INITIAL;

    TransactionState PENDING = TransactionStateEnum.PENDING;

    TransactionState SUCCESS = TransactionStateEnum.SUCCESS;

    TransactionState FAILURE = TransactionStateEnum.FAILURE;

    enum TransactionStateEnum implements TransactionState {
        INITIAL("Initial"),

        PENDING("Pending"),

        SUCCESS("Success"),

        FAILURE("Failure");
        private final String jsonName;

        private TransactionStateEnum(final String jsonName) {
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
    public static TransactionState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TransactionState() {
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

    public static Optional<TransactionState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static TransactionState[] values() {
        return TransactionStateEnum.values();
    }

}
