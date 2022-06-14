
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.CartClassificationTierImpl.class, name = CartClassificationTier.CART_CLASSIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.CartScoreTierImpl.class, name = CartScoreTier.CART_SCORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.CartValueTierImpl.class, name = CartValueTier.CART_VALUE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRatePriceTierImpl.class, visible = true)
@JsonDeserialize(as = ShippingRatePriceTierImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingRatePriceTier {

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();

    public static com.commercetools.api.models.shipping_method.CartClassificationTierBuilder cartClassificationBuilder() {
        return com.commercetools.api.models.shipping_method.CartClassificationTierBuilder.of();
    }

    public static com.commercetools.api.models.shipping_method.CartScoreTierBuilder cartScoreBuilder() {
        return com.commercetools.api.models.shipping_method.CartScoreTierBuilder.of();
    }

    public static com.commercetools.api.models.shipping_method.CartValueTierBuilder cartValueBuilder() {
        return com.commercetools.api.models.shipping_method.CartValueTierBuilder.of();
    }

    default <T> T withShippingRatePriceTier(Function<ShippingRatePriceTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRatePriceTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRatePriceTier>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRatePriceTier>";
            }
        };
    }
}
