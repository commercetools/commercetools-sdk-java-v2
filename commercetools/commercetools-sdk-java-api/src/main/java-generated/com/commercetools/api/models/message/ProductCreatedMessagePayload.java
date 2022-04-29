
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductCreatedMessagePayloadImpl.class)
public interface ProductCreatedMessagePayload extends MessagePayload {

    String PRODUCT_CREATED = "ProductCreated";

    @NotNull
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    public void setProductProjection(final ProductProjection productProjection);

    public static ProductCreatedMessagePayload of() {
        return new ProductCreatedMessagePayloadImpl();
    }

    public static ProductCreatedMessagePayload of(final ProductCreatedMessagePayload template) {
        ProductCreatedMessagePayloadImpl instance = new ProductCreatedMessagePayloadImpl();
        instance.setProductProjection(template.getProductProjection());
        return instance;
    }

    public static ProductCreatedMessagePayloadBuilder builder() {
        return ProductCreatedMessagePayloadBuilder.of();
    }

    public static ProductCreatedMessagePayloadBuilder builder(final ProductCreatedMessagePayload template) {
        return ProductCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductCreatedMessagePayload(Function<ProductCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductCreatedMessagePayload>";
            }
        };
    }
}
