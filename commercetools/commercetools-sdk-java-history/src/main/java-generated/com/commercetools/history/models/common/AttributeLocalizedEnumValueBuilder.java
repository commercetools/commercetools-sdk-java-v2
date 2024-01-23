
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeLocalizedEnumValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeLocalizedEnumValue attributeLocalizedEnumValue = AttributeLocalizedEnumValue.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeLocalizedEnumValueBuilder implements Builder<AttributeLocalizedEnumValue> {

    private String key;

    private com.commercetools.history.models.common.LocalizedString label;

    /**
     *  <p>Key of the value used as a programmatic identifier, for example in facets &amp; filters.</p>
     * @param key value to be set
     * @return Builder
     */

    public AttributeLocalizedEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Descriptive, localized label of the value.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeLocalizedEnumValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Descriptive, localized label of the value.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeLocalizedEnumValueBuilder withLabel(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Descriptive, localized label of the value.</p>
     * @param label value to be set
     * @return Builder
     */

    public AttributeLocalizedEnumValueBuilder label(
            final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Key of the value used as a programmatic identifier, for example in facets &amp; filters.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Descriptive, localized label of the value.</p>
     * @return label
     */

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     * builds AttributeLocalizedEnumValue with checking for non-null required values
     * @return AttributeLocalizedEnumValue
     */
    public AttributeLocalizedEnumValue build() {
        Objects.requireNonNull(key, AttributeLocalizedEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, AttributeLocalizedEnumValue.class + ": label is missing");
        return new AttributeLocalizedEnumValueImpl(key, label);
    }

    /**
     * builds AttributeLocalizedEnumValue without checking for non-null required values
     * @return AttributeLocalizedEnumValue
     */
    public AttributeLocalizedEnumValue buildUnchecked() {
        return new AttributeLocalizedEnumValueImpl(key, label);
    }

    /**
     * factory method for an instance of AttributeLocalizedEnumValueBuilder
     * @return builder
     */
    public static AttributeLocalizedEnumValueBuilder of() {
        return new AttributeLocalizedEnumValueBuilder();
    }

    /**
     * create builder for AttributeLocalizedEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeLocalizedEnumValueBuilder of(final AttributeLocalizedEnumValue template) {
        AttributeLocalizedEnumValueBuilder builder = new AttributeLocalizedEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
