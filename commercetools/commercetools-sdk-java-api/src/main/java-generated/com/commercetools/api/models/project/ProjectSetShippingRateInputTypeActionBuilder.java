
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectSetShippingRateInputTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;

    public ProjectSetShippingRateInputTypeActionBuilder shippingRateInputType(
            @Nullable final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType() {
        return this.shippingRateInputType;
    }

    public ProjectSetShippingRateInputTypeAction build() {
        return new ProjectSetShippingRateInputTypeActionImpl(shippingRateInputType);
    }

    public static ProjectSetShippingRateInputTypeActionBuilder of() {
        return new ProjectSetShippingRateInputTypeActionBuilder();
    }

    public static ProjectSetShippingRateInputTypeActionBuilder of(
            final ProjectSetShippingRateInputTypeAction template) {
        ProjectSetShippingRateInputTypeActionBuilder builder = new ProjectSetShippingRateInputTypeActionBuilder();
        builder.shippingRateInputType = template.getShippingRateInputType();
        return builder;
    }

}
