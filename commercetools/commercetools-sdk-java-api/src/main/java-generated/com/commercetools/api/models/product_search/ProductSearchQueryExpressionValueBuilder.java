
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchQueryExpressionValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchQueryExpressionValue productSearchQueryExpressionValue = ProductSearchQueryExpressionValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchQueryExpressionValueBuilder implements Builder<ProductSearchQueryExpressionValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchQueryExpressionValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public ProductSearchQueryExpressionValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchQueryExpressionValueBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * value of field}
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     * value of boost}
     * @return boost
     */

    @Nullable
    public Double getBoost() {
        return this.boost;
    }

    /**
     * value of attributeType}
     * @return attributeType
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchAttributeType getAttributeType() {
        return this.attributeType;
    }

    /**
     * builds ProductSearchQueryExpressionValue with checking for non-null required values
     * @return ProductSearchQueryExpressionValue
     */
    public ProductSearchQueryExpressionValue build() {
        Objects.requireNonNull(field, ProductSearchQueryExpressionValue.class + ": field is missing");
        return new ProductSearchQueryExpressionValueImpl(field, boost, attributeType);
    }

    /**
     * builds ProductSearchQueryExpressionValue without checking for non-null required values
     * @return ProductSearchQueryExpressionValue
     */
    public ProductSearchQueryExpressionValue buildUnchecked() {
        return new ProductSearchQueryExpressionValueImpl(field, boost, attributeType);
    }

    /**
     * factory method for an instance of ProductSearchQueryExpressionValueBuilder
     * @return builder
     */
    public static ProductSearchQueryExpressionValueBuilder of() {
        return new ProductSearchQueryExpressionValueBuilder();
    }

    /**
     * create builder for ProductSearchQueryExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchQueryExpressionValueBuilder of(final ProductSearchQueryExpressionValue template) {
        ProductSearchQueryExpressionValueBuilder builder = new ProductSearchQueryExpressionValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.attributeType = template.getAttributeType();
        return builder;
    }

}
