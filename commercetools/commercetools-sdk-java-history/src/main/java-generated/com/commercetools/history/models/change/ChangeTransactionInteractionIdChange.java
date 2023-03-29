
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TransactionChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTransactionInteractionIdChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionInteractionIdChange changeTransactionInteractionIdChange = ChangeTransactionInteractionIdChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .nextValue("{nextValue}")
 *             .previousValue("{previousValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTransactionInteractionIdChangeImpl.class)
public interface ChangeTransactionInteractionIdChange extends Change {

    /**
     * discriminator value for ChangeTransactionInteractionIdChange
     */
    String CHANGE_TRANSACTION_INTERACTION_ID_CHANGE = "ChangeTransactionInteractionIdChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>changeTransactionInteractionId</code> on payments</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return transaction
     */
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionChangeValue getTransaction();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Update action for <code>changeTransactionInteractionId</code> on payments</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set transaction
     * @param transaction value to be set
     */

    public void setTransaction(final TransactionChangeValue transaction);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     * factory method
     * @return instance of ChangeTransactionInteractionIdChange
     */
    public static ChangeTransactionInteractionIdChange of() {
        return new ChangeTransactionInteractionIdChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTransactionInteractionIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTransactionInteractionIdChange of(final ChangeTransactionInteractionIdChange template) {
        ChangeTransactionInteractionIdChangeImpl instance = new ChangeTransactionInteractionIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(template.getTransaction());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeTransactionInteractionIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTransactionInteractionIdChange deepCopy(
            @Nullable final ChangeTransactionInteractionIdChange template) {
        if (template == null) {
            return null;
        }
        ChangeTransactionInteractionIdChangeImpl instance = new ChangeTransactionInteractionIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(
            com.commercetools.history.models.change_value.TransactionChangeValue.deepCopy(template.getTransaction()));
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeTransactionInteractionIdChange
     * @return builder
     */
    public static ChangeTransactionInteractionIdChangeBuilder builder() {
        return ChangeTransactionInteractionIdChangeBuilder.of();
    }

    /**
     * create builder for ChangeTransactionInteractionIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTransactionInteractionIdChangeBuilder builder(
            final ChangeTransactionInteractionIdChange template) {
        return ChangeTransactionInteractionIdChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTransactionInteractionIdChange(Function<ChangeTransactionInteractionIdChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionInteractionIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionInteractionIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTransactionInteractionIdChange>";
            }
        };
    }
}
