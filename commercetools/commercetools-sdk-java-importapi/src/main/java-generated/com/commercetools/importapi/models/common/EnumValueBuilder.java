
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumValue enumValue = EnumValue.builder()
 *             .key("{key}")
 *             .label("{label}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumValueBuilder implements Builder<EnumValue> {

    private String key;

    private String label;

    /**
     *
     * @param key value to be set
     * @return Builder
     */

    public EnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     * @param label value to be set
     * @return Builder
     */

    public EnumValueBuilder label(final String label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getLabel() {
        return this.label;
    }

    /**
     * builds EnumValue with checking for non-null required values
     * @return EnumValue
     */
    public EnumValue build() {
        Objects.requireNonNull(key, EnumValue.class + ": key is missing");
        Objects.requireNonNull(label, EnumValue.class + ": label is missing");
        return new EnumValueImpl(key, label);
    }

    /**
     * builds EnumValue without checking for non-null required values
     * @return EnumValue
     */
    public EnumValue buildUnchecked() {
        return new EnumValueImpl(key, label);
    }

    public static EnumValueBuilder of() {
        return new EnumValueBuilder();
    }

    public static EnumValueBuilder of(final EnumValue template) {
        EnumValueBuilder builder = new EnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
