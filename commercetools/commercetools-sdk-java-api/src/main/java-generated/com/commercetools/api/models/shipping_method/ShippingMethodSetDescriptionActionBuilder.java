
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetDescriptionAction shippingMethodSetDescriptionAction = ShippingMethodSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class ShippingMethodSetDescriptionActionBuilder implements Builder<ShippingMethodSetDescriptionAction> {

    @Nullable
    private String description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public ShippingMethodSetDescriptionActionBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     * builds ShippingMethodSetDescriptionAction with checking for non-null required values
     * @return ShippingMethodSetDescriptionAction
     */
    public ShippingMethodSetDescriptionAction build() {
        return new ShippingMethodSetDescriptionActionImpl(description);
    }

    /**
     * builds ShippingMethodSetDescriptionAction without checking for non-null required values
     * @return ShippingMethodSetDescriptionAction
     */
    public ShippingMethodSetDescriptionAction buildUnchecked() {
        return new ShippingMethodSetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of ShippingMethodSetDescriptionActionBuilder
     * @return builder
     */
    public static ShippingMethodSetDescriptionActionBuilder of() {
        return new ShippingMethodSetDescriptionActionBuilder();
    }

    /**
     * create builder for ShippingMethodSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetDescriptionActionBuilder of(final ShippingMethodSetDescriptionAction template) {
        ShippingMethodSetDescriptionActionBuilder builder = new ShippingMethodSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
