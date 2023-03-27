
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SuggestionResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SuggestionResult suggestionResult = SuggestionResult.builder()
 *             .plus/searchKeywords.[a-z]{2}(-[A-Z]{2})?/(/searchKeywords.[a-z]{2}(-[A-Z]{2})?/Builder -> /searchKeywords.[a-z]{2}(-[A-Z]{2})?/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SuggestionResultBuilder implements Builder<SuggestionResult> {

    private Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> values = new HashMap<>();

    /**
     * assign pattern properties to the builder
     * @param values properties to be set
     * @return Builder
     */

    public SuggestionResultBuilder values(
            final Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> values) {
        this.values = values;
        return this;
    }

    /**
     * assign a pattern property to the builder
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public SuggestionResultBuilder addValue(final String key,
            final java.util.List<com.commercetools.api.models.product.Suggestion> value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     * values of pattern properties
     * @return pattern properties
     */

    public Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> getValues() {
        return this.values;
    }

    /**
     * builds SuggestionResult with checking for non-null required values
     * @return SuggestionResult
     */
    public SuggestionResult build() {
        return new SuggestionResultImpl(values);
    }

    /**
     * builds SuggestionResult without checking for non-null required values
     * @return SuggestionResult
     */
    public SuggestionResult buildUnchecked() {
        return new SuggestionResultImpl(values);
    }

    /**
     * factory method for an instance of SuggestionResultBuilder
     * @return builder
     */
    public static SuggestionResultBuilder of() {
        return new SuggestionResultBuilder();
    }

    /**
     * create builder for SuggestionResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SuggestionResultBuilder of(final SuggestionResult template) {
        SuggestionResultBuilder builder = new SuggestionResultBuilder();
        builder.values = template.values();
        return builder;
    }

}
