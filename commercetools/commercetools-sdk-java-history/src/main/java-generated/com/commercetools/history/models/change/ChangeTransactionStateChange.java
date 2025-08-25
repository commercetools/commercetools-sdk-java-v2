
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.TransactionChangeValue;
import com.commercetools.history.models.common.TransactionState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentChangeTransactionStateAction" rel="nofollow">Change TransactionState</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionStateChange changeTransactionStateChange = ChangeTransactionStateChange.builder()
 *             .change("{change}")
 *             .previousValue(TransactionState.INITIAL)
 *             .nextValue(TransactionState.INITIAL)
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeTransactionStateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTransactionStateChangeImpl.class)
public interface ChangeTransactionStateChange extends Change {

    /**
     * discriminator value for ChangeTransactionStateChange
     */
    String CHANGE_TRANSACTION_STATE_CHANGE = "ChangeTransactionStateChange";

    /**
     *
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public TransactionState getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public TransactionState getNextValue();

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @return transaction
     */
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionChangeValue getTransaction();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TransactionState previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TransactionState nextValue);

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param transaction value to be set
     */

    public void setTransaction(final TransactionChangeValue transaction);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    public ChangeTransactionStateChange copyDeep();

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTransaction(
            com.commercetools.history.models.change_value.TransactionChangeValue.deepCopy(template.getTransaction()));
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
