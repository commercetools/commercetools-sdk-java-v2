
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSortingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSorting productSearchSorting = ProductSearchSorting.builder()
 *             .field("{field}")
 *             .order(ProductSearchSortOrder.ASC)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchSortingBuilder implements Builder<ProductSearchSorting> {

    private String field;

    @Nullable
    private String language;

    private com.commercetools.api.models.product_search.ProductSearchSortOrder order;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchSortMode mode;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchQueryExpression filter;

    @Nullable
    private Boolean internal;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchSortingBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public ProductSearchSortingBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     * set the value to the order
     * @param order value to be set
     * @return Builder
     */

    public ProductSearchSortingBuilder order(
            final com.commercetools.api.models.product_search.ProductSearchSortOrder order) {
        this.order = order;
        return this;
    }

    /**
     * set the value to the mode
     * @param mode value to be set
     * @return Builder
     */

    public ProductSearchSortingBuilder mode(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchSortMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchSortingBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchSortingBuilder filter(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder> builder) {
        this.filter = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchSortingBuilder withFilter(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchQueryExpression> builder) {
        this.filter = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder.of());
        return this;
    }

    /**
     * set the value to the filter
     * @param filter value to be set
     * @return Builder
     */

    public ProductSearchSortingBuilder filter(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchQueryExpression filter) {
        this.filter = filter;
        return this;
    }

    /**
     * set the value to the internal
     * @param internal value to be set
     * @return Builder
     */

    public ProductSearchSortingBuilder internal(@Nullable final Boolean internal) {
        this.internal = internal;
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
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
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

    public com.commercetools.api.models.product_search.ProductSearchSortOrder getOrder() {
        return this.order;
    }

    /**
     * value of mode}
     * @return mode
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchSortMode getMode() {
        return this.mode;
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
     * value of filter}
     * @return filter
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchQueryExpression getFilter() {
        return this.filter;
    }

    /**
     * value of internal}
     * @return internal
     */

    @Nullable
    public Boolean getInternal() {
        return this.internal;
    }

    /**
     * builds ProductSearchSorting with checking for non-null required values
     * @return ProductSearchSorting
     */
    public ProductSearchSorting build() {
        Objects.requireNonNull(field, ProductSearchSorting.class + ": field is missing");
        Objects.requireNonNull(order, ProductSearchSorting.class + ": order is missing");
        return new ProductSearchSortingImpl(field, language, order, mode, attributeType, filter, internal);
    }

    /**
     * builds ProductSearchSorting without checking for non-null required values
     * @return ProductSearchSorting
     */
    public ProductSearchSorting buildUnchecked() {
        return new ProductSearchSortingImpl(field, language, order, mode, attributeType, filter, internal);
    }

    /**
     * factory method for an instance of ProductSearchSortingBuilder
     * @return builder
     */
    public static ProductSearchSortingBuilder of() {
        return new ProductSearchSortingBuilder();
    }

    /**
     * create builder for ProductSearchSorting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSortingBuilder of(final ProductSearchSorting template) {
        ProductSearchSortingBuilder builder = new ProductSearchSortingBuilder();
        builder.field = template.getField();
        builder.language = template.getLanguage();
        builder.order = template.getOrder();
        builder.mode = template.getMode();
        builder.attributeType = template.getAttributeType();
        builder.filter = template.getFilter();
        builder.internal = template.getInternal();
        return builder;
    }

}
