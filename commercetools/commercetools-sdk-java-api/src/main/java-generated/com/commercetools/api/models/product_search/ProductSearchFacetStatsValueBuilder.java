
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetStatsValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetStatsValue productSearchFacetStatsValue = ProductSearchFacetStatsValue.builder()
 *             .name("{name}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetStatsValueBuilder implements Builder<ProductSearchFacetStatsValue> {

    private String name;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope;

    @Nullable
    private com.commercetools.api.models.search.SearchQuery filter;

    private String field;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    /**
     *  <p>Name of the stats facet to appear in the ProductSearchFacetResultStats.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetStatsValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     * @param scope value to be set
     * @return Builder
     */

    public ProductSearchFacetStatsValueBuilder scope(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFacetStatsValueBuilder filter(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFacetStatsValueBuilder withFilter(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of());
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @param filter value to be set
     * @return Builder
     */

    public ProductSearchFacetStatsValueBuilder filter(
            @Nullable final com.commercetools.api.models.search.SearchQuery filter) {
        this.filter = filter;
        return this;
    }

    /**
     *  <p>The searchable Product field to facet on.</p>
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchFacetStatsValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public ProductSearchFacetStatsValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     *  <p>Name of the stats facet to appear in the ProductSearchFacetResultStats.</p>
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
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @return filter
     */

    @Nullable
    public com.commercetools.api.models.search.SearchQuery getFilter() {
        return this.filter;
    }

    /**
     *  <p>The searchable Product field to facet on.</p>
     * @return field
     */

    public String getField() {
        return this.field;
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
     * builds ProductSearchFacetStatsValue with checking for non-null required values
     * @return ProductSearchFacetStatsValue
     */
    public ProductSearchFacetStatsValue build() {
        Objects.requireNonNull(name, ProductSearchFacetStatsValue.class + ": name is missing");
        Objects.requireNonNull(field, ProductSearchFacetStatsValue.class + ": field is missing");
        return new ProductSearchFacetStatsValueImpl(name, scope, filter, field, fieldType);
    }

    /**
     * builds ProductSearchFacetStatsValue without checking for non-null required values
     * @return ProductSearchFacetStatsValue
     */
    public ProductSearchFacetStatsValue buildUnchecked() {
        return new ProductSearchFacetStatsValueImpl(name, scope, filter, field, fieldType);
    }

    /**
     * factory method for an instance of ProductSearchFacetStatsValueBuilder
     * @return builder
     */
    public static ProductSearchFacetStatsValueBuilder of() {
        return new ProductSearchFacetStatsValueBuilder();
    }

    /**
     * create builder for ProductSearchFacetStatsValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetStatsValueBuilder of(final ProductSearchFacetStatsValue template) {
        ProductSearchFacetStatsValueBuilder builder = new ProductSearchFacetStatsValueBuilder();
        builder.name = template.getName();
        builder.scope = template.getScope();
        builder.filter = template.getFilter();
        builder.field = template.getField();
        builder.fieldType = template.getFieldType();
        return builder;
    }

}
