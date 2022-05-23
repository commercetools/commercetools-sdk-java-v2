
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldContainerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldContainer fieldContainer = FieldContainer.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FieldContainerBuilder implements Builder<FieldContainer> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     <*  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the FieldDefinitions) and values given by CustomFieldValue.</p>>
     */

    public FieldContainerBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     <*  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the FieldDefinitions) and values given by CustomFieldValue.</p>>
     */

    public FieldContainerBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public FieldContainer build() {
        Objects.requireNonNull(values, FieldContainer.class + ": values are missing");
        return new FieldContainerImpl(values);
    }

    /**
     * builds FieldContainer without checking for non null required values
     */
    public FieldContainer buildUnchecked() {
        return new FieldContainerImpl(values);
    }

    public static FieldContainerBuilder of() {
        return new FieldContainerBuilder();
    }

    public static FieldContainerBuilder of(final FieldContainer template) {
        FieldContainerBuilder builder = new FieldContainerBuilder();
        builder.values = template.values();
        return builder;
    }

}
