
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
     */

    public ProductSetSearchKeywordsActionBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     */

    public ProductSetSearchKeywordsActionBuilder searchKeywords(
            final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>searchKeywords</code> is updated. If <code>false</code>, both the current and staged <code>searchKeywords</code> are updated.</p>
     */

    public ProductSetSearchKeywordsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetSearchKeywordsAction build() {
        Objects.requireNonNull(searchKeywords, ProductSetSearchKeywordsAction.class + ": searchKeywords is missing");
        return new ProductSetSearchKeywordsActionImpl(searchKeywords, staged);
    }

    /**
     * builds ProductSetSearchKeywordsAction without checking for non null required values
     */
    public ProductSetSearchKeywordsAction buildUnchecked() {
        return new ProductSetSearchKeywordsActionImpl(searchKeywords, staged);
    }

    public static ProductSetSearchKeywordsActionBuilder of() {
        return new ProductSetSearchKeywordsActionBuilder();
    }

    public static ProductSetSearchKeywordsActionBuilder of(final ProductSetSearchKeywordsAction template) {
        ProductSetSearchKeywordsActionBuilder builder = new ProductSetSearchKeywordsActionBuilder();
        builder.searchKeywords = template.getSearchKeywords();
        builder.staged = template.getStaged();
        return builder;
    }

}
