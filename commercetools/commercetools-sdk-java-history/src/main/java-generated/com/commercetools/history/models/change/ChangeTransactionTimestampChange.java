package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.TransactionChangeValue;
import com.commercetools.history.models.change.ChangeTransactionTimestampChangeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ChangeTransactionTimestampChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionTimestampChange changeTransactionTimestampChange = ChangeTransactionTimestampChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .nextValue("{nextValue}")
 *             .previousValue("{previousValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChangeTransactionTimestampChangeImpl.class)
public interface ChangeTransactionTimestampChange extends Change {

    /**
     * discriminator value for ChangeTransactionTimestampChange
     */
    String CHANGE_TRANSACTION_TIMESTAMP_CHANGE = "ChangeTransactionTimestampChange";

    /**
     *  <p>Update action for <code>changeTransactionTimestamp</code> on payments</p>
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
    public String getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Update action for <code>changeTransactionTimestamp</code> on payments</p>
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
     * @return instance of ChangeTransactionTimestampChange
     */
    public static ChangeTransactionTimestampChange of(){
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
        instance.setTransaction(template.getTransaction());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

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
        instance.setTransaction(com.commercetools.history.models.change_value.TransactionChangeValue.deepCopy(template.getTransaction()));
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
