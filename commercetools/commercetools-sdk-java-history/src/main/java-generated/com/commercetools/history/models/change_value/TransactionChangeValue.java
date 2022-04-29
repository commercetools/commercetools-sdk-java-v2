
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TransactionChangeValueImpl.class)
public interface TransactionChangeValue {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("interactionId")
    public String getInteractionId();

    @NotNull
    @JsonProperty("timestamp")
    public String getTimestamp();

    public void setId(final String id);

    public void setInteractionId(final String interactionId);

    public void setTimestamp(final String timestamp);

    public static TransactionChangeValue of() {
        return new TransactionChangeValueImpl();
    }

    public static TransactionChangeValue of(final TransactionChangeValue template) {
        TransactionChangeValueImpl instance = new TransactionChangeValueImpl();
        instance.setId(template.getId());
        instance.setInteractionId(template.getInteractionId());
        instance.setTimestamp(template.getTimestamp());
        return instance;
    }

    public static TransactionChangeValueBuilder builder() {
        return TransactionChangeValueBuilder.of();
    }

    public static TransactionChangeValueBuilder builder(final TransactionChangeValue template) {
        return TransactionChangeValueBuilder.of(template);
    }

    default <T> T withTransactionChangeValue(Function<TransactionChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TransactionChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransactionChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionChangeValue>";
            }
        };
    }
}
