
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodReference shippingMethodReference = ShippingMethodReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodReferenceBuilder implements Builder<ShippingMethodReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ShippingMethodReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds ShippingMethodReference with checking for non-null required values
     * @return ShippingMethodReference
     */
    public ShippingMethodReference build() {
        Objects.requireNonNull(id, ShippingMethodReference.class + ": id is missing");
        return new ShippingMethodReferenceImpl(id);
    }

    /**
     * builds ShippingMethodReference without checking for non-null required values
     * @return ShippingMethodReference
     */
    public ShippingMethodReference buildUnchecked() {
        return new ShippingMethodReferenceImpl(id);
    }

    /**
     * factory method for an instance of ShippingMethodReferenceBuilder
     * @return builder
     */
    public static ShippingMethodReferenceBuilder of() {
        return new ShippingMethodReferenceBuilder();
    }

    /**
     * create builder for ShippingMethodReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodReferenceBuilder of(final ShippingMethodReference template) {
        ShippingMethodReferenceBuilder builder = new ShippingMethodReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
