
package com.commercetools.api.models.variant_attributes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>JSON object where the keys are supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> <code>id</code>, and the values are <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantAttributesChannelAvailability" rel="nofollow">VariantAttributesChannelAvailability</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributesChannelAvailabilityMap variantAttributesChannelAvailabilityMap = VariantAttributesChannelAvailabilityMap.builder()
 *             ./^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$/(/^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$/Builder -> /^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantAttributesChannelAvailabilityMapImpl.class)
public interface VariantAttributesChannelAvailabilityMap {

    /**
     *  <p>The availability for a specific supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @return map of the pattern property values
     */
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, VariantAttributesChannelAvailability> values();

    /**
     *  <p>The availability for a specific supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, VariantAttributesChannelAvailability value);

    /**
     * factory method
     * @return instance of VariantAttributesChannelAvailabilityMap
     */
    public static VariantAttributesChannelAvailabilityMap of() {
        return new VariantAttributesChannelAvailabilityMapImpl();
    }

    /**
     * factory method to create a shallow copy VariantAttributesChannelAvailabilityMap
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantAttributesChannelAvailabilityMap of(final VariantAttributesChannelAvailabilityMap template) {
        VariantAttributesChannelAvailabilityMapImpl instance = new VariantAttributesChannelAvailabilityMapImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public VariantAttributesChannelAvailabilityMap copyDeep();

    /**
     * factory method to create a deep copy of VariantAttributesChannelAvailabilityMap
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantAttributesChannelAvailabilityMap deepCopy(
            @Nullable final VariantAttributesChannelAvailabilityMap template) {
        if (template == null) {
            return null;
        }
        VariantAttributesChannelAvailabilityMapImpl instance = new VariantAttributesChannelAvailabilityMapImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for VariantAttributesChannelAvailabilityMap
     * @return builder
     */
    public static VariantAttributesChannelAvailabilityMapBuilder builder() {
        return VariantAttributesChannelAvailabilityMapBuilder.of();
    }

    /**
     * create builder for VariantAttributesChannelAvailabilityMap instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesChannelAvailabilityMapBuilder builder(
            final VariantAttributesChannelAvailabilityMap template) {
        return VariantAttributesChannelAvailabilityMapBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantAttributesChannelAvailabilityMap(
            Function<VariantAttributesChannelAvailabilityMap, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantAttributesChannelAvailabilityMap> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantAttributesChannelAvailabilityMap>() {
            @Override
            public String toString() {
                return "TypeReference<VariantAttributesChannelAvailabilityMap>";
            }
        };
    }
}
