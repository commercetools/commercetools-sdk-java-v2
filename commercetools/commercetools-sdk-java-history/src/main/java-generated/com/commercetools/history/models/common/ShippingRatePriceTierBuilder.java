
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingRatePriceTierBuilder {

    private com.commercetools.history.models.common.ShippingRateTierType type;

    public ShippingRatePriceTierBuilder type(final com.commercetools.history.models.common.ShippingRateTierType type) {
        this.type = type;
        return this;
    }

    public com.commercetools.history.models.common.ShippingRateTierType getType() {
        return this.type;
    }

    public ShippingRatePriceTier build() {
        return new ShippingRatePriceTierImpl(type);
    }

    public static ShippingRatePriceTierBuilder of() {
        return new ShippingRatePriceTierBuilder();
    }

    public static ShippingRatePriceTierBuilder of(final ShippingRatePriceTier template) {
        ShippingRatePriceTierBuilder builder = new ShippingRatePriceTierBuilder();
        builder.type = template.getType();
        return builder;
    }

}
