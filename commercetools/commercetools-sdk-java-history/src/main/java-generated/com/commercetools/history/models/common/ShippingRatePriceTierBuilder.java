
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRatePriceTierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRatePriceTier shippingRatePriceTier = ShippingRatePriceTier.builder()
 *             .type(ShippingRateTierType.CART_VALUE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingRatePriceTierBuilder implements Builder<ShippingRatePriceTier> {

    private com.commercetools.history.models.common.ShippingRateTierType type;

    /**
     *
     */

    public ShippingRatePriceTierBuilder type(final com.commercetools.history.models.common.ShippingRateTierType type) {
        this.type = type;
        return this;
    }

    public com.commercetools.history.models.common.ShippingRateTierType getType() {
        return this.type;
    }

    public ShippingRatePriceTier build() {
        Objects.requireNonNull(type, ShippingRatePriceTier.class + ": type is missing");
        return new ShippingRatePriceTierImpl(type);
    }

    /**
     * builds ShippingRatePriceTier without checking for non null required values
     */
    public ShippingRatePriceTier buildUnchecked() {
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
