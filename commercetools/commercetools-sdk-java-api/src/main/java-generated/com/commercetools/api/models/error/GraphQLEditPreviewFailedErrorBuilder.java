
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLEditPreviewFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEditPreviewFailedError graphQLEditPreviewFailedError = GraphQLEditPreviewFailedError.builder()
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLEditPreviewFailedErrorBuilder implements Builder<GraphQLEditPreviewFailedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.order_edit.OrderEditPreviewFailure result;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLEditPreviewFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLEditPreviewFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @param builder function to build the result value
     * @return Builder
     */

    public GraphQLEditPreviewFailedErrorBuilder result(
            Function<com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder, com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder> builder) {
        this.result = builder.apply(com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @param result value to be set
     * @return Builder
     */

    public GraphQLEditPreviewFailedErrorBuilder result(
            final com.commercetools.api.models.order_edit.OrderEditPreviewFailure result) {
        this.result = result;
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
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @return result
     */

    public com.commercetools.api.models.order_edit.OrderEditPreviewFailure getResult() {
        return this.result;
    }

    /**
     * builds GraphQLEditPreviewFailedError with checking for non-null required values
     * @return GraphQLEditPreviewFailedError
     */
    public GraphQLEditPreviewFailedError build() {
        Objects.requireNonNull(result, GraphQLEditPreviewFailedError.class + ": result is missing");
        return new GraphQLEditPreviewFailedErrorImpl(values, result);
    }

    /**
     * builds GraphQLEditPreviewFailedError without checking for non-null required values
     * @return GraphQLEditPreviewFailedError
     */
    public GraphQLEditPreviewFailedError buildUnchecked() {
        return new GraphQLEditPreviewFailedErrorImpl(values, result);
    }

    /**
     * factory method for an instance of GraphQLEditPreviewFailedErrorBuilder
     * @return builder
     */
    public static GraphQLEditPreviewFailedErrorBuilder of() {
        return new GraphQLEditPreviewFailedErrorBuilder();
    }

    /**
     * create builder for GraphQLEditPreviewFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEditPreviewFailedErrorBuilder of(final GraphQLEditPreviewFailedError template) {
        GraphQLEditPreviewFailedErrorBuilder builder = new GraphQLEditPreviewFailedErrorBuilder();
        builder.values = template.values();
        builder.result = template.getResult();
        return builder;
    }

}
