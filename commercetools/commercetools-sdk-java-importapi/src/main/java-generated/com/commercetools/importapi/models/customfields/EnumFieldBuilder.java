
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
     *  <p>The key of the enum value. Must be a <code>key</code> of one of the CustomFieldEnumValues defined in the CustomFieldEnumType.</p>
     * @param value value to be set
     * @return Builder
     */

    public EnumFieldBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The key of the enum value. Must be a <code>key</code> of one of the CustomFieldEnumValues defined in the CustomFieldEnumType.</p>
     * @return value
     */

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

    /**
     * factory method for an instance of EnumFieldBuilder
     * @return builder
     */
    public static EnumFieldBuilder of() {
        return new EnumFieldBuilder();
    }

    /**
     * create builder for EnumField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumFieldBuilder of(final EnumField template) {
        EnumFieldBuilder builder = new EnumFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
