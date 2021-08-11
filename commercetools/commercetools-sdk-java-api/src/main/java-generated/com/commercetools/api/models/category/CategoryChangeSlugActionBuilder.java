
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryChangeSlugActionBuilder implements Builder<CategoryChangeSlugAction> {

    private com.commercetools.api.models.common.LocalizedString slug;

    public CategoryChangeSlugActionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CategoryChangeSlugActionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public CategoryChangeSlugAction build() {
        Objects.requireNonNull(slug, CategoryChangeSlugAction.class + ": slug is missing");
        return new CategoryChangeSlugActionImpl(slug);
    }

    /**
     * builds CategoryChangeSlugAction without checking for non null required values
     */
    public CategoryChangeSlugAction buildUnchecked() {
        return new CategoryChangeSlugActionImpl(slug);
    }

    public static CategoryChangeSlugActionBuilder of() {
        return new CategoryChangeSlugActionBuilder();
    }

    public static CategoryChangeSlugActionBuilder of(final CategoryChangeSlugAction template) {
        CategoryChangeSlugActionBuilder builder = new CategoryChangeSlugActionBuilder();
        builder.slug = template.getSlug();
        return builder;
    }

}
