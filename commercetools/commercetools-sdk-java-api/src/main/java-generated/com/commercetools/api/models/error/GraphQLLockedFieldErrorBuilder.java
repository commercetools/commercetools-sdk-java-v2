
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLLockedFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLLockedFieldError graphQLLockedFieldError = GraphQLLockedFieldError.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLLockedFieldErrorBuilder implements Builder<GraphQLLockedFieldError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String field;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLLockedFieldErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLLockedFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Field that is currently locked.</p>
     * @param field value to be set
     * @return Builder
     */

    public GraphQLLockedFieldErrorBuilder field(final String field) {
        this.field = field;
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
     *  <p>Field that is currently locked.</p>
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     * builds GraphQLLockedFieldError with checking for non-null required values
     * @return GraphQLLockedFieldError
     */
    public GraphQLLockedFieldError build() {
        Objects.requireNonNull(field, GraphQLLockedFieldError.class + ": field is missing");
        return new GraphQLLockedFieldErrorImpl(values, field);
    }

    /**
     * builds GraphQLLockedFieldError without checking for non-null required values
     * @return GraphQLLockedFieldError
     */
    public GraphQLLockedFieldError buildUnchecked() {
        return new GraphQLLockedFieldErrorImpl(values, field);
    }

    /**
     * factory method for an instance of GraphQLLockedFieldErrorBuilder
     * @return builder
     */
    public static GraphQLLockedFieldErrorBuilder of() {
        return new GraphQLLockedFieldErrorBuilder();
    }

    /**
     * create builder for GraphQLLockedFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLLockedFieldErrorBuilder of(final GraphQLLockedFieldError template) {
        GraphQLLockedFieldErrorBuilder builder = new GraphQLLockedFieldErrorBuilder();
        builder.values = template.values();
        builder.field = template.getField();
        return builder;
    }

}
