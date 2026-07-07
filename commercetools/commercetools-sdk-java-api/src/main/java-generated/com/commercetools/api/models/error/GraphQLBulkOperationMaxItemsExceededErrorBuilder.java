
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLBulkOperationMaxItemsExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLBulkOperationMaxItemsExceededError graphQLBulkOperationMaxItemsExceededError = GraphQLBulkOperationMaxItemsExceededError.builder()
 *             .limit(0.3)
 *             .provided(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLBulkOperationMaxItemsExceededErrorBuilder
        implements Builder<GraphQLBulkOperationMaxItemsExceededError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private Integer limit;

    private Integer provided;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLBulkOperationMaxItemsExceededErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLBulkOperationMaxItemsExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Maximum number of items allowed in a single bulk request.</p>
     * @param limit value to be set
     * @return Builder
     */

    public GraphQLBulkOperationMaxItemsExceededErrorBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of items provided in the request.</p>
     * @param provided value to be set
     * @return Builder
     */

    public GraphQLBulkOperationMaxItemsExceededErrorBuilder provided(final Integer provided) {
        this.provided = provided;
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
     *  <p>Maximum number of items allowed in a single bulk request.</p>
     * @return limit
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of items provided in the request.</p>
     * @return provided
     */

    public Integer getProvided() {
        return this.provided;
    }

    /**
     * builds GraphQLBulkOperationMaxItemsExceededError with checking for non-null required values
     * @return GraphQLBulkOperationMaxItemsExceededError
     */
    public GraphQLBulkOperationMaxItemsExceededError build() {
        Objects.requireNonNull(limit, GraphQLBulkOperationMaxItemsExceededError.class + ": limit is missing");
        Objects.requireNonNull(provided, GraphQLBulkOperationMaxItemsExceededError.class + ": provided is missing");
        return new GraphQLBulkOperationMaxItemsExceededErrorImpl(values, limit, provided);
    }

    /**
     * builds GraphQLBulkOperationMaxItemsExceededError without checking for non-null required values
     * @return GraphQLBulkOperationMaxItemsExceededError
     */
    public GraphQLBulkOperationMaxItemsExceededError buildUnchecked() {
        return new GraphQLBulkOperationMaxItemsExceededErrorImpl(values, limit, provided);
    }

    /**
     * factory method for an instance of GraphQLBulkOperationMaxItemsExceededErrorBuilder
     * @return builder
     */
    public static GraphQLBulkOperationMaxItemsExceededErrorBuilder of() {
        return new GraphQLBulkOperationMaxItemsExceededErrorBuilder();
    }

    /**
     * create builder for GraphQLBulkOperationMaxItemsExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLBulkOperationMaxItemsExceededErrorBuilder of(
            final GraphQLBulkOperationMaxItemsExceededError template) {
        GraphQLBulkOperationMaxItemsExceededErrorBuilder builder = new GraphQLBulkOperationMaxItemsExceededErrorBuilder();
        builder.values = template.values();
        builder.limit = template.getLimit();
        builder.provided = template.getProvided();
        return builder;
    }

}
