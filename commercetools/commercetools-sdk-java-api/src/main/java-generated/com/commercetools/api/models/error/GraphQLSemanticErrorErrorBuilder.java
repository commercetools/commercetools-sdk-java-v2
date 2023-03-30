
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLSemanticErrorErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSemanticErrorError graphQLSemanticErrorError = GraphQLSemanticErrorError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLSemanticErrorErrorBuilder implements Builder<GraphQLSemanticErrorError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLSemanticErrorErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLSemanticErrorErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLSemanticErrorError with checking for non-null required values
     * @return GraphQLSemanticErrorError
     */
    public GraphQLSemanticErrorError build() {
        return new GraphQLSemanticErrorErrorImpl(values);
    }

    /**
     * builds GraphQLSemanticErrorError without checking for non-null required values
     * @return GraphQLSemanticErrorError
     */
    public GraphQLSemanticErrorError buildUnchecked() {
        return new GraphQLSemanticErrorErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLSemanticErrorErrorBuilder
     * @return builder
     */
    public static GraphQLSemanticErrorErrorBuilder of() {
        return new GraphQLSemanticErrorErrorBuilder();
    }

    /**
     * create builder for GraphQLSemanticErrorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSemanticErrorErrorBuilder of(final GraphQLSemanticErrorError template) {
        GraphQLSemanticErrorErrorBuilder builder = new GraphQLSemanticErrorErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
