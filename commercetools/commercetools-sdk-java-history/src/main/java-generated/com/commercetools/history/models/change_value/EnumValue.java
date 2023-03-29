
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumValue enumValue = EnumValue.builder()
 *             .key("{key}")
 *             .label("{label}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumValueImpl.class)
public interface EnumValue {

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return label
     */
    @NotNull
    @JsonProperty("label")
    public String getLabel();

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set label
     * @param label value to be set
     */

    public void setLabel(final String label);

    /**
     * factory method
     * @return instance of EnumValue
     */
    public static EnumValue of() {
        return new EnumValueImpl();
    }

    /**
     * factory method to create a shallow copy EnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static EnumValue of(final EnumValue template) {
        EnumValueImpl instance = new EnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * factory method to create a deep copy of EnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EnumValue deepCopy(@Nullable final EnumValue template) {
        if (template == null) {
            return null;
        }
        EnumValueImpl instance = new EnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * builder factory method for EnumValue
     * @return builder
     */
    public static EnumValueBuilder builder() {
        return EnumValueBuilder.of();
    }

    /**
     * create builder for EnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumValueBuilder builder(final EnumValue template) {
        return EnumValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEnumValue(Function<EnumValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<EnumValue>";
            }
        };
    }
}
