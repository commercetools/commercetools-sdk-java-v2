
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetMetaTitleActionBuilder implements Builder<CategorySetMetaTitleAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    public CategorySetMetaTitleActionBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CategorySetMetaTitleActionBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    public CategorySetMetaTitleAction build() {
        return new CategorySetMetaTitleActionImpl(metaTitle);
    }

    /**
     * builds CategorySetMetaTitleAction without checking for non null required values
     */
    public CategorySetMetaTitleAction buildUnchecked() {
        return new CategorySetMetaTitleActionImpl(metaTitle);
    }

    public static CategorySetMetaTitleActionBuilder of() {
        return new CategorySetMetaTitleActionBuilder();
    }

    public static CategorySetMetaTitleActionBuilder of(final CategorySetMetaTitleAction template) {
        CategorySetMetaTitleActionBuilder builder = new CategorySetMetaTitleActionBuilder();
        builder.metaTitle = template.getMetaTitle();
        return builder;
    }

}
