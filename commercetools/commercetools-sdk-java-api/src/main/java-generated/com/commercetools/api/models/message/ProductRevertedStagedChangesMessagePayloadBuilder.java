
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductRevertedStagedChangesMessagePayloadBuilder
        implements Builder<ProductRevertedStagedChangesMessagePayload> {

    private java.util.List<String> removedImageUrls;

    public ProductRevertedStagedChangesMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    public ProductRevertedStagedChangesMessagePayloadBuilder removedImageUrls(
            final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    public ProductRevertedStagedChangesMessagePayloadBuilder plusRemovedImageUrls(final String... removedImageUrls) {
        if (this.removedImageUrls == null) {
            this.removedImageUrls = new ArrayList<>();
        }
        this.removedImageUrls.addAll(Arrays.asList(removedImageUrls));
        return this;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    public ProductRevertedStagedChangesMessagePayload build() {
        Objects.requireNonNull(removedImageUrls,
            ProductRevertedStagedChangesMessagePayload.class + ": removedImageUrls is missing");
        return new ProductRevertedStagedChangesMessagePayloadImpl(removedImageUrls);
    }

    /**
     * builds ProductRevertedStagedChangesMessagePayload without checking for non null required values
     */
    public ProductRevertedStagedChangesMessagePayload buildUnchecked() {
        return new ProductRevertedStagedChangesMessagePayloadImpl(removedImageUrls);
    }

    public static ProductRevertedStagedChangesMessagePayloadBuilder of() {
        return new ProductRevertedStagedChangesMessagePayloadBuilder();
    }

    public static ProductRevertedStagedChangesMessagePayloadBuilder of(
            final ProductRevertedStagedChangesMessagePayload template) {
        ProductRevertedStagedChangesMessagePayloadBuilder builder = new ProductRevertedStagedChangesMessagePayloadBuilder();
        builder.removedImageUrls = template.getRemovedImageUrls();
        return builder;
    }

}
