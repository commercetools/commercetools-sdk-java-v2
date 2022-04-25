
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductUnpublishedMessagePayloadImpl.class)
public interface ProductUnpublishedMessagePayload extends MessagePayload {

    String PRODUCT_UNPUBLISHED = "ProductUnpublished";

    public static ProductUnpublishedMessagePayload of() {
        return new ProductUnpublishedMessagePayloadImpl();
    }

    public static ProductUnpublishedMessagePayload of(final ProductUnpublishedMessagePayload template) {
        ProductUnpublishedMessagePayloadImpl instance = new ProductUnpublishedMessagePayloadImpl();
        return instance;
    }

    public static ProductUnpublishedMessagePayloadBuilder builder() {
        return ProductUnpublishedMessagePayloadBuilder.of();
    }

    public static ProductUnpublishedMessagePayloadBuilder builder(final ProductUnpublishedMessagePayload template) {
        return ProductUnpublishedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductUnpublishedMessagePayload(Function<ProductUnpublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUnpublishedMessagePayload>";
            }
        };
    }
}
