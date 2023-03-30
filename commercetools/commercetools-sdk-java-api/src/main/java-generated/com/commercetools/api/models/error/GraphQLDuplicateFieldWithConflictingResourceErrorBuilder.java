
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLDuplicateFieldWithConflictingResourceErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateFieldWithConflictingResourceError graphQLDuplicateFieldWithConflictingResourceError = GraphQLDuplicateFieldWithConflictingResourceError.builder()
 *             .field("{field}")
 *             .conflictingResource(conflictingResourceBuilder -> conflictingResourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicateFieldWithConflictingResourceErrorBuilder
        implements Builder<GraphQLDuplicateFieldWithConflictingResourceError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String field;

    private java.lang.Object duplicateValue;

    private com.commercetools.api.models.common.Reference conflictingResource;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLDuplicateFieldWithConflictingResourceErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLDuplicateFieldWithConflictingResourceErrorBuilder addValue(final String key,
            final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Name of the conflicting field.</p>
     * @param field value to be set
     * @return Builder
     */

    public GraphQLDuplicateFieldWithConflictingResourceErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>Conflicting duplicate value.</p>
     * @param duplicateValue value to be set
     * @return Builder
     */

    public GraphQLDuplicateFieldWithConflictingResourceErrorBuilder duplicateValue(
            final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
        return this;
    }

    /**
     *  <p>Reference to the resource that has the conflicting value.</p>
     * @param conflictingResource value to be set
     * @return Builder
     */

    public GraphQLDuplicateFieldWithConflictingResourceErrorBuilder conflictingResource(
            final com.commercetools.api.models.common.Reference conflictingResource) {
        this.conflictingResource = conflictingResource;
        return this;
    }

    /**
     *  <p>Reference to the resource that has the conflicting value.</p>
     * @param builder function to build the conflictingResource value
     * @return Builder
     */

    public GraphQLDuplicateFieldWithConflictingResourceErrorBuilder conflictingResource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.conflictingResource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
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
     *  <p>Name of the conflicting field.</p>
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>Conflicting duplicate value.</p>
     * @return duplicateValue
     */

    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
    }

    /**
     *  <p>Reference to the resource that has the conflicting value.</p>
     * @return conflictingResource
     */

    public com.commercetools.api.models.common.Reference getConflictingResource() {
        return this.conflictingResource;
    }

    /**
     * builds GraphQLDuplicateFieldWithConflictingResourceError with checking for non-null required values
     * @return GraphQLDuplicateFieldWithConflictingResourceError
     */
    public GraphQLDuplicateFieldWithConflictingResourceError build() {
        Objects.requireNonNull(field, GraphQLDuplicateFieldWithConflictingResourceError.class + ": field is missing");
        Objects.requireNonNull(duplicateValue,
            GraphQLDuplicateFieldWithConflictingResourceError.class + ": duplicateValue is missing");
        Objects.requireNonNull(conflictingResource,
            GraphQLDuplicateFieldWithConflictingResourceError.class + ": conflictingResource is missing");
        return new GraphQLDuplicateFieldWithConflictingResourceErrorImpl(values, field, duplicateValue,
            conflictingResource);
    }

    /**
     * builds GraphQLDuplicateFieldWithConflictingResourceError without checking for non-null required values
     * @return GraphQLDuplicateFieldWithConflictingResourceError
     */
    public GraphQLDuplicateFieldWithConflictingResourceError buildUnchecked() {
        return new GraphQLDuplicateFieldWithConflictingResourceErrorImpl(values, field, duplicateValue,
            conflictingResource);
    }

    /**
     * factory method for an instance of GraphQLDuplicateFieldWithConflictingResourceErrorBuilder
     * @return builder
     */
    public static GraphQLDuplicateFieldWithConflictingResourceErrorBuilder of() {
        return new GraphQLDuplicateFieldWithConflictingResourceErrorBuilder();
    }

    /**
     * create builder for GraphQLDuplicateFieldWithConflictingResourceError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateFieldWithConflictingResourceErrorBuilder of(
            final GraphQLDuplicateFieldWithConflictingResourceError template) {
        GraphQLDuplicateFieldWithConflictingResourceErrorBuilder builder = new GraphQLDuplicateFieldWithConflictingResourceErrorBuilder();
        builder.values = template.values();
        builder.field = template.getField();
        builder.duplicateValue = template.getDuplicateValue();
        builder.conflictingResource = template.getConflictingResource();
        return builder;
    }

}
