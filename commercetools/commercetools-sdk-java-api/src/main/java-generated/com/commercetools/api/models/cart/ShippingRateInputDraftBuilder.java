
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingRateInputDraftBuilder {

    public com.commercetools.api.models.cart.ClassificationShippingRateInputDraftBuilder classificationBuilder() {
        return com.commercetools.api.models.cart.ClassificationShippingRateInputDraftBuilder.of();
    }

    public com.commercetools.api.models.cart.ScoreShippingRateInputDraftBuilder scoreBuilder() {
        return com.commercetools.api.models.cart.ScoreShippingRateInputDraftBuilder.of();
    }

    public static ShippingRateInputDraftBuilder of() {
        return new ShippingRateInputDraftBuilder();
    }
}
