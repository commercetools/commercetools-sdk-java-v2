package com.commercetools.history.models.change_value;

import com.commercetools.history.models.common.LocalizedString;
import java.lang.Object;
import com.commercetools.history.models.change_value.CustomFieldExpandedValueImpl;

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
 *  <p>Only available if <code>expand</code> is set to true</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldExpandedValue customFieldExpandedValue = CustomFieldExpandedValue.builder()
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldExpandedValueImpl.class)
public interface CustomFieldExpandedValue  {


    /**
     *  <p>Name of a custom field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();
    /**
     *
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Name of a custom field.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     * set value
     * @param value value to be set
     */
    
    public void setValue(final Object value);
    
    
    /**
     * set label
     * @param label value to be set
     */
    
    public void setLabel(final LocalizedString label);
    

    /**
     * factory method
     * @return instance of CustomFieldExpandedValue
     */
    public static CustomFieldExpandedValue of(){
        return new CustomFieldExpandedValueImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomFieldExpandedValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldExpandedValue of(final CustomFieldExpandedValue template) {
        CustomFieldExpandedValueImpl instance = new CustomFieldExpandedValueImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldExpandedValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldExpandedValue deepCopy(@Nullable final CustomFieldExpandedValue template) {
        if (template == null) {
            return null;
        }
        CustomFieldExpandedValueImpl instance = new CustomFieldExpandedValueImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setLabel(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLabel()));
        return instance;
    }

    /**
     * builder factory method for CustomFieldExpandedValue
     * @return builder
     */
    public static CustomFieldExpandedValueBuilder builder() {
        return CustomFieldExpandedValueBuilder.of();
    }
    
    /**
     * create builder for CustomFieldExpandedValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldExpandedValueBuilder builder(final CustomFieldExpandedValue template) {
        return CustomFieldExpandedValueBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldExpandedValue(Function<CustomFieldExpandedValue, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldExpandedValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldExpandedValue>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldExpandedValue>";
            }
        };
    }
}
