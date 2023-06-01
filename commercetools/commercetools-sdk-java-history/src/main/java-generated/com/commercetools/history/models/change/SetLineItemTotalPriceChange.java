package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.change.SetLineItemTotalPriceChangeImpl;

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
 * SetLineItemTotalPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemTotalPriceChange setLineItemTotalPriceChange = SetLineItemTotalPriceChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetLineItemTotalPriceChangeImpl.class)
public interface SetLineItemTotalPriceChange extends Change {

    /**
     * discriminator value for SetLineItemTotalPriceChange
     */
    String SET_LINE_ITEM_TOTAL_PRICE_CHANGE = "SetLineItemTotalPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setLineItemTotalPrice</code></p>
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
    public LocalizedString getLineItem();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemTotalPrice</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set lineItem
     * @param lineItem value to be set
     */
    
    public void setLineItem(final LocalizedString lineItem);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Money nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Money previousValue);
    

    /**
     * factory method
     * @return instance of SetLineItemTotalPriceChange
     */
    public static SetLineItemTotalPriceChange of(){
        return new SetLineItemTotalPriceChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetLineItemTotalPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemTotalPriceChange of(final SetLineItemTotalPriceChange template) {
        SetLineItemTotalPriceChangeImpl instance = new SetLineItemTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLineItemTotalPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemTotalPriceChange deepCopy(@Nullable final SetLineItemTotalPriceChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemTotalPriceChangeImpl instance = new SetLineItemTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setNextValue(com.commercetools.history.models.common.Money.deepCopy(template.getNextValue()));
        instance.setPreviousValue(com.commercetools.history.models.common.Money.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetLineItemTotalPriceChange
     * @return builder
     */
    public static SetLineItemTotalPriceChangeBuilder builder() {
        return SetLineItemTotalPriceChangeBuilder.of();
    }
    
    /**
     * create builder for SetLineItemTotalPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemTotalPriceChangeBuilder builder(final SetLineItemTotalPriceChange template) {
        return SetLineItemTotalPriceChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemTotalPriceChange(Function<SetLineItemTotalPriceChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemTotalPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemTotalPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemTotalPriceChange>";
            }
        };
    }
}
