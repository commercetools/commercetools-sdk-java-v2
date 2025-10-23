
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.TransactionChangeValue;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionCustomTypeAction" rel="nofollow">Set Transaction Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTransactionCustomTypeChange setTransactionCustomTypeChange = SetTransactionCustomTypeChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetTransactionCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTransactionCustomTypeChangeImpl.class)
public interface SetTransactionCustomTypeChange extends Change {

    /**
     * discriminator value for SetTransactionCustomTypeChange
     */
    String SET_TRANSACTION_CUSTOM_TYPE_CHANGE = "SetTransactionCustomTypeChange";

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
     *  <p>Holds information about the updated Transaction.</p>
     * @return transaction
     */
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionChangeValue getTransaction();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param transaction value to be set
     */

    public void setTransaction(final TransactionChangeValue transaction);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * factory method
     * @return instance of SetTransactionCustomTypeChange
     */
    public static SetTransactionCustomTypeChange of() {
        return new SetTransactionCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTransactionCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTransactionCustomTypeChange of(final SetTransactionCustomTypeChange template) {
        SetTransactionCustomTypeChangeImpl instance = new SetTransactionCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(template.getTransaction());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetTransactionCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetTransactionCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTransactionCustomTypeChange deepCopy(@Nullable final SetTransactionCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetTransactionCustomTypeChangeImpl instance = new SetTransactionCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(
            com.commercetools.history.models.change_value.TransactionChangeValue.deepCopy(template.getTransaction()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetTransactionCustomTypeChange
     * @return builder
     */
    public static SetTransactionCustomTypeChangeBuilder builder() {
        return SetTransactionCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetTransactionCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTransactionCustomTypeChangeBuilder builder(final SetTransactionCustomTypeChange template) {
        return SetTransactionCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTransactionCustomTypeChange(Function<SetTransactionCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTransactionCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTransactionCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTransactionCustomTypeChange>";
            }
        };
    }
}
