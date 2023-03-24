
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StringLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StringLabel stringLabel = StringLabel.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StringLabelBuilder implements Builder<StringLabel> {

    private String value;

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public StringLabelBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * builds StringLabel with checking for non-null required values
     * @return StringLabel
     */
    public StringLabel build() {
        Objects.requireNonNull(value, StringLabel.class + ": value is missing");
        return new StringLabelImpl(value);
    }

    /**
     * builds StringLabel without checking for non-null required values
     * @return StringLabel
     */
    public StringLabel buildUnchecked() {
        return new StringLabelImpl(value);
    }

    public static StringLabelBuilder of() {
        return new StringLabelBuilder();
    }

    public static StringLabelBuilder of(final StringLabel template) {
        StringLabelBuilder builder = new StringLabelBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
