
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
     *  <p><code>"A Product Variant Selection can only be set for a Product previously added to the Product Selection."</code></p>
     */

    public ProductAssignmentMissingErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ProductAssignmentMissingErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
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
     */

    public ProductAssignmentMissingErrorBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     */

    public ProductAssignmentMissingErrorBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public ProductAssignmentMissingError build() {
        Objects.requireNonNull(message, ProductAssignmentMissingError.class + ": message is missing");
        Objects.requireNonNull(values, ProductAssignmentMissingError.class + ": values are missing");
        Objects.requireNonNull(product, ProductAssignmentMissingError.class + ": product is missing");
        return new ProductAssignmentMissingErrorImpl(message, values, product);
    }

    /**
     * builds ProductAssignmentMissingError without checking for non null required values
     */
    public ProductAssignmentMissingError buildUnchecked() {
        return new ProductAssignmentMissingErrorImpl(message, values, product);
    }

    public static ProductAssignmentMissingErrorBuilder of() {
        return new ProductAssignmentMissingErrorBuilder();
    }

    public static ProductAssignmentMissingErrorBuilder of(final ProductAssignmentMissingError template) {
        ProductAssignmentMissingErrorBuilder builder = new ProductAssignmentMissingErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.product = template.getProduct();
        return builder;
    }

}
