
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodChangeActiveActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeActiveAction shippingMethodChangeActiveAction = ShippingMethodChangeActiveAction.builder()
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodChangeActiveActionBuilder implements Builder<ShippingMethodChangeActiveAction> {

    private Boolean active;

    /**
     *  <p>Value to set.</p>
     *  <p>If set to <code>false</code>, the ShippingMethod cannot be used during the creation or update of a Cart or Order.</p>
     * @param active value to be set
     * @return Builder
     */

    public ShippingMethodChangeActiveActionBuilder active(final Boolean active) {
        this.active = active;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     *  <p>If set to <code>false</code>, the ShippingMethod cannot be used during the creation or update of a Cart or Order.</p>
     * @return active
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * builds ShippingMethodChangeActiveAction with checking for non-null required values
     * @return ShippingMethodChangeActiveAction
     */
    public ShippingMethodChangeActiveAction build() {
        Objects.requireNonNull(active, ShippingMethodChangeActiveAction.class + ": active is missing");
        return new ShippingMethodChangeActiveActionImpl(active);
    }

    /**
     * builds ShippingMethodChangeActiveAction without checking for non-null required values
     * @return ShippingMethodChangeActiveAction
     */
    public ShippingMethodChangeActiveAction buildUnchecked() {
        return new ShippingMethodChangeActiveActionImpl(active);
    }

    /**
     * factory method for an instance of ShippingMethodChangeActiveActionBuilder
     * @return builder
     */
    public static ShippingMethodChangeActiveActionBuilder of() {
        return new ShippingMethodChangeActiveActionBuilder();
    }

    /**
     * create builder for ShippingMethodChangeActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeActiveActionBuilder of(final ShippingMethodChangeActiveAction template) {
        ShippingMethodChangeActiveActionBuilder builder = new ShippingMethodChangeActiveActionBuilder();
        builder.active = template.getActive();
        return builder;
    }

}
