
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.CartClassificationTypeImpl.class, name = CartClassificationType.CART_CLASSIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.CartScoreTypeImpl.class, name = CartScoreType.CART_SCORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.CartValueTypeImpl.class, name = CartValueType.CART_VALUE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRateInputTypeImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingRateInputType {

    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();

    default <T> T withShippingRateInputType(Function<ShippingRateInputType, T> helper) {
        return helper.apply(this);
    }
}
