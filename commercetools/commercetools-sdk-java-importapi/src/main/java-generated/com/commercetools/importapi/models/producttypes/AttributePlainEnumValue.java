
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * AttributePlainEnumValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributePlainEnumValue attributePlainEnumValue = AttributePlainEnumValue.builder()
 *             .key("{key}")
 *             .label("{label}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributePlainEnumValueImpl.class)
public interface AttributePlainEnumValue {

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
     * @return instance of AttributePlainEnumValue
     */
    public static AttributePlainEnumValue of() {
        return new AttributePlainEnumValueImpl();
    }

    /**
     * factory method to create a shallow copy AttributePlainEnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributePlainEnumValue of(final AttributePlainEnumValue template) {
        AttributePlainEnumValueImpl instance = new AttributePlainEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public AttributePlainEnumValue copyDeep();

    /**
     * factory method to create a deep copy of AttributePlainEnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributePlainEnumValue deepCopy(@Nullable final AttributePlainEnumValue template) {
        if (template == null) {
            return null;
        }
        AttributePlainEnumValueImpl instance = new AttributePlainEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * builder factory method for AttributePlainEnumValue
     * @return builder
     */
    public static AttributePlainEnumValueBuilder builder() {
        return AttributePlainEnumValueBuilder.of();
    }

    /**
     * create builder for AttributePlainEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributePlainEnumValueBuilder builder(final AttributePlainEnumValue template) {
        return AttributePlainEnumValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributePlainEnumValue(Function<AttributePlainEnumValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributePlainEnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributePlainEnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<AttributePlainEnumValue>";
            }
        };
    }
}
