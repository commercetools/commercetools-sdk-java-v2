package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Transaction;
import com.commercetools.history.models.change.AddTransactionChangeImpl;

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
 * AddTransactionChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddTransactionChange addTransactionChange = AddTransactionChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AddTransactionChangeImpl.class)
public interface AddTransactionChange extends Change {

    /**
     * discriminator value for AddTransactionChange
     */
    String ADD_TRANSACTION_CHANGE = "AddTransactionChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>addTransaction</code> on payments</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Transaction getNextValue();

    /**
     *  <p>Update action for <code>addTransaction</code> on payments</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Transaction nextValue);
    

    /**
     * factory method
     * @return instance of AddTransactionChange
     */
    public static AddTransactionChange of(){
        return new AddTransactionChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy AddTransactionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddTransactionChange of(final AddTransactionChange template) {
        AddTransactionChangeImpl instance = new AddTransactionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddTransactionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddTransactionChange deepCopy(@Nullable final AddTransactionChange template) {
        if (template == null) {
            return null;
        }
        AddTransactionChangeImpl instance = new AddTransactionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.Transaction.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddTransactionChange
     * @return builder
     */
    public static AddTransactionChangeBuilder builder() {
        return AddTransactionChangeBuilder.of();
    }
    
    /**
     * create builder for AddTransactionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddTransactionChangeBuilder builder(final AddTransactionChange template) {
        return AddTransactionChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddTransactionChange(Function<AddTransactionChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddTransactionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddTransactionChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddTransactionChange>";
            }
        };
    }
}
