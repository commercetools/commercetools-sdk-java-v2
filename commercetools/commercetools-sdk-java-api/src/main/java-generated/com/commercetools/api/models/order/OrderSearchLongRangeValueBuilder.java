
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchLongRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchLongRangeValue orderSearchLongRangeValue = OrderSearchLongRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchLongRangeValueBuilder implements Builder<OrderSearchLongRangeValue> {

    private String field;

    @Nullable
    private Integer boost;

    @Nullable
    private com.commercetools.api.models.order.OrderSearchCustomType customType;

    @Nullable
    private Long gte;

    @Nullable
    private Long lte;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public OrderSearchLongRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public OrderSearchLongRangeValueBuilder boost(@Nullable final Integer boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>customType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
     * @param customType value to be set
     * @return Builder
     */

    public OrderSearchLongRangeValueBuilder customType(
            @Nullable final com.commercetools.api.models.order.OrderSearchCustomType customType) {
        this.customType = customType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public OrderSearchLongRangeValueBuilder gte(@Nullable final Long gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public OrderSearchLongRangeValueBuilder lte(@Nullable final Long lte) {
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
     *  <p>Possible values for the <code>customType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
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
    public Long getGte() {
        return this.gte;
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
     * builds OrderSearchLongRangeValue with checking for non-null required values
     * @return OrderSearchLongRangeValue
     */
    public OrderSearchLongRangeValue build() {
        Objects.requireNonNull(field, OrderSearchLongRangeValue.class + ": field is missing");
        return new OrderSearchLongRangeValueImpl(field, boost, customType, gte, lte);
    }

    /**
     * builds OrderSearchLongRangeValue without checking for non-null required values
     * @return OrderSearchLongRangeValue
     */
    public OrderSearchLongRangeValue buildUnchecked() {
        return new OrderSearchLongRangeValueImpl(field, boost, customType, gte, lte);
    }

    /**
     * factory method for an instance of OrderSearchLongRangeValueBuilder
     * @return builder
     */
    public static OrderSearchLongRangeValueBuilder of() {
        return new OrderSearchLongRangeValueBuilder();
    }

    /**
     * create builder for OrderSearchLongRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchLongRangeValueBuilder of(final OrderSearchLongRangeValue template) {
        OrderSearchLongRangeValueBuilder builder = new OrderSearchLongRangeValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.customType = template.getCustomType();
        builder.gte = template.getGte();
        builder.lte = template.getLte();
        return builder;
    }

}
