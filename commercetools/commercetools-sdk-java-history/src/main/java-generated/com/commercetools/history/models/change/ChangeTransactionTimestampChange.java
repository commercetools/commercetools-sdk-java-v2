
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.TransactionChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentChangeTransactionTimestampAction" rel="nofollow">Change TransactionTimestamp</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionTimestampChange changeTransactionTimestampChange = ChangeTransactionTimestampChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeTransactionTimestampChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTransactionTimestampChangeImpl.class)
public interface ChangeTransactionTimestampChange extends Change {

    /**
     * discriminator value for ChangeTransactionTimestampChange
     */
    String CHANGE_TRANSACTION_TIMESTAMP_CHANGE = "ChangeTransactionTimestampChange";

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
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

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

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param transaction value to be set
     */

    public void setTransaction(final TransactionChangeValue transaction);

    /**
     * factory method
     * @return instance of ChangeTransactionTimestampChange
     */
    public static ChangeTransactionTimestampChange of() {
        return new ChangeTransactionTimestampChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTransactionTimestampChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTransactionTimestampChange of(final ChangeTransactionTimestampChange template) {
        ChangeTransactionTimestampChangeImpl instance = new ChangeTransactionTimestampChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    public ChangeTransactionTimestampChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeTransactionTimestampChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTransactionTimestampChange deepCopy(@Nullable final ChangeTransactionTimestampChange template) {
        if (template == null) {
            return null;
        }
        ChangeTransactionTimestampChangeImpl instance = new ChangeTransactionTimestampChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTransaction(
            com.commercetools.history.models.change_value.TransactionChangeValue.deepCopy(template.getTransaction()));
        return instance;
    }

    /**
     * builder factory method for ChangeTransactionTimestampChange
     * @return builder
     */
    public static ChangeTransactionTimestampChangeBuilder builder() {
        return ChangeTransactionTimestampChangeBuilder.of();
    }

    /**
     * create builder for ChangeTransactionTimestampChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTransactionTimestampChangeBuilder builder(final ChangeTransactionTimestampChange template) {
        return ChangeTransactionTimestampChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTransactionTimestampChange(Function<ChangeTransactionTimestampChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionTimestampChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTransactionTimestampChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTransactionTimestampChange>";
            }
        };
    }
}
