
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TransactionChangeValue;
import com.commercetools.history.models.common.TransactionState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTransactionStateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionStateChange changeTransactionStateChange = ChangeTransactionStateChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .nextValue(TransactionState.INITIAL)
 *             .previousValue(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTransactionStateChangeImpl.class)
public interface ChangeTransactionStateChange extends Change {

    /**
     * discriminator value for ChangeTransactionStateChange
     */
    String CHANGE_TRANSACTION_STATE_CHANGE = "ChangeTransactionStateChange";

    /**
     *  <p>Update action for <code>changeTransactionState</code> on payments</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

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
    public TransactionState getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public TransactionState getPreviousValue();

    /**
     *  <p>Update action for <code>changeTransactionState</code> on payments</p>
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

    public void setNextValue(final TransactionState nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TransactionState previousValue);

    /**
     * factory method
     * @return instance of ChangeTransactionStateChange
     */
    public static ChangeTransactionStateChange of() {
        return new ChangeTransactionStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTransactionStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTransactionStateChange of(final ChangeTransactionStateChange template) {
        ChangeTransactionStateChangeImpl instance = new ChangeTransactionStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(template.getTransaction());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeTransactionStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTransactionStateChange deepCopy(@Nullable final ChangeTransactionStateChange template) {
        if (template == null) {
            return null;
        }
        ChangeTransactionStateChangeImpl instance = new ChangeTransactionStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(Optional.ofNullable(template.getTransaction())
                .map(com.commercetools.history.models.change_value.TransactionChangeValue::deepCopy)
                .orElse(null));
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeTransactionStateChange
     * @return builder
     */
    public static ChangeTransactionStateChangeBuilder builder() {
        return ChangeTransactionStateChangeBuilder.of();
    }

    /**
     * create builder for ChangeTransactionStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTransactionStateChangeBuilder builder(final ChangeTransactionStateChange template) {
        return ChangeTransactionStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTransactionStateChange(Function<ChangeTransactionStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTransactionStateChange>";
            }
        };
    }
}
