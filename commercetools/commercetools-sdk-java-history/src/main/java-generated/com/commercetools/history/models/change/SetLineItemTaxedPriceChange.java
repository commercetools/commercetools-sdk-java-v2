package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TaxedItemPrice;
import com.commercetools.history.models.change.SetLineItemTaxedPriceChangeImpl;

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
 * SetLineItemTaxedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemTaxedPriceChange setLineItemTaxedPriceChange = SetLineItemTaxedPriceChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
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
@JsonDeserialize(as = SetLineItemTaxedPriceChangeImpl.class)
public interface SetLineItemTaxedPriceChange extends Change {

    /**
     * discriminator value for SetLineItemTaxedPriceChange
     */
    String SET_LINE_ITEM_TAXED_PRICE_CHANGE = "SetLineItemTaxedPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setLineItemTaxedPrice</code></p>
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
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxedItemPrice getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxedItemPrice getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemTaxedPrice</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set lineItem
     * @param lineItem value to be set
     */
    
    public void setLineItem(final LocalizedString lineItem);
    
    
    /**
     * set lineItemId
     * @param lineItemId value to be set
     */
    
    public void setLineItemId(final String lineItemId);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final TaxedItemPrice nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final TaxedItemPrice previousValue);
    

    /**
     * factory method
     * @return instance of SetLineItemTaxedPriceChange
     */
    public static SetLineItemTaxedPriceChange of(){
        return new SetLineItemTaxedPriceChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetLineItemTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemTaxedPriceChange of(final SetLineItemTaxedPriceChange template) {
        SetLineItemTaxedPriceChangeImpl instance = new SetLineItemTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLineItemTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemTaxedPriceChange deepCopy(@Nullable final SetLineItemTaxedPriceChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemTaxedPriceChangeImpl instance = new SetLineItemTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setLineItemId(template.getLineItemId());
        instance.setNextValue(com.commercetools.history.models.common.TaxedItemPrice.deepCopy(template.getNextValue()));
        instance.setPreviousValue(com.commercetools.history.models.common.TaxedItemPrice.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetLineItemTaxedPriceChange
     * @return builder
     */
    public static SetLineItemTaxedPriceChangeBuilder builder() {
        return SetLineItemTaxedPriceChangeBuilder.of();
    }
    
    /**
     * create builder for SetLineItemTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemTaxedPriceChangeBuilder builder(final SetLineItemTaxedPriceChange template) {
        return SetLineItemTaxedPriceChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemTaxedPriceChange(Function<SetLineItemTaxedPriceChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemTaxedPriceChange>";
            }
        };
    }
}
