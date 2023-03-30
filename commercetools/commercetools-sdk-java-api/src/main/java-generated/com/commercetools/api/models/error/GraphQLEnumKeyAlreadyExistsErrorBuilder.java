
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLEnumKeyAlreadyExistsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEnumKeyAlreadyExistsError graphQLEnumKeyAlreadyExistsError = GraphQLEnumKeyAlreadyExistsError.builder()
 *             .conflictingEnumKey("{conflictingEnumKey}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLEnumKeyAlreadyExistsErrorBuilder implements Builder<GraphQLEnumKeyAlreadyExistsError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String conflictingEnumKey;

    private String conflictingAttributeName;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLEnumKeyAlreadyExistsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLEnumKeyAlreadyExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Conflicting enum key.</p>
     * @param conflictingEnumKey value to be set
     * @return Builder
     */

    public GraphQLEnumKeyAlreadyExistsErrorBuilder conflictingEnumKey(final String conflictingEnumKey) {
        this.conflictingEnumKey = conflictingEnumKey;
        return this;
    }

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     * @return Builder
     */

    public GraphQLEnumKeyAlreadyExistsErrorBuilder conflictingAttributeName(final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
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
     *  <p>Conflicting enum key.</p>
     * @return conflictingEnumKey
     */

    public String getConflictingEnumKey() {
        return this.conflictingEnumKey;
    }

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    /**
     * builds GraphQLEnumKeyAlreadyExistsError with checking for non-null required values
     * @return GraphQLEnumKeyAlreadyExistsError
     */
    public GraphQLEnumKeyAlreadyExistsError build() {
        Objects.requireNonNull(conflictingEnumKey,
            GraphQLEnumKeyAlreadyExistsError.class + ": conflictingEnumKey is missing");
        Objects.requireNonNull(conflictingAttributeName,
            GraphQLEnumKeyAlreadyExistsError.class + ": conflictingAttributeName is missing");
        return new GraphQLEnumKeyAlreadyExistsErrorImpl(values, conflictingEnumKey, conflictingAttributeName);
    }

    /**
     * builds GraphQLEnumKeyAlreadyExistsError without checking for non-null required values
     * @return GraphQLEnumKeyAlreadyExistsError
     */
    public GraphQLEnumKeyAlreadyExistsError buildUnchecked() {
        return new GraphQLEnumKeyAlreadyExistsErrorImpl(values, conflictingEnumKey, conflictingAttributeName);
    }

    /**
     * factory method for an instance of GraphQLEnumKeyAlreadyExistsErrorBuilder
     * @return builder
     */
    public static GraphQLEnumKeyAlreadyExistsErrorBuilder of() {
        return new GraphQLEnumKeyAlreadyExistsErrorBuilder();
    }

    /**
     * create builder for GraphQLEnumKeyAlreadyExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEnumKeyAlreadyExistsErrorBuilder of(final GraphQLEnumKeyAlreadyExistsError template) {
        GraphQLEnumKeyAlreadyExistsErrorBuilder builder = new GraphQLEnumKeyAlreadyExistsErrorBuilder();
        builder.values = template.values();
        builder.conflictingEnumKey = template.getConflictingEnumKey();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
