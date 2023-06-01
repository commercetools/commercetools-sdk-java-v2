package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.commercetools.history.models.change.SetLineItemDeactivatedAtChangeImpl;

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
 * SetLineItemDeactivatedAtChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDeactivatedAtChange setLineItemDeactivatedAtChange = SetLineItemDeactivatedAtChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetLineItemDeactivatedAtChangeImpl.class)
public interface SetLineItemDeactivatedAtChange extends Change {

    /**
     * discriminator value for SetLineItemDeactivatedAtChange
     */
    String SET_LINE_ITEM_DEACTIVATED_AT_CHANGE = "SetLineItemDeactivatedAtChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setLineItemDeactivatedAt</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItemValue getLineItem();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Update action for <code>setLineItemDeactivatedAt</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set lineItem
     * @param lineItem value to be set
     */
    
    public void setLineItem(final ShoppingListLineItemValue lineItem);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final String previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final String nextValue);
    

    /**
     * factory method
     * @return instance of SetLineItemDeactivatedAtChange
     */
    public static SetLineItemDeactivatedAtChange of(){
        return new SetLineItemDeactivatedAtChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetLineItemDeactivatedAtChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemDeactivatedAtChange of(final SetLineItemDeactivatedAtChange template) {
        SetLineItemDeactivatedAtChangeImpl instance = new SetLineItemDeactivatedAtChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLineItemDeactivatedAtChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemDeactivatedAtChange deepCopy(@Nullable final SetLineItemDeactivatedAtChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemDeactivatedAtChangeImpl instance = new SetLineItemDeactivatedAtChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(com.commercetools.history.models.change_value.ShoppingListLineItemValue.deepCopy(template.getLineItem()));
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetLineItemDeactivatedAtChange
     * @return builder
     */
    public static SetLineItemDeactivatedAtChangeBuilder builder() {
        return SetLineItemDeactivatedAtChangeBuilder.of();
    }
    
    /**
     * create builder for SetLineItemDeactivatedAtChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDeactivatedAtChangeBuilder builder(final SetLineItemDeactivatedAtChange template) {
        return SetLineItemDeactivatedAtChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemDeactivatedAtChange(Function<SetLineItemDeactivatedAtChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemDeactivatedAtChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemDeactivatedAtChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemDeactivatedAtChange>";
            }
        };
    }
}
