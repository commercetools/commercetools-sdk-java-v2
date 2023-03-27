
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumSetField enumSetField = EnumSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumSetFieldBuilder implements Builder<EnumSetField> {

    private java.util.List<String> value;

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */

    public EnumSetFieldBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */

    public EnumSetFieldBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */

    public EnumSetFieldBuilder plusValue(final String... value) {
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
     * builds EnumSetField with checking for non-null required values
     * @return EnumSetField
     */
    public EnumSetField build() {
        Objects.requireNonNull(value, EnumSetField.class + ": value is missing");
        return new EnumSetFieldImpl(value);
    }

    /**
     * builds EnumSetField without checking for non-null required values
     * @return EnumSetField
     */
    public EnumSetField buildUnchecked() {
        return new EnumSetFieldImpl(value);
    }

    /**
     * factory method for an instance of EnumSetFieldBuilder
     * @return builder
     */
    public static EnumSetFieldBuilder of() {
        return new EnumSetFieldBuilder();
    }

    /**
     * create builder for EnumSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumSetFieldBuilder of(final EnumSetField template) {
        EnumSetFieldBuilder builder = new EnumSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
