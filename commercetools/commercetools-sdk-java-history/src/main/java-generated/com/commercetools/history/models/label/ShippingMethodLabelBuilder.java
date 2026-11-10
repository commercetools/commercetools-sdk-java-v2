
package com.commercetools.history.models.label;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodLabel shippingMethodLabel = ShippingMethodLabel.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodLabelBuilder implements Builder<ShippingMethodLabel> {

    @Nullable
    private String key;

    private String name;

    /**
     *  <p>User-defined unique identifier of the Shipping Method.</p>
     * @param key value to be set
     * @return Builder
     */

    public ShippingMethodLabelBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique name identifier of the Shipping Method.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShippingMethodLabelBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Unique name identifier of the Shipping Method.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds ShippingMethodLabel with checking for non-null required values
     * @return ShippingMethodLabel
     */
    public ShippingMethodLabel build() {
        Objects.requireNonNull(name, ShippingMethodLabel.class + ": name is missing");
        return new ShippingMethodLabelImpl(key, name);
    }

    /**
     * builds ShippingMethodLabel without checking for non-null required values
     * @return ShippingMethodLabel
     */
    public ShippingMethodLabel buildUnchecked() {
        return new ShippingMethodLabelImpl(key, name);
    }

    /**
     * factory method for an instance of ShippingMethodLabelBuilder
     * @return builder
     */
    public static ShippingMethodLabelBuilder of() {
        return new ShippingMethodLabelBuilder();
    }

    /**
     * create builder for ShippingMethodLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodLabelBuilder of(final ShippingMethodLabel template) {
        ShippingMethodLabelBuilder builder = new ShippingMethodLabelBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        return builder;
    }

}
