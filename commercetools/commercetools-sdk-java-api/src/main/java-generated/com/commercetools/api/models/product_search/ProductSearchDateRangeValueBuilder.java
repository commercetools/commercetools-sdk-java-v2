
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchDateRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchDateRangeValue productSearchDateRangeValue = ProductSearchDateRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchDateRangeValueBuilder implements Builder<ProductSearchDateRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    @Nullable
    private java.time.LocalDate gte;

    @Nullable
    private java.time.LocalDate gt;

    @Nullable
    private java.time.LocalDate lte;

    @Nullable
    private java.time.LocalDate lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchDateRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public ProductSearchDateRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchDateRangeValueBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public ProductSearchDateRangeValueBuilder gte(@Nullable final java.time.LocalDate gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public ProductSearchDateRangeValueBuilder gt(@Nullable final java.time.LocalDate gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public ProductSearchDateRangeValueBuilder lte(@Nullable final java.time.LocalDate lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public ProductSearchDateRangeValueBuilder lt(@Nullable final java.time.LocalDate lt) {
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
    public java.time.LocalDate getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public java.time.LocalDate getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public java.time.LocalDate getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public java.time.LocalDate getLt() {
        return this.lt;
    }

    /**
     * builds ProductSearchDateRangeValue with checking for non-null required values
     * @return ProductSearchDateRangeValue
     */
    public ProductSearchDateRangeValue build() {
        Objects.requireNonNull(field, ProductSearchDateRangeValue.class + ": field is missing");
        return new ProductSearchDateRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * builds ProductSearchDateRangeValue without checking for non-null required values
     * @return ProductSearchDateRangeValue
     */
    public ProductSearchDateRangeValue buildUnchecked() {
        return new ProductSearchDateRangeValueImpl(field, boost, attributeType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of ProductSearchDateRangeValueBuilder
     * @return builder
     */
    public static ProductSearchDateRangeValueBuilder of() {
        return new ProductSearchDateRangeValueBuilder();
    }

    /**
     * create builder for ProductSearchDateRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchDateRangeValueBuilder of(final ProductSearchDateRangeValue template) {
        ProductSearchDateRangeValueBuilder builder = new ProductSearchDateRangeValueBuilder();
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
