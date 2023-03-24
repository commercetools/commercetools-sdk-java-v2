
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FacetResultsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FacetResults facetResults = FacetResults.builder()
 *             ./^[a-z].*$/(/^[a-z].*$/Builder -> /^[a-z].*$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FacetResultsBuilder implements Builder<FacetResults> {

    private Map<String, com.commercetools.api.models.product.FacetResult> values = new HashMap<>();

    /**
     *
     * @param values properties to be set
     * @return Builder
     */

    public FacetResultsBuilder values(final Map<String, com.commercetools.api.models.product.FacetResult> values) {
        this.values = values;
        return this;
    }

    /**
     *
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public FacetResultsBuilder addValue(final String key,
            final com.commercetools.api.models.product.FacetResult value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, com.commercetools.api.models.product.FacetResult> getValues() {
        return this.values;
    }

    /**
     * builds FacetResults with checking for non-null required values
     * @return FacetResults
     */
    public FacetResults build() {
        return new FacetResultsImpl(values);
    }

    /**
     * builds FacetResults without checking for non-null required values
     * @return FacetResults
     */
    public FacetResults buildUnchecked() {
        return new FacetResultsImpl(values);
    }

    public static FacetResultsBuilder of() {
        return new FacetResultsBuilder();
    }

    public static FacetResultsBuilder of(final FacetResults template) {
        FacetResultsBuilder builder = new FacetResultsBuilder();
        builder.values = template.values();
        return builder;
    }

}
