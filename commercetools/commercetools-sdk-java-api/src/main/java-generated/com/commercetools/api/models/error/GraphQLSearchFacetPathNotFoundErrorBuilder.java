
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLSearchFacetPathNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchFacetPathNotFoundError graphQLSearchFacetPathNotFoundError = GraphQLSearchFacetPathNotFoundError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLSearchFacetPathNotFoundErrorBuilder implements Builder<GraphQLSearchFacetPathNotFoundError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLSearchFacetPathNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLSearchFacetPathNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     * builds GraphQLSearchFacetPathNotFoundError with checking for non-null required values
     * @return GraphQLSearchFacetPathNotFoundError
     */
    public GraphQLSearchFacetPathNotFoundError build() {
        return new GraphQLSearchFacetPathNotFoundErrorImpl(values);
    }

    /**
     * builds GraphQLSearchFacetPathNotFoundError without checking for non-null required values
     * @return GraphQLSearchFacetPathNotFoundError
     */
    public GraphQLSearchFacetPathNotFoundError buildUnchecked() {
        return new GraphQLSearchFacetPathNotFoundErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLSearchFacetPathNotFoundErrorBuilder
     * @return builder
     */
    public static GraphQLSearchFacetPathNotFoundErrorBuilder of() {
        return new GraphQLSearchFacetPathNotFoundErrorBuilder();
    }

    /**
     * create builder for GraphQLSearchFacetPathNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchFacetPathNotFoundErrorBuilder of(final GraphQLSearchFacetPathNotFoundError template) {
        GraphQLSearchFacetPathNotFoundErrorBuilder builder = new GraphQLSearchFacetPathNotFoundErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
