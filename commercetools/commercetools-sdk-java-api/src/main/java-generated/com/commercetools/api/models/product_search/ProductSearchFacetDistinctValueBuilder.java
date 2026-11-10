
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetDistinctValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetDistinctValue productSearchFacetDistinctValue = ProductSearchFacetDistinctValue.builder()
 *             .name("{name}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetDistinctValueBuilder implements Builder<ProductSearchFacetDistinctValue> {

    private String name;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope;

    @Nullable
    private com.commercetools.api.models.search.SearchQuery filter;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level;

    private String field;

    @Nullable
    private java.util.List<String> includes;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression sort;

    @Nullable
    private Integer limit;

    @Nullable
    private String language;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    @Nullable
    private String missing;

    /**
     *  <p>Name of the distinct facet to appear in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchFacetResultBucket" rel="nofollow">ProductSearchFacetResultBucket</a>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     * @param scope value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder scope(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder filter(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder withFilter(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of());
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     * @param filter value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder filter(
            @Nullable final com.commercetools.api.models.search.SearchQuery filter) {
        this.filter = filter;
        return this;
    }

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @param level value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder level(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     *  <p>The <span>searchable Product field</span> to facet on.</p>
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>Specify which bucket keys the facets results should include.</p>
     * @param includes value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder includes(@Nullable final String... includes) {
        this.includes = new ArrayList<>(Arrays.asList(includes));
        return this;
    }

    /**
     *  <p>Specify which bucket keys the facets results should include.</p>
     * @param includes value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder includes(@Nullable final java.util.List<String> includes) {
        this.includes = includes;
        return this;
    }

    /**
     *  <p>Specify which bucket keys the facets results should include.</p>
     * @param includes value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder plusIncludes(@Nullable final String... includes) {
        if (this.includes == null) {
            this.includes = new ArrayList<>();
        }
        this.includes.addAll(Arrays.asList(includes));
        return this;
    }

    /**
     *  <p>Define how the buckets are sorted.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder sort(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpressionBuilder> builder) {
        this.sort = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpressionBuilder
                        .of())
                .build();
        return this;
    }

    /**
     *  <p>Define how the buckets are sorted.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder withSort(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression> builder) {
        this.sort = builder.apply(
            com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpressionBuilder.of());
        return this;
    }

    /**
     *  <p>Define how the buckets are sorted.</p>
     * @param sort value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder sort(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression sort) {
        this.sort = sort;
        return this;
    }

    /**
     *  <p>Maximum number of buckets to return.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder limit(@Nullable final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the <span>IETF language tag format</span>, as described in <span>BCP 47</span>. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     *  <p>Default value to use if the specified field is not present on some Products.</p>
     * @param missing value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctValueBuilder missing(@Nullable final String missing) {
        this.missing = missing;
        return this;
    }

    /**
     *  <p>Name of the distinct facet to appear in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchFacetResultBucket" rel="nofollow">ProductSearchFacetResultBucket</a>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     * @return scope
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum getScope() {
        return this.scope;
    }

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     * @return filter
     */

    @Nullable
    public com.commercetools.api.models.search.SearchQuery getFilter() {
        return this.filter;
    }

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @return level
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum getLevel() {
        return this.level;
    }

    /**
     *  <p>The <span>searchable Product field</span> to facet on.</p>
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>Specify which bucket keys the facets results should include.</p>
     * @return includes
     */

    @Nullable
    public java.util.List<String> getIncludes() {
        return this.includes;
    }

    /**
     *  <p>Define how the buckets are sorted.</p>
     * @return sort
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression getSort() {
        return this.sort;
    }

    /**
     *  <p>Maximum number of buckets to return.</p>
     * @return limit
     */

    @Nullable
    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the <span>IETF language tag format</span>, as described in <span>BCP 47</span>. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @return language
     */

    @Nullable
    public String getLanguage() {
        return this.language;
    }

    /**
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     * @return fieldType
     */

    @Nullable
    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
    }

    /**
     *  <p>Default value to use if the specified field is not present on some Products.</p>
     * @return missing
     */

    @Nullable
    public String getMissing() {
        return this.missing;
    }

    /**
     * builds ProductSearchFacetDistinctValue with checking for non-null required values
     * @return ProductSearchFacetDistinctValue
     */
    public ProductSearchFacetDistinctValue build() {
        Objects.requireNonNull(name, ProductSearchFacetDistinctValue.class + ": name is missing");
        Objects.requireNonNull(field, ProductSearchFacetDistinctValue.class + ": field is missing");
        return new ProductSearchFacetDistinctValueImpl(name, scope, filter, level, field, includes, sort, limit,
            language, fieldType, missing);
    }

    /**
     * builds ProductSearchFacetDistinctValue without checking for non-null required values
     * @return ProductSearchFacetDistinctValue
     */
    public ProductSearchFacetDistinctValue buildUnchecked() {
        return new ProductSearchFacetDistinctValueImpl(name, scope, filter, level, field, includes, sort, limit,
            language, fieldType, missing);
    }

    /**
     * factory method for an instance of ProductSearchFacetDistinctValueBuilder
     * @return builder
     */
    public static ProductSearchFacetDistinctValueBuilder of() {
        return new ProductSearchFacetDistinctValueBuilder();
    }

    /**
     * create builder for ProductSearchFacetDistinctValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetDistinctValueBuilder of(final ProductSearchFacetDistinctValue template) {
        ProductSearchFacetDistinctValueBuilder builder = new ProductSearchFacetDistinctValueBuilder();
        builder.name = template.getName();
        builder.scope = template.getScope();
        builder.filter = template.getFilter();
        builder.level = template.getLevel();
        builder.field = template.getField();
        builder.includes = template.getIncludes();
        builder.sort = template.getSort();
        builder.limit = template.getLimit();
        builder.language = template.getLanguage();
        builder.fieldType = template.getFieldType();
        builder.missing = template.getMissing();
        return builder;
    }

}
