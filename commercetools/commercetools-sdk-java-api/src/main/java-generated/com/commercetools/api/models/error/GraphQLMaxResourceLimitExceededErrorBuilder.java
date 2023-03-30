
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLMaxResourceLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMaxResourceLimitExceededError graphQLMaxResourceLimitExceededError = GraphQLMaxResourceLimitExceededError.builder()
 *             .exceededResource(ReferenceTypeId.ATTRIBUTE_GROUP)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMaxResourceLimitExceededErrorBuilder implements Builder<GraphQLMaxResourceLimitExceededError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.common.ReferenceTypeId exceededResource;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLMaxResourceLimitExceededErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLMaxResourceLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     * @param exceededResource value to be set
     * @return Builder
     */

    public GraphQLMaxResourceLimitExceededErrorBuilder exceededResource(
            final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.exceededResource = exceededResource;
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
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     * @return exceededResource
     */

    public com.commercetools.api.models.common.ReferenceTypeId getExceededResource() {
        return this.exceededResource;
    }

    /**
     * builds GraphQLMaxResourceLimitExceededError with checking for non-null required values
     * @return GraphQLMaxResourceLimitExceededError
     */
    public GraphQLMaxResourceLimitExceededError build() {
        Objects.requireNonNull(exceededResource,
            GraphQLMaxResourceLimitExceededError.class + ": exceededResource is missing");
        return new GraphQLMaxResourceLimitExceededErrorImpl(values, exceededResource);
    }

    /**
     * builds GraphQLMaxResourceLimitExceededError without checking for non-null required values
     * @return GraphQLMaxResourceLimitExceededError
     */
    public GraphQLMaxResourceLimitExceededError buildUnchecked() {
        return new GraphQLMaxResourceLimitExceededErrorImpl(values, exceededResource);
    }

    /**
     * factory method for an instance of GraphQLMaxResourceLimitExceededErrorBuilder
     * @return builder
     */
    public static GraphQLMaxResourceLimitExceededErrorBuilder of() {
        return new GraphQLMaxResourceLimitExceededErrorBuilder();
    }

    /**
     * create builder for GraphQLMaxResourceLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMaxResourceLimitExceededErrorBuilder of(final GraphQLMaxResourceLimitExceededError template) {
        GraphQLMaxResourceLimitExceededErrorBuilder builder = new GraphQLMaxResourceLimitExceededErrorBuilder();
        builder.values = template.values();
        builder.exceededResource = template.getExceededResource();
        return builder;
    }

}
