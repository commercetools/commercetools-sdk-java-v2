
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchDateRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchDateRangeValue orderSearchDateRangeValue = OrderSearchDateRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchDateRangeValueBuilder implements Builder<OrderSearchDateRangeValue> {

    private String field;

    @Nullable
    private Integer boost;

    @Nullable
    private com.commercetools.api.models.order.OrderSearchCustomType customType;

    @Nullable
    private java.time.ZonedDateTime gte;

    @Nullable
    private java.time.ZonedDateTime lte;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public OrderSearchDateRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public OrderSearchDateRangeValueBuilder boost(@Nullable final Integer boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>customType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
     * @param customType value to be set
     * @return Builder
     */

    public OrderSearchDateRangeValueBuilder customType(
            @Nullable final com.commercetools.api.models.order.OrderSearchCustomType customType) {
        this.customType = customType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public OrderSearchDateRangeValueBuilder gte(@Nullable final java.time.ZonedDateTime gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public OrderSearchDateRangeValueBuilder lte(@Nullable final java.time.ZonedDateTime lte) {
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
     *  <p>Possible values for the <code>customType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
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
    public java.time.ZonedDateTime getGte() {
        return this.gte;
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
     * builds OrderSearchDateRangeValue with checking for non-null required values
     * @return OrderSearchDateRangeValue
     */
    public OrderSearchDateRangeValue build() {
        Objects.requireNonNull(field, OrderSearchDateRangeValue.class + ": field is missing");
        return new OrderSearchDateRangeValueImpl(field, boost, customType, gte, lte);
    }

    /**
     * builds OrderSearchDateRangeValue without checking for non-null required values
     * @return OrderSearchDateRangeValue
     */
    public OrderSearchDateRangeValue buildUnchecked() {
        return new OrderSearchDateRangeValueImpl(field, boost, customType, gte, lte);
    }

    /**
     * factory method for an instance of OrderSearchDateRangeValueBuilder
     * @return builder
     */
    public static OrderSearchDateRangeValueBuilder of() {
        return new OrderSearchDateRangeValueBuilder();
    }

    /**
     * create builder for OrderSearchDateRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchDateRangeValueBuilder of(final OrderSearchDateRangeValue template) {
        OrderSearchDateRangeValueBuilder builder = new OrderSearchDateRangeValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.customType = template.getCustomType();
        builder.gte = template.getGte();
        builder.lte = template.getLte();
        return builder;
    }

}
