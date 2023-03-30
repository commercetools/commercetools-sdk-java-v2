
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLEnumValueIsUsedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEnumValueIsUsedError graphQLEnumValueIsUsedError = GraphQLEnumValueIsUsedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLEnumValueIsUsedErrorBuilder implements Builder<GraphQLEnumValueIsUsedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLEnumValueIsUsedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLEnumValueIsUsedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLEnumValueIsUsedError with checking for non-null required values
     * @return GraphQLEnumValueIsUsedError
     */
    public GraphQLEnumValueIsUsedError build() {
        return new GraphQLEnumValueIsUsedErrorImpl(values);
    }

    /**
     * builds GraphQLEnumValueIsUsedError without checking for non-null required values
     * @return GraphQLEnumValueIsUsedError
     */
    public GraphQLEnumValueIsUsedError buildUnchecked() {
        return new GraphQLEnumValueIsUsedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLEnumValueIsUsedErrorBuilder
     * @return builder
     */
    public static GraphQLEnumValueIsUsedErrorBuilder of() {
        return new GraphQLEnumValueIsUsedErrorBuilder();
    }

    /**
     * create builder for GraphQLEnumValueIsUsedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEnumValueIsUsedErrorBuilder of(final GraphQLEnumValueIsUsedError template) {
        GraphQLEnumValueIsUsedErrorBuilder builder = new GraphQLEnumValueIsUsedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
