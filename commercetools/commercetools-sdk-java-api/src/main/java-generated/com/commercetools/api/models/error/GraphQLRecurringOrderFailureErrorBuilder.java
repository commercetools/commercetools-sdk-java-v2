
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLRecurringOrderFailureErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLRecurringOrderFailureError graphQLRecurringOrderFailureError = GraphQLRecurringOrderFailureError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLRecurringOrderFailureErrorBuilder implements Builder<GraphQLRecurringOrderFailureError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.lang.Object details;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLRecurringOrderFailureErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLRecurringOrderFailureErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Details about the error's cause and the entities involved.</p>
     * @param details value to be set
     * @return Builder
     */

    public GraphQLRecurringOrderFailureErrorBuilder details(final java.lang.Object details) {
        this.details = details;
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
     *  <p>Details about the error's cause and the entities involved.</p>
     * @return details
     */

    public java.lang.Object getDetails() {
        return this.details;
    }

    /**
     * builds GraphQLRecurringOrderFailureError with checking for non-null required values
     * @return GraphQLRecurringOrderFailureError
     */
    public GraphQLRecurringOrderFailureError build() {
        Objects.requireNonNull(details, GraphQLRecurringOrderFailureError.class + ": details is missing");
        return new GraphQLRecurringOrderFailureErrorImpl(values, details);
    }

    /**
     * builds GraphQLRecurringOrderFailureError without checking for non-null required values
     * @return GraphQLRecurringOrderFailureError
     */
    public GraphQLRecurringOrderFailureError buildUnchecked() {
        return new GraphQLRecurringOrderFailureErrorImpl(values, details);
    }

    /**
     * factory method for an instance of GraphQLRecurringOrderFailureErrorBuilder
     * @return builder
     */
    public static GraphQLRecurringOrderFailureErrorBuilder of() {
        return new GraphQLRecurringOrderFailureErrorBuilder();
    }

    /**
     * create builder for GraphQLRecurringOrderFailureError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLRecurringOrderFailureErrorBuilder of(final GraphQLRecurringOrderFailureError template) {
        GraphQLRecurringOrderFailureErrorBuilder builder = new GraphQLRecurringOrderFailureErrorBuilder();
        builder.values = template.values();
        builder.details = template.getDetails();
        return builder;
    }

}
