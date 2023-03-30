
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidJsonInputErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidJsonInputError graphQLInvalidJsonInputError = GraphQLInvalidJsonInputError.builder()
 *             .detailedErrorMessage("{detailedErrorMessage}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLInvalidJsonInputErrorBuilder implements Builder<GraphQLInvalidJsonInputError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String detailedErrorMessage;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLInvalidJsonInputErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLInvalidJsonInputErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @param detailedErrorMessage value to be set
     * @return Builder
     */

    public GraphQLInvalidJsonInputErrorBuilder detailedErrorMessage(final String detailedErrorMessage) {
        this.detailedErrorMessage = detailedErrorMessage;
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
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @return detailedErrorMessage
     */

    public String getDetailedErrorMessage() {
        return this.detailedErrorMessage;
    }

    /**
     * builds GraphQLInvalidJsonInputError with checking for non-null required values
     * @return GraphQLInvalidJsonInputError
     */
    public GraphQLInvalidJsonInputError build() {
        Objects.requireNonNull(detailedErrorMessage,
            GraphQLInvalidJsonInputError.class + ": detailedErrorMessage is missing");
        return new GraphQLInvalidJsonInputErrorImpl(values, detailedErrorMessage);
    }

    /**
     * builds GraphQLInvalidJsonInputError without checking for non-null required values
     * @return GraphQLInvalidJsonInputError
     */
    public GraphQLInvalidJsonInputError buildUnchecked() {
        return new GraphQLInvalidJsonInputErrorImpl(values, detailedErrorMessage);
    }

    /**
     * factory method for an instance of GraphQLInvalidJsonInputErrorBuilder
     * @return builder
     */
    public static GraphQLInvalidJsonInputErrorBuilder of() {
        return new GraphQLInvalidJsonInputErrorBuilder();
    }

    /**
     * create builder for GraphQLInvalidJsonInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidJsonInputErrorBuilder of(final GraphQLInvalidJsonInputError template) {
        GraphQLInvalidJsonInputErrorBuilder builder = new GraphQLInvalidJsonInputErrorBuilder();
        builder.values = template.values();
        builder.detailedErrorMessage = template.getDetailedErrorMessage();
        return builder;
    }

}
