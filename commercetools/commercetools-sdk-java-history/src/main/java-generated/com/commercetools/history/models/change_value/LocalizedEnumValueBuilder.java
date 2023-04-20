
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizedEnumValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedEnumValue localizedEnumValue = LocalizedEnumValue.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizedEnumValueBuilder implements Builder<LocalizedEnumValue> {

    private String key;

    private com.commercetools.history.models.common.LocalizedString label;

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public LocalizedEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     * set the value to the label using the builder function
     * @param builder function to build the label value
     * @return Builder
     */

    public LocalizedEnumValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the label using the builder function
     * @param builder function to build the label value
     * @return Builder
     */

    public LocalizedEnumValueBuilder withLabel(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     * set the value to the label
     * @param label value to be set
     * @return Builder
     */

    public LocalizedEnumValueBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     * value of key}
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * value of label}
     * @return label
     */

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     * builds LocalizedEnumValue with checking for non-null required values
     * @return LocalizedEnumValue
     */
    public LocalizedEnumValue build() {
        Objects.requireNonNull(key, LocalizedEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, LocalizedEnumValue.class + ": label is missing");
        return new LocalizedEnumValueImpl(key, label);
    }

    /**
     * builds LocalizedEnumValue without checking for non-null required values
     * @return LocalizedEnumValue
     */
    public LocalizedEnumValue buildUnchecked() {
        return new LocalizedEnumValueImpl(key, label);
    }

    /**
     * factory method for an instance of LocalizedEnumValueBuilder
     * @return builder
     */
    public static LocalizedEnumValueBuilder of() {
        return new LocalizedEnumValueBuilder();
    }

    /**
     * create builder for LocalizedEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedEnumValueBuilder of(final LocalizedEnumValue template) {
        LocalizedEnumValueBuilder builder = new LocalizedEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
