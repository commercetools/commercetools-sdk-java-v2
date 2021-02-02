
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductImageAddedMessagePayloadBuilder {

    private Long variantId;

    private com.commercetools.api.models.common.Image image;

    private Boolean staged;

    public ProductImageAddedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductImageAddedMessagePayloadBuilder image(final com.commercetools.api.models.common.Image image) {
        this.image = image;
        return this;
    }

    public ProductImageAddedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductImageAddedMessagePayload build() {
        return new ProductImageAddedMessagePayloadImpl(variantId, image, staged);
    }

    public static ProductImageAddedMessagePayloadBuilder of() {
        return new ProductImageAddedMessagePayloadBuilder();
    }

    public static ProductImageAddedMessagePayloadBuilder of(final ProductImageAddedMessagePayload template) {
        ProductImageAddedMessagePayloadBuilder builder = new ProductImageAddedMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.image = template.getImage();
        builder.staged = template.getStaged();
        return builder;
    }

}
