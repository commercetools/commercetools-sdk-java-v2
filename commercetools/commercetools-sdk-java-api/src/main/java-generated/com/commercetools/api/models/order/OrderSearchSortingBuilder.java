
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchSortingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchSorting orderSearchSorting = OrderSearchSorting.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchSortingBuilder implements Builder<OrderSearchSorting> {

    private String field;

    @Nullable
    private String language;

    @Nullable
    private com.commercetools.api.models.order.OrderSearchSortOrder order;

    @Nullable
    private com.commercetools.api.models.order.OrderSearchSortMode mode;

    @Nullable
    private com.commercetools.api.models.order.OrderSearchQueryExpression filter;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public OrderSearchSortingBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the language
     * @param language value to be set
     * @return Builder
     */

    public OrderSearchSortingBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     * set the value to the order
     * @param order value to be set
     * @return Builder
     */

    public OrderSearchSortingBuilder order(
            @Nullable final com.commercetools.api.models.order.OrderSearchSortOrder order) {
        this.order = order;
        return this;
    }

    /**
     * set the value to the mode
     * @param mode value to be set
     * @return Builder
     */

    public OrderSearchSortingBuilder mode(@Nullable final com.commercetools.api.models.order.OrderSearchSortMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public OrderSearchSortingBuilder filter(
            Function<com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder, com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder> builder) {
        this.filter = builder.apply(com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public OrderSearchSortingBuilder withFilter(
            Function<com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder, com.commercetools.api.models.order.OrderSearchQueryExpression> builder) {
        this.filter = builder.apply(com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder.of());
        return this;
    }

    /**
     * set the value to the filter
     * @param filter value to be set
     * @return Builder
     */

    public OrderSearchSortingBuilder filter(
            @Nullable final com.commercetools.api.models.order.OrderSearchQueryExpression filter) {
        this.filter = filter;
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
     * value of language}
     * @return language
     */

    @Nullable
    public String getLanguage() {
        return this.language;
    }

    /**
     * value of order}
     * @return order
     */

    @Nullable
    public com.commercetools.api.models.order.OrderSearchSortOrder getOrder() {
        return this.order;
    }

    /**
     * value of mode}
     * @return mode
     */

    @Nullable
    public com.commercetools.api.models.order.OrderSearchSortMode getMode() {
        return this.mode;
    }

    /**
     * value of filter}
     * @return filter
     */

    @Nullable
    public com.commercetools.api.models.order.OrderSearchQueryExpression getFilter() {
        return this.filter;
    }

    /**
     * builds OrderSearchSorting with checking for non-null required values
     * @return OrderSearchSorting
     */
    public OrderSearchSorting build() {
        Objects.requireNonNull(field, OrderSearchSorting.class + ": field is missing");
        return new OrderSearchSortingImpl(field, language, order, mode, filter);
    }

    /**
     * builds OrderSearchSorting without checking for non-null required values
     * @return OrderSearchSorting
     */
    public OrderSearchSorting buildUnchecked() {
        return new OrderSearchSortingImpl(field, language, order, mode, filter);
    }

    /**
     * factory method for an instance of OrderSearchSortingBuilder
     * @return builder
     */
    public static OrderSearchSortingBuilder of() {
        return new OrderSearchSortingBuilder();
    }

    /**
     * create builder for OrderSearchSorting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchSortingBuilder of(final OrderSearchSorting template) {
        OrderSearchSortingBuilder builder = new OrderSearchSortingBuilder();
        builder.field = template.getField();
        builder.language = template.getLanguage();
        builder.order = template.getOrder();
        builder.mode = template.getMode();
        builder.filter = template.getFilter();
        return builder;
    }

}
