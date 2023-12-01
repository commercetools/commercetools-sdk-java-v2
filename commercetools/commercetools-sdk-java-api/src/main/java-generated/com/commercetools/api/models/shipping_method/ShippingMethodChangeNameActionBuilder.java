
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
     *  <p>Unique value to set within a Project. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShippingMethodChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Unique value to set within a Project. Must not be empty.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds ShippingMethodChangeNameAction with checking for non-null required values
     * @return ShippingMethodChangeNameAction
     */
    public ShippingMethodChangeNameAction build() {
        Objects.requireNonNull(name, ShippingMethodChangeNameAction.class + ": name is missing");
        return new ShippingMethodChangeNameActionImpl(name);
    }

    /**
     * builds ShippingMethodChangeNameAction without checking for non-null required values
     * @return ShippingMethodChangeNameAction
     */
    public ShippingMethodChangeNameAction buildUnchecked() {
        return new ShippingMethodChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of ShippingMethodChangeNameActionBuilder
     * @return builder
     */
    public static ShippingMethodChangeNameActionBuilder of() {
        return new ShippingMethodChangeNameActionBuilder();
    }

    /**
     * create builder for ShippingMethodChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeNameActionBuilder of(final ShippingMethodChangeNameAction template) {
        ShippingMethodChangeNameActionBuilder builder = new ShippingMethodChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
