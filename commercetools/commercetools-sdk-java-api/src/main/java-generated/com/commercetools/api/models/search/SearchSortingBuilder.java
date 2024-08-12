
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchSortingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchSorting searchSorting = SearchSorting.builder()
 *             .field("{field}")
 *             .order(SearchSortOrder.ASC)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchSortingBuilder implements Builder<SearchSorting> {

    private String field;

    @Nullable
    private String language;

    private com.commercetools.api.models.search.SearchSortOrder order;

    @Nullable
    private com.commercetools.api.models.search.SearchSortMode mode;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    @Nullable
    private com.commercetools.api.models.search.SearchQueryExpression filter;

    /**
     *  <p>Use any searchable field of the resource as sort criterion, or <code>"score"</code> to sort by relevance score calculated by the API.</p>
     * @param field value to be set
     * @return Builder
     */

    public SearchSortingBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public SearchSortingBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     *  <p>Specify the order in which the search results should be sorted. Can be <code>asc</code> for ascending, or <code>desc</code> for descending order.</p>
     * @param order value to be set
     * @return Builder
     */

    public SearchSortingBuilder order(final com.commercetools.api.models.search.SearchSortOrder order) {
        this.order = order;
        return this;
    }

    /**
     *  <p>Specify the sort mode to be applied for a set-type <code>field</code>.</p>
     * @param mode value to be set
     * @return Builder
     */

    public SearchSortingBuilder mode(@Nullable final com.commercetools.api.models.search.SearchSortMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     *  <p>Provide the data type of the given <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchSortingBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     *  <p>Allows you to apply a sort filter.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public SearchSortingBuilder filter(
            Function<com.commercetools.api.models.search.SearchQueryExpressionBuilder, com.commercetools.api.models.search.SearchQueryExpressionBuilder> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryExpressionBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Allows you to apply a sort filter.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public SearchSortingBuilder withFilter(
            Function<com.commercetools.api.models.search.SearchQueryExpressionBuilder, com.commercetools.api.models.search.SearchQueryExpression> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryExpressionBuilder.of());
        return this;
    }

    /**
     *  <p>Allows you to apply a sort filter.</p>
     * @param filter value to be set
     * @return Builder
     */

    public SearchSortingBuilder filter(
            @Nullable final com.commercetools.api.models.search.SearchQueryExpression filter) {
        this.filter = filter;
        return this;
    }

    /**
     *  <p>Use any searchable field of the resource as sort criterion, or <code>"score"</code> to sort by relevance score calculated by the API.</p>
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
     *  <p>Specify the order in which the search results should be sorted. Can be <code>asc</code> for ascending, or <code>desc</code> for descending order.</p>
     * @return order
     */

    public com.commercetools.api.models.search.SearchSortOrder getOrder() {
        return this.order;
    }

    /**
     *  <p>Specify the sort mode to be applied for a set-type <code>field</code>.</p>
     * @return mode
     */

    @Nullable
    public com.commercetools.api.models.search.SearchSortMode getMode() {
        return this.mode;
    }

    /**
     *  <p>Provide the data type of the given <code>field</code>.</p>
     * @return fieldType
     */

    @Nullable
    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
    }

    /**
     *  <p>Allows you to apply a sort filter.</p>
     * @return filter
     */

    @Nullable
    public com.commercetools.api.models.search.SearchQueryExpression getFilter() {
        return this.filter;
    }

    /**
     * builds SearchSorting with checking for non-null required values
     * @return SearchSorting
     */
    public SearchSorting build() {
        Objects.requireNonNull(field, SearchSorting.class + ": field is missing");
        Objects.requireNonNull(order, SearchSorting.class + ": order is missing");
        return new SearchSortingImpl(field, language, order, mode, fieldType, filter);
    }

    /**
     * builds SearchSorting without checking for non-null required values
     * @return SearchSorting
     */
    public SearchSorting buildUnchecked() {
        return new SearchSortingImpl(field, language, order, mode, fieldType, filter);
    }

    /**
     * factory method for an instance of SearchSortingBuilder
     * @return builder
     */
    public static SearchSortingBuilder of() {
        return new SearchSortingBuilder();
    }

    /**
     * create builder for SearchSorting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchSortingBuilder of(final SearchSorting template) {
        SearchSortingBuilder builder = new SearchSortingBuilder();
        builder.field = template.getField();
        builder.language = template.getLanguage();
        builder.order = template.getOrder();
        builder.mode = template.getMode();
        builder.fieldType = template.getFieldType();
        builder.filter = template.getFilter();
        return builder;
    }

}
