
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLSyntaxErrorErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSyntaxErrorError graphQLSyntaxErrorError = GraphQLSyntaxErrorError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLSyntaxErrorErrorBuilder implements Builder<GraphQLSyntaxErrorError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLSyntaxErrorErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLSyntaxErrorErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLSyntaxErrorError with checking for non-null required values
     * @return GraphQLSyntaxErrorError
     */
    public GraphQLSyntaxErrorError build() {
        return new GraphQLSyntaxErrorErrorImpl(values);
    }

    /**
     * builds GraphQLSyntaxErrorError without checking for non-null required values
     * @return GraphQLSyntaxErrorError
     */
    public GraphQLSyntaxErrorError buildUnchecked() {
        return new GraphQLSyntaxErrorErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLSyntaxErrorErrorBuilder
     * @return builder
     */
    public static GraphQLSyntaxErrorErrorBuilder of() {
        return new GraphQLSyntaxErrorErrorBuilder();
    }

    /**
     * create builder for GraphQLSyntaxErrorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSyntaxErrorErrorBuilder of(final GraphQLSyntaxErrorError template) {
        GraphQLSyntaxErrorErrorBuilder builder = new GraphQLSyntaxErrorErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
