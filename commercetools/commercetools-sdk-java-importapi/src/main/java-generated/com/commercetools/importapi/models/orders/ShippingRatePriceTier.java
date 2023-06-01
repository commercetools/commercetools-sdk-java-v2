package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.CartClassificationTier;
import com.commercetools.importapi.models.orders.ShippingRateTierType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
 *             plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.orders.CartClassificationTierImpl.class, name = CartClassificationTier.CART_CLASSIFICATION)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = ShippingRatePriceTierImpl.class,
    visible = true
)
@JsonDeserialize(as = ShippingRatePriceTierImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface ShippingRatePriceTier  {


    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();




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
        if (template instanceof com.commercetools.importapi.models.orders.CartClassificationTier) {
            return com.commercetools.importapi.models.orders.CartClassificationTier.deepCopy((com.commercetools.importapi.models.orders.CartClassificationTier)template);
        }
        ShippingRatePriceTierImpl instance = new ShippingRatePriceTierImpl();
        return instance;
    }


    /**
     * builder for cartClassification subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.orders.CartClassificationTierBuilder cartClassificationBuilder() {
       return com.commercetools.importapi.models.orders.CartClassificationTierBuilder.of();
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
