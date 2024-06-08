
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * Attributes
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Attributes attributes = Attributes.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributesImpl.class)
public interface Attributes {

    /**
     *  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself. And since this property will be represented as a map, we can set individual attributes to null to delete them (which follows JSON Merge Patch semantics).</p>
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, Attribute> values();

    /**
     *  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself. And since this property will be represented as a map, we can set individual attributes to null to delete them (which follows JSON Merge Patch semantics).</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, Attribute value);

    /**
     * factory method
     * @return instance of Attributes
     */
    public static Attributes of() {
        return new AttributesImpl();
    }

    /**
     * factory method to create a shallow copy Attributes
     * @param template instance to be copied
     * @return copy instance
     */
    public static Attributes of(final Attributes template) {
        AttributesImpl instance = new AttributesImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of Attributes
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Attributes deepCopy(@Nullable final Attributes template) {
        if (template == null) {
            return null;
        }
        AttributesImpl instance = new AttributesImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for Attributes
     * @return builder
     */
    public static AttributesBuilder builder() {
        return AttributesBuilder.of();
    }

    /**
     * create builder for Attributes instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributesBuilder builder(final Attributes template) {
        return AttributesBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributes(Function<Attributes, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Attributes> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Attributes>() {
            @Override
            public String toString() {
                return "TypeReference<Attributes>";
            }
        };
    }
}
