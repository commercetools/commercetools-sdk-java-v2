
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * FieldDefinitionOrderValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldDefinitionOrderValue fieldDefinitionOrderValue = FieldDefinitionOrderValue.builder()
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FieldDefinitionOrderValueImpl.class)
public interface FieldDefinitionOrderValue {

    /**
     *  <p>Name of the FieldDefinition.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Descriptive label of the field.</p>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Name of the FieldDefinition.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Descriptive label of the field.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     * factory method
     * @return instance of FieldDefinitionOrderValue
     */
    public static FieldDefinitionOrderValue of() {
        return new FieldDefinitionOrderValueImpl();
    }

    /**
     * factory method to create a shallow copy FieldDefinitionOrderValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static FieldDefinitionOrderValue of(final FieldDefinitionOrderValue template) {
        FieldDefinitionOrderValueImpl instance = new FieldDefinitionOrderValueImpl();
        instance.setName(template.getName());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public FieldDefinitionOrderValue copyDeep();

    /**
     * factory method to create a deep copy of FieldDefinitionOrderValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FieldDefinitionOrderValue deepCopy(@Nullable final FieldDefinitionOrderValue template) {
        if (template == null) {
            return null;
        }
        FieldDefinitionOrderValueImpl instance = new FieldDefinitionOrderValueImpl();
        instance.setName(template.getName());
        instance.setLabel(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLabel()));
        return instance;
    }

    /**
     * builder factory method for FieldDefinitionOrderValue
     * @return builder
     */
    public static FieldDefinitionOrderValueBuilder builder() {
        return FieldDefinitionOrderValueBuilder.of();
    }

    /**
     * create builder for FieldDefinitionOrderValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldDefinitionOrderValueBuilder builder(final FieldDefinitionOrderValue template) {
        return FieldDefinitionOrderValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFieldDefinitionOrderValue(Function<FieldDefinitionOrderValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FieldDefinitionOrderValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldDefinitionOrderValue>() {
            @Override
            public String toString() {
                return "TypeReference<FieldDefinitionOrderValue>";
            }
        };
    }
}
