
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchNumberRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchNumberRangeValue orderSearchNumberRangeValue = OrderSearchNumberRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchNumberRangeValueBuilder implements Builder<OrderSearchNumberRangeValue> {

    private String field;

    @Nullable
    private Integer boost;

    @Nullable
    private com.commercetools.api.models.order.OrderSearchCustomType customType;

    @Nullable
    private Double gte;

    @Nullable
    private Double lte;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public OrderSearchNumberRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public OrderSearchNumberRangeValueBuilder boost(@Nullable final Integer boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>customType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
     * @param customType value to be set
     * @return Builder
     */

    public OrderSearchNumberRangeValueBuilder customType(
            @Nullable final com.commercetools.api.models.order.OrderSearchCustomType customType) {
        this.customType = customType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public OrderSearchNumberRangeValueBuilder gte(@Nullable final Double gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public OrderSearchNumberRangeValueBuilder lte(@Nullable final Double lte) {
        this.lte = lte;
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
    public Integer getBoost() {
        return this.boost;
    }

    /**
     *  <p>Possible values for the <code>customType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
     * @return customType
     */

    @Nullable
    public com.commercetools.api.models.order.OrderSearchCustomType getCustomType() {
        return this.customType;
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
     * value of lte}
     * @return lte
     */

    @Nullable
    public Double getLte() {
        return this.lte;
    }

    /**
     * builds OrderSearchNumberRangeValue with checking for non-null required values
     * @return OrderSearchNumberRangeValue
     */
    public OrderSearchNumberRangeValue build() {
        Objects.requireNonNull(field, OrderSearchNumberRangeValue.class + ": field is missing");
        return new OrderSearchNumberRangeValueImpl(field, boost, customType, gte, lte);
    }

    /**
     * builds OrderSearchNumberRangeValue without checking for non-null required values
     * @return OrderSearchNumberRangeValue
     */
    public OrderSearchNumberRangeValue buildUnchecked() {
        return new OrderSearchNumberRangeValueImpl(field, boost, customType, gte, lte);
    }

    /**
     * factory method for an instance of OrderSearchNumberRangeValueBuilder
     * @return builder
     */
    public static OrderSearchNumberRangeValueBuilder of() {
        return new OrderSearchNumberRangeValueBuilder();
    }

    /**
     * create builder for OrderSearchNumberRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchNumberRangeValueBuilder of(final OrderSearchNumberRangeValue template) {
        OrderSearchNumberRangeValueBuilder builder = new OrderSearchNumberRangeValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.customType = template.getCustomType();
        builder.gte = template.getGte();
        builder.lte = template.getLte();
        return builder;
    }

}
