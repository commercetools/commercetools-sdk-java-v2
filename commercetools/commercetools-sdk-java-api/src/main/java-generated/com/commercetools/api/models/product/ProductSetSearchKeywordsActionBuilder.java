
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetSearchKeywordsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetSearchKeywordsAction productSetSearchKeywordsAction = ProductSetSearchKeywordsAction.builder()
 *             .searchKeywords(searchKeywordsBuilder -> searchKeywordsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetSearchKeywordsActionBuilder implements Builder<ProductSetSearchKeywordsAction> {

    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductSetSearchKeywordsActionBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductSetSearchKeywordsActionBuilder withSearchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywords> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param searchKeywords value to be set
     * @return Builder
     */

    public ProductSetSearchKeywordsActionBuilder searchKeywords(
            final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>searchKeywords</code> is updated. If <code>false</code>, both the current and staged <code>searchKeywords</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetSearchKeywordsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return searchKeywords
     */

    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>searchKeywords</code> is updated. If <code>false</code>, both the current and staged <code>searchKeywords</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductSetSearchKeywordsAction with checking for non-null required values
     * @return ProductSetSearchKeywordsAction
     */
    public ProductSetSearchKeywordsAction build() {
        Objects.requireNonNull(searchKeywords, ProductSetSearchKeywordsAction.class + ": searchKeywords is missing");
        return new ProductSetSearchKeywordsActionImpl(searchKeywords, staged);
    }

    /**
     * builds ProductSetSearchKeywordsAction without checking for non-null required values
     * @return ProductSetSearchKeywordsAction
     */
    public ProductSetSearchKeywordsAction buildUnchecked() {
        return new ProductSetSearchKeywordsActionImpl(searchKeywords, staged);
    }

    /**
     * factory method for an instance of ProductSetSearchKeywordsActionBuilder
     * @return builder
     */
    public static ProductSetSearchKeywordsActionBuilder of() {
        return new ProductSetSearchKeywordsActionBuilder();
    }

    /**
     * create builder for ProductSetSearchKeywordsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetSearchKeywordsActionBuilder of(final ProductSetSearchKeywordsAction template) {
        ProductSetSearchKeywordsActionBuilder builder = new ProductSetSearchKeywordsActionBuilder();
        builder.searchKeywords = template.getSearchKeywords();
        builder.staged = template.getStaged();
        return builder;
    }

}
