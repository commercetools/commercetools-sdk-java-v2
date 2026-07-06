
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodResourceIdentifier shippingMethodResourceIdentifier = ShippingMethodResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodResourceIdentifierBuilder implements Builder<ShippingMethodResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public ShippingMethodResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public ShippingMethodResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ShippingMethodResourceIdentifier with checking for non-null required values
     * @return ShippingMethodResourceIdentifier
     */
    public ShippingMethodResourceIdentifier build() {
        return new ShippingMethodResourceIdentifierImpl(id, key);
    }

    /**
     * builds ShippingMethodResourceIdentifier without checking for non-null required values
     * @return ShippingMethodResourceIdentifier
     */
    public ShippingMethodResourceIdentifier buildUnchecked() {
        return new ShippingMethodResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ShippingMethodResourceIdentifierBuilder
     * @return builder
     */
    public static ShippingMethodResourceIdentifierBuilder of() {
        return new ShippingMethodResourceIdentifierBuilder();
    }

    /**
     * create builder for ShippingMethodResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodResourceIdentifierBuilder of(final ShippingMethodResourceIdentifier template) {
        ShippingMethodResourceIdentifierBuilder builder = new ShippingMethodResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
