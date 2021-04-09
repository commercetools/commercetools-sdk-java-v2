
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TransactionImpl.class)
public interface Transaction {

    /**
    *  <p>The unique ID of this object.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The time at which the transaction took place.</p>
    */
    @NotNull
    @JsonProperty("timestamp")
    public String getTimestamp();

    @NotNull
    @JsonProperty("type")
    public TransactionType getType();

    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    /**
    *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
    */
    @NotNull
    @JsonProperty("interactionId")
    public String getInteractionId();

    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    public void setId(final String id);

    public void setTimestamp(final String timestamp);

    public void setType(final TransactionType type);

    public void setAmount(final Money amount);

    public void setInteractionId(final String interactionId);

    public void setState(final TransactionState state);

    public static Transaction of() {
        return new TransactionImpl();
    }

    public static Transaction of(final Transaction template) {
        TransactionImpl instance = new TransactionImpl();
        instance.setId(template.getId());
        instance.setTimestamp(template.getTimestamp());
        instance.setType(template.getType());
        instance.setAmount(template.getAmount());
        instance.setInteractionId(template.getInteractionId());
        instance.setState(template.getState());
        return instance;
    }

    public static TransactionBuilder builder() {
        return TransactionBuilder.of();
    }

    public static TransactionBuilder builder(final Transaction template) {
        return TransactionBuilder.of(template);
    }

    default <T> T withTransaction(Function<Transaction, T> helper) {
        return helper.apply(this);
    }
}
