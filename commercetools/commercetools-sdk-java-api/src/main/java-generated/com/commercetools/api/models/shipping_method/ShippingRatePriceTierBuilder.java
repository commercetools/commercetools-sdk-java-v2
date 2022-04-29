
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingRatePriceTierBuilder {

    public com.commercetools.api.models.shipping_method.CartClassificationTierBuilder cartClassificationBuilder() {
        return com.commercetools.api.models.shipping_method.CartClassificationTierBuilder.of();
    }

    public com.commercetools.api.models.shipping_method.CartScoreTierBuilder cartScoreBuilder() {
        return com.commercetools.api.models.shipping_method.CartScoreTierBuilder.of();
    }

    public com.commercetools.api.models.shipping_method.CartValueTierBuilder cartValueBuilder() {
        return com.commercetools.api.models.shipping_method.CartValueTierBuilder.of();
    }

    public static ShippingRatePriceTierBuilder of() {
        return new ShippingRatePriceTierBuilder();
    }
}
