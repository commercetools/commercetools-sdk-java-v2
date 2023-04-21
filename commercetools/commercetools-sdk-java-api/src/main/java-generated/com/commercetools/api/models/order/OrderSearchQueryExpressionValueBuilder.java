
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchQueryExpressionValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchQueryExpressionValue orderSearchQueryExpressionValue = OrderSearchQueryExpressionValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchQueryExpressionValueBuilder implements Builder<OrderSearchQueryExpressionValue> {

    private String field;

    @Nullable
    private Integer boost;

    @Nullable
    private String customType;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public OrderSearchQueryExpressionValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public OrderSearchQueryExpressionValueBuilder boost(@Nullable final Integer boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the customType
     * @param customType value to be set
     * @return Builder
     */

    public OrderSearchQueryExpressionValueBuilder customType(@Nullable final String customType) {
        this.customType = customType;
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
     * value of customType}
     * @return customType
     */

    @Nullable
    public String getCustomType() {
        return this.customType;
    }

    /**
     * builds OrderSearchQueryExpressionValue with checking for non-null required values
     * @return OrderSearchQueryExpressionValue
     */
    public OrderSearchQueryExpressionValue build() {
        Objects.requireNonNull(field, OrderSearchQueryExpressionValue.class + ": field is missing");
        return new OrderSearchQueryExpressionValueImpl(field, boost, customType);
    }

    /**
     * builds OrderSearchQueryExpressionValue without checking for non-null required values
     * @return OrderSearchQueryExpressionValue
     */
    public OrderSearchQueryExpressionValue buildUnchecked() {
        return new OrderSearchQueryExpressionValueImpl(field, boost, customType);
    }

    /**
     * factory method for an instance of OrderSearchQueryExpressionValueBuilder
     * @return builder
     */
    public static OrderSearchQueryExpressionValueBuilder of() {
        return new OrderSearchQueryExpressionValueBuilder();
    }

    /**
     * create builder for OrderSearchQueryExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchQueryExpressionValueBuilder of(final OrderSearchQueryExpressionValue template) {
        OrderSearchQueryExpressionValueBuilder builder = new OrderSearchQueryExpressionValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.customType = template.getCustomType();
        return builder;
    }

}
