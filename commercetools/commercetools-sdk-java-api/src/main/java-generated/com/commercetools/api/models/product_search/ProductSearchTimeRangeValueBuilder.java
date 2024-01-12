
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchTimeRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchTimeRangeValue productSearchTimeRangeValue = ProductSearchTimeRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchTimeRangeValueBuilder implements Builder<ProductSearchTimeRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    @Nullable
    private java.time.LocalTime gte;

    @Nullable
    private java.time.LocalTime gt;

    @Nullable
    private java.time.LocalTime lte;

    @Nullable
    private java.time.LocalTime lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchTimeRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public ProductSearchTimeRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchTimeRangeValueBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public ProductSearchTimeRangeValueBuilder gte(@Nullable final java.time.LocalTime gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public ProductSearchTimeRangeValueBuilder gt(@Nullable final java.time.LocalTime gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public ProductSearchTimeRangeValueBuilder lte(@Nullable final java.time.LocalTime lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public ProductSearchTimeRangeValueBuilder lt(@Nullable final java.time.LocalTime lt) {
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
    public java.time.LocalTime getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public java.time.LocalTime getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public java.time.LocalTime getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public java.time.LocalTime getLt() {
        return this.lt;
    }

    /**
     * builds ProductSearchTimeRangeValue with checking for non-null required values
     * @return ProductSearchTimeRangeValue
     */
    public ProductSearchTimeRangeValue build() {
        Objects.requireNonNull(field, ProductSearchTimeRangeValue.class + ": field is missing");
        return new ProductSearchTimeRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * builds ProductSearchTimeRangeValue without checking for non-null required values
     * @return ProductSearchTimeRangeValue
     */
    public ProductSearchTimeRangeValue buildUnchecked() {
        return new ProductSearchTimeRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of ProductSearchTimeRangeValueBuilder
     * @return builder
     */
    public static ProductSearchTimeRangeValueBuilder of() {
        return new ProductSearchTimeRangeValueBuilder();
    }

    /**
     * create builder for ProductSearchTimeRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchTimeRangeValueBuilder of(final ProductSearchTimeRangeValue template) {
        ProductSearchTimeRangeValueBuilder builder = new ProductSearchTimeRangeValueBuilder();
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
