
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetMetaKeywordsActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    public CategorySetMetaKeywordsActionBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    public CategorySetMetaKeywordsAction build() {
        return new CategorySetMetaKeywordsActionImpl(metaKeywords);
    }

    public static CategorySetMetaKeywordsActionBuilder of() {
        return new CategorySetMetaKeywordsActionBuilder();
    }

    public static CategorySetMetaKeywordsActionBuilder of(final CategorySetMetaKeywordsAction template) {
        CategorySetMetaKeywordsActionBuilder builder = new CategorySetMetaKeywordsActionBuilder();
        builder.metaKeywords = template.getMetaKeywords();
        return builder;
    }

}
