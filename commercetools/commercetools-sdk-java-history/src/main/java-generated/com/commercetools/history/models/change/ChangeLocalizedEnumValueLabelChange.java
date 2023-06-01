package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChangeImpl;

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
 * ChangeLocalizedEnumValueLabelChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLocalizedEnumValueLabelChange changeLocalizedEnumValueLabelChange = ChangeLocalizedEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .valueKey("{valueKey}")
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
@JsonDeserialize(as = ChangeLocalizedEnumValueLabelChangeImpl.class)
public interface ChangeLocalizedEnumValueLabelChange extends Change {

    /**
     * discriminator value for ChangeLocalizedEnumValueLabelChange
     */
    String CHANGE_LOCALIZED_ENUM_VALUE_LABEL_CHANGE = "ChangeLocalizedEnumValueLabelChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>changeLocalizedEnumValueLabel</code> on types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *  <p>The name of the field definition updated.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();
    /**
     *  <p>The name of the attribute updated.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    /**
     *  <p>Key of the values that was updated</p>
     * @return valueKey
     */
    @NotNull
    @JsonProperty("valueKey")
    public String getValueKey();
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
     *  <p>Update action for <code>changeLocalizedEnumValueLabel</code> on types</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     *  <p>The name of the field definition updated.</p>
     * @param fieldName value to be set
     */
    
    public void setFieldName(final String fieldName);
    
    
    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     */
    
    public void setAttributeName(final String attributeName);
    
    
    /**
     *  <p>Key of the values that was updated</p>
     * @param valueKey value to be set
     */
    
    public void setValueKey(final String valueKey);
    
    
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
     * @return instance of ChangeLocalizedEnumValueLabelChange
     */
    public static ChangeLocalizedEnumValueLabelChange of(){
        return new ChangeLocalizedEnumValueLabelChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy ChangeLocalizedEnumValueLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLocalizedEnumValueLabelChange of(final ChangeLocalizedEnumValueLabelChange template) {
        ChangeLocalizedEnumValueLabelChangeImpl instance = new ChangeLocalizedEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeLocalizedEnumValueLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLocalizedEnumValueLabelChange deepCopy(@Nullable final ChangeLocalizedEnumValueLabelChange template) {
        if (template == null) {
            return null;
        }
        ChangeLocalizedEnumValueLabelChangeImpl instance = new ChangeLocalizedEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
        instance.setPreviousValue(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeLocalizedEnumValueLabelChange
     * @return builder
     */
    public static ChangeLocalizedEnumValueLabelChangeBuilder builder() {
        return ChangeLocalizedEnumValueLabelChangeBuilder.of();
    }
    
    /**
     * create builder for ChangeLocalizedEnumValueLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLocalizedEnumValueLabelChangeBuilder builder(final ChangeLocalizedEnumValueLabelChange template) {
        return ChangeLocalizedEnumValueLabelChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLocalizedEnumValueLabelChange(Function<ChangeLocalizedEnumValueLabelChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedEnumValueLabelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedEnumValueLabelChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLocalizedEnumValueLabelChange>";
            }
        };
    }
}
