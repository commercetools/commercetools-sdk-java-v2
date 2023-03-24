
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumField enumField = EnumField.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumFieldBuilder implements Builder<EnumField> {

    private String value;

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public EnumFieldBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * builds EnumField with checking for non-null required values
     * @return EnumField
     */
    public EnumField build() {
        Objects.requireNonNull(value, EnumField.class + ": value is missing");
        return new EnumFieldImpl(value);
    }

    /**
     * builds EnumField without checking for non-null required values
     * @return EnumField
     */
    public EnumField buildUnchecked() {
        return new EnumFieldImpl(value);
    }

    public static EnumFieldBuilder of() {
        return new EnumFieldBuilder();
    }

    public static EnumFieldBuilder of(final EnumField template) {
        EnumFieldBuilder builder = new EnumFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
