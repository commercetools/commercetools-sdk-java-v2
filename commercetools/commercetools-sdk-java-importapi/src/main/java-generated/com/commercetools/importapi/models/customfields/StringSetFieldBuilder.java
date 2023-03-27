
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StringSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StringSetField stringSetField = StringSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StringSetFieldBuilder implements Builder<StringSetField> {

    private java.util.List<String> value;

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */

    public StringSetFieldBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */

    public StringSetFieldBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */

    public StringSetFieldBuilder plusValue(final String... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     * value of value}
     * @return value
     */

    public java.util.List<String> getValue() {
        return this.value;
    }

    /**
     * builds StringSetField with checking for non-null required values
     * @return StringSetField
     */
    public StringSetField build() {
        Objects.requireNonNull(value, StringSetField.class + ": value is missing");
        return new StringSetFieldImpl(value);
    }

    /**
     * builds StringSetField without checking for non-null required values
     * @return StringSetField
     */
    public StringSetField buildUnchecked() {
        return new StringSetFieldImpl(value);
    }

    /**
     * factory method for an instance of StringSetFieldBuilder
     * @return builder
     */
    public static StringSetFieldBuilder of() {
        return new StringSetFieldBuilder();
    }

    /**
     * create builder for StringSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StringSetFieldBuilder of(final StringSetField template) {
        StringSetFieldBuilder builder = new StringSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
