
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
     *
     * @param value
     * @return Builder
     */

    public LocalizedEnumFieldBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public LocalizedEnumField build() {
        Objects.requireNonNull(value, LocalizedEnumField.class + ": value is missing");
        return new LocalizedEnumFieldImpl(value);
    }

    /**
     * builds LocalizedEnumField without checking for non null required values
     */
    public LocalizedEnumField buildUnchecked() {
        return new LocalizedEnumFieldImpl(value);
    }

    public static LocalizedEnumFieldBuilder of() {
        return new LocalizedEnumFieldBuilder();
    }

    public static LocalizedEnumFieldBuilder of(final LocalizedEnumField template) {
        LocalizedEnumFieldBuilder builder = new LocalizedEnumFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
