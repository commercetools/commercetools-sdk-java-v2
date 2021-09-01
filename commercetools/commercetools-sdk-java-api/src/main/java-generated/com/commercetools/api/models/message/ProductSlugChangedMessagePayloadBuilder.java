
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSlugChangedMessagePayloadBuilder implements Builder<ProductSlugChangedMessagePayload> {

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString oldSlug;

    public ProductSlugChangedMessagePayloadBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductSlugChangedMessagePayloadBuilder slug(
            final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public ProductSlugChangedMessagePayloadBuilder oldSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.oldSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
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
        Objects.requireNonNull(slug, ProductSlugChangedMessagePayload.class + ": slug is missing");
        return new ProductSlugChangedMessagePayloadImpl(slug, oldSlug);
    }

    /**
     * builds ProductSlugChangedMessagePayload without checking for non null required values
     */
    public ProductSlugChangedMessagePayload buildUnchecked() {
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
