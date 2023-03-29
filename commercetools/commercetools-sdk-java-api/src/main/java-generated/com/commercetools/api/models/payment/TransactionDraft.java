
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
public interface TransactionDraft extends com.commercetools.api.models.CustomizableDraft<TransactionDraft>,
        io.vrap.rmf.base.client.Draft<TransactionDraft> {

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @return timestamp
     */

    @JsonProperty("timestamp")
    public ZonedDateTime getTimestamp();

    /**
     *  <p>Type of the Transaction.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public TransactionType getType();

    /**
     *  <p>Money value for the Transaction.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     * @return interactionId
     */

    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
     *  <p>State of the Transaction.</p>
     * @return state
     */

    @JsonProperty("state")
    public TransactionState getState();

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @param timestamp value to be set
     */

    public void setTimestamp(final ZonedDateTime timestamp);

    /**
     *  <p>Type of the Transaction.</p>
     * @param type value to be set
     */

    public void setType(final TransactionType type);

    /**
     *  <p>Money value for the Transaction.</p>
     * @param amount value to be set
     */

    public void setAmount(final Money amount);

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     * @param interactionId value to be set
     */

    public void setInteractionId(final String interactionId);

    /**
     *  <p>State of the Transaction.</p>
     * @param state value to be set
     */

    public void setState(final TransactionState state);

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of TransactionDraft
     */
    public static TransactionDraft of() {
        return new TransactionDraftImpl();
    }

    /**
     * factory method to create a shallow copy TransactionDraft
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of TransactionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionDraft deepCopy(@Nullable final TransactionDraft template) {
        if (template == null) {
            return null;
        }
        TransactionDraftImpl instance = new TransactionDraftImpl();
        instance.setTimestamp(template.getTimestamp());
        instance.setType(template.getType());
        instance.setAmount(com.commercetools.api.models.common.Money.deepCopy(template.getAmount()));
        instance.setInteractionId(template.getInteractionId());
        instance.setState(template.getState());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for TransactionDraft
     * @return builder
     */
    public static TransactionDraftBuilder builder() {
        return TransactionDraftBuilder.of();
    }

    /**
     * create builder for TransactionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionDraftBuilder builder(final TransactionDraft template) {
        return TransactionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionDraft(Function<TransactionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransactionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransactionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionDraft>";
            }
        };
    }
}
