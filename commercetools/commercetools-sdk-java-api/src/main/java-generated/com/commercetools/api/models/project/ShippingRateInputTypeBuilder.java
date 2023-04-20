
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateInputTypeBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingRateInputTypeBuilder {

    public com.commercetools.api.models.project.CartClassificationTypeBuilder cartClassificationBuilder() {
        return com.commercetools.api.models.project.CartClassificationTypeBuilder.of();
    }

    public com.commercetools.api.models.project.CartScoreTypeBuilder cartScoreBuilder() {
        return com.commercetools.api.models.project.CartScoreTypeBuilder.of();
    }

    public com.commercetools.api.models.project.CartValueTypeBuilder cartValueBuilder() {
        return com.commercetools.api.models.project.CartValueTypeBuilder.of();
    }

    /**
     * factory method for an instance of ShippingRateInputTypeBuilder
     * @return builder
     */
    public static ShippingRateInputTypeBuilder of() {
        return new ShippingRateInputTypeBuilder();
    }

}
