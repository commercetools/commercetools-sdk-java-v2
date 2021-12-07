
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CategorySetMetaDescriptionActionBuilder implements Builder<CategorySetMetaDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    public CategorySetMetaDescriptionActionBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CategorySetMetaDescriptionActionBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    public CategorySetMetaDescriptionAction build() {
        return new CategorySetMetaDescriptionActionImpl(metaDescription);
    }

    /**
     * builds CategorySetMetaDescriptionAction without checking for non null required values
     */
    public CategorySetMetaDescriptionAction buildUnchecked() {
        return new CategorySetMetaDescriptionActionImpl(metaDescription);
    }

    public static CategorySetMetaDescriptionActionBuilder of() {
        return new CategorySetMetaDescriptionActionBuilder();
    }

    public static CategorySetMetaDescriptionActionBuilder of(final CategorySetMetaDescriptionAction template) {
        CategorySetMetaDescriptionActionBuilder builder = new CategorySetMetaDescriptionActionBuilder();
        builder.metaDescription = template.getMetaDescription();
        return builder;
    }

}