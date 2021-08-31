
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductAddExternalImageActionBuilder implements Builder<ProductAddExternalImageAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private com.commercetools.api.models.common.Image image;

    @Nullable
    private Boolean staged;

    public ProductAddExternalImageActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductAddExternalImageActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductAddExternalImageActionBuilder image(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build();
        return this;
    }

    public ProductAddExternalImageActionBuilder image(final com.commercetools.api.models.common.Image image) {
        this.image = image;
        return this;
    }

    public ProductAddExternalImageActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductAddExternalImageAction build() {
        Objects.requireNonNull(image, ProductAddExternalImageAction.class + ": image is missing");
        return new ProductAddExternalImageActionImpl(variantId, sku, image, staged);
    }

    /**
     * builds ProductAddExternalImageAction without checking for non null required values
     */
    public ProductAddExternalImageAction buildUnchecked() {
        return new ProductAddExternalImageActionImpl(variantId, sku, image, staged);
    }

    public static ProductAddExternalImageActionBuilder of() {
        return new ProductAddExternalImageActionBuilder();
    }

    public static ProductAddExternalImageActionBuilder of(final ProductAddExternalImageAction template) {
        ProductAddExternalImageActionBuilder builder = new ProductAddExternalImageActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.image = template.getImage();
        builder.staged = template.getStaged();
        return builder;
    }

}
