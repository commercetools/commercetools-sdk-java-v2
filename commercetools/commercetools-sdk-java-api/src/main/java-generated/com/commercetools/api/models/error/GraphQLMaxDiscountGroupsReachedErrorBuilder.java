
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLMaxDiscountGroupsReachedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMaxDiscountGroupsReachedError graphQLMaxDiscountGroupsReachedError = GraphQLMaxDiscountGroupsReachedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMaxDiscountGroupsReachedErrorBuilder implements Builder<GraphQLMaxDiscountGroupsReachedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLMaxDiscountGroupsReachedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLMaxDiscountGroupsReachedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLMaxDiscountGroupsReachedError with checking for non-null required values
     * @return GraphQLMaxDiscountGroupsReachedError
     */
    public GraphQLMaxDiscountGroupsReachedError build() {
        return new GraphQLMaxDiscountGroupsReachedErrorImpl(values);
    }

    /**
     * builds GraphQLMaxDiscountGroupsReachedError without checking for non-null required values
     * @return GraphQLMaxDiscountGroupsReachedError
     */
    public GraphQLMaxDiscountGroupsReachedError buildUnchecked() {
        return new GraphQLMaxDiscountGroupsReachedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLMaxDiscountGroupsReachedErrorBuilder
     * @return builder
     */
    public static GraphQLMaxDiscountGroupsReachedErrorBuilder of() {
        return new GraphQLMaxDiscountGroupsReachedErrorBuilder();
    }

    /**
     * create builder for GraphQLMaxDiscountGroupsReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMaxDiscountGroupsReachedErrorBuilder of(final GraphQLMaxDiscountGroupsReachedError template) {
        GraphQLMaxDiscountGroupsReachedErrorBuilder builder = new GraphQLMaxDiscountGroupsReachedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
