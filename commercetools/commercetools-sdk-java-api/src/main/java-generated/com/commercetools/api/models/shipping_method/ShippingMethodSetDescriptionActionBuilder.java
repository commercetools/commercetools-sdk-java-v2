
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
public class ShippingMethodSetDescriptionActionBuilder implements Builder<ShippingMethodSetDescriptionAction> {

    @Nullable
    private String description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ShippingMethodSetDescriptionActionBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public ShippingMethodSetDescriptionAction build() {
        return new ShippingMethodSetDescriptionActionImpl(description);
    }

    /**
     * builds ShippingMethodSetDescriptionAction without checking for non null required values
     */
    public ShippingMethodSetDescriptionAction buildUnchecked() {
        return new ShippingMethodSetDescriptionActionImpl(description);
    }

    public static ShippingMethodSetDescriptionActionBuilder of() {
        return new ShippingMethodSetDescriptionActionBuilder();
    }

    public static ShippingMethodSetDescriptionActionBuilder of(final ShippingMethodSetDescriptionAction template) {
        ShippingMethodSetDescriptionActionBuilder builder = new ShippingMethodSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
