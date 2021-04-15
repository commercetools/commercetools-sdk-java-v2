
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductCreatedMessagePayloadBuilder {

    private com.commercetools.api.models.product.ProductProjection productProjection;

    public ProductCreatedMessagePayloadBuilder productProjection(
            final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        return this;
    }

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    public ProductCreatedMessagePayload build() {
        return new ProductCreatedMessagePayloadImpl(productProjection);
    }

    public static ProductCreatedMessagePayloadBuilder of() {
        return new ProductCreatedMessagePayloadBuilder();
    }

    public static ProductCreatedMessagePayloadBuilder of(final ProductCreatedMessagePayload template) {
        ProductCreatedMessagePayloadBuilder builder = new ProductCreatedMessagePayloadBuilder();
        builder.productProjection = template.getProductProjection();
        return builder;
    }

}
