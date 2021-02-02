
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
@JsonDeserialize(as = ProductImageAddedMessageImpl.class)
public interface ProductImageAddedMessage extends Message {

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

    public static ProductImageAddedMessage of() {
        return new ProductImageAddedMessageImpl();
    }

    public static ProductImageAddedMessage of(final ProductImageAddedMessage template) {
        ProductImageAddedMessageImpl instance = new ProductImageAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVariantId(template.getVariantId());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductImageAddedMessageBuilder builder() {
        return ProductImageAddedMessageBuilder.of();
    }

    public static ProductImageAddedMessageBuilder builder(final ProductImageAddedMessage template) {
        return ProductImageAddedMessageBuilder.of(template);
    }

    default <T> T withProductImageAddedMessage(Function<ProductImageAddedMessage, T> helper) {
        return helper.apply(this);
    }
}
