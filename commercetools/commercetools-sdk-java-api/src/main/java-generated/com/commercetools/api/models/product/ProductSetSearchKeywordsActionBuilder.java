
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetSearchKeywordsActionBuilder implements Builder<ProductSetSearchKeywordsAction> {

    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    @Nullable
    private Boolean staged;

    public ProductSetSearchKeywordsActionBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    public ProductSetSearchKeywordsActionBuilder searchKeywords(
            final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

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
