
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductChangeSlugActionBuilder {

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private Boolean staged;

    public ProductChangeSlugActionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public ProductChangeSlugActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductChangeSlugAction build() {
        return new ProductChangeSlugActionImpl(slug, staged);
    }

    public static ProductChangeSlugActionBuilder of() {
        return new ProductChangeSlugActionBuilder();
    }

    public static ProductChangeSlugActionBuilder of(final ProductChangeSlugAction template) {
        ProductChangeSlugActionBuilder builder = new ProductChangeSlugActionBuilder();
        builder.slug = template.getSlug();
        builder.staged = template.getStaged();
        return builder;
    }

}
