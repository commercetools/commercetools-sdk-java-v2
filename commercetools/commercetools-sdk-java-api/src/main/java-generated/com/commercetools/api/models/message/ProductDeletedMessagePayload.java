
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
@JsonDeserialize(as = ProductDeletedMessagePayloadImpl.class)
public interface ProductDeletedMessagePayload extends MessagePayload {

    String PRODUCT_DELETED = "ProductDeleted";

    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    @NotNull
    @Valid
    @JsonProperty("currentProjection")
    public ProductProjection getCurrentProjection();

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public void setCurrentProjection(final ProductProjection currentProjection);

    public static ProductDeletedMessagePayload of() {
        return new ProductDeletedMessagePayloadImpl();
    }

    public static ProductDeletedMessagePayload of(final ProductDeletedMessagePayload template) {
        ProductDeletedMessagePayloadImpl instance = new ProductDeletedMessagePayloadImpl();
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        instance.setCurrentProjection(template.getCurrentProjection());
        return instance;
    }

    public static ProductDeletedMessagePayloadBuilder builder() {
        return ProductDeletedMessagePayloadBuilder.of();
    }

    public static ProductDeletedMessagePayloadBuilder builder(final ProductDeletedMessagePayload template) {
        return ProductDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductDeletedMessagePayload(Function<ProductDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDeletedMessagePayload>";
            }
        };
    }
}
