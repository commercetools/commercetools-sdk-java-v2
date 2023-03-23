
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StringFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StringField stringField = StringField.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StringFieldBuilder implements Builder<StringField> {

    private String value;

    /**
     *
     * @param value
     * @return Builder
     */

    public StringFieldBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public StringField build() {
        Objects.requireNonNull(value, StringField.class + ": value is missing");
        return new StringFieldImpl(value);
    }

    /**
     * builds StringField without checking for non null required values
     */
    public StringField buildUnchecked() {
        return new StringFieldImpl(value);
    }

    public static StringFieldBuilder of() {
        return new StringFieldBuilder();
    }

    public static StringFieldBuilder of(final StringField template) {
        StringFieldBuilder builder = new StringFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
