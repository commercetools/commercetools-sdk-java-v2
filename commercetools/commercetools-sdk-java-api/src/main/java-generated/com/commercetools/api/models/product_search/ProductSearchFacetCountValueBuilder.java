
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetCountValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetCountValue productSearchFacetCountValue = ProductSearchFacetCountValue.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetCountValueBuilder implements Builder<ProductSearchFacetCountValue> {

    private String name;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope;

    @Nullable
    private com.commercetools.api.models.search.SearchQuery filter;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level;

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetCountValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     * @param scope value to be set
     * @return Builder
     */

    public ProductSearchFacetCountValueBuilder scope(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFacetCountValueBuilder filter(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFacetCountValueBuilder withFilter(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        this.filter = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of());
        return this;
    }

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @param filter value to be set
     * @return Builder
     */

    public ProductSearchFacetCountValueBuilder filter(
            @Nullable final com.commercetools.api.models.search.SearchQuery filter) {
        this.filter = filter;
        return this;
    }

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @param level value to be set
     * @return Builder
     */

    public ProductSearchFacetCountValueBuilder level(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * value of name}
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
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @return level
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum getLevel() {
        return this.level;
    }

    /**
     * builds ProductSearchFacetCountValue with checking for non-null required values
     * @return ProductSearchFacetCountValue
     */
    public ProductSearchFacetCountValue build() {
        Objects.requireNonNull(name, ProductSearchFacetCountValue.class + ": name is missing");
        return new ProductSearchFacetCountValueImpl(name, scope, filter, level);
    }

    /**
     * builds ProductSearchFacetCountValue without checking for non-null required values
     * @return ProductSearchFacetCountValue
     */
    public ProductSearchFacetCountValue buildUnchecked() {
        return new ProductSearchFacetCountValueImpl(name, scope, filter, level);
    }

    /**
     * factory method for an instance of ProductSearchFacetCountValueBuilder
     * @return builder
     */
    public static ProductSearchFacetCountValueBuilder of() {
        return new ProductSearchFacetCountValueBuilder();
    }

    /**
     * create builder for ProductSearchFacetCountValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetCountValueBuilder of(final ProductSearchFacetCountValue template) {
        ProductSearchFacetCountValueBuilder builder = new ProductSearchFacetCountValueBuilder();
        builder.name = template.getName();
        builder.scope = template.getScope();
        builder.filter = template.getFilter();
        builder.level = template.getLevel();
        return builder;
    }

}
