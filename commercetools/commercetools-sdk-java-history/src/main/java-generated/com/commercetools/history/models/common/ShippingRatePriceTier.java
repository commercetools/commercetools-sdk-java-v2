package com.commercetools.history.models.common;

import com.commercetools.history.models.common.ShippingRateTierType;
import com.commercetools.history.models.common.ShippingRatePriceTierImpl;

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
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRatePriceTier shippingRatePriceTier = ShippingRatePriceTier.builder()
 *             .type(ShippingRateTierType.CART_VALUE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShippingRatePriceTierImpl.class)
public interface ShippingRatePriceTier  {


    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();

    /**
     * set type
     * @param type value to be set
     */
    
    public void setType(final ShippingRateTierType type);
    

    /**
     * factory method
     * @return instance of ShippingRatePriceTier
     */
    public static ShippingRatePriceTier of(){
        return new ShippingRatePriceTierImpl();
    }
    

    /**
     * factory method to create a shallow copy ShippingRatePriceTier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingRatePriceTier of(final ShippingRatePriceTier template) {
        ShippingRatePriceTierImpl instance = new ShippingRatePriceTierImpl();
        instance.setType(template.getType());
        return instance;
    }

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
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for ShippingRatePriceTier
     * @return builder
     */
    public static ShippingRatePriceTierBuilder builder() {
        return ShippingRatePriceTierBuilder.of();
    }
    
    /**
     * create builder for ShippingRatePriceTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRatePriceTierBuilder builder(final ShippingRatePriceTier template) {
        return ShippingRatePriceTierBuilder.of(template);
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
