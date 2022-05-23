
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributesBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Attributes attributes = Attributes.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributesBuilder implements Builder<Attributes> {

    private Map<String, com.commercetools.importapi.models.productvariants.Attribute> values = new HashMap<>();

    /**
     <*  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself. And since this property will be represented as a map, we can set individual attributes to null to delete them (which follows JSON Merge Patch semantics).</p>>
     */

    public AttributesBuilder values(
            final Map<String, com.commercetools.importapi.models.productvariants.Attribute> values) {
        this.values = values;
        return this;
    }

    /**
     <*  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself. And since this property will be represented as a map, we can set individual attributes to null to delete them (which follows JSON Merge Patch semantics).</p>>
     */

    public AttributesBuilder addValue(final String key,
            final com.commercetools.importapi.models.productvariants.Attribute value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, com.commercetools.importapi.models.productvariants.Attribute> getValues() {
        return this.values;
    }

    public Attributes build() {
        Objects.requireNonNull(values, Attributes.class + ": values are missing");
        return new AttributesImpl(values);
    }

    /**
     * builds Attributes without checking for non null required values
     */
    public Attributes buildUnchecked() {
        return new AttributesImpl(values);
    }

    public static AttributesBuilder of() {
        return new AttributesBuilder();
    }

    public static AttributesBuilder of(final Attributes template) {
        AttributesBuilder builder = new AttributesBuilder();
        builder.values = template.values();
        return builder;
    }

}
