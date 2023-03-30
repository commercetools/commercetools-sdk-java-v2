
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLDuplicateAttributeValuesErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateAttributeValuesError graphQLDuplicateAttributeValuesError = GraphQLDuplicateAttributeValuesError.builder()
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicateAttributeValuesErrorBuilder implements Builder<GraphQLDuplicateAttributeValuesError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLDuplicateAttributeValuesErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLDuplicateAttributeValuesErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public GraphQLDuplicateAttributeValuesErrorBuilder attributes(
            final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public GraphQLDuplicateAttributeValuesErrorBuilder attributes(
            final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public GraphQLDuplicateAttributeValuesErrorBuilder plusAttributes(
            final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public GraphQLDuplicateAttributeValuesErrorBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public GraphQLDuplicateAttributeValuesErrorBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
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
     * @return attributes
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     * builds GraphQLDuplicateAttributeValuesError with checking for non-null required values
     * @return GraphQLDuplicateAttributeValuesError
     */
    public GraphQLDuplicateAttributeValuesError build() {
        Objects.requireNonNull(attributes, GraphQLDuplicateAttributeValuesError.class + ": attributes is missing");
        return new GraphQLDuplicateAttributeValuesErrorImpl(values, attributes);
    }

    /**
     * builds GraphQLDuplicateAttributeValuesError without checking for non-null required values
     * @return GraphQLDuplicateAttributeValuesError
     */
    public GraphQLDuplicateAttributeValuesError buildUnchecked() {
        return new GraphQLDuplicateAttributeValuesErrorImpl(values, attributes);
    }

    /**
     * factory method for an instance of GraphQLDuplicateAttributeValuesErrorBuilder
     * @return builder
     */
    public static GraphQLDuplicateAttributeValuesErrorBuilder of() {
        return new GraphQLDuplicateAttributeValuesErrorBuilder();
    }

    /**
     * create builder for GraphQLDuplicateAttributeValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateAttributeValuesErrorBuilder of(final GraphQLDuplicateAttributeValuesError template) {
        GraphQLDuplicateAttributeValuesErrorBuilder builder = new GraphQLDuplicateAttributeValuesErrorBuilder();
        builder.values = template.values();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
