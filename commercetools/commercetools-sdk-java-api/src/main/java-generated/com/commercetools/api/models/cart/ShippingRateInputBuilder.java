
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingRateInputBuilder {

    public com.commercetools.api.models.cart.ClassificationShippingRateInputBuilder classificationBuilder() {
        return com.commercetools.api.models.cart.ClassificationShippingRateInputBuilder.of();
    }

    public com.commercetools.api.models.cart.ScoreShippingRateInputBuilder scoreBuilder() {
        return com.commercetools.api.models.cart.ScoreShippingRateInputBuilder.of();
    }

    public static ShippingRateInputBuilder of() {
        return new ShippingRateInputBuilder();
    }
}
