
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeValue shippingMethodChangeValue = ShippingMethodChangeValue.builder()
 *             .id("{id}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodChangeValueBuilder implements Builder<ShippingMethodChangeValue> {

    private String id;

    private String name;

    /**
     *
     * @param id value to be set
     * @return Builder
     */

    public ShippingMethodChangeValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param name value to be set
     * @return Builder
     */

    public ShippingMethodChangeValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    /**
     * builds ShippingMethodChangeValue with checking for non-null required values
     * @return ShippingMethodChangeValue
     */
    public ShippingMethodChangeValue build() {
        Objects.requireNonNull(id, ShippingMethodChangeValue.class + ": id is missing");
        Objects.requireNonNull(name, ShippingMethodChangeValue.class + ": name is missing");
        return new ShippingMethodChangeValueImpl(id, name);
    }

    /**
     * builds ShippingMethodChangeValue without checking for non-null required values
     * @return ShippingMethodChangeValue
     */
    public ShippingMethodChangeValue buildUnchecked() {
        return new ShippingMethodChangeValueImpl(id, name);
    }

    public static ShippingMethodChangeValueBuilder of() {
        return new ShippingMethodChangeValueBuilder();
    }

    public static ShippingMethodChangeValueBuilder of(final ShippingMethodChangeValue template) {
        ShippingMethodChangeValueBuilder builder = new ShippingMethodChangeValueBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        return builder;
    }

}
