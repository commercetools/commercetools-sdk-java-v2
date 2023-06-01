package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.SetLineItemProductKeyChangeImpl;

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
 * SetLineItemProductKeyChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemProductKeyChange setLineItemProductKeyChange = SetLineItemProductKeyChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .variant("{variant}")
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
@JsonDeserialize(as = SetLineItemProductKeyChangeImpl.class)
public interface SetLineItemProductKeyChange extends Change {

    /**
     * discriminator value for SetLineItemProductKeyChange
     */
    String SET_LINE_ITEM_PRODUCT_KEY_CHANGE = "SetLineItemProductKeyChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setLineItemProductKey</code></p>
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
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();
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
     *  <p>Update action for <code>setLineItemProductKey</code></p>
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
     * set variant
     * @param variant value to be set
     */
    
    public void setVariant(final String variant);
    
    
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
     * @return instance of SetLineItemProductKeyChange
     */
    public static SetLineItemProductKeyChange of(){
        return new SetLineItemProductKeyChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetLineItemProductKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemProductKeyChange of(final SetLineItemProductKeyChange template) {
        SetLineItemProductKeyChangeImpl instance = new SetLineItemProductKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setVariant(template.getVariant());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLineItemProductKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemProductKeyChange deepCopy(@Nullable final SetLineItemProductKeyChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemProductKeyChangeImpl instance = new SetLineItemProductKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setLineItemId(template.getLineItemId());
        instance.setVariant(template.getVariant());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetLineItemProductKeyChange
     * @return builder
     */
    public static SetLineItemProductKeyChangeBuilder builder() {
        return SetLineItemProductKeyChangeBuilder.of();
    }
    
    /**
     * create builder for SetLineItemProductKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemProductKeyChangeBuilder builder(final SetLineItemProductKeyChange template) {
        return SetLineItemProductKeyChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemProductKeyChange(Function<SetLineItemProductKeyChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemProductKeyChange>";
            }
        };
    }
}
