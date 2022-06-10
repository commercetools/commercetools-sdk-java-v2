
package com.commercetools.api.models.product_type;

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

    private com.commercetools.api.models.common.LocalizedString label;

    /**
     *
     */

    public AttributeLocalizedEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public AttributeLocalizedEnumValueBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public AttributeLocalizedEnumValueBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public AttributeLocalizedEnumValue build() {
        Objects.requireNonNull(key, AttributeLocalizedEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, AttributeLocalizedEnumValue.class + ": label is missing");
        return new AttributeLocalizedEnumValueImpl(key, label);
    }

    /**
     * builds AttributeLocalizedEnumValue without checking for non null required values
     */
    public AttributeLocalizedEnumValue buildUnchecked() {
        return new AttributeLocalizedEnumValueImpl(key, label);
    }

    public static AttributeLocalizedEnumValueBuilder of() {
        return new AttributeLocalizedEnumValueBuilder();
    }

    public static AttributeLocalizedEnumValueBuilder of(final AttributeLocalizedEnumValue template) {
        AttributeLocalizedEnumValueBuilder builder = new AttributeLocalizedEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
