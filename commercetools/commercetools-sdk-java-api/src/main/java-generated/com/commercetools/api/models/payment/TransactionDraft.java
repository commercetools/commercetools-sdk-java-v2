
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TransactionDraftImpl.class)
public interface TransactionDraft extends com.commercetools.api.models.CustomizableDraft<TransactionDraft> {

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
    public Money getAmount();

    /**
    *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP).
    *  If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
    */

    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
    *  <p>The state of this transaction.
    *  If not set, defaults to <code>Initial</code>.</p>
    */

    @JsonProperty("state")
    public TransactionState getState();

    /**
    *  <p>Custom Fields for the Transaction.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setTimestamp(final ZonedDateTime timestamp);

    public void setType(final TransactionType type);

    public void setAmount(final Money amount);

    public void setInteractionId(final String interactionId);

    public void setState(final TransactionState state);

    public void setCustom(final CustomFieldsDraft custom);

    public static TransactionDraft of() {
        return new TransactionDraftImpl();
    }

    public static TransactionDraft of(final TransactionDraft template) {
        TransactionDraftImpl instance = new TransactionDraftImpl();
        instance.setTimestamp(template.getTimestamp());
        instance.setType(template.getType());
        instance.setAmount(template.getAmount());
        instance.setInteractionId(template.getInteractionId());
        instance.setState(template.getState());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static TransactionDraftBuilder builder() {
        return TransactionDraftBuilder.of();
    }

    public static TransactionDraftBuilder builder(final TransactionDraft template) {
        return TransactionDraftBuilder.of(template);
    }

    default <T> T withTransactionDraft(Function<TransactionDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TransactionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransactionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionDraft>";
            }
        };
    }
}
