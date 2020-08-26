package com.commercetools.api.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum TransactionState {

    
    @JsonProperty("Initial")
    INITIAL("Initial"),
    
    
    @JsonProperty("Pending")
    PENDING("Pending"),
    
    
    @JsonProperty("Success")
    SUCCESS("Success"),
    
    
    @JsonProperty("Failure")
    FAILURE("Failure");

    private final String jsonName;

    private TransactionState(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<TransactionState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}
