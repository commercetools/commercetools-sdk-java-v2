
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExpiredCustomerPasswordTokenErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExpiredCustomerPasswordTokenError graphQLExpiredCustomerPasswordTokenError = GraphQLExpiredCustomerPasswordTokenError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLExpiredCustomerPasswordTokenErrorBuilder
        implements Builder<GraphQLExpiredCustomerPasswordTokenError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLExpiredCustomerPasswordTokenErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLExpiredCustomerPasswordTokenErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLExpiredCustomerPasswordTokenError with checking for non-null required values
     * @return GraphQLExpiredCustomerPasswordTokenError
     */
    public GraphQLExpiredCustomerPasswordTokenError build() {
        return new GraphQLExpiredCustomerPasswordTokenErrorImpl(values);
    }

    /**
     * builds GraphQLExpiredCustomerPasswordTokenError without checking for non-null required values
     * @return GraphQLExpiredCustomerPasswordTokenError
     */
    public GraphQLExpiredCustomerPasswordTokenError buildUnchecked() {
        return new GraphQLExpiredCustomerPasswordTokenErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLExpiredCustomerPasswordTokenErrorBuilder
     * @return builder
     */
    public static GraphQLExpiredCustomerPasswordTokenErrorBuilder of() {
        return new GraphQLExpiredCustomerPasswordTokenErrorBuilder();
    }

    /**
     * create builder for GraphQLExpiredCustomerPasswordTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExpiredCustomerPasswordTokenErrorBuilder of(
            final GraphQLExpiredCustomerPasswordTokenError template) {
        GraphQLExpiredCustomerPasswordTokenErrorBuilder builder = new GraphQLExpiredCustomerPasswordTokenErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
