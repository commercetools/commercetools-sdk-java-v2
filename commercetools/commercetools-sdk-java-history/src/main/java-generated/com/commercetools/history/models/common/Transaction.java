
package com.commercetools.history.models.common;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents a financial transaction typically created as a result of a notification from the payment service.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Transaction transaction = Transaction.builder()
 *             .id("{id}")
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionImpl.class)
public interface Transaction {

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @return timestamp
     */

    @JsonProperty("timestamp")
    public ZonedDateTime getTimestamp();

    /**
     *  <p>Type of the Transaction. For example, <code>Authorization</code>.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public TransactionType getType();

    /**
     *  <p>Money value of the Transaction.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public CentPrecisionMoney getAmount();

    /**
     *  <p>Identifier used by the interface that manages the Transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction can be found with this ID.</p>
     * @return interactionId
     */

    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
     *  <p>State of the Transaction.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    /**
     *  <p>Custom Fields defined for the Transaction.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @param timestamp value to be set
     */

    public void setTimestamp(final ZonedDateTime timestamp);

    /**
     *  <p>Type of the Transaction. For example, <code>Authorization</code>.</p>
     * @param type value to be set
     */

    public void setType(final TransactionType type);

    /**
     *  <p>Money value of the Transaction.</p>
     * @param amount value to be set
     */

    public void setAmount(final CentPrecisionMoney amount);

    /**
     *  <p>Identifier used by the interface that manages the Transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction can be found with this ID.</p>
     * @param interactionId value to be set
     */

    public void setInteractionId(final String interactionId);

    /**
     *  <p>State of the Transaction.</p>
     * @param state value to be set
     */

    public void setState(final TransactionState state);

    /**
     *  <p>Custom Fields defined for the Transaction.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of Transaction
     */
    public static Transaction of() {
        return new TransactionImpl();
    }

    /**
     * factory method to create a shallow copy Transaction
     * @param template instance to be copied
     * @return copy instance
     */
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

    public Transaction copyDeep();

    /**
     * factory method to create a deep copy of Transaction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Transaction deepCopy(@Nullable final Transaction template) {
        if (template == null) {
            return null;
        }
        TransactionImpl instance = new TransactionImpl();
        instance.setId(template.getId());
        instance.setTimestamp(template.getTimestamp());
        instance.setType(template.getType());
        instance.setAmount(com.commercetools.history.models.common.CentPrecisionMoney.deepCopy(template.getAmount()));
        instance.setInteractionId(template.getInteractionId());
        instance.setState(template.getState());
        instance.setCustom(com.commercetools.history.models.common.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for Transaction
     * @return builder
     */
    public static TransactionBuilder builder() {
        return TransactionBuilder.of();
    }

    /**
     * create builder for Transaction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionBuilder builder(final Transaction template) {
        return TransactionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransaction(Function<Transaction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Transaction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Transaction>() {
            @Override
            public String toString() {
                return "TypeReference<Transaction>";
            }
        };
    }
}
