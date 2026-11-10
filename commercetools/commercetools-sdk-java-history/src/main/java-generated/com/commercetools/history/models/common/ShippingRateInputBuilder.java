
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateInputBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateInput shippingRateInput = ShippingRateInput.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingRateInputBuilder implements Builder<ShippingRateInput> {

    private String type;

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public ShippingRateInputBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     * value of type}
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     * builds ShippingRateInput with checking for non-null required values
     * @return ShippingRateInput
     */
    public ShippingRateInput build() {
        Objects.requireNonNull(type, ShippingRateInput.class + ": type is missing");
        return new ShippingRateInputImpl(type);
    }

    /**
     * builds ShippingRateInput without checking for non-null required values
     * @return ShippingRateInput
     */
    public ShippingRateInput buildUnchecked() {
        return new ShippingRateInputImpl(type);
    }

    /**
     * factory method for an instance of ShippingRateInputBuilder
     * @return builder
     */
    public static ShippingRateInputBuilder of() {
        return new ShippingRateInputBuilder();
    }

    /**
     * create builder for ShippingRateInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRateInputBuilder of(final ShippingRateInput template) {
        ShippingRateInputBuilder builder = new ShippingRateInputBuilder();
        builder.type = template.getType();
        return builder;
    }

}
