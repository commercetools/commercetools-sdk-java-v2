package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.ChangeLineItemQuantityChangeImpl;

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
 * ChangeLineItemQuantityChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLineItemQuantityChange changeLineItemQuantityChange = ChangeLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .nextValue(1)
 *             .previousValue(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChangeLineItemQuantityChangeImpl.class)
public interface ChangeLineItemQuantityChange extends Change {

    /**
     * discriminator value for ChangeLineItemQuantityChange
     */
    String CHANGE_LINE_ITEM_QUANTITY_CHANGE = "ChangeLineItemQuantityChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>changeLineItemQuantity</code></p>
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
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();
    /**
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    /**
     *  <p>Update action for <code>changeLineItemQuantity</code></p>
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
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Integer nextValue);
    
    
    /**
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Integer previousValue);
    

    /**
     * factory method
     * @return instance of ChangeLineItemQuantityChange
     */
    public static ChangeLineItemQuantityChange of(){
        return new ChangeLineItemQuantityChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy ChangeLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLineItemQuantityChange of(final ChangeLineItemQuantityChange template) {
        ChangeLineItemQuantityChangeImpl instance = new ChangeLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLineItemQuantityChange deepCopy(@Nullable final ChangeLineItemQuantityChange template) {
        if (template == null) {
            return null;
        }
        ChangeLineItemQuantityChangeImpl instance = new ChangeLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setLineItemId(template.getLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeLineItemQuantityChange
     * @return builder
     */
    public static ChangeLineItemQuantityChangeBuilder builder() {
        return ChangeLineItemQuantityChangeBuilder.of();
    }
    
    /**
     * create builder for ChangeLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLineItemQuantityChangeBuilder builder(final ChangeLineItemQuantityChange template) {
        return ChangeLineItemQuantityChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLineItemQuantityChange(Function<ChangeLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLineItemQuantityChange>";
            }
        };
    }
}
