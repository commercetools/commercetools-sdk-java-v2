
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExpiredCustomerEmailTokenErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExpiredCustomerEmailTokenError graphQLExpiredCustomerEmailTokenError = GraphQLExpiredCustomerEmailTokenError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLExpiredCustomerEmailTokenErrorBuilder implements Builder<GraphQLExpiredCustomerEmailTokenError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLExpiredCustomerEmailTokenErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLExpiredCustomerEmailTokenErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLExpiredCustomerEmailTokenError with checking for non-null required values
     * @return GraphQLExpiredCustomerEmailTokenError
     */
    public GraphQLExpiredCustomerEmailTokenError build() {
        return new GraphQLExpiredCustomerEmailTokenErrorImpl(values);
    }

    /**
     * builds GraphQLExpiredCustomerEmailTokenError without checking for non-null required values
     * @return GraphQLExpiredCustomerEmailTokenError
     */
    public GraphQLExpiredCustomerEmailTokenError buildUnchecked() {
        return new GraphQLExpiredCustomerEmailTokenErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLExpiredCustomerEmailTokenErrorBuilder
     * @return builder
     */
    public static GraphQLExpiredCustomerEmailTokenErrorBuilder of() {
        return new GraphQLExpiredCustomerEmailTokenErrorBuilder();
    }

    /**
     * create builder for GraphQLExpiredCustomerEmailTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExpiredCustomerEmailTokenErrorBuilder of(
            final GraphQLExpiredCustomerEmailTokenError template) {
        GraphQLExpiredCustomerEmailTokenErrorBuilder builder = new GraphQLExpiredCustomerEmailTokenErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
