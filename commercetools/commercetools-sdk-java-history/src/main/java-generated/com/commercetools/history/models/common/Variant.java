
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * Variant
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Variant variant = Variant.builder()
 *             .id(1)
 *             .sku("{sku}")
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantImpl.class)
public interface Variant {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public Integer getId();

    /**
     *
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final Integer id);

    /**
     * set sku
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of Variant
     */
    public static Variant of() {
        return new VariantImpl();
    }

    /**
     * factory method to create a shallow copy Variant
     * @param template instance to be copied
     * @return copy instance
     */
    public static Variant of(final Variant template) {
        VariantImpl instance = new VariantImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of Variant
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Variant deepCopy(@Nullable final Variant template) {
        if (template == null) {
            return null;
        }
        VariantImpl instance = new VariantImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for Variant
     * @return builder
     */
    public static VariantBuilder builder() {
        return VariantBuilder.of();
    }

    /**
     * create builder for Variant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBuilder builder(final Variant template) {
        return VariantBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariant(Function<Variant, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Variant> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Variant>() {
            @Override
            public String toString() {
                return "TypeReference<Variant>";
            }
        };
    }
}
