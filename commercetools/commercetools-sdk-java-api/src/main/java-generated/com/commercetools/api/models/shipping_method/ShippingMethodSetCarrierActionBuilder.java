
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetCarrierActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetCarrierAction shippingMethodSetCarrierAction = ShippingMethodSetCarrierAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetCarrierActionBuilder implements Builder<ShippingMethodSetCarrierAction> {

    @Nullable
    private String carrier;

    /**
     *  <p>Name of the carrier that delivers the parcel, for example <code>DHL</code>. If <code>carrier</code> is absent or <code>null</code>, it is removed if it exists.</p>
     * @param carrier value to be set
     * @return Builder
     */

    public ShippingMethodSetCarrierActionBuilder carrier(@Nullable final String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     *  <p>Name of the carrier that delivers the parcel, for example <code>DHL</code>. If <code>carrier</code> is absent or <code>null</code>, it is removed if it exists.</p>
     * @return carrier
     */

    @Nullable
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * builds ShippingMethodSetCarrierAction with checking for non-null required values
     * @return ShippingMethodSetCarrierAction
     */
    public ShippingMethodSetCarrierAction build() {
        return new ShippingMethodSetCarrierActionImpl(carrier);
    }

    /**
     * builds ShippingMethodSetCarrierAction without checking for non-null required values
     * @return ShippingMethodSetCarrierAction
     */
    public ShippingMethodSetCarrierAction buildUnchecked() {
        return new ShippingMethodSetCarrierActionImpl(carrier);
    }

    /**
     * factory method for an instance of ShippingMethodSetCarrierActionBuilder
     * @return builder
     */
    public static ShippingMethodSetCarrierActionBuilder of() {
        return new ShippingMethodSetCarrierActionBuilder();
    }

    /**
     * create builder for ShippingMethodSetCarrierAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetCarrierActionBuilder of(final ShippingMethodSetCarrierAction template) {
        ShippingMethodSetCarrierActionBuilder builder = new ShippingMethodSetCarrierActionBuilder();
        builder.carrier = template.getCarrier();
        return builder;
    }

}
