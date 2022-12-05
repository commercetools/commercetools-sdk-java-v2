
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

/**
 * TransactionDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionDraft transactionDraft = TransactionDraft.builder()
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionDraftImpl.class)
public interface TransactionDraft extends com.commercetools.api.models.CustomizableDraft<TransactionDraft> {

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     */

    @JsonProperty("timestamp")
    public ZonedDateTime getTimestamp();

    /**
     *  <p>Type of the Transaction.</p>
     */
    @NotNull
    @JsonProperty("type")
    public TransactionType getType();

    /**
     *  <p>Money value for the Transaction.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     */

    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
     *  <p>State of the Transaction.</p>
     */

    @JsonProperty("state")
    public TransactionState getState();

    /**
     *  <p>Custom Fields of the Transaction.</p>
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
