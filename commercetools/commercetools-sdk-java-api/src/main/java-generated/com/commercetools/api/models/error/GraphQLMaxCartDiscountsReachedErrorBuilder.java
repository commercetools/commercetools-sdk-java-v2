
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLMaxCartDiscountsReachedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMaxCartDiscountsReachedError graphQLMaxCartDiscountsReachedError = GraphQLMaxCartDiscountsReachedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMaxCartDiscountsReachedErrorBuilder implements Builder<GraphQLMaxCartDiscountsReachedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLMaxCartDiscountsReachedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLMaxCartDiscountsReachedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLMaxCartDiscountsReachedError with checking for non-null required values
     * @return GraphQLMaxCartDiscountsReachedError
     */
    public GraphQLMaxCartDiscountsReachedError build() {
        return new GraphQLMaxCartDiscountsReachedErrorImpl(values);
    }

    /**
     * builds GraphQLMaxCartDiscountsReachedError without checking for non-null required values
     * @return GraphQLMaxCartDiscountsReachedError
     */
    public GraphQLMaxCartDiscountsReachedError buildUnchecked() {
        return new GraphQLMaxCartDiscountsReachedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLMaxCartDiscountsReachedErrorBuilder
     * @return builder
     */
    public static GraphQLMaxCartDiscountsReachedErrorBuilder of() {
        return new GraphQLMaxCartDiscountsReachedErrorBuilder();
    }

    /**
     * create builder for GraphQLMaxCartDiscountsReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMaxCartDiscountsReachedErrorBuilder of(final GraphQLMaxCartDiscountsReachedError template) {
        GraphQLMaxCartDiscountsReachedErrorBuilder builder = new GraphQLMaxCartDiscountsReachedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
