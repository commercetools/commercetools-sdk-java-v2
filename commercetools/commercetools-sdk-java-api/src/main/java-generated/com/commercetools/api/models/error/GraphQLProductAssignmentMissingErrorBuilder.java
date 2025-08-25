
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLProductAssignmentMissingErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLProductAssignmentMissingError graphQLProductAssignmentMissingError = GraphQLProductAssignmentMissingError.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLProductAssignmentMissingErrorBuilder implements Builder<GraphQLProductAssignmentMissingError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.product.ProductReference product;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLProductAssignmentMissingErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLProductAssignmentMissingErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> for which the error was returned.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public GraphQLProductAssignmentMissingErrorBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> for which the error was returned.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public GraphQLProductAssignmentMissingErrorBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> for which the error was returned.</p>
     * @param product value to be set
     * @return Builder
     */

    public GraphQLProductAssignmentMissingErrorBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> for which the error was returned.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     * builds GraphQLProductAssignmentMissingError with checking for non-null required values
     * @return GraphQLProductAssignmentMissingError
     */
    public GraphQLProductAssignmentMissingError build() {
        Objects.requireNonNull(product, GraphQLProductAssignmentMissingError.class + ": product is missing");
        return new GraphQLProductAssignmentMissingErrorImpl(values, product);
    }

    /**
     * builds GraphQLProductAssignmentMissingError without checking for non-null required values
     * @return GraphQLProductAssignmentMissingError
     */
    public GraphQLProductAssignmentMissingError buildUnchecked() {
        return new GraphQLProductAssignmentMissingErrorImpl(values, product);
    }

    /**
     * factory method for an instance of GraphQLProductAssignmentMissingErrorBuilder
     * @return builder
     */
    public static GraphQLProductAssignmentMissingErrorBuilder of() {
        return new GraphQLProductAssignmentMissingErrorBuilder();
    }

    /**
     * create builder for GraphQLProductAssignmentMissingError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLProductAssignmentMissingErrorBuilder of(final GraphQLProductAssignmentMissingError template) {
        GraphQLProductAssignmentMissingErrorBuilder builder = new GraphQLProductAssignmentMissingErrorBuilder();
        builder.values = template.values();
        builder.product = template.getProduct();
        return builder;
    }

}
