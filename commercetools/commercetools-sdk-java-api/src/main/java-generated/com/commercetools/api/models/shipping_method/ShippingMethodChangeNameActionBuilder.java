
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeNameAction shippingMethodChangeNameAction = ShippingMethodChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodChangeNameActionBuilder implements Builder<ShippingMethodChangeNameAction> {

    private String name;

    /**
     *  <p>Value to set. Must not be empty.</p>
     */

    public ShippingMethodChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ShippingMethodChangeNameAction build() {
        Objects.requireNonNull(name, ShippingMethodChangeNameAction.class + ": name is missing");
        return new ShippingMethodChangeNameActionImpl(name);
    }

    /**
     * builds ShippingMethodChangeNameAction without checking for non null required values
     */
    public ShippingMethodChangeNameAction buildUnchecked() {
        return new ShippingMethodChangeNameActionImpl(name);
    }

    public static ShippingMethodChangeNameActionBuilder of() {
        return new ShippingMethodChangeNameActionBuilder();
    }

    public static ShippingMethodChangeNameActionBuilder of(final ShippingMethodChangeNameAction template) {
        ShippingMethodChangeNameActionBuilder builder = new ShippingMethodChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
