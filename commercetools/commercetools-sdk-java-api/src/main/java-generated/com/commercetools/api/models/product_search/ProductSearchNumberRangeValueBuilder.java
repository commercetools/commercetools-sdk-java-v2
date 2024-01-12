
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchNumberRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchNumberRangeValue productSearchNumberRangeValue = ProductSearchNumberRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchNumberRangeValueBuilder implements Builder<ProductSearchNumberRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    @Nullable
    private Double gte;

    @Nullable
    private Double gt;

    @Nullable
    private Double lte;

    @Nullable
    private Double lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchNumberRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public ProductSearchNumberRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchNumberRangeValueBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public ProductSearchNumberRangeValueBuilder gte(@Nullable final Double gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public ProductSearchNumberRangeValueBuilder gt(@Nullable final Double gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public ProductSearchNumberRangeValueBuilder lte(@Nullable final Double lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public ProductSearchNumberRangeValueBuilder lt(@Nullable final Double lt) {
        this.lt = lt;
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
     * value of gte}
     * @return gte
     */

    @Nullable
    public Double getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public Double getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public Double getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public Double getLt() {
        return this.lt;
    }

    /**
     * builds ProductSearchNumberRangeValue with checking for non-null required values
     * @return ProductSearchNumberRangeValue
     */
    public ProductSearchNumberRangeValue build() {
        Objects.requireNonNull(field, ProductSearchNumberRangeValue.class + ": field is missing");
        return new ProductSearchNumberRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * builds ProductSearchNumberRangeValue without checking for non-null required values
     * @return ProductSearchNumberRangeValue
     */
    public ProductSearchNumberRangeValue buildUnchecked() {
        return new ProductSearchNumberRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of ProductSearchNumberRangeValueBuilder
     * @return builder
     */
    public static ProductSearchNumberRangeValueBuilder of() {
        return new ProductSearchNumberRangeValueBuilder();
    }

    /**
     * create builder for ProductSearchNumberRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchNumberRangeValueBuilder of(final ProductSearchNumberRangeValue template) {
        ProductSearchNumberRangeValueBuilder builder = new ProductSearchNumberRangeValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.attributeType = template.getAttributeType();
        builder.gte = template.getGte();
        builder.gt = template.getGt();
        builder.lte = template.getLte();
        builder.lt = template.getLt();
        return builder;
    }

}
