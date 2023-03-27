
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizedEnumFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedEnumField localizedEnumField = LocalizedEnumField.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizedEnumFieldBuilder implements Builder<LocalizedEnumField> {

    private String value;

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public LocalizedEnumFieldBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     * value of value}
     * @return value
     */

    public String getValue() {
        return this.value;
    }

    /**
     * builds LocalizedEnumField with checking for non-null required values
     * @return LocalizedEnumField
     */
    public LocalizedEnumField build() {
        Objects.requireNonNull(value, LocalizedEnumField.class + ": value is missing");
        return new LocalizedEnumFieldImpl(value);
    }

    /**
     * builds LocalizedEnumField without checking for non-null required values
     * @return LocalizedEnumField
     */
    public LocalizedEnumField buildUnchecked() {
        return new LocalizedEnumFieldImpl(value);
    }

    /**
     * factory method for an instance of LocalizedEnumFieldBuilder
     * @return builder
     */
    public static LocalizedEnumFieldBuilder of() {
        return new LocalizedEnumFieldBuilder();
    }

    /**
     * create builder for LocalizedEnumField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedEnumFieldBuilder of(final LocalizedEnumField template) {
        LocalizedEnumFieldBuilder builder = new LocalizedEnumFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
