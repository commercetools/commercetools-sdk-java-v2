
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductUnpublishedMessagePayloadBuilder implements Builder<ProductUnpublishedMessagePayload> {

    public ProductUnpublishedMessagePayload build() {
        return new ProductUnpublishedMessagePayloadImpl();
    }

    /**
     * builds ProductUnpublishedMessagePayload without checking for non null required values
     */
    public ProductUnpublishedMessagePayload buildUnchecked() {
        return new ProductUnpublishedMessagePayloadImpl();
    }

    public static ProductUnpublishedMessagePayloadBuilder of() {
        return new ProductUnpublishedMessagePayloadBuilder();
    }

    public static ProductUnpublishedMessagePayloadBuilder of(final ProductUnpublishedMessagePayload template) {
        ProductUnpublishedMessagePayloadBuilder builder = new ProductUnpublishedMessagePayloadBuilder();
        return builder;
    }

}
