
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
     *  <p>Changed value.</p>
     * @param value value to be set
     * @return Builder
     */

    public StringLabelBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Changed value.</p>
     * @return value
     */

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

    /**
     * factory method for an instance of StringLabelBuilder
     * @return builder
     */
    public static StringLabelBuilder of() {
        return new StringLabelBuilder();
    }

    /**
     * create builder for StringLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StringLabelBuilder of(final StringLabel template) {
        StringLabelBuilder builder = new StringLabelBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
