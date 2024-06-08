
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>JSON object where the key is a supply Channel <code>id</code> and the value is the ProductVariantChannelAvailability of the InventoryEntry.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantChannelAvailabilityMap productVariantChannelAvailabilityMap = ProductVariantChannelAvailabilityMap.builder()
 *             .//(//Builder -> //Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantChannelAvailabilityMapImpl.class)
public interface ProductVariantChannelAvailabilityMap {

    /**
     *
     * @return map of the pattern property values
     */
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, ProductVariantChannelAvailability> values();

    /**
     * set pattern property
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, ProductVariantChannelAvailability value);

    /**
     * factory method
     * @return instance of ProductVariantChannelAvailabilityMap
     */
    public static ProductVariantChannelAvailabilityMap of() {
        return new ProductVariantChannelAvailabilityMapImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantChannelAvailabilityMap
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantChannelAvailabilityMap of(final ProductVariantChannelAvailabilityMap template) {
        ProductVariantChannelAvailabilityMapImpl instance = new ProductVariantChannelAvailabilityMapImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantChannelAvailabilityMap
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantChannelAvailabilityMap deepCopy(
            @Nullable final ProductVariantChannelAvailabilityMap template) {
        if (template == null) {
            return null;
        }
        ProductVariantChannelAvailabilityMapImpl instance = new ProductVariantChannelAvailabilityMapImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ProductVariantChannelAvailabilityMap
     * @return builder
     */
    public static ProductVariantChannelAvailabilityMapBuilder builder() {
        return ProductVariantChannelAvailabilityMapBuilder.of();
    }

    /**
     * create builder for ProductVariantChannelAvailabilityMap instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantChannelAvailabilityMapBuilder builder(
            final ProductVariantChannelAvailabilityMap template) {
        return ProductVariantChannelAvailabilityMapBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantChannelAvailabilityMap(Function<ProductVariantChannelAvailabilityMap, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantChannelAvailabilityMap> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantChannelAvailabilityMap>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantChannelAvailabilityMap>";
            }
        };
    }
}
