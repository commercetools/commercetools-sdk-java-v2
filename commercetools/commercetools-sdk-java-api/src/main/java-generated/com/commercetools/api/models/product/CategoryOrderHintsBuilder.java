
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryOrderHintsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryOrderHints categoryOrderHints = CategoryOrderHints.builder()
 *             ./[0-9].[0-9]*[1-9]/("{/[0-9].[0-9]*[1-9]/}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryOrderHintsBuilder implements Builder<CategoryOrderHints> {

    private Map<String, String> values = new HashMap<>();

    /**
     *  <p>A string representing a number between 0 and 1 that must start with <code>0.</code> and cannot end with <code>0</code>.</p>
     */

    public CategoryOrderHintsBuilder values(final Map<String, String> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>A string representing a number between 0 and 1 that must start with <code>0.</code> and cannot end with <code>0</code>.</p>
     */

    public CategoryOrderHintsBuilder addValue(final String key, final String value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, String> getValues() {
        return this.values;
    }

    public CategoryOrderHints build() {
        Objects.requireNonNull(values, CategoryOrderHints.class + ": values are missing");
        return new CategoryOrderHintsImpl(values);
    }

    /**
     * builds CategoryOrderHints without checking for non null required values
     */
    public CategoryOrderHints buildUnchecked() {
        return new CategoryOrderHintsImpl(values);
    }

    public static CategoryOrderHintsBuilder of() {
        return new CategoryOrderHintsBuilder();
    }

    public static CategoryOrderHintsBuilder of(final CategoryOrderHints template) {
        CategoryOrderHintsBuilder builder = new CategoryOrderHintsBuilder();
        builder.values = template.values();
        return builder;
    }

}
