
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductImageAddedMessagePayloadImpl.class)
public interface ProductImageAddedMessagePayload extends MessagePayload {

    String PRODUCT_IMAGE_ADDED = "ProductImageAdded";

    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();

    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setImage(final Image image);

    public void setStaged(final Boolean staged);

    public static ProductImageAddedMessagePayload of() {
        return new ProductImageAddedMessagePayloadImpl();
    }

    public static ProductImageAddedMessagePayload of(final ProductImageAddedMessagePayload template) {
        ProductImageAddedMessagePayloadImpl instance = new ProductImageAddedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductImageAddedMessagePayloadBuilder builder() {
        return ProductImageAddedMessagePayloadBuilder.of();
    }

    public static ProductImageAddedMessagePayloadBuilder builder(final ProductImageAddedMessagePayload template) {
        return ProductImageAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductImageAddedMessagePayload(Function<ProductImageAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
