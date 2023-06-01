package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.TextInputHint;
import com.commercetools.history.models.change.ChangeInputHintChangeImpl;

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
 * ChangeInputHintChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeInputHintChange changeInputHintChange = ChangeInputHintChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .nextValue(TextInputHint.SINGLE_LINE)
 *             .previousValue(TextInputHint.SINGLE_LINE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChangeInputHintChangeImpl.class)
public interface ChangeInputHintChange extends Change {

    /**
     * discriminator value for ChangeInputHintChange
     */
    String CHANGE_INPUT_HINT_CHANGE = "ChangeInputHintChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>changeInputHint</code> on product types and types</p>
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
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public TextInputHint getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public TextInputHint getPreviousValue();

    /**
     *  <p>Update action for <code>changeInputHint</code> on product types and types</p>
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
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final TextInputHint nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final TextInputHint previousValue);
    

    /**
     * factory method
     * @return instance of ChangeInputHintChange
     */
    public static ChangeInputHintChange of(){
        return new ChangeInputHintChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy ChangeInputHintChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeInputHintChange of(final ChangeInputHintChange template) {
        ChangeInputHintChangeImpl instance = new ChangeInputHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeInputHintChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeInputHintChange deepCopy(@Nullable final ChangeInputHintChange template) {
        if (template == null) {
            return null;
        }
        ChangeInputHintChangeImpl instance = new ChangeInputHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeInputHintChange
     * @return builder
     */
    public static ChangeInputHintChangeBuilder builder() {
        return ChangeInputHintChangeBuilder.of();
    }
    
    /**
     * create builder for ChangeInputHintChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeInputHintChangeBuilder builder(final ChangeInputHintChange template) {
        return ChangeInputHintChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeInputHintChange(Function<ChangeInputHintChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeInputHintChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeInputHintChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeInputHintChange>";
            }
        };
    }
}
