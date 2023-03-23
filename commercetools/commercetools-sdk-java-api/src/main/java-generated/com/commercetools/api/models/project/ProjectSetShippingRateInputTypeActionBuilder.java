
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectSetShippingRateInputTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetShippingRateInputTypeAction projectSetShippingRateInputTypeAction = ProjectSetShippingRateInputTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetShippingRateInputTypeActionBuilder implements Builder<ProjectSetShippingRateInputTypeAction> {

    @Nullable
    private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param shippingRateInputType
     * @return Builder
     */

    public ProjectSetShippingRateInputTypeActionBuilder shippingRateInputType(
            @Nullable final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return Builder
     */

    public ProjectSetShippingRateInputTypeActionBuilder shippingRateInputType(
            Function<com.commercetools.api.models.project.ShippingRateInputTypeBuilder, Builder<? extends com.commercetools.api.models.project.ShippingRateInputType>> builder) {
        this.shippingRateInputType = builder
                .apply(com.commercetools.api.models.project.ShippingRateInputTypeBuilder.of())
                .build();
        return this;
    }

    @Nullable
    public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType() {
        return this.shippingRateInputType;
    }

    public ProjectSetShippingRateInputTypeAction build() {
        return new ProjectSetShippingRateInputTypeActionImpl(shippingRateInputType);
    }

    /**
     * builds ProjectSetShippingRateInputTypeAction without checking for non null required values
     */
    public ProjectSetShippingRateInputTypeAction buildUnchecked() {
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
