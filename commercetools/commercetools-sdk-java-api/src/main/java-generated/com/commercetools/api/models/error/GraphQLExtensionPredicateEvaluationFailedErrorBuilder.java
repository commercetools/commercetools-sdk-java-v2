
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExtensionPredicateEvaluationFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionPredicateEvaluationFailedError graphQLExtensionPredicateEvaluationFailedError = GraphQLExtensionPredicateEvaluationFailedError.builder()
 *             .errorByExtension(errorByExtensionBuilder -> errorByExtensionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLExtensionPredicateEvaluationFailedErrorBuilder
        implements Builder<GraphQLExtensionPredicateEvaluationFailedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.error.ErrorByExtension errorByExtension;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLExtensionPredicateEvaluationFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLExtensionPredicateEvaluationFailedErrorBuilder addValue(final String key,
            final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @param builder function to build the errorByExtension value
     * @return Builder
     */

    public GraphQLExtensionPredicateEvaluationFailedErrorBuilder errorByExtension(
            Function<com.commercetools.api.models.error.ErrorByExtensionBuilder, com.commercetools.api.models.error.ErrorByExtensionBuilder> builder) {
        this.errorByExtension = builder.apply(com.commercetools.api.models.error.ErrorByExtensionBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @param builder function to build the errorByExtension value
     * @return Builder
     */

    public GraphQLExtensionPredicateEvaluationFailedErrorBuilder withErrorByExtension(
            Function<com.commercetools.api.models.error.ErrorByExtensionBuilder, com.commercetools.api.models.error.ErrorByExtension> builder) {
        this.errorByExtension = builder.apply(com.commercetools.api.models.error.ErrorByExtensionBuilder.of());
        return this;
    }

    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @param errorByExtension value to be set
     * @return Builder
     */

    public GraphQLExtensionPredicateEvaluationFailedErrorBuilder errorByExtension(
            final com.commercetools.api.models.error.ErrorByExtension errorByExtension) {
        this.errorByExtension = errorByExtension;
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
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @return errorByExtension
     */

    public com.commercetools.api.models.error.ErrorByExtension getErrorByExtension() {
        return this.errorByExtension;
    }

    /**
     * builds GraphQLExtensionPredicateEvaluationFailedError with checking for non-null required values
     * @return GraphQLExtensionPredicateEvaluationFailedError
     */
    public GraphQLExtensionPredicateEvaluationFailedError build() {
        Objects.requireNonNull(errorByExtension,
            GraphQLExtensionPredicateEvaluationFailedError.class + ": errorByExtension is missing");
        return new GraphQLExtensionPredicateEvaluationFailedErrorImpl(values, errorByExtension);
    }

    /**
     * builds GraphQLExtensionPredicateEvaluationFailedError without checking for non-null required values
     * @return GraphQLExtensionPredicateEvaluationFailedError
     */
    public GraphQLExtensionPredicateEvaluationFailedError buildUnchecked() {
        return new GraphQLExtensionPredicateEvaluationFailedErrorImpl(values, errorByExtension);
    }

    /**
     * factory method for an instance of GraphQLExtensionPredicateEvaluationFailedErrorBuilder
     * @return builder
     */
    public static GraphQLExtensionPredicateEvaluationFailedErrorBuilder of() {
        return new GraphQLExtensionPredicateEvaluationFailedErrorBuilder();
    }

    /**
     * create builder for GraphQLExtensionPredicateEvaluationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionPredicateEvaluationFailedErrorBuilder of(
            final GraphQLExtensionPredicateEvaluationFailedError template) {
        GraphQLExtensionPredicateEvaluationFailedErrorBuilder builder = new GraphQLExtensionPredicateEvaluationFailedErrorBuilder();
        builder.values = template.values();
        builder.errorByExtension = template.getErrorByExtension();
        return builder;
    }

}
