package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChangeImpl;

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
 * SetCustomLineItemTaxCategoryChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTaxCategoryChange setCustomLineItemTaxCategoryChange = SetCustomLineItemTaxCategoryChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
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
@JsonDeserialize(as = SetCustomLineItemTaxCategoryChangeImpl.class)
public interface SetCustomLineItemTaxCategoryChange extends Change {

    /**
     * discriminator value for SetCustomLineItemTaxCategoryChange
     */
    String SET_CUSTOM_LINE_ITEM_TAX_CATEGORY_CHANGE = "SetCustomLineItemTaxCategoryChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setCustomLineItemTaxCategory</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();
    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     *  <p>Update action for <code>setCustomLineItemTaxCategory</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set customLineItem
     * @param customLineItem value to be set
     */
    
    public void setCustomLineItem(final LocalizedString customLineItem);
    
    
    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */
    
    public void setCustomLineItemId(final String customLineItemId);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Reference nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Reference previousValue);
    

    /**
     * factory method
     * @return instance of SetCustomLineItemTaxCategoryChange
     */
    public static SetCustomLineItemTaxCategoryChange of(){
        return new SetCustomLineItemTaxCategoryChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetCustomLineItemTaxCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemTaxCategoryChange of(final SetCustomLineItemTaxCategoryChange template) {
        SetCustomLineItemTaxCategoryChangeImpl instance = new SetCustomLineItemTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomLineItemTaxCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomLineItemTaxCategoryChange deepCopy(@Nullable final SetCustomLineItemTaxCategoryChange template) {
        if (template == null) {
            return null;
        }
        SetCustomLineItemTaxCategoryChangeImpl instance = new SetCustomLineItemTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        instance.setPreviousValue(com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemTaxCategoryChange
     * @return builder
     */
    public static SetCustomLineItemTaxCategoryChangeBuilder builder() {
        return SetCustomLineItemTaxCategoryChangeBuilder.of();
    }
    
    /**
     * create builder for SetCustomLineItemTaxCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemTaxCategoryChangeBuilder builder(final SetCustomLineItemTaxCategoryChange template) {
        return SetCustomLineItemTaxCategoryChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemTaxCategoryChange(Function<SetCustomLineItemTaxCategoryChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxCategoryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxCategoryChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemTaxCategoryChange>";
            }
        };
    }
}
