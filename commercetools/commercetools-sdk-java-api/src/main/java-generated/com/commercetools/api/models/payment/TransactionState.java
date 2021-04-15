package com.commercetools.api.models.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
    }

    @JsonValue
    String getJsonName();
    String name();

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
        });
    }

    public static Optional<TransactionState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    public static TransactionState[] values() {
        return TransactionStateEnum.values();
    }
}
