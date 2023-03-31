
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLEnumValuesMustMatchErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEnumValuesMustMatchError graphQLEnumValuesMustMatchError = GraphQLEnumValuesMustMatchError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLEnumValuesMustMatchErrorBuilder implements Builder<GraphQLEnumValuesMustMatchError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLEnumValuesMustMatchErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLEnumValuesMustMatchErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLEnumValuesMustMatchError with checking for non-null required values
     * @return GraphQLEnumValuesMustMatchError
     */
    public GraphQLEnumValuesMustMatchError build() {
        return new GraphQLEnumValuesMustMatchErrorImpl(values);
    }

    /**
     * builds GraphQLEnumValuesMustMatchError without checking for non-null required values
     * @return GraphQLEnumValuesMustMatchError
     */
    public GraphQLEnumValuesMustMatchError buildUnchecked() {
        return new GraphQLEnumValuesMustMatchErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLEnumValuesMustMatchErrorBuilder
     * @return builder
     */
    public static GraphQLEnumValuesMustMatchErrorBuilder of() {
        return new GraphQLEnumValuesMustMatchErrorBuilder();
    }

    /**
     * create builder for GraphQLEnumValuesMustMatchError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEnumValuesMustMatchErrorBuilder of(final GraphQLEnumValuesMustMatchError template) {
        GraphQLEnumValuesMustMatchErrorBuilder builder = new GraphQLEnumValuesMustMatchErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
