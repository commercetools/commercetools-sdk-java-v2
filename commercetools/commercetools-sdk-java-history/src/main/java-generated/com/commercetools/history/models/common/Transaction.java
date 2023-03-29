
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Transaction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Transaction transaction = Transaction.builder()
 *             .id("{id}")
 *             .timestamp("{timestamp}")
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .interactionId("{interactionId}")
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
     *  <p>Time at which the transaction took place.</p>
     * @return timestamp
     */
    @NotNull
    @JsonProperty("timestamp")
    public String getTimestamp();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public TransactionType getType();

    /**
     *
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    /**
     *  <p>Identifier used by the interface that manages the transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
     * @return interactionId
     */
    @NotNull
    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
     *
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Time at which the transaction took place.</p>
     * @param timestamp value to be set
     */

    public void setTimestamp(final String timestamp);

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final TransactionType type);

    /**
     * set amount
     * @param amount value to be set
     */

    public void setAmount(final Money amount);

    /**
     *  <p>Identifier used by the interface that manages the transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
     * @param interactionId value to be set
     */

    public void setInteractionId(final String interactionId);

    /**
     * set state
     * @param state value to be set
     */

    public void setState(final TransactionState state);

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
        return instance;
    }

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
        instance.setAmount(com.commercetools.history.models.common.Money.deepCopy(template.getAmount()));
        instance.setInteractionId(template.getInteractionId());
        instance.setState(template.getState());
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
