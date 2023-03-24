
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NumberFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NumberField numberField = NumberField.builder()
 *             .value(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NumberFieldBuilder implements Builder<NumberField> {

    private Double value;

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public NumberFieldBuilder value(final Double value) {
        this.value = value;
        return this;
    }

    public Double getValue() {
        return this.value;
    }

    /**
     * builds NumberField with checking for non-null required values
     * @return NumberField
     */
    public NumberField build() {
        Objects.requireNonNull(value, NumberField.class + ": value is missing");
        return new NumberFieldImpl(value);
    }

    /**
     * builds NumberField without checking for non-null required values
     * @return NumberField
     */
    public NumberField buildUnchecked() {
        return new NumberFieldImpl(value);
    }

    public static NumberFieldBuilder of() {
        return new NumberFieldBuilder();
    }

    public static NumberFieldBuilder of(final NumberField template) {
        NumberFieldBuilder builder = new NumberFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
