
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
 * ShippingRatePriceTier
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRatePriceTier shippingRatePriceTier = ShippingRatePriceTier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
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
        ShippingRatePriceTierImpl instance = new ShippingRatePriceTierImpl();
        return instance;
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
