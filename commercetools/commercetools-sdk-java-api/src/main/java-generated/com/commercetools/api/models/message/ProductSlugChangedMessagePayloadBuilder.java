
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSlugChangedMessagePayloadBuilder {

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString oldSlug;

    public ProductSlugChangedMessagePayloadBuilder slug(
            final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public ProductSlugChangedMessagePayloadBuilder oldSlug(
            @Nullable final com.commercetools.api.models.common.LocalizedString oldSlug) {
        this.oldSlug = oldSlug;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getOldSlug() {
        return this.oldSlug;
    }

    public ProductSlugChangedMessagePayload build() {
        return new ProductSlugChangedMessagePayloadImpl(slug, oldSlug);
    }

    public static ProductSlugChangedMessagePayloadBuilder of() {
        return new ProductSlugChangedMessagePayloadBuilder();
    }

    public static ProductSlugChangedMessagePayloadBuilder of(final ProductSlugChangedMessagePayload template) {
        ProductSlugChangedMessagePayloadBuilder builder = new ProductSlugChangedMessagePayloadBuilder();
        builder.slug = template.getSlug();
        builder.oldSlug = template.getOldSlug();
        return builder;
    }

}
