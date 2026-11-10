
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodKeyReference shippingMethodKeyReference = ShippingMethodKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodKeyReferenceBuilder implements Builder<ShippingMethodKeyReference> {

    private String key;

    /**
     *  <p>User-defined unique identifier of the referenced ShippingMethod.</p>
     * @param key value to be set
     * @return Builder
     */

    public ShippingMethodKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced ShippingMethod.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds ShippingMethodKeyReference with checking for non-null required values
     * @return ShippingMethodKeyReference
     */
    public ShippingMethodKeyReference build() {
        Objects.requireNonNull(key, ShippingMethodKeyReference.class + ": key is missing");
        return new ShippingMethodKeyReferenceImpl(key);
    }

    /**
     * builds ShippingMethodKeyReference without checking for non-null required values
     * @return ShippingMethodKeyReference
     */
    public ShippingMethodKeyReference buildUnchecked() {
        return new ShippingMethodKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of ShippingMethodKeyReferenceBuilder
     * @return builder
     */
    public static ShippingMethodKeyReferenceBuilder of() {
        return new ShippingMethodKeyReferenceBuilder();
    }

    /**
     * create builder for ShippingMethodKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodKeyReferenceBuilder of(final ShippingMethodKeyReference template) {
        ShippingMethodKeyReferenceBuilder builder = new ShippingMethodKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
