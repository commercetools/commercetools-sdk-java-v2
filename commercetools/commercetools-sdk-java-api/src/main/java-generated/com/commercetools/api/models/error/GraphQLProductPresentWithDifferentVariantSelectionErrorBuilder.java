
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLProductPresentWithDifferentVariantSelectionError graphQLProductPresentWithDifferentVariantSelectionError = GraphQLProductPresentWithDifferentVariantSelectionError.builder()
 *             .product(productBuilder -> productBuilder)
 *             .existingVariantSelection(existingVariantSelectionBuilder -> existingVariantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder
        implements Builder<GraphQLProductPresentWithDifferentVariantSelectionError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder values(
            final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder addValue(final String key,
            final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @param product value to be set
     * @return Builder
     */

    public GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     * @param existingVariantSelection value to be set
     * @return Builder
     */

    public GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder existingVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection) {
        this.existingVariantSelection = existingVariantSelection;
        return this;
    }

    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     * @param builder function to build the existingVariantSelection value
     * @return Builder
     */

    public GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder existingVariantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.existingVariantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
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
     *  <p>Reference to the Product for which the error was returned.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     * @return existingVariantSelection
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getExistingVariantSelection() {
        return this.existingVariantSelection;
    }

    /**
     * builds GraphQLProductPresentWithDifferentVariantSelectionError with checking for non-null required values
     * @return GraphQLProductPresentWithDifferentVariantSelectionError
     */
    public GraphQLProductPresentWithDifferentVariantSelectionError build() {
        Objects.requireNonNull(product,
            GraphQLProductPresentWithDifferentVariantSelectionError.class + ": product is missing");
        Objects.requireNonNull(existingVariantSelection,
            GraphQLProductPresentWithDifferentVariantSelectionError.class + ": existingVariantSelection is missing");
        return new GraphQLProductPresentWithDifferentVariantSelectionErrorImpl(values, product,
            existingVariantSelection);
    }

    /**
     * builds GraphQLProductPresentWithDifferentVariantSelectionError without checking for non-null required values
     * @return GraphQLProductPresentWithDifferentVariantSelectionError
     */
    public GraphQLProductPresentWithDifferentVariantSelectionError buildUnchecked() {
        return new GraphQLProductPresentWithDifferentVariantSelectionErrorImpl(values, product,
            existingVariantSelection);
    }

    /**
     * factory method for an instance of GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder
     * @return builder
     */
    public static GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder of() {
        return new GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder();
    }

    /**
     * create builder for GraphQLProductPresentWithDifferentVariantSelectionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder of(
            final GraphQLProductPresentWithDifferentVariantSelectionError template) {
        GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder builder = new GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder();
        builder.values = template.values();
        builder.product = template.getProduct();
        builder.existingVariantSelection = template.getExistingVariantSelection();
        return builder;
    }

}
