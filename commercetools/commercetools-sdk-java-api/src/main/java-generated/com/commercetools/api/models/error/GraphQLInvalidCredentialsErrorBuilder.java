
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidCredentialsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidCredentialsError graphQLInvalidCredentialsError = GraphQLInvalidCredentialsError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLInvalidCredentialsErrorBuilder implements Builder<GraphQLInvalidCredentialsError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLInvalidCredentialsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLInvalidCredentialsErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLInvalidCredentialsError with checking for non-null required values
     * @return GraphQLInvalidCredentialsError
     */
    public GraphQLInvalidCredentialsError build() {
        return new GraphQLInvalidCredentialsErrorImpl(values);
    }

    /**
     * builds GraphQLInvalidCredentialsError without checking for non-null required values
     * @return GraphQLInvalidCredentialsError
     */
    public GraphQLInvalidCredentialsError buildUnchecked() {
        return new GraphQLInvalidCredentialsErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLInvalidCredentialsErrorBuilder
     * @return builder
     */
    public static GraphQLInvalidCredentialsErrorBuilder of() {
        return new GraphQLInvalidCredentialsErrorBuilder();
    }

    /**
     * create builder for GraphQLInvalidCredentialsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidCredentialsErrorBuilder of(final GraphQLInvalidCredentialsError template) {
        GraphQLInvalidCredentialsErrorBuilder builder = new GraphQLInvalidCredentialsErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
