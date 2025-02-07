
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetRangesValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetRangesValue productSearchFacetRangesValue = ProductSearchFacetRangesValue.builder()
 *             .name("{name}")
 *             .field("{field}")
 *             .plusRanges(rangesBuilder -> rangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetRangesValueBuilder implements Builder<ProductSearchFacetRangesValue> {

    private String name;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope;

    @Nullable
    private com.commercetools.api.models.search.SearchQuery filter;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level;

    private String field;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange> ranges;

    @Nullable
    private String language;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    /**
     *  <p>Name of the ranges facet to appear in the ProductSearchFacetResultBucket.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     * @param scope value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder scope(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder filter(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder withFilter(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of());
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     * @param filter value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder filter(
            @Nullable final com.commercetools.api.models.search.SearchQuery filter) {
        this.filter = filter;
        return this;
    }

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @param level value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder level(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     *  <p>The searchable Product field to facet on.</p>
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>Define ranges for the facet.</p>
     * @param ranges value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder ranges(
            final com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange... ranges) {
        this.ranges = new ArrayList<>(Arrays.asList(ranges));
        return this;
    }

    /**
     *  <p>Define ranges for the facet.</p>
     * @param ranges value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder ranges(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    /**
     *  <p>Define ranges for the facet.</p>
     * @param ranges value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder plusRanges(
            final com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange... ranges) {
        if (this.ranges == null) {
            this.ranges = new ArrayList<>();
        }
        this.ranges.addAll(Arrays.asList(ranges));
        return this;
    }

    /**
     *  <p>Define ranges for the facet.</p>
     * @param builder function to build the ranges value
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder plusRanges(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder, com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder> builder) {
        if (this.ranges == null) {
            this.ranges = new ArrayList<>();
        }
        this.ranges.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Define ranges for the facet.</p>
     * @param builder function to build the ranges value
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder withRanges(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder, com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder> builder) {
        this.ranges = new ArrayList<>();
        this.ranges.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Define ranges for the facet.</p>
     * @param builder function to build the ranges value
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder addRanges(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder, com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange> builder) {
        return plusRanges(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder.of()));
    }

    /**
     *  <p>Define ranges for the facet.</p>
     * @param builder function to build the ranges value
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder setRanges(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder, com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange> builder) {
        return ranges(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeBuilder.of()));
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     *  <p>Name of the ranges facet to appear in the ProductSearchFacetResultBucket.</p>
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
     *  <p>The searchable Product field to facet on.</p>
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>Define ranges for the facet.</p>
     * @return ranges
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange> getRanges() {
        return this.ranges;
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
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     * @return fieldType
     */

    @Nullable
    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
    }

    /**
     * builds ProductSearchFacetRangesValue with checking for non-null required values
     * @return ProductSearchFacetRangesValue
     */
    public ProductSearchFacetRangesValue build() {
        Objects.requireNonNull(name, ProductSearchFacetRangesValue.class + ": name is missing");
        Objects.requireNonNull(field, ProductSearchFacetRangesValue.class + ": field is missing");
        Objects.requireNonNull(ranges, ProductSearchFacetRangesValue.class + ": ranges is missing");
        return new ProductSearchFacetRangesValueImpl(name, scope, filter, level, field, ranges, language, fieldType);
    }

    /**
     * builds ProductSearchFacetRangesValue without checking for non-null required values
     * @return ProductSearchFacetRangesValue
     */
    public ProductSearchFacetRangesValue buildUnchecked() {
        return new ProductSearchFacetRangesValueImpl(name, scope, filter, level, field, ranges, language, fieldType);
    }

    /**
     * factory method for an instance of ProductSearchFacetRangesValueBuilder
     * @return builder
     */
    public static ProductSearchFacetRangesValueBuilder of() {
        return new ProductSearchFacetRangesValueBuilder();
    }

    /**
     * create builder for ProductSearchFacetRangesValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetRangesValueBuilder of(final ProductSearchFacetRangesValue template) {
        ProductSearchFacetRangesValueBuilder builder = new ProductSearchFacetRangesValueBuilder();
        builder.name = template.getName();
        builder.scope = template.getScope();
        builder.filter = template.getFilter();
        builder.level = template.getLevel();
        builder.field = template.getField();
        builder.ranges = template.getRanges();
        builder.language = template.getLanguage();
        builder.fieldType = template.getFieldType();
        return builder;
    }

}
