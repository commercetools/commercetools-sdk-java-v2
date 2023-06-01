package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.TextLineItemValue;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.SetTextLineItemDescriptionChangeImpl;

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
 * SetTextLineItemDescriptionChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextLineItemDescriptionChange setTextLineItemDescriptionChange = SetTextLineItemDescriptionChange.builder()
 *             .change("{change}")
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetTextLineItemDescriptionChangeImpl.class)
public interface SetTextLineItemDescriptionChange extends Change {

    /**
     * discriminator value for SetTextLineItemDescriptionChange
     */
    String SET_TEXT_LINE_ITEM_DESCRIPTION_CHANGE = "SetTextLineItemDescriptionChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return textLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("textLineItem")
    public TextLineItemValue getTextLineItem();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     * set change
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set textLineItem
     * @param textLineItem value to be set
     */
    
    public void setTextLineItem(final TextLineItemValue textLineItem);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final LocalizedString previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final LocalizedString nextValue);
    

    /**
     * factory method
     * @return instance of SetTextLineItemDescriptionChange
     */
    public static SetTextLineItemDescriptionChange of(){
        return new SetTextLineItemDescriptionChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetTextLineItemDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTextLineItemDescriptionChange of(final SetTextLineItemDescriptionChange template) {
        SetTextLineItemDescriptionChangeImpl instance = new SetTextLineItemDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setTextLineItem(template.getTextLineItem());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetTextLineItemDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTextLineItemDescriptionChange deepCopy(@Nullable final SetTextLineItemDescriptionChange template) {
        if (template == null) {
            return null;
        }
        SetTextLineItemDescriptionChangeImpl instance = new SetTextLineItemDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setTextLineItem(com.commercetools.history.models.change_value.TextLineItemValue.deepCopy(template.getTextLineItem()));
        instance.setPreviousValue(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetTextLineItemDescriptionChange
     * @return builder
     */
    public static SetTextLineItemDescriptionChangeBuilder builder() {
        return SetTextLineItemDescriptionChangeBuilder.of();
    }
    
    /**
     * create builder for SetTextLineItemDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextLineItemDescriptionChangeBuilder builder(final SetTextLineItemDescriptionChange template) {
        return SetTextLineItemDescriptionChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTextLineItemDescriptionChange(Function<SetTextLineItemDescriptionChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTextLineItemDescriptionChange>";
            }
        };
    }
}
