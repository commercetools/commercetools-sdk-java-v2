
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDeletedMessagePayloadBuilder implements Builder<ProductDeletedMessagePayload> {

    private java.util.List<String> removedImageUrls;

    private com.commercetools.api.models.product.ProductProjection currentProjection;

    public ProductDeletedMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    public ProductDeletedMessagePayloadBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    public ProductDeletedMessagePayloadBuilder plusRemovedImageUrls(final String... removedImageUrls) {
        if (this.removedImageUrls == null) {
            this.removedImageUrls = new ArrayList<>();
        }
        this.removedImageUrls.addAll(Arrays.asList(removedImageUrls));
        return this;
    }

    public ProductDeletedMessagePayloadBuilder currentProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.currentProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of())
                .build();
        return this;
    }

    public ProductDeletedMessagePayloadBuilder currentProjection(
            final com.commercetools.api.models.product.ProductProjection currentProjection) {
        this.currentProjection = currentProjection;
        return this;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    public com.commercetools.api.models.product.ProductProjection getCurrentProjection() {
        return this.currentProjection;
    }

    public ProductDeletedMessagePayload build() {
        Objects.requireNonNull(removedImageUrls, ProductDeletedMessagePayload.class + ": removedImageUrls is missing");
        Objects.requireNonNull(currentProjection,
            ProductDeletedMessagePayload.class + ": currentProjection is missing");
        return new ProductDeletedMessagePayloadImpl(removedImageUrls, currentProjection);
    }

    /**
     * builds ProductDeletedMessagePayload without checking for non null required values
     */
    public ProductDeletedMessagePayload buildUnchecked() {
        return new ProductDeletedMessagePayloadImpl(removedImageUrls, currentProjection);
    }

    public static ProductDeletedMessagePayloadBuilder of() {
        return new ProductDeletedMessagePayloadBuilder();
    }

    public static ProductDeletedMessagePayloadBuilder of(final ProductDeletedMessagePayload template) {
        ProductDeletedMessagePayloadBuilder builder = new ProductDeletedMessagePayloadBuilder();
        builder.removedImageUrls = template.getRemovedImageUrls();
        builder.currentProjection = template.getCurrentProjection();
        return builder;
    }

}
