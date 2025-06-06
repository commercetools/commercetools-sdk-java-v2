
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ShippingRatePriceTier
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRatePriceTier shippingRatePriceTier = ShippingRatePriceTier.cartClassificationBuilder()
 *             value("{value}")
 *             price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRatePriceTierImpl.class, visible = true)
@JsonDeserialize(as = ShippingRatePriceTierImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingRatePriceTier {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();

    public ShippingRatePriceTier copyDeep();

    /**
     * factory method to create a deep copy of ShippingRatePriceTier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingRatePriceTier deepCopy(@Nullable final ShippingRatePriceTier template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ShippingRatePriceTierImpl)) {
            return template.copyDeep();
        }
        ShippingRatePriceTierImpl instance = new ShippingRatePriceTierImpl();
        return instance;
    }

    /**
     * builder for cartClassification subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.CartClassificationTierBuilder cartClassificationBuilder() {
        return com.commercetools.api.models.shipping_method.CartClassificationTierBuilder.of();
    }

    /**
     * builder for cartScore subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.CartScoreTierBuilder cartScoreBuilder() {
        return com.commercetools.api.models.shipping_method.CartScoreTierBuilder.of();
    }

    /**
     * builder for cartValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.CartValueTierBuilder cartValueBuilder() {
        return com.commercetools.api.models.shipping_method.CartValueTierBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingRatePriceTier(Function<ShippingRatePriceTier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRatePriceTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRatePriceTier>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRatePriceTier>";
            }
        };
    }
}
