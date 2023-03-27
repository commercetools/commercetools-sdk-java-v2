
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomShippingMethodChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomShippingMethodChangeValue customShippingMethodChangeValue = CustomShippingMethodChangeValue.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomShippingMethodChangeValueBuilder implements Builder<CustomShippingMethodChangeValue> {

    private String name;

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public CustomShippingMethodChangeValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds CustomShippingMethodChangeValue with checking for non-null required values
     * @return CustomShippingMethodChangeValue
     */
    public CustomShippingMethodChangeValue build() {
        Objects.requireNonNull(name, CustomShippingMethodChangeValue.class + ": name is missing");
        return new CustomShippingMethodChangeValueImpl(name);
    }

    /**
     * builds CustomShippingMethodChangeValue without checking for non-null required values
     * @return CustomShippingMethodChangeValue
     */
    public CustomShippingMethodChangeValue buildUnchecked() {
        return new CustomShippingMethodChangeValueImpl(name);
    }

    /**
     * factory method for an instance of CustomShippingMethodChangeValueBuilder
     * @return builder
     */
    public static CustomShippingMethodChangeValueBuilder of() {
        return new CustomShippingMethodChangeValueBuilder();
    }

    /**
     * create builder for CustomShippingMethodChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomShippingMethodChangeValueBuilder of(final CustomShippingMethodChangeValue template) {
        CustomShippingMethodChangeValueBuilder builder = new CustomShippingMethodChangeValueBuilder();
        builder.name = template.getName();
        return builder;
    }

}
