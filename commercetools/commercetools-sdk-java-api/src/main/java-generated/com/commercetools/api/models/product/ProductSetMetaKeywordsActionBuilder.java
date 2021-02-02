
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetMetaKeywordsActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private Boolean staged;

    public ProductSetMetaKeywordsActionBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    public ProductSetMetaKeywordsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetMetaKeywordsAction build() {
        return new ProductSetMetaKeywordsActionImpl(metaKeywords, staged);
    }

    public static ProductSetMetaKeywordsActionBuilder of() {
        return new ProductSetMetaKeywordsActionBuilder();
    }

    public static ProductSetMetaKeywordsActionBuilder of(final ProductSetMetaKeywordsAction template) {
        ProductSetMetaKeywordsActionBuilder builder = new ProductSetMetaKeywordsActionBuilder();
        builder.metaKeywords = template.getMetaKeywords();
        builder.staged = template.getStaged();
        return builder;
    }

}
