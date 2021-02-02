
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPublishedMessagePayloadBuilder {

    private java.util.List<String> removedImageUrls;

    private com.commercetools.api.models.product.ProductProjection productProjection;

    private com.commercetools.api.models.cart.ProductPublishScope scope;

    public ProductPublishedMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    public ProductPublishedMessagePayloadBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    public ProductPublishedMessagePayloadBuilder productProjection(
            final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        return this;
    }

    public ProductPublishedMessagePayloadBuilder scope(
            final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.scope = scope;
        return this;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    public com.commercetools.api.models.cart.ProductPublishScope getScope() {
        return this.scope;
    }

    public ProductPublishedMessagePayload build() {
        return new ProductPublishedMessagePayloadImpl(removedImageUrls, productProjection, scope);
    }

    public static ProductPublishedMessagePayloadBuilder of() {
        return new ProductPublishedMessagePayloadBuilder();
    }

    public static ProductPublishedMessagePayloadBuilder of(final ProductPublishedMessagePayload template) {
        ProductPublishedMessagePayloadBuilder builder = new ProductPublishedMessagePayloadBuilder();
        builder.removedImageUrls = template.getRemovedImageUrls();
        builder.productProjection = template.getProductProjection();
        builder.scope = template.getScope();
        return builder;
    }

}
