
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TransactionImpl.class)
public interface Transaction extends com.commercetools.api.models.Customizable<Transaction> {

    /**
    *  <p>The unique ID of this object.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The time at which the transaction took place.</p>
    */

    @JsonProperty("timestamp")
    public ZonedDateTime getTimestamp();

    /**
    *  <p>The type of this transaction.</p>
    */
    @NotNull
    @JsonProperty("type")
    public TransactionType getType();

    @NotNull
    @Valid
    @JsonProperty("amount")
    public TypedMoney getAmount();

    /**
    *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP).
    *  If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
    */

    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
    *  <p>The state of this transaction.</p>
    */

    @JsonProperty("state")
    public TransactionState getState();

    /**
    *  <p>Custom Fields for the Transaction.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setTimestamp(final ZonedDateTime timestamp);

    public void setType(final TransactionType type);

    public void setAmount(final TypedMoney amount);

    public void setInteractionId(final String interactionId);

    public void setState(final TransactionState state);

    public void setCustom(final CustomFields custom);

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
        instance.setCustom(template.getCustom());
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

    public static com.fasterxml.jackson.core.type.TypeReference<Transaction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Transaction>() {
            @Override
            public String toString() {
                return "TypeReference<Transaction>";
            }
        };
    }
}
