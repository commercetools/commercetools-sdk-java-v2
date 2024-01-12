
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchDateTimeRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchDateTimeRangeValue productSearchDateTimeRangeValue = ProductSearchDateTimeRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchDateTimeRangeValueBuilder implements Builder<ProductSearchDateTimeRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    @Nullable
    private java.time.ZonedDateTime gte;

    @Nullable
    private java.time.ZonedDateTime gt;

    @Nullable
    private java.time.ZonedDateTime lte;

    @Nullable
    private java.time.ZonedDateTime lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchDateTimeRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public ProductSearchDateTimeRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchDateTimeRangeValueBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public ProductSearchDateTimeRangeValueBuilder gte(@Nullable final java.time.ZonedDateTime gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public ProductSearchDateTimeRangeValueBuilder gt(@Nullable final java.time.ZonedDateTime gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public ProductSearchDateTimeRangeValueBuilder lte(@Nullable final java.time.ZonedDateTime lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public ProductSearchDateTimeRangeValueBuilder lt(@Nullable final java.time.ZonedDateTime lt) {
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
    public java.time.ZonedDateTime getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public java.time.ZonedDateTime getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public java.time.ZonedDateTime getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public java.time.ZonedDateTime getLt() {
        return this.lt;
    }

    /**
     * builds ProductSearchDateTimeRangeValue with checking for non-null required values
     * @return ProductSearchDateTimeRangeValue
     */
    public ProductSearchDateTimeRangeValue build() {
        Objects.requireNonNull(field, ProductSearchDateTimeRangeValue.class + ": field is missing");
        return new ProductSearchDateTimeRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * builds ProductSearchDateTimeRangeValue without checking for non-null required values
     * @return ProductSearchDateTimeRangeValue
     */
    public ProductSearchDateTimeRangeValue buildUnchecked() {
        return new ProductSearchDateTimeRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of ProductSearchDateTimeRangeValueBuilder
     * @return builder
     */
    public static ProductSearchDateTimeRangeValueBuilder of() {
        return new ProductSearchDateTimeRangeValueBuilder();
    }

    /**
     * create builder for ProductSearchDateTimeRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchDateTimeRangeValueBuilder of(final ProductSearchDateTimeRangeValue template) {
        ProductSearchDateTimeRangeValueBuilder builder = new ProductSearchDateTimeRangeValueBuilder();
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
