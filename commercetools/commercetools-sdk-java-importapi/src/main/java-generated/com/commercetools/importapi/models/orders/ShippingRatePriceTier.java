
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.orders.CartClassificationTierImpl.class, name = CartClassificationTier.CART_CLASSIFICATION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRatePriceTierImpl.class, visible = true)
@JsonDeserialize(as = ShippingRatePriceTierImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingRatePriceTier {

    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();

    public static com.commercetools.importapi.models.orders.CartClassificationTierBuilder cartClassificationBuilder() {
        return com.commercetools.importapi.models.orders.CartClassificationTierBuilder.of();
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
