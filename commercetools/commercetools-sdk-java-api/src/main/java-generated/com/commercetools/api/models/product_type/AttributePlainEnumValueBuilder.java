
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributePlainEnumValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributePlainEnumValue attributePlainEnumValue = AttributePlainEnumValue.builder()
 *             .key("{key}")
 *             .label("{label}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributePlainEnumValueBuilder implements Builder<AttributePlainEnumValue> {

    private String key;

    private String label;

    /**
     *  <p>Key of the value used as a programmatic identifier, for example in facets &amp; filters.</p>
     * @param key value to be set
     * @return Builder
     */

    public AttributePlainEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Descriptive label of the value.</p>
     * @param label value to be set
     * @return Builder
     */

    public AttributePlainEnumValueBuilder label(final String label) {
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
     *  <p>Descriptive label of the value.</p>
     * @return label
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * builds AttributePlainEnumValue with checking for non-null required values
     * @return AttributePlainEnumValue
     */
    public AttributePlainEnumValue build() {
        Objects.requireNonNull(key, AttributePlainEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, AttributePlainEnumValue.class + ": label is missing");
        return new AttributePlainEnumValueImpl(key, label);
    }

    /**
     * builds AttributePlainEnumValue without checking for non-null required values
     * @return AttributePlainEnumValue
     */
    public AttributePlainEnumValue buildUnchecked() {
        return new AttributePlainEnumValueImpl(key, label);
    }

    /**
     * factory method for an instance of AttributePlainEnumValueBuilder
     * @return builder
     */
    public static AttributePlainEnumValueBuilder of() {
        return new AttributePlainEnumValueBuilder();
    }

    /**
     * create builder for AttributePlainEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributePlainEnumValueBuilder of(final AttributePlainEnumValue template) {
        AttributePlainEnumValueBuilder builder = new AttributePlainEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
