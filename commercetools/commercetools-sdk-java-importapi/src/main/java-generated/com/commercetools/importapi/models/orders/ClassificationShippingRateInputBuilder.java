
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ClassificationShippingRateInputBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ClassificationShippingRateInput classificationShippingRateInput = ClassificationShippingRateInput.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ClassificationShippingRateInputBuilder implements Builder<ClassificationShippingRateInput> {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString label;

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public ClassificationShippingRateInputBuilder key(final String key) {
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

    public ClassificationShippingRateInputBuilder label(
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
     * @param builder function to build the label value
     * @return Builder
     */

    public ClassificationShippingRateInputBuilder withLabel(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
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

    public ClassificationShippingRateInputBuilder label(
            final com.commercetools.importapi.models.common.LocalizedString label) {
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
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return label
     */

    public com.commercetools.importapi.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     * builds ClassificationShippingRateInput with checking for non-null required values
     * @return ClassificationShippingRateInput
     */
    public ClassificationShippingRateInput build() {
        Objects.requireNonNull(key, ClassificationShippingRateInput.class + ": key is missing");
        Objects.requireNonNull(label, ClassificationShippingRateInput.class + ": label is missing");
        return new ClassificationShippingRateInputImpl(key, label);
    }

    /**
     * builds ClassificationShippingRateInput without checking for non-null required values
     * @return ClassificationShippingRateInput
     */
    public ClassificationShippingRateInput buildUnchecked() {
        return new ClassificationShippingRateInputImpl(key, label);
    }

    /**
     * factory method for an instance of ClassificationShippingRateInputBuilder
     * @return builder
     */
    public static ClassificationShippingRateInputBuilder of() {
        return new ClassificationShippingRateInputBuilder();
    }

    /**
     * create builder for ClassificationShippingRateInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ClassificationShippingRateInputBuilder of(final ClassificationShippingRateInput template) {
        ClassificationShippingRateInputBuilder builder = new ClassificationShippingRateInputBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
