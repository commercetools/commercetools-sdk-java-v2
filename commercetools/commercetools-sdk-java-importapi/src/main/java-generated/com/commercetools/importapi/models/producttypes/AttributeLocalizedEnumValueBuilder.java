
package com.commercetools.importapi.models.producttypes;

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

    private com.commercetools.importapi.models.common.LocalizedString label;

    /**
     *
     * @param key value to be set
     * @return Builder
     */

    public AttributeLocalizedEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param builder function to build the label value
     * @return Builder
     */

    public AttributeLocalizedEnumValueBuilder label(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param label value to be set
     * @return Builder
     */

    public AttributeLocalizedEnumValueBuilder label(
            final com.commercetools.importapi.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.importapi.models.common.LocalizedString getLabel() {
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
