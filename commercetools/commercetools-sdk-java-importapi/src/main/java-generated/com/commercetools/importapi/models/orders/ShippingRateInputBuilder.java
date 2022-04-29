
package com.commercetools.importapi.models.orders;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingRateInputBuilder {

    public com.commercetools.importapi.models.orders.ClassificationShippingRateInputBuilder classificationBuilder() {
        return com.commercetools.importapi.models.orders.ClassificationShippingRateInputBuilder.of();
    }

    public com.commercetools.importapi.models.orders.ScoreShippingRateInputBuilder scoreBuilder() {
        return com.commercetools.importapi.models.orders.ScoreShippingRateInputBuilder.of();
    }

    public static ShippingRateInputBuilder of() {
        return new ShippingRateInputBuilder();
    }
}
