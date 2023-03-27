
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BooleanFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BooleanField booleanField = BooleanField.builder()
 *             .value(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BooleanFieldBuilder implements Builder<BooleanField> {

    private Boolean value;

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public BooleanFieldBuilder value(final Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * value of value}
     * @return value
     */

    public Boolean getValue() {
        return this.value;
    }

    /**
     * builds BooleanField with checking for non-null required values
     * @return BooleanField
     */
    public BooleanField build() {
        Objects.requireNonNull(value, BooleanField.class + ": value is missing");
        return new BooleanFieldImpl(value);
    }

    /**
     * builds BooleanField without checking for non-null required values
     * @return BooleanField
     */
    public BooleanField buildUnchecked() {
        return new BooleanFieldImpl(value);
    }

    /**
     * factory method for an instance of BooleanFieldBuilder
     * @return builder
     */
    public static BooleanFieldBuilder of() {
        return new BooleanFieldBuilder();
    }

    /**
     * create builder for BooleanField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BooleanFieldBuilder of(final BooleanField template) {
        BooleanFieldBuilder builder = new BooleanFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
