
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLDuplicateAttributeValueErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateAttributeValueError graphQLDuplicateAttributeValueError = GraphQLDuplicateAttributeValueError.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicateAttributeValueErrorBuilder implements Builder<GraphQLDuplicateAttributeValueError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.product.Attribute attribute;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLDuplicateAttributeValueErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLDuplicateAttributeValueErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     * @param builder function to build the attribute value
     * @return Builder
     */

    public GraphQLDuplicateAttributeValueErrorBuilder attribute(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attribute = builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     * @param attribute value to be set
     * @return Builder
     */

    public GraphQLDuplicateAttributeValueErrorBuilder attribute(
            final com.commercetools.api.models.product.Attribute attribute) {
        this.attribute = attribute;
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
     *  <p>Conflicting Attributes.</p>
     * @return attribute
     */

    public com.commercetools.api.models.product.Attribute getAttribute() {
        return this.attribute;
    }

    /**
     * builds GraphQLDuplicateAttributeValueError with checking for non-null required values
     * @return GraphQLDuplicateAttributeValueError
     */
    public GraphQLDuplicateAttributeValueError build() {
        Objects.requireNonNull(attribute, GraphQLDuplicateAttributeValueError.class + ": attribute is missing");
        return new GraphQLDuplicateAttributeValueErrorImpl(values, attribute);
    }

    /**
     * builds GraphQLDuplicateAttributeValueError without checking for non-null required values
     * @return GraphQLDuplicateAttributeValueError
     */
    public GraphQLDuplicateAttributeValueError buildUnchecked() {
        return new GraphQLDuplicateAttributeValueErrorImpl(values, attribute);
    }

    /**
     * factory method for an instance of GraphQLDuplicateAttributeValueErrorBuilder
     * @return builder
     */
    public static GraphQLDuplicateAttributeValueErrorBuilder of() {
        return new GraphQLDuplicateAttributeValueErrorBuilder();
    }

    /**
     * create builder for GraphQLDuplicateAttributeValueError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateAttributeValueErrorBuilder of(final GraphQLDuplicateAttributeValueError template) {
        GraphQLDuplicateAttributeValueErrorBuilder builder = new GraphQLDuplicateAttributeValueErrorBuilder();
        builder.values = template.values();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
