package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import java.lang.Object;
import com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChangeImpl;

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
 * SetShoppingListLineItemCustomFieldChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShoppingListLineItemCustomFieldChange setShoppingListLineItemCustomFieldChange = SetShoppingListLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetShoppingListLineItemCustomFieldChangeImpl.class)
public interface SetShoppingListLineItemCustomFieldChange extends Change {

    /**
     * discriminator value for SetShoppingListLineItemCustomFieldChange
     */
    String SET_SHOPPING_LIST_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetShoppingListLineItemCustomFieldChange";

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
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();
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
     * set name
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     * set customTypeId
     * @param customTypeId value to be set
     */
    
    public void setCustomTypeId(final String customTypeId);
    
    
    /**
     * set lineItem
     * @param lineItem value to be set
     */
    
    public void setLineItem(final ShoppingListLineItemValue lineItem);
    
    
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
     * @return instance of SetShoppingListLineItemCustomFieldChange
     */
    public static SetShoppingListLineItemCustomFieldChange of(){
        return new SetShoppingListLineItemCustomFieldChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetShoppingListLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShoppingListLineItemCustomFieldChange of(final SetShoppingListLineItemCustomFieldChange template) {
        SetShoppingListLineItemCustomFieldChangeImpl instance = new SetShoppingListLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetShoppingListLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShoppingListLineItemCustomFieldChange deepCopy(@Nullable final SetShoppingListLineItemCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetShoppingListLineItemCustomFieldChangeImpl instance = new SetShoppingListLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setLineItem(com.commercetools.history.models.change_value.ShoppingListLineItemValue.deepCopy(template.getLineItem()));
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetShoppingListLineItemCustomFieldChange
     * @return builder
     */
    public static SetShoppingListLineItemCustomFieldChangeBuilder builder() {
        return SetShoppingListLineItemCustomFieldChangeBuilder.of();
    }
    
    /**
     * create builder for SetShoppingListLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShoppingListLineItemCustomFieldChangeBuilder builder(final SetShoppingListLineItemCustomFieldChange template) {
        return SetShoppingListLineItemCustomFieldChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShoppingListLineItemCustomFieldChange(Function<SetShoppingListLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShoppingListLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShoppingListLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShoppingListLineItemCustomFieldChange>";
            }
        };
    }
}
