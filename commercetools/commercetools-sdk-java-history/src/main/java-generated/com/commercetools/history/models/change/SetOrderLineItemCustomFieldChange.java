package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import java.lang.Object;
import com.commercetools.history.models.change.SetOrderLineItemCustomFieldChangeImpl;

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
 * SetOrderLineItemCustomFieldChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderLineItemCustomFieldChange setOrderLineItemCustomFieldChange = SetOrderLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .customTypeId("{customTypeId}")
 *             .name("{name}")
 *             .variant("{variant}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetOrderLineItemCustomFieldChangeImpl.class)
public interface SetOrderLineItemCustomFieldChange extends Change {

    /**
     * discriminator value for SetOrderLineItemCustomFieldChange
     */
    String SET_ORDER_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetOrderLineItemCustomFieldChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setLineItemCustomField</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();
    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();
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
    @JsonProperty("nextValue")
    public Object getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemCustomField</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set customTypeId
     * @param customTypeId value to be set
     */
    
    public void setCustomTypeId(final String customTypeId);
    
    
    /**
     * set name
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     * set variant
     * @param variant value to be set
     */
    
    public void setVariant(final String variant);
    
    
    /**
     * set lineItem
     * @param lineItem value to be set
     */
    
    public void setLineItem(final LocalizedString lineItem);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Object nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Object previousValue);
    

    /**
     * factory method
     * @return instance of SetOrderLineItemCustomFieldChange
     */
    public static SetOrderLineItemCustomFieldChange of(){
        return new SetOrderLineItemCustomFieldChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetOrderLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetOrderLineItemCustomFieldChange of(final SetOrderLineItemCustomFieldChange template) {
        SetOrderLineItemCustomFieldChangeImpl instance = new SetOrderLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setName(template.getName());
        instance.setVariant(template.getVariant());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetOrderLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetOrderLineItemCustomFieldChange deepCopy(@Nullable final SetOrderLineItemCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetOrderLineItemCustomFieldChangeImpl instance = new SetOrderLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setName(template.getName());
        instance.setVariant(template.getVariant());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetOrderLineItemCustomFieldChange
     * @return builder
     */
    public static SetOrderLineItemCustomFieldChangeBuilder builder() {
        return SetOrderLineItemCustomFieldChangeBuilder.of();
    }
    
    /**
     * create builder for SetOrderLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderLineItemCustomFieldChangeBuilder builder(final SetOrderLineItemCustomFieldChange template) {
        return SetOrderLineItemCustomFieldChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetOrderLineItemCustomFieldChange(Function<SetOrderLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderLineItemCustomFieldChange>";
            }
        };
    }
}
