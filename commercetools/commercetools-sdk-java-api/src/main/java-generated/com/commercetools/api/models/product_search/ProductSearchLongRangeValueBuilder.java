
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchLongRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchLongRangeValue productSearchLongRangeValue = ProductSearchLongRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchLongRangeValueBuilder implements Builder<ProductSearchLongRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    @Nullable
    private Long gte;

    @Nullable
    private Long gt;

    @Nullable
    private Long lte;

    @Nullable
    private Long lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchLongRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public ProductSearchLongRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchLongRangeValueBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public ProductSearchLongRangeValueBuilder gte(@Nullable final Long gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public ProductSearchLongRangeValueBuilder gt(@Nullable final Long gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public ProductSearchLongRangeValueBuilder lte(@Nullable final Long lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public ProductSearchLongRangeValueBuilder lt(@Nullable final Long lt) {
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
    public Long getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public Long getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public Long getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public Long getLt() {
        return this.lt;
    }

    /**
     * builds ProductSearchLongRangeValue with checking for non-null required values
     * @return ProductSearchLongRangeValue
     */
    public ProductSearchLongRangeValue build() {
        Objects.requireNonNull(field, ProductSearchLongRangeValue.class + ": field is missing");
        return new ProductSearchLongRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * builds ProductSearchLongRangeValue without checking for non-null required values
     * @return ProductSearchLongRangeValue
     */
    public ProductSearchLongRangeValue buildUnchecked() {
        return new ProductSearchLongRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of ProductSearchLongRangeValueBuilder
     * @return builder
     */
    public static ProductSearchLongRangeValueBuilder of() {
        return new ProductSearchLongRangeValueBuilder();
    }

    /**
     * create builder for ProductSearchLongRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchLongRangeValueBuilder of(final ProductSearchLongRangeValue template) {
        ProductSearchLongRangeValueBuilder builder = new ProductSearchLongRangeValueBuilder();
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
