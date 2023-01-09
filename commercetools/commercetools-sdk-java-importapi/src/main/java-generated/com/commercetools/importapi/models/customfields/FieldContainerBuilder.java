
package com.commercetools.importapi.models.customfields;

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
 *             .//(//Builder -> //Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FieldContainerBuilder implements Builder<FieldContainer> {

    private Map<String, com.commercetools.importapi.models.customfields.CustomField> values = new HashMap<>();

    /**
     *  <p>Mapping from the custom field name to the actual value.</p>
     */

    public FieldContainerBuilder values(
            final Map<String, com.commercetools.importapi.models.customfields.CustomField> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Mapping from the custom field name to the actual value.</p>
     */

    public FieldContainerBuilder addValue(final String key,
            final com.commercetools.importapi.models.customfields.CustomField value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, com.commercetools.importapi.models.customfields.CustomField> getValues() {
        return this.values;
    }

    public FieldContainer build() {
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
