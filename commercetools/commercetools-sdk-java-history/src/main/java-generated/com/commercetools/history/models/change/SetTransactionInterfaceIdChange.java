
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.TransactionChangeValue;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTransactionInterfaceIdChange setTransactionInterfaceIdChange = SetTransactionInterfaceIdChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetTransactionInterfaceIdChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTransactionInterfaceIdChangeImpl.class)
public interface SetTransactionInterfaceIdChange extends Change {

    /**
     * discriminator value for SetTransactionInterfaceIdChange
     */
    String SET_TRANSACTION_INTERFACE_ID_CHANGE = "SetTransactionInterfaceIdChange";

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

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of SetTransactionInterfaceIdChange
     */
    public static SetTransactionInterfaceIdChange of() {
        return new SetTransactionInterfaceIdChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTransactionInterfaceIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTransactionInterfaceIdChange of(final SetTransactionInterfaceIdChange template) {
        SetTransactionInterfaceIdChangeImpl instance = new SetTransactionInterfaceIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(template.getTransaction());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetTransactionInterfaceIdChange copyDeep();

    /**
     * factory method to create a deep copy of SetTransactionInterfaceIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTransactionInterfaceIdChange deepCopy(@Nullable final SetTransactionInterfaceIdChange template) {
        if (template == null) {
            return null;
        }
        SetTransactionInterfaceIdChangeImpl instance = new SetTransactionInterfaceIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(
            com.commercetools.history.models.change_value.TransactionChangeValue.deepCopy(template.getTransaction()));
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetTransactionInterfaceIdChange
     * @return builder
     */
    public static SetTransactionInterfaceIdChangeBuilder builder() {
        return SetTransactionInterfaceIdChangeBuilder.of();
    }

    /**
     * create builder for SetTransactionInterfaceIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTransactionInterfaceIdChangeBuilder builder(final SetTransactionInterfaceIdChange template) {
        return SetTransactionInterfaceIdChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTransactionInterfaceIdChange(Function<SetTransactionInterfaceIdChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<SetTransactionInterfaceIdChange> typeReference() {
        return new tools.jackson.core.type.TypeReference<SetTransactionInterfaceIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTransactionInterfaceIdChange>";
            }
        };
    }
}
