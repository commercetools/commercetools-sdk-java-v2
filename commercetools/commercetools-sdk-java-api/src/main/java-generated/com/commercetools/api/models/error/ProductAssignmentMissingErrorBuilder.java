
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAssignmentMissingErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAssignmentMissingError productAssignmentMissingError = ProductAssignmentMissingError.builder()
 *             .message("{message}")
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAssignmentMissingErrorBuilder implements Builder<ProductAssignmentMissingError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.product.ProductReference product;

    /**
     *  <p>For Product Selection of type Individual, the message is:</p>
     *  <p><code>"A Product Variant Selection can only be set for a Product that has previously been added to the Product Selection."</code></p>
     *  <p>For Product Selection of type Individual Exclusion, the message is:</p>
     *  <p><code>"A Variant Exclusion can only be set for a Product that has previously been added to the Product Selection of type Individual Exclusion."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ProductAssignmentMissingErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ProductAssignmentMissingErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ProductAssignmentMissingErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public ProductAssignmentMissingErrorBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductAssignmentMissingErrorBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>For Product Selection of type Individual, the message is:</p>
     *  <p><code>"A Product Variant Selection can only be set for a Product that has previously been added to the Product Selection."</code></p>
     *  <p>For Product Selection of type Individual Exclusion, the message is:</p>
     *  <p><code>"A Variant Exclusion can only be set for a Product that has previously been added to the Product Selection of type Individual Exclusion."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
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
     * builds ProductAssignmentMissingError with checking for non-null required values
     * @return ProductAssignmentMissingError
     */
    public ProductAssignmentMissingError build() {
        Objects.requireNonNull(message, ProductAssignmentMissingError.class + ": message is missing");
        Objects.requireNonNull(product, ProductAssignmentMissingError.class + ": product is missing");
        return new ProductAssignmentMissingErrorImpl(message, values, product);
    }

    /**
     * builds ProductAssignmentMissingError without checking for non-null required values
     * @return ProductAssignmentMissingError
     */
    public ProductAssignmentMissingError buildUnchecked() {
        return new ProductAssignmentMissingErrorImpl(message, values, product);
    }

    /**
     * factory method for an instance of ProductAssignmentMissingErrorBuilder
     * @return builder
     */
    public static ProductAssignmentMissingErrorBuilder of() {
        return new ProductAssignmentMissingErrorBuilder();
    }

    /**
     * create builder for ProductAssignmentMissingError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAssignmentMissingErrorBuilder of(final ProductAssignmentMissingError template) {
        ProductAssignmentMissingErrorBuilder builder = new ProductAssignmentMissingErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.product = template.getProduct();
        return builder;
    }

}
