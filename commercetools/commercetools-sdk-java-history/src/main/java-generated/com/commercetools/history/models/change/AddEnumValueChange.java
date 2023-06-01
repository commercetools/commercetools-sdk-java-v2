package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.EnumValue;
import com.commercetools.history.models.change.AddEnumValueChangeImpl;

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
 * AddEnumValueChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddEnumValueChange addEnumValueChange = AddEnumValueChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AddEnumValueChangeImpl.class)
public interface AddEnumValueChange extends Change {

    /**
     * discriminator value for AddEnumValueChange
     */
    String ADD_ENUM_VALUE_CHANGE = "AddEnumValueChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>addEnumValue</code> on types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *  <p>The name of the field/attribute definition updated.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public EnumValue getNextValue();

    /**
     *  <p>Update action for <code>addEnumValue</code> on types</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     *  <p>The name of the field/attribute definition updated.</p>
     * @param fieldName value to be set
     */
    
    public void setFieldName(final String fieldName);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final EnumValue nextValue);
    

    /**
     * factory method
     * @return instance of AddEnumValueChange
     */
    public static AddEnumValueChange of(){
        return new AddEnumValueChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy AddEnumValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddEnumValueChange of(final AddEnumValueChange template) {
        AddEnumValueChangeImpl instance = new AddEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddEnumValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddEnumValueChange deepCopy(@Nullable final AddEnumValueChange template) {
        if (template == null) {
            return null;
        }
        AddEnumValueChangeImpl instance = new AddEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setNextValue(com.commercetools.history.models.change_value.EnumValue.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddEnumValueChange
     * @return builder
     */
    public static AddEnumValueChangeBuilder builder() {
        return AddEnumValueChangeBuilder.of();
    }
    
    /**
     * create builder for AddEnumValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddEnumValueChangeBuilder builder(final AddEnumValueChange template) {
        return AddEnumValueChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddEnumValueChange(Function<AddEnumValueChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddEnumValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddEnumValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddEnumValueChange>";
            }
        };
    }
}
