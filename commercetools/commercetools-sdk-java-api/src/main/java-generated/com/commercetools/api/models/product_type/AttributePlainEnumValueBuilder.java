
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
     */

    public AttributePlainEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Descriptive label of the value.</p>
     */

    public AttributePlainEnumValueBuilder label(final String label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getLabel() {
        return this.label;
    }

    public AttributePlainEnumValue build() {
        Objects.requireNonNull(key, AttributePlainEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, AttributePlainEnumValue.class + ": label is missing");
        return new AttributePlainEnumValueImpl(key, label);
    }

    /**
     * builds AttributePlainEnumValue without checking for non null required values
     */
    public AttributePlainEnumValue buildUnchecked() {
        return new AttributePlainEnumValueImpl(key, label);
    }

    public static AttributePlainEnumValueBuilder of() {
        return new AttributePlainEnumValueBuilder();
    }

    public static AttributePlainEnumValueBuilder of(final AttributePlainEnumValue template) {
        AttributePlainEnumValueBuilder builder = new AttributePlainEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
