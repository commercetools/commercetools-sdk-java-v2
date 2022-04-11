
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public static ShippingRateInputTypeBuilder of() {
        return new ShippingRateInputTypeBuilder();
    }
}
