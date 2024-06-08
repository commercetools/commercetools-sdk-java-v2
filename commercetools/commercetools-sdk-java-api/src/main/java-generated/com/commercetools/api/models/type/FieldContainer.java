
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * FieldContainer
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldContainer fieldContainer = FieldContainer.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FieldContainerImpl.class)
public interface FieldContainer {

    /**
     *  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the FieldDefinitions) and values given by CustomFieldValue.</p>
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    /**
     *  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the FieldDefinitions) and values given by CustomFieldValue.</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, Object value);

    /**
     * factory method
     * @return instance of FieldContainer
     */
    public static FieldContainer of() {
        return new FieldContainerImpl();
    }

    /**
     * factory method to create a shallow copy FieldContainer
     * @param template instance to be copied
     * @return copy instance
     */
    public static FieldContainer of(final FieldContainer template) {
        FieldContainerImpl instance = new FieldContainerImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of FieldContainer
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FieldContainer deepCopy(@Nullable final FieldContainer template) {
        if (template == null) {
            return null;
        }
        FieldContainerImpl instance = new FieldContainerImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for FieldContainer
     * @return builder
     */
    public static FieldContainerBuilder builder() {
        return FieldContainerBuilder.of();
    }

    /**
     * create builder for FieldContainer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldContainerBuilder builder(final FieldContainer template) {
        return FieldContainerBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFieldContainer(Function<FieldContainer, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FieldContainer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldContainer>() {
            @Override
            public String toString() {
                return "TypeReference<FieldContainer>";
            }
        };
    }
}
