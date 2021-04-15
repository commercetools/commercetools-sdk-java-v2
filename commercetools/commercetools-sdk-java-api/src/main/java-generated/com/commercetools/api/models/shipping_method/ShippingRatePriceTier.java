
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.CartClassificationTierImpl.class, name = CartClassificationTier.CART_CLASSIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.CartScoreTierImpl.class, name = CartScoreTier.CART_SCORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.CartValueTierImpl.class, name = CartValueTier.CART_VALUE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRatePriceTierImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingRatePriceTier {

    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();

    default <T> T withShippingRatePriceTier(Function<ShippingRatePriceTier, T> helper) {
        return helper.apply(this);
    }
}
